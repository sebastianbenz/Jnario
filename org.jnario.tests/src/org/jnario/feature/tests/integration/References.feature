/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static extension org.jnario.jnario.test.util.FeatureExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@org.junit.Ignore
Feature: References for steps

	Scenario: Defining a step and using it in the same scenario
		public String jnarioFile
		Given a scenario with reused steps
			jnarioFile = "
				package bootstrap
				Feature: Test
					Scenario: TestScenario 1
						Given step
							throw new RuntimeException()
						
					Scenario: TestScenario 2
						Given step
				"
		When I run it it should fail
			jnarioFile.execute.failureCount => 2
			
	Scenario: Referencing steps with different keyword
		Given a scenario with reused steps
			jnarioFile = '
				package bootstrap
				Feature: Test
					Scenario: TestScenario 1
						Given step
							throw new RuntimeException()
						
					Scenario: TestScenario 2
						When step
				'
	 	When I run it it should fail
	 
	 Scenario: Using fields from other steps
		Given a scenario with a field
			jnarioFile = '''
				package bootstrap
				import java.util.*
				Feature: Test
					Scenario: TestScenario 1
						List<String> values = new ArrayList()
						Given a list
							values += "hello"
						
					Scenario: TestScenario 2
						Given a list
						Then it should have contents
							values.size => 1
				'''
	 	Then it should be successful
	 	
	 	