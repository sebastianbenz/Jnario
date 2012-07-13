/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.scoping.SuiteScopeProvider
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ScopeTestExtension
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.SuitePackage


@CreateWith(typeof(SuiteTestCreator))
describe SuiteScopeProvider {

	@Inject extension ScopeTestExtension 
	extension SuitePackage = SuitePackage::eINSTANCE

	before '''
		package test
		
		#MySuite
		
		- "My Spec Reference"	
		
	'''.parseSuite

	before '''
		package test
		
		describe "RootSpec"{
			
			describe "SubSpec 1"{
			}
			
			describe "SubSpec 2"{
			}
			
		}
		'''.parseSpec

	fact "spec references are only root specs"{
		specScope should contain "RootSpec"
		specScope should not contain  "SubSpec 1"
	}

	def specScope(){
		return scope(first(typeof(SpecReference)), specReference_Spec)
	}
}