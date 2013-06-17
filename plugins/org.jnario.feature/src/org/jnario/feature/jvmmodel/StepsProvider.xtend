package org.jnario.feature.jvmmodel

import org.eclipse.emf.ecore.EObject
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.StepImplementation
import org.jnario.feature.feature.FeatureFile

class StepsProvider {
	
	def getSteps(EObject context){
		if(context.eResource == null){
			return emptyList
		}
		val featureFiles = context.eResource.contents.filter(typeof(FeatureFile))
		val features = featureFiles.map[xtendTypes].flatten.filter(typeof(Feature))
		val scenarios = features.map[
			if(background == null){
				return scenarios
			}
			scenarios + #[background]
		].flatten.filterNull
		scenarios.map[steps].flatten.filter(typeof(StepImplementation))
	}
	
}