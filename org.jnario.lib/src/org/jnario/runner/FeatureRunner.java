/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureRunner extends ExampleGroupRunner {

	private final class RunnerWrapper implements TestInstantiator {

		private TestInstantiator instantiator;
		private Object test;

		public RunnerWrapper(TestInstantiator instantiator){
			this.instantiator = instantiator;
		}

		public Object createTest(Class<?> klass) throws Exception {
			if(test == null){
				test = instantiator.createTest(klass);
			}
			return test;
		}

		public void beforeTestRun() {
			instantiator.beforeTestRun();
		}

		public void afterTestRun() {
			instantiator.afterTestRun();
		}
	}

	private TestInstantiator delegate;

	public FeatureRunner(Class<?> klass, NameProvider nameProvider) throws InitializationError {
		super(klass, nameProvider);
	}
	
	public FeatureRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}
	
	@Override
	protected Predicate<FrameworkMethod> isTestMethod() {
		return Predicates.alwaysTrue();
	}
	
	@Override
	protected ExampleRunner createExampleRunner(Class<?> testClass,
			FrameworkMethod from) throws InitializationError,
			NoTestsRemainException {
		if(delegate == null){
			createTestWrapper();
		}
		return new ExampleRunner(testClass, from, getNameProvider(), delegate);
	}
	
	
	private void createTestWrapper() throws InitializationError{
		TestInstantiator createTestInstantiator = createTestInstantiator();
		delegate = new RunnerWrapper(createTestInstantiator);
	}
	
}
