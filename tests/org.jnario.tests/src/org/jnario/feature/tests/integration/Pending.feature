/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*
import com.google.inject.Inject
import org.jnario.jnario.test.util.FeatureExecutor
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@CreateWith(typeof(FeatureTestCreator))
Feature: Pending steps
	
	Scenario: When one step of a scenario is pending then all following should be pending
		@Inject FeatureExecutor runner
		Given a scenario
		'''
			Feature: With pending steps
				Scenario: Scenario with pending steps
					Given is implemented
						var x = 3
					When is not implemented
					Then is also implemented
						3 => 3
		'''
		Then it should execute successfully
		And the expected number of ignored steps is "2"
			runner.execute(jnarioFile) => ignoreCountIs(args.first.toInt)
			
	Scenario: When an and step is pending the following steps should be pending
	
		Given a scenario
		'''
			Feature: With pending steps
				Scenario: Scenario with pending steps
					int x
					Given does something
						x = 3
					And a not implemented step
					When is implemented with
						x = x + 5
					Then does also something
						x => 8
		'''
		Then it should execute successfully
		And the expected number of ignored steps is "3"
		
	Scenario: When a step of a background all following steps and all scenario steps should be pending
		Given a scenario
		'''
			Feature: With pending steps
				Background:
					int x
					Given a variable x
						x = 3
					And has no implementation
				Scenario: Scenario with pending steps
					Given a variable y
						var y = 3
					When something is added to x
						x = x + 5
					Then there should be the corresponding result
						x => 8
		'''
		Then it should execute successfully
		And the expected number of ignored steps is "4"