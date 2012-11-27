package org.jnario.feature.jvmmodel

import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step

class Scenarios {
	
	def static steps(Scenario scenario){
		scenario.members.filter(typeof(Step))
	}
	
	def static allSteps(Scenario scenario){
   		val steps = <Step>newArrayList
   		scenario.steps.forEach[
			steps += it
			steps.addAll(it.and)   			
   		]
   		steps
   	}
	
}