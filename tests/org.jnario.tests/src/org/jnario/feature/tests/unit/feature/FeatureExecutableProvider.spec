package org.jnario.feature.tests.unit.feature

import com.google.inject.Inject
import org.jnario.Executable
import org.jnario.feature.jvmmodel.FeatureExecutableProvider
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith

import static org.jnario.lib.JnarioCollectionLiterals.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(FeatureTestCreator))
describe FeatureExecutableProvider {
	
	@Inject extension ModelStore
	fact "returns background and scenarios"{
		'''
		Feature: My feature
		Background: My Background
		Scenario: My first Scenario
		Scenario: My second Scenario
		'''.parseScenario
		feature().executables => list(scenario("Background: My Background"), scenario("Scenario: My first Scenario"), scenario("Scenario: My second Scenario"))
	}
	
	fact "returns steps"{
		'''
		Feature: My feature
		Scenario: My first Scenario
			Given something
		'''.parseScenario
		scenario("Scenario: My first Scenario").executables => list(step("Given something"))
	}
	
	fact "returns sub steps"{
		'''
		Feature: My feature
		Scenario: My first Scenario
			Given something
			 And something else
		'''.parseScenario
		scenario("Scenario: My first Scenario").executables => list(step("Given something"), step("And something else"))
	}
	
	def executables(Executable spec){
		subject.getExecutables(spec) 
	}
} 