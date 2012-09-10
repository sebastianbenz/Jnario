package org.jnario.feature.tests.unit.naming

import com.google.inject.Inject
import org.jnario.feature.feature.FeaturePackage
import org.jnario.feature.feature.StepReference
import org.jnario.feature.scoping.FeatureScopeProvider
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.jnario.test.util.ScopeTestExtension
import org.jnario.runner.CreateWith

import static org.jnario.lib.JnarioCollectionLiterals.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(FeatureTestCreator))
describe FeatureScopeProvider {
	@Inject extension ScopeTestExtension e
	
	context "StepReference"{
		fact "contains all implemented steps"{
			e.parseFeature('''
			package myPackage
			Feature: MyFeature
			Scenario: MyScenario
				Given a step
					val x = ""
				And a step
				And another step
			''')
			
			targetOperationScope should contain "myPackage.a step"
			targetOperationScope should not contain "myPackage.another step"
		}
	}
	
	
	def targetOperationScope(){
		val source = first(typeof(StepReference))
		scope(source, FeaturePackage::eINSTANCE.stepReference_Reference)
	} 
}