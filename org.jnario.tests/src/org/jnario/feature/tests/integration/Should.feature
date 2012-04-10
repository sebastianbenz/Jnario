package org.jnario.feature.tests.integration
Feature: Should
	
	Scenario: Features with should
		
		Given a Scenario
		When defining the expected behavior
		Then it should be possible to use 'should'
			true should be true
			1 + 1 should not be 1
			"something" should not be null 
		And the shortcut '=>'
			1 + 1 => 2 
			"a string" => typeof(String)