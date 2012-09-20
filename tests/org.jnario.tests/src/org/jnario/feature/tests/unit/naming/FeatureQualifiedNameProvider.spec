package org.jnario.feature.tests.unit.naming

import org.jnario.feature.naming.FeatureQualifiedNameProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.jnario.feature.feature.Step

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

	context "StepImplementation"{
		fact "strips keyword"{
			"Given a step with implementation".implementedStepName => "myPackage.a step with implementation"
		}
		fact "strips dot at end"{
			"Given a step with implementation.".implementedStepName => "myPackage.a step with implementation"
		}
		fact "strips argument values"{
			"Given a step with \"arg\".".implementedStepName => 'myPackage.a step with ""'
		}
	}
	
	context "StepReference"{
		fact "strips keyword"{
			"Given a step with implementation".implementedStepName => "myPackage.a step with implementation"
		}
		fact "strips dot at end"{
			"Given a step with implementation.".stepName => "myPackage.a step with implementation"
		}
		fact "strips argument values"{
			"Given a step with \"arg\".".stepName => 'myPackage.a step with ""'
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