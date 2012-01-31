/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * @author Sebastian Benz
 */
public class JnarioRunner extends ExampleGroupRunner {

	private final class RunnerWrapper implements
	TestInstantiator {

		private TestInstantiator instantiator;
		private Object test;

		public RunnerWrapper(TestInstantiator instantiator){
			this.instantiator = instantiator;
		}

		@Override
		public Object createTest(Class<?> klass) throws Exception {
			if(test == null){
				test = instantiator.createTest(klass);
			}
			return test;
		}

		@Override
		public void beforeTestRun() {
			instantiator.beforeTestRun();
		}

		@Override
		public void afterTestRun() {
			instantiator.afterTestRun();
		}
	}

	private TestInstantiator delegate;

	public JnarioRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}
	
	@Override
	protected boolean isTestMethod(FrameworkMethod input) {
		return true;
	}
	
	@Override
	protected ExampleGroupRunner createExampleGroupRunner(Class<?> declaredClass)
			throws InitializationError {
		return new JnarioRunner(declaredClass);
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
