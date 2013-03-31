/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.naming

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.Step
import org.jnario.feature.jvmmodel.StepExpressionProvider
import org.junit.Ignore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

import static org.jnario.jnario.test.util.Query.*
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.feature.feature.StepReference

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(typeof(FeatureTestCreator))
describe StepExpressionProvider{

	@Inject extension ModelStore modelStore

	fact "should return the name for a step with definition"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario
					Given a step with an implementation
						"the implementation"
		''')
		assert step.expression == subject.expressionOf(step)
	}

	fact "should copy the referenced step's implementation and set the referencing step"{
		parseScenario('''
			Feature: Example
				Scenario: MyScenario 1
					Given a step 
						
				Scenario: MyScenario 2
					Given a step 
						"the implementation"
		''')
		val expr = subject.expressionOf(step)
		assert expr != null
		assert step.expression == expr
		assert (step as StepReference).reference.expression != expr 
	}
	
	def step(){
		return query(modelStore).first(typeof(Step))
	}
}