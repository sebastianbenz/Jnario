package org.jnario.jnario.test.util

import org.jnario.feature.feature.FeatureFactory

class Features {
	
	static val factory = FeatureFactory::eINSTANCE
	
	def static scenario(String name){
		val scenario = factory.createScenario
		scenario.name = name
		return scenario
	}
	
	def static scenario(String name, String featureName){
		val scenario = factory.createScenario
		scenario.name = "Scenario: " + name
		val feature = feature(featureName)
		feature.scenarios += scenario
		return scenario
	}
	
	def static feature(String name){
		val feature = factory.createFeature
		feature.name = name
		return feature
	}
}