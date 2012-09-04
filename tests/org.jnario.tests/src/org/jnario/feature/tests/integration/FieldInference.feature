/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import static extension org.jnario.jnario.test.util.ResultMatchers.*
import org.jnario.jnario.test.util.FeatureExecutor
 
@CreateWith(typeof(FeatureTestCreator))
Feature: Field Inference

	Scenario: Inferring Fields from other Scenario
	
		When I have a feature with two scenarios
			'''
			Feature: Feature 1
				Scenario: My Scenario
					String myString
					Given a string "value"
						myString = args.first
				Scenario: My Scenario 2
					Given a string "test"
					Then my string is "test"
						myString => args.first  
			'''
			jnarioFile = args.first
		Then it should execute successfully

	Scenario: Inferring Fields from Scenario in different Features
		@Inject FeatureExecutor runner
		CharSequence feature1
		CharSequence feature2
	
		When I have a feature
			'''
			Feature: Feature 1
				Scenario: My Scenario
					String myString
					Given a string "value"
						myString = args.first
			'''
			feature1 = args.first
		And another feature
			'''
			Feature: Feature 2
				Scenario: My Scenario 2
					Given a string "test"
					Then my string is "test"
						myString => args.first   
			'''
			feature2 = args.first
		Then both should execute successfully 
			runner.execute(feature1) => isSuccessful
			runner.execute(feature2) => isSuccessful

	Scenario: Inferring Fields from Background
		When I have a feature with a background and two scenarios
			'''
			Feature: My Feature
				Background: with field
					String myString
					
				Scenario: My Scenario
					Given a string "value"
						myString = args.first
				Scenario: My Scenario 2
					Given a string "test"
					Then my string is "test"
						myString => args.first  
			'''
			jnarioFile = args.first
		Then it should execute successfully
		
	Scenario: Inferring Fields from Background in different Feature
		When I have a feature
			'''
			Feature: Feature 1
				Background:
					String myString
				
				Scenario: My Scenario
					Given a string "value"
						myString = args.first
			'''
			feature1 = args.first
		And another feature 
			'''
			Feature: Feature 2
				Scenario: My Scenario 2
					Given a string "test"
					Then my string is "test"
						myString => args.first   
			'''
			feature2 = args.first
		Then both should execute successfully 
 