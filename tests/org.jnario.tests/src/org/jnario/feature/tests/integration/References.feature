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
Feature: References for steps

	Scenario: Defining a step and using it in the same scenario
		CharSequence jnarioFile
		When I have a scenario with reused steps that throw an exception
			'''
			package bootstrap
			Feature: Test
				Scenario: TestScenario 1
					Given step
						throw new RuntimeException()
					
				Scenario: TestScenario 2
					Given step
			'''
			jnarioFile = args.first
		Then the number of failures should be "2"
			jnarioFile.run.failureCount => args.first.toInt
			
	Scenario: Referencing steps with different keyword
		CharSequence jnarioFile
		When I have a scenario with reused steps with different keywords that throw an exception
			'''
				package bootstrap
				Feature: Test
					Scenario: TestScenario 1
						Given step
							throw new RuntimeException()
						
					Scenario: TestScenario 2
						When step
			'''
			jnarioFile = args.first
	 	Then the number of failures should be "2"
	 
	 Scenario: Using fields from other steps
		When I have a scenario with a field
			'''
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
			jnarioFile = args.first
	 	Then it should execute successfully
	 	
	 Scenario: Steps with short names
	 	When I have a scenario with references and short step names (1 word)
	 		'''
	 			package bootstrap
	 			import java.util.*
	 			Feature: Test
	 				Scenario: TestScenario1
	 					int x
	 					Given step
	 						x = 3
	 				Scenario: TestScenario2
	 					Given step
	 					Then step
	 						x => 3
	 		'''
	 		jnarioFile = args.first
	 	Then it should execute successfully
	 		
/* PENDING
	 Scenario: Steps with short names
	 	When I have a scenario with field initialized in a given step
	 		'''
				import java.util.Stack
				
				Feature: Stack
				
				
				Scenario: Stack adding elements
					Stack<String> stack
					Given a stack
						stack= new Stack<String>()
					When I add a value "something"
						stack.add("something")
					Then the stack should contain "something"
						assert stack.contains("something")
				
				Scenario: Stack adding more elements
					Given a stack
					When I add a value "something else"
					Then the stack should contain "something else"
	 		'''
	 		jnarioFile = args.first
	 	Then it should execute successfully	
*/	 	
	 	