package org.jnario.feature.jvmmodel

import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step

class Scenarios {
	
	def static allSteps(Scenario scenario){
   		val steps = <Step>newArrayList
   		scenario.steps.forEach[
			steps += it
			steps.addAll(it.and)   			
   		]
   		steps
   	}
	
}