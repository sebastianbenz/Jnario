package org.jnario.feature.tests.unit.feature

import org.jnario.feature.jvmmodel.StepTypeProvider
import org.jnario.feature.feature.FeatureFactory
import org.jnario.feature.feature.FeaturePackage
import org.jnario.runner.CreateWith
import org.jnario.runner.SpecCreator
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore

@CreateWith(typeof(SpecTestCreator))
describe StepTypeProvider {
	
	extension FeatureFactory factory = FeatureFactory::eINSTANCE;
	extension StepTypeProvider = new StepTypeProvider
	extension FeaturePackage pack = FeaturePackage::eINSTANCE
	@Inject extension ModelStore
	 
	fact createGiven.expectedTypes => #[given, givenReference]
	fact createGivenReference.expectedTypes => #[given, givenReference]
	fact createWhen.expectedTypes => #[when, whenReference]
	fact createWhenReference.expectedTypes => #[when, whenReference]
	fact createThen.expectedTypes => #[then, thenReference]
	fact createThenReference.expectedTypes => #[then, thenReference]
	
	fact '''
		Feature: something
		Scenario: scenario
			Given something
			And something else
			And something else
	'''.expectedTypes =>  #[given, givenReference]
	
	def expectedTypes(CharSequence s){
		s.parseScenario
		firstScenario.steps.last.expectedTypes
	}
	
}