/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.naming;

import static java.lang.Character.isDigit;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.convertToJavaString;
import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;
import static org.jnario.util.Strings.convertToCamelCase;

import java.util.List;

import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.JavaKeywords;
import org.jnario.ExampleTable;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;
import org.jnario.spec.spec.util.SpecSwitch;

import com.google.inject.Inject;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ExampleNameProvider {

	private OperationNameProvider operationNameProvider = new OperationNameProvider();
	
	@Inject(optional=true) 
	private JavaKeywords javaUtils = new JavaKeywords();

	public String describe(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.getTargetType() != null){
			result.append(exampleGroup.getTargetType().getSimpleName());
			result.append(" ");
		}
		if(exampleGroup.getTargetOperation() != null){
			result.append(new OperationNameProvider().apply(exampleGroup.getTargetOperation()));
			result.append(" ");
		}
		if(exampleGroup.getName() != null){
			result.append(exampleGroup.getName());
		}
		return convertToJavaString(makeJunitConform(result));
	}

	protected String makeJunitConform(StringBuilder result) {
		return result.toString().replace("(", "[").replace(")", "]").replace("#", "-").trim();
	}
	
	public String describe(Example example){
		StringBuilder sb = new StringBuilder();
		if(example.getName() != null){
			sb.append(example.getName());
			sb.append(" ");
		}else{
			sb.append(expression(example));
		}
		if(example.isPending()){
			sb.append("[PENDING]");
		}
		return convertToJavaString(makeJunitConform(sb)).trim().replace("\\\"", "\"").replace("\\n", "; ").replace("\\t", "\t");
	}

	private String expression(Example example) {
		XExpression rootExpression = example.getExpr();
		if(rootExpression == null){
			return "";
		}
		String expression = NodeModelUtils.getNode(rootExpression).getText().trim();
		if(expression.length() == 0){
			return "";
		}
		return expression;
	}

	public String toJavaClassName(ExampleGroup exampleGroup) {
		StringBuilder result = internalGetName(exampleGroup);
		result.append("Spec");
		return result.toString();
	}

	public String toMethodName(TestFunction function){
		return new SpecSwitch<String>(){
			public String caseAfter(After object) {
				return toMethodName(object);
			};
			public String caseBefore(Before object) {
				return toMethodName(object);
			};
			public String caseExample(Example object) {
				return toMethodName(object);
			};
		}.doSwitch(function);
	}
	
	public String toMethodName(Example example){
		StringBuilder result = new StringBuilder();
		if(example.getName() != null){
			result.append(memberDescriptionOf(example));
		}else{
			result.append(expression(example));
		}
		if(result.length() == 0){
			return "";
		}
		String name = toFirstLower(convertToCamelCase(result).toString());
		if(javaUtils.isJavaKeyword(name) || isDigit(name.charAt(0))){
			name = "_" + name;
		}
		return name;
	}
	
	public String toMethodName(Before before){
		return toMethodName(before, "before");
	}
	
	public String toMethodName(After before){
		return toMethodName(before, "after");
	}
	
	public String toMethodName(TestFunction target, String defaultName){
		if(target.getName() != null){
			return toFirstLower(convertToCamelCase(target.getName()));
		}
		int count = countPreviousWithDefaultName(target);
		if(count > 1){
			defaultName += count;
		}
		return defaultName;
	}
	
	public String toFieldName(ExampleTable exampleTable){
		String name = exampleTable.getName();
		return name == null ? "examples" : name;
	}
	
	public String toJavaClassName(ExampleTable exampleTable){
		ExampleGroup parent = getContainerOfType(exampleTable, ExampleGroup.class);
		return toJavaClassName(parent) + toFirstUpper(toFieldName(exampleTable));
	}

	protected int countPreviousWithDefaultName(TestFunction target) {
		List<XtendMember> members = ((ExampleGroup)target.eContainer()).getMembers();
		int index = members.indexOf(target);
		int count = 1;
		for (int i = 0; i < index; i++) {
			XtendMember current = members.get(i);
			if (target.getClass().isInstance(current)) {
				if(((TestFunction)current).getName() == null){
					count++;
				}
			}
		}
		return count;
	}
	
	protected StringBuilder internalGetName(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		ExampleGroup parent = getContainerOfType(exampleGroup.eContainer(), ExampleGroup.class);
		if(parent != null){
			result.append(internalGetName(parent));
		}
		if(exampleGroup.getTargetType() != null){
			result.append(exampleGroup.getTargetType().getSimpleName());
		}
		if(exampleGroup.getTargetOperation() != null){
			String operationName = operationNameProvider.apply(exampleGroup.getTargetOperation()).toString();
			result.append(toFirstUpper(operationName));
		}
		result.append(toFirstUpper(memberDescriptionOf(exampleGroup)));
		result = convertToCamelCase(result);
		return result;
	}
	
	private String memberDescriptionOf(XtendMember member) {
		String newName = SimpleAttributeResolver.NAME_RESOLVER.apply(member);
		if(newName == null){
			newName = "";
		}
		return newName;
	}

}
