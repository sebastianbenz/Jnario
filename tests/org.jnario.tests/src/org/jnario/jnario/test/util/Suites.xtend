/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import org.jnario.suite.suite.SuiteFactory

class Suites {
	
	static val SuiteFactory factory = SuiteFactory::eINSTANCE
	
	def static suite(String name){
		val suite = factory.createSuite
		suite.name = name
		suite
	}
	
}