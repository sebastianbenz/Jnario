package de.bmw.carit.jnario.spec.tests.unit.validation

import static de.bmw.carit.jnario.tests.util.Query.*
import de.bmw.carit.jnario.runner.InstantiateWith
import com.google.inject.Inject
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import de.bmw.carit.jnario.tests.util.ModelStore
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester
import org.eclipse.emf.ecore.EObject
import de.bmw.carit.jnario.spec.spec.Assertion

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
	
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}