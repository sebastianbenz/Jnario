package org.jnario.feature.tests.integration

import static extension org.jnario.jnario.test.util.FeatureExecutor.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.FeatureExecutor
import static extension org.jnario.jnario.test.util.ResultMatchers.*
 
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
		@Inject extension FeatureExecutor 
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
