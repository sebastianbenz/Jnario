/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.naming;

import static java.lang.Math.max;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.convertToJavaString;
import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;
import static org.jnario.util.Nodes.textForFeature;
import static org.jnario.util.Strings.convertToCamelCase;
import static org.jnario.util.Strings.makeJunitConform;
import static org.jnario.util.Strings.markAsPending;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xbase.compiler.JavaKeywords;
import org.jnario.ExampleTable;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.spec.spec.TestFunction;
import org.jnario.spec.spec.util.SpecSwitch;

import com.google.inject.Inject;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ExampleNameProvider {

	private static final String SPEC_POSTFIX = "Spec";

	@Inject(optional=true) 
	private OperationNameProvider operationNameProvider = new OperationNameProvider();
	
	@Inject(optional=true) 
	private JavaKeywords javaUtils = new JavaKeywords();

	public String describe(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.getTargetType() != null){
			result.append(getTargetTypeName(exampleGroup));
			result.append(" ");
		}
		if(hasTargetOperation(exampleGroup)){
			result.append(getOperationName(exampleGroup));
			result.append(" ");
		}
		if(exampleGroup.getName() != null){
			result.append(exampleGroup.getName());
		}
		return convertToJavaString(makeJunitConform(result));
	}

	protected QualifiedName getOperationName(ExampleGroup exampleGroup) {
		EObject operation = (EObject) exampleGroup.eGet(SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION, false);
		if(operation.eIsProxy()){
			String name = textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION);
			return QualifiedName.create(name);
		}
		return operationNameProvider.apply(exampleGroup.getTargetOperation());
	}

	public String describe(Example example){
		StringBuilder sb = new StringBuilder();
		if(example.getName() != null){
			sb.append(example.getName());
		}
		if(example.isPending()){
			markAsPending(sb);
		}
		return convertToJavaString(makeJunitConform(sb)).trim();
	}

	public String toJavaClassName(ExampleGroup exampleGroup) {
		StringBuilder result = internalGetName(exampleGroup);
		result.append(SPEC_POSTFIX);
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
		String name = "";
		if(example.getName() != null){
			name = memberDescriptionOf(example);
		}
		return toMethodName(name);
	}

	protected String toMethodName(String name) {
		StringBuilder result = new StringBuilder();
		result.append("_");
		result.append(toFirstLower(convertToCamelCase(name)));
		if(result.length() > 249){
			return result.substring(0, 250);
		}else{
			return result.toString();
		}
	}
	
	public String toMethodName(Before before){
		return toMethodName(before, "before");
	}
	
	public String toMethodName(After before){
		return toMethodName(before, "after");
	}
	
	public String toMethodName(TestFunction target, String defaultName){
		if(target.getName() != null){
			return toMethodName(target.getName());
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
			result.append(getTargetTypeName(exampleGroup));
		}
		if(hasTargetOperation(exampleGroup)){
			String operationName = getOperationName(exampleGroup).toString();
			result.append(toFirstUpper(operationName));
		}
		result.append(toFirstUpper(memberDescriptionOf(exampleGroup)));
		result = convertToCamelCase(result);
		return result;
	}

	protected String getTargetTypeName(ExampleGroup exampleGroup) {
		String targetName;
		if(isProxy(exampleGroup.getTargetType())){
			targetName = resolveProxyTypeName(exampleGroup);
		}else{
			targetName = exampleGroup.getTargetType().getSimpleName();
		}
		return targetName;
	}

	protected boolean hasTargetOperation(ExampleGroup exampleGroup) {
		return exampleGroup.eIsSet(SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION);
	}

	private String resolveProxyTypeName(ExampleGroup exampleGroup) {
		String text = textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE);
		int begin = max(text.lastIndexOf('.'), text.lastIndexOf('$')) + 1;
		int end = text.indexOf('<');
		if(end == -1){
			end = text.length();
		}
		return text.substring(begin, end);
	}

	private boolean isProxy(JvmTypeReference jvmTypeReference) {
		if (jvmTypeReference instanceof JvmParameterizedTypeReference) {
			JvmParameterizedTypeReference parameterizedTypeReference = (JvmParameterizedTypeReference) jvmTypeReference;
			EObject value = (EObject) parameterizedTypeReference.eGet(TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, false);
			return value.eIsProxy();
		}else{
			return true;
		}
	}
	
	private String memberDescriptionOf(XtendMember member) {
		String newName = SimpleAttributeResolver.NAME_RESOLVER.apply(member);
		if(newName == null){
			newName = "";
		}
		return newName;
	}

	public String toJavaClassName(EObject eObject) {
		if (eObject instanceof ExampleGroup) {
			return toJavaClassName((ExampleGroup) eObject);
		}
		if (eObject instanceof ExampleTable) {
			return toJavaClassName((ExampleTable) eObject);
		}
		throw new UnsupportedOperationException("Unknown java class name for " + eObject.eClass().getName());
	}

}
