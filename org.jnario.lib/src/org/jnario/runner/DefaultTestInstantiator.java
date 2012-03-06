/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class DefaultTestInstantiator implements TestInstantiator {

	public Object createTest(Class<?> klass) throws Exception {
		return klass.newInstance();
	}

	public void beforeTestRun() {
	}

	public void afterTestRun() {
	}

}
