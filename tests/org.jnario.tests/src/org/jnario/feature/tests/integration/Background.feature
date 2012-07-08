/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*
import static extension org.jnario.jnario.test.util.FeatureExecutor.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Backgrounds

	Scenario: It is possible to add a background to a feature
		CharSequence jnarioFile
		When I have a feature with a background
			'''
				package bootstrap
				Feature: Some feature
					Background:
						Given a user name
							val x = "an implementation"
					Scenario: Scenario 1
					Scenario: Scenario 2
			'''
			jnarioFile = args.first
		Then it should execute successfully
			jnarioFile.successful
			

	Scenario: Given methods from backgrounds are generated in every scenario class
		CharSequence jnarioFile
		When I have a feature with a background
			'''
				package bootstrap
				Feature: Some feature
					Background:
						Given a user name
							throw new RuntimeException()
					Scenario: Scenario 1
					Scenario: Scenario 2
			'''
			jnarioFile = args.first
		Then every class should have a method that throws a RuntimeExeception
			jnarioFile.run.failureCount => 2
			
	Scenario: Using fields from background steps
		CharSequence jnarioFile
		When I have a scenario with a field
			 '''
				package bootstrap
				import java.util.*
				Feature: Test
					Background: 
						List<String> values = new ArrayList()
						Given a list
							values += "hello"
						
					Scenario: TestScenario 2
						Then it should have contents
							values.size => 1
			'''
			jnarioFile = args.first
	 	Then it should execute successfully
			
	Scenario: Instantiating Objects in Backgrounds
		CharSequence jnarioFile
		When I have a feature with a background
			'''
				package bootstrap
				import org.jnario.feature.tests.integration.Calculator
				Feature: Calculator
				  Background:
				   int result 
				   Calculator calculator
				   Given a calculator
				       calculator = new Calculator()
				  Scenario: Adding two numbers 1 
				   When I enter two numbers "20" and "70"
				        result = calculator.add(args.first.toInt, args.second.toInt)
				   Then it returns "90"
				     	result => args.first.toInt
				  Scenario: Adding two numbers 2
				    When I enter two numbers "20" and "80"
				      Then it returns "100"
			'''	
			jnarioFile = args.first	
	 	Then it should execute successfully
	 	