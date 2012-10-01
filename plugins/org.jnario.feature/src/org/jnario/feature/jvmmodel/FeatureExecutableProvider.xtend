package org.jnario.feature.jvmmodel

import org.jnario.jvmmodel.ExecutableProvider
import org.jnario.Executable
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import static extension org.jnario.feature.jvmmodel.Scenarios.*
import java.util.List

class FeatureExecutableProvider implements ExecutableProvider {
	
	override getExecutables(Executable specification) {
		specification.doGetExecutables
	}
	 
	def dispatch List<? extends Executable> doGetExecutables(Scenario scenario){
		scenario.allSteps
	}
	
	def dispatch List<? extends Executable> doGetExecutables(Executable e){
		emptyList
	}
	
	def dispatch List<? extends Executable> doGetExecutables(Feature feature){
		if(feature.background == null){
			feature.scenarios
		}
		val result = <Scenario>newArrayList(feature.background)
		result.addAll(feature.scenarios)
		result
	}
	
}