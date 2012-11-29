/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import org.jnario.feature.feature.FeatureFactory
import org.eclipse.xtext.xbase.XbaseFactory
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Background

class Features {
	
	static val factory = FeatureFactory::eINSTANCE
	
	def static step(String name){
		val step = factory.createGiven
		step.name = name
		step
	}
	
	def static stepWithoutImplementation(){
		step("Given a pending step")
	}
	
	def static implementedStep(){
		val step = step("Given a step with implementation")
		step.expression = implementation
		step
	}
	
	def static implementation(){
		val blockExpression = XbaseFactory::eINSTANCE.createXBlockExpression
		blockExpression.expressions += XbaseFactory::eINSTANCE.createXFeatureCall
		blockExpression
	}
	
	def static scenarioWith(Step... steps){
		scenarioWith("Scenario: with steps", steps)
	}
	
	def static scenarioWith(String name, Step... steps){
		val scenario = scenario(name)
		scenario.steps.addAll(steps)
		scenario
	}
	
	def static scenario(String name){
		val scenario = factory.createScenario
		scenario.name = name
		return scenario
	}
	
	def static background(String name){
		val scenario = factory.createBackground
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
	
	def static implementedScenario(){
		val scenario = scenarioWith(implementedStep)
		scenario
	}
	
	def static scenarioWithoutSteps(){
		scenario("Scenario: pending")
	}
	
	def static feature(String name){
		val feature = factory.createFeature
		feature.name = name
		return feature
	}
	
	def static featureWithBackgroundAndScenario(Background background, Scenario... scenarios){
		val feature = featureWith(scenarios)
		feature.background = background
		feature
	}
	
	def static featureWith(Scenario... scenarios){
		val feature = feature("Feature: with scenarios")
		feature.scenarios.addAll(scenarios)
		feature
	}
	
	def static implementedBackground(){
		val bg = background("Background: with implemented step")
		bg.steps += implementedStep
		bg
	}
	
	def static backgroundWithoutSteps(){
		val bg = background("Background: without steps")
		bg
	}
	
	def static featureWithBackground(Background scenario){
		val feature = feature("Feature: with background")
		feature.background = scenario
		feature
	}
}
