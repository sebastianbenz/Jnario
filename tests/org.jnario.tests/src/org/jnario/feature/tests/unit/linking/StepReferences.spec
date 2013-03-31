/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.linking

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.GivenReference
import org.jnario.feature.feature.Given

/*
 * Scenario steps can reference other steps with an implementation. It is important
 * to note that these references are aware of the respective namespaces. If you want
 * to reference a step in a different package you need to add a corresponding import statement
 * (see last example).  
 */
@CreateWith(typeof(FeatureTestCreator))
describe "Referencing other Steps"{

	@Inject extension ModelStore m
	
	fact "Steps can reference steps in the same feature"{
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
	
	fact "Steps ignore trailing whitespace when referencing steps"{
		parseScenario('''
			package test
			
			Feature: My Feature
			
				Scenario: Scenario 1
					Given a step
						val x = "an implementation"
				Scenario: Scenario 2
					Given a step	
					//            ^ 
					//   here is a whitespace
		''')
		first(typeof(GivenReference)).reference => first(typeof(Given))
	}
	
	fact "Steps can reference steps in features in the same package"{
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
	
	fact "Referencing steps in a different package requires an import statement"{
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