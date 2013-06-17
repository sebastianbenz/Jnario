package org.jnario.feature.tests.unit.feature

import org.jnario.feature.jvmmodel.StepTypeProvider
import static org.jnario.feature.jvmmodel.StepTypeProvider.*
import org.jnario.feature.feature.FeatureFactory
import org.jnario.feature.feature.FeaturePackage
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore

@CreateWith(typeof(SpecTestCreator))
describe StepTypeProvider {
	
	extension FeatureFactory factory = FeatureFactory::eINSTANCE;
	extension StepTypeProvider = new StepTypeProvider
	extension FeaturePackage pack = FeaturePackage::eINSTANCE
	@Inject extension ModelStore
	 
	fact createGiven.expectedTypes => GIVEN
	fact createGivenReference.expectedTypes => GIVEN
	fact createWhen.expectedTypes => WHEN
	fact createWhenReference.expectedTypes => WHEN
	fact createThen.expectedTypes => THEN
	fact createThenReference.expectedTypes => THEN
	
	fact '''
		Feature: something
		Scenario: scenario
			Given something
			And something else
			And something else
	'''.expectedTypes =>  GIVEN
	
	fact "calculates actual type"{
	'''
		Feature: something
		Scenario: scenario
			Given something
			But something else
			And something else
	'''.actualType =>  givenReference
	}
	
	def actualType(CharSequence s){
		s.parseScenario
		firstScenario.steps.last.actualType
	}
	
	
	def expectedTypes(CharSequence s){
		s.parseScenario
		firstScenario.steps.last.expectedTypes
	}
	
}