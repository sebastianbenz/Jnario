/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.naming.SpecQualifiedNameProvider
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

@CreateWith(typeof(SpecTestCreator))
describe SpecQualifiedNameProvider {
 
	@Inject extension ModelStore

	fact "null if spec description is empty"{
		parseSpec('''
			package test
			describe ""{}''')
		qualifiedName should be null
		
		parseSpec('''
			describe ""{}''')
		qualifiedName should be null
	}

	fact "uses spec description"{
		parseSpec('''
			describe "My Spec"{}''')
		qualifiedName => "My Spec"
	}
	
	fact "trims spec description whitespace"{
		parseSpec('''
			describe "My Spec  "{}''')
		qualifiedName => "My Spec"
	}
	
	fact "uses referenced type"{
		parseSpec('''
			describe org.junit.Assert{}''')
		qualifiedName => "Assert"
	}
	
	fact "uses referenced type and description"{
		parseSpec('''
			describe org.junit.Assert "My Spec"{}''')
		qualifiedName => "Assert My Spec"
	}
	
	fact "adds spec package"{
		parseSpec('''
			package test
			describe "My Spec"{}''')
		qualifiedName => "test.My Spec"
	}
	
	def qualifiedName(){
		subject.getFullyQualifiedName(firstSpec)?.toString		
	}
}