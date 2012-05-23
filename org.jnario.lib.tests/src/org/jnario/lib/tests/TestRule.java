/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.tests;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

@SuppressWarnings("deprecation")
public class TestRule implements MethodRule {

	
	
	private static boolean isExecuted = false;
	
	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		isExecuted = true;
		return base;
	}
	
	public static boolean isExecuted() {
		return isExecuted;
	}

}
