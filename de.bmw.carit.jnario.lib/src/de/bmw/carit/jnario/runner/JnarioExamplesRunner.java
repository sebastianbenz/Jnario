/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JnarioExamplesRunner extends JnarioRunner{

	public JnarioExamplesRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
	}
	
	@Override
	protected boolean isTestMethod(FrameworkMethod input) {
		return input.getMethod().getDeclaringClass() != targetClass();
	}
}
