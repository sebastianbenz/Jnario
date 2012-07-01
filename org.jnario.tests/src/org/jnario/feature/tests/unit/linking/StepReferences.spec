package org.jnario.feature.tests.unit.linking

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.GivenReference
import org.jnario.feature.feature.Given

@CreateWith(typeof(FeatureTestCreator))
describe "Referencing other Steps"{

	@Inject extension ModelStore m
	
	fact "Steps can reference other steps in the same feature"{
		parseScenario('''
			package test
			
			Feature: My Feature
			
				Scenario: Scenario 1
					Given a step
						val x = "an implementation"
				Scenario: Scenario 2
					Given a step
					
		''')
		first(typeof(GivenReference)).reference => first(typeof(Given))
	}
	
	fact "Steps with trailing whitespace can reference other steps in the same feature"{
		parseScenario('''
			package test
			
			Feature: My Feature
			
				Scenario: Scenario 1
					Given a step
						val x = "an implementation"
				Scenario: Scenario 2
					Given a step	
					
		''')
		first(typeof(GivenReference)).reference => first(typeof(Given))
	}
	
	fact "Steps can reference other steps in different features in the same package"{
		parseScenario('''
			package test
			
			Feature: My Feature 1
			
				Scenario: Scenario 1
					Given a step
						val x = "an implementation"
		''')
		parseScenario('''
			package test
			
			Feature: My Feature 2
				Scenario: Scenario 2
					Given a step
					
		''')
		first(typeof(GivenReference)).reference => first(typeof(Given))
	}
	
	fact "Steps can reference other steps in different features in different packages with an import statement"{
		parseScenario('''
			package test1
			
			Feature: My Feature 1
			
				Scenario: Scenario 1
					Given a step
						val x = "an implementation"
		''')
		parseScenario('''
			package test2
			import test1.*
			Feature: My Feature 2
				Scenario: Scenario 2
					Given a step
					
		''')
		first(typeof(GivenReference)).reference => first(typeof(Given))
	}

}