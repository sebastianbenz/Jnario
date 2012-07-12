/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.suite.SuiteFactory
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator

@CreateWith(typeof(SuiteTestCreator))
describe SuiteClassNameProvider {
	
	context getClassName{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "MySuiteSuite"	|
			| "##My Suite \n with multiple lines"		| "MySuiteSuite"	|
		}
		
		fact examples.forEach[subject.getClassName(suite(name)) => expectedClassName]
	}
	
	context ^describe{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "my Suite"		|
			| "##My Suite \n with multiple lines"		| "My Suite"		|
		}
		
		fact examples.forEach[subject.^describe(suite(name)) => expectedClassName]
	}	
 
	def suite(String name){
		val suite = SuiteFactory::eINSTANCE.createSuite
		suite.name = name
		suite
	}
}