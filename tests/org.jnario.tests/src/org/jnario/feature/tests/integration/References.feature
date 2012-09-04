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
	 		
	 Scenario: Field initialization
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
	 	
	 	
	 Scenario: Steps 
	 	When I have a scenario with a variable that is initialized 
	 	'''
	 	import java.util.concurrent.TimeUnit

		Feature: Test
		
		Scenario: Scenario
		When test
		val test = TimeUnit::MINUTES
		
		Scenario: Scenario 2
		When test
	 	'''
	 	 	jnarioFile = args.first
	 	Then it should execute successfully	
	 	
	 Scenario: Extension fields 
	 	When I have a scenario with a variable that is initialized 
	 	'''
	 	import org.jnario.feature.tests.integration.MyExtension
		Feature: Extension Fields
			Scenario: A scenario with an extension field
				extension MyExtension myExtension = new MyExtension
				val x = <String>newArrayList
				Given an implementation that uses the extension
					x.myExtensionMethod
				Then extension is called
					assert myExtension.called
								
			Scenario: Another scenario that uses the extension
				Given an implementation that uses the extension
				Then extension is called
					And we can use it inside other steps
						x.myExtensionMethod
	 	'''
	 	 	jnarioFile = args.first
	 	Then it should execute successfully	
	 	
	 Scenario: Using closures in steps
	  	When I have a scenario which uses closures
	  	'''
	  	Feature: Using Closures

			Scenario: Steps which define closures
				var colors = list("green", "blue")
				When we convert all strings to uppercase
					colors = colors.map[toUpperCase]
				Then they are uppercase
					colors => list("GREEN", "BLUE")
		
			Scenario: Steps which reference steps with closures
				var colors = list("red", "blue")
				When we convert all strings to uppercase
				Then they are uppercase
					colors => list("RED", "BLUE")
	  	'''
	  		jnarioFile = args.first
	  	Then it should execute successfully	
	  	
		Scenario: Multiple Step References (causes problem when copier does not clear its cache)
			When I have a feature with multiple scenarios
			'''
			Feature: Field Inference
			 
				Scenario: Scenario 1
					CharSequence jnarioFile2
			 		Then it should execute successfully
						println(jnarioFile2)
			                  
				Scenario: Scenario 2
					CharSequence feature1
					Then both should execute successfully 
						println(feature1)
			                          
				Scenario: Scenario 3
					When I have a feature with a background and two scenarios 'Feature: Feature 1'         
						jnarioFile2 = args.first
					Then it should execute successfully
					     
				Scenario: Scenario 4
					When I have a feature 'Feature: Feature 1'
						feature1 = args.first
					Then both should execute successfully 
					'''
				jnarioFile = args.first
			Then it should execute successfully	
	 