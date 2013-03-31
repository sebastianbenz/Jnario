/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.naming.SuiteQualifiedNameProvider
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator

@CreateWith(typeof(SuiteTestCreator))
describe SuiteQualifiedNameProvider {

	@Inject extension ModelStore

	fact "removes suite prefix"{
		parseSuite('''
			#My Suite''')
		qualifiedName => "My Suite"
	}
	
	fact "removes suite trailing text"{
		parseSuite('''
			#My Suite
			with description''')
		qualifiedName => "My Suite"
	}
	
	fact "add suite package"{
		parseSuite('''
			package test
			#My Suite''')
		qualifiedName => "test.My Suite"
	}
	
	fact "handles empty packages"{
		parseSuite('''
			#My Suite''')
		qualifiedName => "My Suite"
	}
	
	fact "handles empty suites"{
		parseSuite('''
			#
		''')
		qualifiedName should be null
	}
	
	def qualifiedName(){
		subject.getFullyQualifiedName(firstSuite)?.toString		
	}
}