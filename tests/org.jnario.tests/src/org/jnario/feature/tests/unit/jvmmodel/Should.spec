package org.jnario.feature.tests.unit.jvmmodel

import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor

@CreateWith(typeof(FeatureTestCreator))
describe "Should"{
	@Inject extension BehaviorExecutor
	
	fact "Shows correct failure message in reused steps"{
		'''
		package demo

		Feature: Failure messages when reusing steps
		
			Scenario: name
			
				Given a step
					try{
						1 + 1 => 3
					}catch(AssertionError e){
						e.message should contain "1 + 1 => 3"
					}
					
			Scenario: name 2		
				Given a step
				
		'''.executesSuccessfully
	} 
}