/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator
import static org.jnario.jnario.test.util.Suites.*
@CreateWith(typeof(SuiteTestCreator))
describe SuiteClassNameProvider {
	
	context "toJavaClassName"{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "MySuiteSuite"	|
			| "##My Suite \n with multiple lines"		| "MySuiteSuite"	|
		}
		
		fact examples.forEach[subject.toJavaClassName(suite(name)) => expectedClassName]
	}
	
	context "describe"{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "my Suite"		|
			| "##My Suite \n with multiple lines"		| "My Suite"		|
		}
		
		fact examples.forEach[subject.^describe(suite(name)) => expectedClassName]
	}	
	
	context "toQualifiedJavaClassName"{
		def examples{
			| name 										| packageName 		| qualifiedName		  |
			| null										| null			  	| null				  |
			| "#"										| "test"			| null				  |
			| "#my Suite"								| null				| "MySuiteSuite"			  |
			| "##My Suite \n with multiple lines"		| "test"			| "test.MySuiteSuite" |
		}
		
		fact examples.forEach[
				val actualName = subject.toQualifiedJavaClassName(suite(name, packageName))
				actualName => qualifiedName
			]
	}
 
}