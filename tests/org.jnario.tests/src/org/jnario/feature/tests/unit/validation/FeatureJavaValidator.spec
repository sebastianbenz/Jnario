/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.validation

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.validation.FeatureJavaValidator
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.jnario.test.util.ModelStore
import org.jnario.runner.CreateWith

import static org.jnario.jnario.test.util.Query.*

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(typeof(FeatureTestCreator))
describe FeatureJavaValidator{

	@Inject extension ModelStore modelStore

	context "Features must have descriptions"{
		fact '''
			Feature: 
		'''.select(typeof(Feature)).assertErrorContains("description")
	}
	
	context "Scenarios must have different names"{
		fact '''
			Feature: My Feature
			Scenario: Hallo
			Scenario: Hallo
		'''.select(typeof(Feature)).assertErrorContains("Duplicate scenario")
	}
	
	context "Scenarios must have descriptions"{
		fact '''
			Feature: A Feature
				Scenario:
				
		'''.select(typeof(Scenario)).assertErrorContains("description")
	}
	
	context "Steps must have descriptions"{
		fact '''
			Feature: A feature
				Scenario: A scenario
				 	Given 
				 	When 
				 	Then 
				 	
		'''.allOf(typeof(Step))[assertErrorContains("description")]
	}
	
	fact "no name clash between features and imported types"{
		'''
			import java.util.Stack
			Feature: Stack
			Scenario: Example
				Stack stack
		'''.parseScenario
		validate(typeof(XtendFile)).assertOK
	}
	
	def select(CharSequence input, Class<? extends EObject> type){
		modelStore.parseScenario(input)
		validate(type)
	}
	
	def allOf(CharSequence input, Class<? extends EObject> type, Procedures$Procedure1<AssertableDiagnostics> test){
		modelStore.parseScenario(input)
		val steps = query(modelStore).allOf(type)
		steps.forEach[
			val result = RegisteredValidatorTester::validateObj(it)
			test.apply(result)
		]
	}
	
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}