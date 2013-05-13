package org.jnario.feature.tests.unit.naming

import static org.junit.Assert.*
import org.jnario.feature.naming.FeatureQualifiedNameProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.jnario.feature.feature.Step
import static org.eclipse.xtext.xbase.lib.IterableExtensions.*

@CreateWith(typeof(FeatureTestCreator))
describe FeatureQualifiedNameProvider {

	@Inject extension ModelStore 
	@Inject IQualifiedNameConverter converter


	context "Package name"{
		fact "package name is prepended"{
			stepName("Given a step", "myPackage") should startWith("myPackage.")
		}
		
		fact "package name is separated by '.'"{
			stepName("Given a step", "myPackage.subpackage") should startWith("myPackage.subpackage.")
		}
		
		fact "default package name is 'features'"{
			stepName("Given a step", null) should startWith("features.")
		}
	}

	context "Step Name"{
		def examples{
			| description					| name									| expected									|
			| "strips keyword"				| "Given a step with implementation"	| "myPackage.a step with implementation"	|
			| "strips dot at end" 			| "Given a step with implementation."	| "myPackage.a step with implementation"	|
			| "strips argument values" 		| "Given a step with \"arg\"."			| 'myPackage.a step with ""'				|
			| "removes double spaces" 		| "Given  two spaces"					| "myPackage.two spaces"					|
			| "removes double tabs" 		| "Given a		two tabs"				| "myPackage.a two tabs"						|
			| "removes space after tab"		| "Given a	 space after tab"			| "myPackage.a space after tab"				|
			| "removes space at end"		| "Given space at end "					| "myPackage.space at end"					|
		}
		fact "StepImplementation"{
			IterableExtensions::forEach(examples)[assertEquals(description, expected, name.implementedStepName); clear]
		}
		
		fact "StepReference"{
			IterableExtensions::forEach(examples)[assertEquals(description, expected, name.stepName); clear]
		}
	}
	
	def implementedStepName(CharSequence s){
		'''
		«s»
		val x = ""
		'''.stepName
	}
	
	def stepName(CharSequence s){
		s.stepName("myPackage")
	}
	
	def stepName(CharSequence s, String packageName){
		val input = '''
			«IF packageName != null»
			package «packageName»
			«ENDIF»
			Feature: MyFeature
			Scenario: The Scenario
			«s»
		'''
		parseScenario(input)
		converter.toString(subject.getFullyQualifiedName(first(typeof(Step))))
	}
}