/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import java.net.MalformedURLException;

import org.eclipse.emf.ecore.EObject;
import org.junit.runner.Result;

public class SuiteExecutor extends BehaviorExecutor {
	

	@Override
	protected Result runExamples(EObject object) throws MalformedURLException,
			ClassNotFoundException {
		throw new UnsupportedOperationException();
	}

}
