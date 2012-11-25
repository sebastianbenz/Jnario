package org.jnario.feature.tests.unit.compiler

import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.runner.CreateWith

@CreateWith(typeof(FeatureTestCreator))
describe "Feature Compiler" {
	@Inject extension BehaviorExecutor
	
	fact "Handles empty closures correctly"{
		'''
		Feature: Empty Closures
			Scenario: Defining Empty Closures
			When I define an empty closure
				[|].apply 
			And  I define an empty closure
		'''.executesSuccessfully
	} 
	
	fact "compiles rich strings"{
		"
		Feature: Rich Strings
			Scenario: A
			When I a rich strings
				val x = 'world'
				'''hello «x»'''.toString => 'hello world'
		".executesSuccessfully
	}
}