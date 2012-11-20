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
				Then my feature class extends test case
					typeof(ExtendAnnotationFeature).superclass => typeof(TestCase)
				And my scenario class extends my feature class
					typeof(ExtendAnnotationFeatureMyScenario).superclass => typeof(ExtendAnnotationFeature)
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
				Then my feature class extends test case
					typeof(ExtendAnnotationFeature).superclass => typeof(TestCase)
				And my scenario class extends my background class
					typeof(ExtendAnnotationFeatureMyScenario).superclass => typeof(ExtendAnnotationFeatureBackground)
				And my background class extends my feature class
					typeof(ExtendAnnotationFeatureBackground).superclass => typeof(ExtendAnnotationFeature)
		'''
		Then it should execute successfully		
