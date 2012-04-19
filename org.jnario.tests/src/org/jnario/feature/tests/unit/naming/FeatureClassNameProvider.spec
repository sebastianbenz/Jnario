package org.jnario.feature.tests.unit.naming

import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.feature.feature.FeatureFactory
import org.jnario.JnarioFactory
import org.eclipse.emf.ecore.EObject

describe FeatureClassNameProvider {

	static FeatureFactory factory = FeatureFactory::eINSTANCE
	
	context getClassName(Feature){
		def examples{
			| name					| expectedClassName 	|
			| "Sample"				| "SampleFeature"		|
			| ""					| "FeatureFeature"		|
			| "  Sample"			| "SampleFeature"		|
			| "hello world"			| "HelloWorldFeature"	|
			| "$hello %& world"		| "HelloWorldFeature"	|
		}
		fact "examples work"{
			examples.forEach[
				className(feature(name)) => expectedClassName
			]
		}
	}
	
	context getClassName(Background){
		def examples{
			| name			 	| feature		| expectedClassName 				|
			| "" 		 		| "Sample"		| "SampleFeatureBackground"			|
			| "Stuff"	 		| "Ha ha"		| "HaHaFeatureStuff"	|
			| "Do Stuff"  		| "Sample"		| "SampleFeatureDoStuff" 	|
			| "% Do$% Stuff" 	| "$$Sample"	| "SampleFeatureDoStuff" 	|
		}
		fact "examples work"{
			examples.forEach[
				className(background(name, feature)) => expectedClassName
			]
		}
	}
	
	context getClassName(ExampleTable){
		def examples{
			| name			 	| scenario 			| feature		| expectedClassName 					|
			| "" 		 		| "Das Szenario" 	| "Sample"		| "SampleFeatureDasSzenarioExamples"	|
			| "Samples"	 		| "Das Szenario" 	| "Sample"		| "SampleFeatureDasSzenarioSamples"		|
			| "Many Samples"	| "Das Szenario" 	| "Sample"		| "SampleFeatureDasSzenarioManySamples"	|
			| "% Many% Samples" | "Das Szenario" 	| "Sample"		| "SampleFeatureDasSzenarioManySamples"	|
		}
		fact "examples work"{
			examples.forEach[
				className(examples(name, scenario, feature)) => expectedClassName
			]
		}
	}
	
	def className(EObject obj){
		subject.getClassName(obj)
	}
	
	def background(String backgroundName, String featureName){
		val result = factory.createBackground
		result.name = "Background: " + backgroundName
		val feature = feature(featureName)
		feature.background = result
		return result
	}
	
	def examples(String examplesName, String scenarioName, String featureName){
		val result = JnarioFactory::eINSTANCE.createExampleTable
		result.name = "Examples: " + examplesName
		val scenario = scenario(scenarioName, featureName)
		scenario.examples += result
		return result
	}
	
	def scenario(String name, String featureName){
		val scenario = factory.createScenario
		scenario.name = "Scenario: " + name
		val feature = feature(featureName)
		feature.scenarios += scenario
		return scenario
	}
	
	def feature(String name){
		val feature = factory.createFeature
		feature.name = "Feature: " + name
		return feature
	}

}