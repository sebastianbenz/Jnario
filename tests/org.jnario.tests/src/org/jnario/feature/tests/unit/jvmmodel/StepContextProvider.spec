package org.jnario.feature.tests.unit.jvmmodel

import org.jnario.feature.jvmmodel.StepContextProvider
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.StepImplementation
import org.eclipse.xtend.core.xtend.XtendField

@CreateWith(typeof(FeatureTestCreator))
describe StepContextProvider {

	@Inject extension ModelStore m

	context usedFields{
		
		fact "returns all called fields of scenario"{
			val usedFields = usedFields('''
			Feature: My Feature
				Scenario: My Scenario
					val field1 = ""
					val field2 = ""

				Given a step
					println(field1)
			''')
			
			usedFields => fields("field1")
		}
		
		fact "returns all called fields of scenario and background"{
			val usedFields = usedFields('''
			Feature: My Feature
				Background: 
					val field3 = ""
					val field4 = ""
				Scenario: My Scenario
					val field1 = ""
					val field2 = ""

				Given a step
					println(field1)
					println(field3)
			''')
			
			usedFields => fields("field1", "field3")
		}
		
	}
	
	def fields(String... names){
		val expected = names.toSet
		m.filter(typeof(XtendField)).filter[
			expected.contains(it.name)
		].toSet
	}
	
	def usedFields(CharSequence content){
		m.parseScenario(content)
		val step = m.first(typeof(StepImplementation))
		subject.usedFields(step)
	}
}