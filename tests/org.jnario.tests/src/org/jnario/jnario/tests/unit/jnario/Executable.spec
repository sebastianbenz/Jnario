package org.jnario.jnario.tests.unit.jnario

import org.jnario.Executable
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup

import static org.jnario.jnario.test.util.Features.*
import static org.jnario.jnario.test.util.Specs.*
import org.jnario.suite.suite.Suite
import static org.jnario.jnario.test.util.Suites.*

describe Executable{
	
	context isPending{
		describe Feature{
			fact feature("Without scenarios and without background").isPending() should be true
			fact featureWith(implementedScenario).isPending() should be false
			fact featureWith(scenarioWithoutSteps, implementedScenario).isPending() should be true
			fact featureWithBackground(implementedBackground).isPending() should be true
			fact featureWithBackground(backgroundWithoutSteps).isPending() should be true
			fact featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario).isPending() should be true
			fact featureWithBackgroundAndScenario(implementedBackground, implementedScenario).isPending() should be false
		}
		
		describe Scenario{
			fact scenario("Without steps").isPending() should be true
			fact scenarioWith(stepWithoutImplementation).isPending() should be true
			fact scenarioWith(implementedStep).isPending() should be false
			fact scenarioWith(stepWithoutImplementation, implementedStep).isPending() should be true
		}
		 
		describe Step{
			fact stepWithoutImplementation.isPending() should be true
			fact implementedStep.isPending() should be false
		}
		
		describe Example{
			fact pendingExample.isPending() should be true
			fact implementedExample.isPending() should be false
		}
		
		describe ExampleGroup{
			fact exampleGroupWith(pendingExample).isPending should be true
			fact exampleGroupWith(implementedExample).isPending should be false
			fact exampleGroupWith(pendingExample, implementedExample).isPending should be true
		}
		
		describe Suite{
			fact "Suites do not support isPending"{
				suite("A suite").isPending throws UnsupportedOperationException
			}
		}
	}
}