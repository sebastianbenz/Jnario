/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExtensionClass {

	private Map<Class<?>, List<FrameworkMethod>> methodsForAnnotations= new HashMap<Class<?>, List<FrameworkMethod>>();

	private FrameworkField extensionField;

	public ExtensionClass(FrameworkField extensionField) {
		this.extensionField = extensionField;
		for (Class<?> eachClass : getSuperClasses(extensionField.getField().getType())) {
			for (Method eachMethod : eachClass.getDeclaredMethods()){
				addToAnnotationLists(new FrameworkMethod(eachMethod), methodsForAnnotations);
			}
		}
	}

	private  void addToAnnotationLists(FrameworkMethod member, Map<Class<?>, List<FrameworkMethod>> map) {
		for (Annotation each : member.getAnnotations()) {
			Class<? extends Annotation> type= each.annotationType();
			List<FrameworkMethod> members= getAnnotatedMembers(map, type);
			for (FrameworkMethod otherMethod : members) {
				if(member.isShadowedBy(otherMethod)){
					return;
				}
			}
			if (runsTopToBottom(type))
				members.add(0, member);
			else
				members.add(member);
		}
	}
	

	public List<FrameworkMethod> getAnnotatedMethods(
			Class<? extends Annotation> annotationClass) {
		return getAnnotatedMembers(methodsForAnnotations, annotationClass);
	}

	private <T> List<T> getAnnotatedMembers(Map<Class<?>, List<T>> map,
			Class<? extends Annotation> type) {
		if (!map.containsKey(type))
			map.put(type, new ArrayList<T>());
		return map.get(type);
	}

	private boolean runsTopToBottom(Class<? extends Annotation> annotation) {
		return annotation.equals(Before.class)
				|| annotation.equals(BeforeClass.class);
	}

	private List<Class<?>> getSuperClasses(Class<?> testClass) {
		ArrayList<Class<?>> results= new ArrayList<Class<?>>();
		Class<?> current= testClass;
		while (current != null) {
			results.add(current);
			current= current.getSuperclass();
		}
		return results;
	}

	public Object get(Object target) throws IllegalArgumentException, IllegalAccessException {
		return extensionField.get(target);
	}

	public List<FrameworkMethod> allMethodsWithAnnotation(
			Class<? extends Annotation> annotationType) {
		List<FrameworkMethod> result = methodsForAnnotations.get(annotationType);
		return result == null ? Collections.<FrameworkMethod>emptyList() : result;
	}

	public String getName() {
		Field field = extensionField.getField();
		return field.getType().getName() + "#" + field.getName();
	}

	public boolean isStatic() {
		return extensionField.isStatic();
	}

}
