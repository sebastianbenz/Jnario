/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import org.junit.runner.Runner;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/**
 * A spec {@link Runner} for Jnario features. It makes 
 * 
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureRunner extends ExampleGroupRunner {

	private final class RunnerWrapper implements SpecCreator {

		private SpecCreator instantiator;
		private Object test;

		public RunnerWrapper(SpecCreator instantiator){
			this.instantiator = instantiator;
		}

		public <T> T createSpec(Class<T> klass){
			if(test == null){
				test = instantiator.createSpec(klass);
			}
			return klass.cast(test);
		}
		
		public <T> T createSubject(Class<T> klass) {
			return instantiator.createSubject(klass);
		}

		public void beforeSpecRun() {
			instantiator.beforeSpecRun();
		}

		public void afterSpecRun() {
			instantiator.afterSpecRun();
		}
	}

	private SpecCreator delegate;

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
		SpecCreator createTestInstantiator = createTestInstantiator();
		delegate = new RunnerWrapper(createTestInstantiator);
	}
	
}
