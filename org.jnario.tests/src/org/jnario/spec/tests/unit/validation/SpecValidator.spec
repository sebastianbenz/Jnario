/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.validation

import com.google.inject.Inject
import org.jnario.Assertion
import org.jnario.ExampleRow
import org.jnario.ExampleTable
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester

import static org.jnario.jnario.test.util.Query.*

@InstantiateWith(typeof(SpecTestInstantiator))
describe "SpecValidator"{

	@Inject extension ModelStore modelStore

	it "assert statement must be boolean"{
		parseSpec('
			package bootstrap

			describe "Example"{
				it "invalid assert"{
					assert 1
				}
			} 
		')
		
		val validationResult = validate(typeof(Assertion))
		validationResult.assertErrorContains("invalid type")
	}
	
	it "example table values must not be void"{
		parseSpec('
			package bootstrap

			describe "Example"{
				def examples{
					| a         |
					| throw new Exception() |
				}
			} 
		')
		
		val validationResult = validate(typeof(ExampleRow))
		validationResult.assertErrorContains("void")
	}
	
	it "example table rows must have the same size"{
		parseSpec('
			package bootstrap

			describe "Example"{
				def examples{
					| a | b |
					| 0 |
				}
			} 
		')
		
		val validationResult = validate(typeof(ExampleTable))
		validationResult.assertErrorContains("number")
	}
	   
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}