package org.jnario.feature.jvmmodel

import static org.eclipse.xtext.EcoreUtil2.*
import org.jnario.feature.feature.Step
import org.eclipse.xtend.core.xtend.XtendMember
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Background

class VisibleMembersCalculator {
	
	def allVisibleMembers(Step step){
   		val scenario = getContainerOfType(step, typeof(Scenario))
		if(scenario == null){
			return <XtendMember>emptyList
		}
		allVisibleMembers(scenario)
   	}

	def allVisibleMembers(Scenario scenario) {
		var members = scenario.members
		if(scenario instanceof Background){
			return members
		}
		val feature = getContainerOfType(scenario, typeof(Feature))
		if(feature.background == null){
			return members
		}
		return members + feature.background.members
	}
	
}