/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.naming;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static java.lang.Math.max;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;
import static org.jnario.util.Nodes.textForFeature;
import static org.jnario.util.Strings.convertToCamelCase;
import static org.jnario.util.Strings.makeJunitConform;
import static org.jnario.util.Strings.markAsPending;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xbase.compiler.JavaKeywords;
import org.jnario.ExampleTable;
import org.jnario.jvmmodel.JnarioNameProvider;
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
public class ExampleNameProvider extends JnarioNameProvider{

	private static final String SPEC_POSTFIX = "Spec";

	@Inject(optional=true) 
	private OperationNameProvider operationNameProvider = new OperationNameProvider();
	
	@Inject(optional=true) 
	private JavaKeywords javaUtils = new JavaKeywords();

	protected String internalToMethodName(EObject eObject){
		if(eObject == null){
			return null;
		}
		if (eObject instanceof After) {
			return _toMethodName((After)eObject);
		}
		if (eObject instanceof Before) {
			return _toMethodName((Before)eObject);
		}
		if (eObject instanceof Example) {
			return _toMethodName((Example)eObject);
		}
		throw new UnsupportedOperationException("Cannot determine method name for " + eObject.eClass().getName());
	}

	protected String internalDescribe(EObject eObject) {
		if(eObject == null){
			return null;
		}
		if (eObject instanceof ExampleGroup) {
			return _describe((ExampleGroup) eObject);
		}
		if (eObject instanceof Example) {
			return _describe((Example) eObject);
		}
		throw new UnsupportedOperationException("Cannote describe " + eObject.eClass().getName());
	}

	protected String internalToJavaClassName(EObject eObject) {
		if(eObject == null){
			return null;
		}
		if (eObject instanceof ExampleGroup) {
			return _toJavaClassName((ExampleGroup) eObject);
		}
		if (eObject instanceof ExampleTable) {
			return _toJavaClassName((ExampleTable) eObject);
		}
		ExampleGroup exampleGroup = getContainerOfType(eObject, ExampleGroup.class);
		if(exampleGroup == null){
			return null;
		}
		return _toJavaClassName(exampleGroup);
	}

	private String _describe(ExampleGroup exampleGroup) {
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
		return makeJunitConform(result);
	}

	private QualifiedName getOperationName(ExampleGroup exampleGroup) {
		EObject operation = (EObject) exampleGroup.eGet(SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION, false);
		if(operation.eIsProxy()){
			String name = textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION);
			return QualifiedName.create(name);
		}
		return operationNameProvider.apply(exampleGroup.getTargetOperation());
	}

	private String _describe(Example example){
		StringBuilder sb = new StringBuilder();
		if(example.getName() != null){
			sb.append(example.getName());
		}
		if(example.isPending()){
			markAsPending(sb);
		}
		return makeJunitConform(sb).trim();
	}

	private String _toJavaClassName(ExampleGroup exampleGroup){
		StringBuilder result = internalGetName(exampleGroup);
		result.append(SPEC_POSTFIX);
		return result.toString();
	}

	private String _toMethodName(Example example){
		String name = "";
		if(example.getName() != null){
			name = memberDescriptionOf(example);
		}
		return _toMethodName(name);
	}

	private String _toMethodName(String name) {
		StringBuilder result = new StringBuilder();
		result.append("_");
		result.append(toFirstLower(convertToCamelCase(name)));
		if(result.length() > 249){
			return result.substring(0, 250);
		}else{
			return result.toString();
		}
	}
	
	private String _toMethodName(Before before){
		String name = "before";
		return _toMethodName(before, name);
	}
	
	private String _toMethodName(After after){
		String name = "after";
		return _toMethodName(after, name);
	}
	
	private String _toMethodName(TestFunction target, String defaultName){
		if(target.getName() != null){
			return _toMethodName(target.getName());
		}
		if(target.isStatic()){
			defaultName += "All";
		}
		int count = countPreviousWithDefaultName(target);
		if(count > 1){
			defaultName += count;
		}
		return defaultName;
	}
	
	protected String internalToFieldName(EObject eObject){
		if (eObject instanceof ExampleTable) {
			ExampleTable exampleTable = (ExampleTable) eObject;
			String name = exampleTable.getName();
			return name == null ? "examples" : name;
		}
		throw new UnsupportedOperationException("Cannot determin field name for " + eObject.eClass().getName());
	}
	
	private String _toJavaClassName(ExampleTable exampleTable){
		ExampleGroup parent = getContainerOfType(exampleTable, ExampleGroup.class);
		return toJavaClassName(parent) + toFirstUpper(toFieldName(exampleTable));
	}

	private int countPreviousWithDefaultName(TestFunction target) {
		List<? extends TestFunction> members = allMembers(target, target.getClass());
		int index = members.indexOf(target);
		int count = 1;
		for (int i = 0; i < index; i++) {
			TestFunction current = members.get(i);
			if (current.getClass() == target.getClass()) {
				if(current.getName() == null && current.isStatic() == target.isStatic()){
					count++;
				}
			}
		}
		return count;
	}

	private <T extends TestFunction> List<T> allMembers(EObject context, Class<T> type) {
		XtendClass container = getContainerOfType(context, XtendClass.class);
		Stack<XtendClass> parents = new Stack<XtendClass>();
		while(container != null){
			parents.push(container);
			container = getContainerOfType(container.eContainer(), XtendClass.class);
		}
		List<T> functions = newArrayList();
		while(!parents.isEmpty()){
			addAll(functions, filter(parents.pop().getMembers(), type));
		}
		return functions;
	}
	
	private StringBuilder internalGetName(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.eContainer() != null){
			ExampleGroup parent = getContainerOfType(exampleGroup.eContainer(), ExampleGroup.class);
			if(parent != null){
				result.append(internalGetName(parent));
			}
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

	private String getTargetTypeName(ExampleGroup exampleGroup) {
		String targetName;
		if(isProxy(exampleGroup.getTargetType())){
			targetName = resolveProxyTypeName(exampleGroup);
		}else{
			targetName = exampleGroup.getTargetType().getSimpleName();
		}
		return targetName;
	}

	private boolean hasTargetOperation(ExampleGroup exampleGroup) {
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

}
