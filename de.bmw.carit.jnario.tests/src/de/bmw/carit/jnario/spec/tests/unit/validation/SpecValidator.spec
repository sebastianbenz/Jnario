package de.bmw.carit.jnario.spec.tests.unit.validation

import com.google.inject.Inject
import de.bmw.carit.jnario.common.Assertion
import de.bmw.carit.jnario.common.ExampleRow
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester

import static de.bmw.carit.jnario.tests.util.Query.*

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
	
	it "example table cells must conform to column type"{
		parseSpec('
			package bootstrap
			import java.util.List
			describe "Example"{
				def examples{
					| List<String> a | 
					| "a"            |
				}
			}  
		')
		
		val validationResult = validate(typeof(ExampleTable))
		validationResult.assertErrorContains("Incompatible types.")
	}
	   
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}