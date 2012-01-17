/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.junit.Test;
import org.junit.runner.Runner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
/**
 * @author Sebastian Benz
 */
public class JnarioExamplesRunner extends JnarioRunner{

	public JnarioExamplesRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
	}
	
	@Override
	protected Iterable<? extends Runner> collectExamples() {
		List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Test.class);
		List<FrameworkMethod> exampleMethods = newArrayList();
		for(FrameworkMethod method: annotatedMethods){
			if(!method.getMethod().getDeclaringClass().equals(targetClass())){
				exampleMethods.add(method);
			}
		}
		orderMethods(exampleMethods);
		return createRunners(targetClass(), exampleMethods);
	}
}
