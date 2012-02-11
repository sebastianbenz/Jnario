package de.bmw.carit.jnario.spec.tests.unit.validation

import static de.bmw.carit.jnario.tests.util.Query.*
import de.bmw.carit.jnario.runner.InstantiateWith
import com.google.inject.Inject
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester
import org.eclipse.emf.ecore.EObject
import de.bmw.carit.jnario.common.Assertion
import de.bmw.carit.jnario.common.ExampleRow
import de.bmw.carit.jnario.common.ExampleTable
import org.eclipse.xtext.xbase.XExpression

@InstantiateWith(typeof(SpecTestInstantiator))
describe "SpecValidator"{

	@Inject ModelStore modelStore

	it "assert statement must be boolean"{
		modelStore.parseSpec('
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
		modelStore.parseSpec('
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
		modelStore.parseSpec('
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