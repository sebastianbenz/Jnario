package org.jnario.feature.tests.integration

Feature: Defining Feature Bases Classes
	
	Scenario: A simple scenario 
		
		Given a scenario
		'''
		import org.jnario.runner.Extends
		import junit.framework.TestCase

		@Extends(typeof(TestCase)) 
		Feature: Extend Annotation
			Scenario: My Scenario
				Then my scenario class extends test case
					typeof(ExtendAnnotationFeatureMyScenario).superclass => typeof(TestCase)
		'''
		jnarioFile = args.first
		Then it should execute successfully		

	Scenario: Scenario with Background
		
		Given a scenario
		'''
		import org.jnario.runner.Extends
		import junit.framework.TestCase

		@Extends(typeof(TestCase)) 
		Feature: Extend Annotation
			Background:
				Given some background
			Scenario: My Scenario
				Then my scenario class extends test case
					typeof(ExtendAnnotationFeatureBackground).superclass => typeof(TestCase)
		'''
		Then it should execute successfully		
