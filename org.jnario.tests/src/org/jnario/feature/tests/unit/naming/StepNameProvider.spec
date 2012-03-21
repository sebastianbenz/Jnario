/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.naming

import com.google.inject.Inject
import org.jnario.runner.InstantiateWith

import static org.jnario.jnario.test.util.Query.*
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.FeatureFactory

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@InstantiateWith(typeof(SpecTestInstantiator))
describe StepNameProvider{

	@Inject extension ModelStore modelStore
	
	fact "should return null if the step has no name"{
		assert subject.nameOf(emptyStep) == null
	}
	
	fact "should return null if the step has no reference"{
		assert subject.nameOf(emptyRef) == null
	}
	
	fact "should return the name for a step with definition"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario
					Given a step with an implementation
						"the implementation"
		''')
		
		assert stepName == "Given a step with an implementation"
	}
	
	fact "should return the name for a step with resolved reference"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario 2
					Given a step with a resolved reference
				Scenario: MyScenario 1
					Given a step with a resolved reference
						"implementation"
		''')
		
		assert stepName == "Given a step with a resolved reference"
	}
	
	fact "should return the name for a step with unresolved reference"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario 2
					Given a step with an unresolved reference
		''')
		
		assert stepName == "Given a step with an unresolved reference"
	}
	
	def stepName(){
		val step = query(modelStore).first(typeof(Step))
		return subject.nameOf(step)
	}
	
	def emptyStep(){
		return FeatureFactory::eINSTANCE.createGiven
	}
	
	def emptyRef(){
		return FeatureFactory::eINSTANCE.createGivenReference
	}
	
}