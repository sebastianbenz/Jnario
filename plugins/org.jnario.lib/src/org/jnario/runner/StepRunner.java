/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import org.jnario.lib.AbstractSpecCreator;
import org.junit.Ignore;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class StepRunner extends ExampleRunner {

	private static final class NullSpecCreator extends
			AbstractSpecCreator {
		@Override
		protected <T> T create(Class<T> klass) {
			throw new UnsupportedOperationException();
		}
	}

	private Object scenario;

	public StepRunner(Class<?> testClass, FrameworkMethod method,
			NameProvider nameProvider, Object scenario) throws InitializationError, NoTestsRemainException {
		super(testClass, method, nameProvider, new NullSpecCreator());
		this.scenario = scenario;
	}
	
	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		Description description= describeChild(method);
		if (method.getAnnotation(Ignore.class) != null) {
			notifier.fireTestIgnored(description);
		} else {
			runLeaf(methodBlock(method), description, notifier);
		}
	}

	@Override
	protected Statement methodBlock(FrameworkMethod method) {
		return methodInvoker(method, scenario);
	}
}
