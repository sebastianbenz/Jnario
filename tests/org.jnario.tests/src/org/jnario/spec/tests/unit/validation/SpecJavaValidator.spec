/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.validation

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester
import org.jnario.Assertion
import org.jnario.ExampleRow
import org.jnario.ExampleTable
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.validation.SpecJavaValidator

import static org.jnario.jnario.test.util.Query.*
import org.eclipse.xtext.xbase.XBinaryOperation
import org.jnario.jnario.test.util.Resources

@CreateWith(typeof(SpecTestCreator))
describe SpecJavaValidator{

	@Inject extension ModelStore modelStore

	fact "assert statement must be boolean"{
		parseSpec('
			package bootstrap

			describe "Example"{
				fact "invalid assert"{
					assert 1
				}
			} 
		')
		
		val validationResult = validate(typeof(Assertion))
		validationResult.assertErrorContains("invalid type")
	}
	
	fact "duplicate names of example methods are ignored"{
		parseSpec('
			package bootstrap

			describe "Example"{
				fact "a***" 
      			fact "a???" 
			} 
		')
		
		val validationResult = validate(typeof(ExampleGroup))
		validationResult.assertOK
	}
	
	fact "specs without description but different types are OK"{
		parseSpec('
		  package bootstrap

		  describe "something"{
			  describe String{
			  }
			  describe Integer{
			  }	
		  }
		')
		val validationResult = validate(typeof(ExampleGroup))
		validationResult.assertOK
	}
	
	fact "specs with different method contexts are OK"{
		parseSpec('
			import java.util.Stack
		  	describe Stack{
				context push(E){
				}
				context push{
				}
			}  
		')
		val validationResult = validate(typeof(ExampleGroup))
		validationResult.assertOK
	}
	
	fact "specs without description and same types are not OK"{
		parseSpec('
		  package bootstrap

		  describe "something"{
			  describe String{
			  }
			  describe String{
			  }	
		  }
		')
		val validationResult = validate(typeof(ExampleGroup))
		validationResult.assertErrorContains("The spec 'String' is already defined.")
	}
	
	fact "example table values must not be void"{
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
	
	fact "example table rows must have the same size"{
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
	
	fact "should can compare objects of the same type"{
		parseSpec('
			describe "Example"{
				fact 1 => 1
			} 
		')
		val validationResult = validate(typeof(XBinaryOperation))
		validationResult.assertOK
	}
	
	fact "should can compare object with a class"{
		parseSpec('
			describe "Example"{
				fact 1 => typeof(int)
			} 
		')
		val validationResult = validate(typeof(XBinaryOperation))
		validationResult.assertOK
	}
	
	fact "should can compare with matcher"{
		parseSpec('
			import static org.hamcrest.CoreMatchers.*
			describe "Example"{
				fact 1 => notNullValue
			} 
		')
		val validationResult = validate(typeof(XBinaryOperation))
		validationResult.assertOK
	}
	
	def validate(Class<? extends EObject> type){
		Resources::addContainerStateAdapter(resourceSet);
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
	
}