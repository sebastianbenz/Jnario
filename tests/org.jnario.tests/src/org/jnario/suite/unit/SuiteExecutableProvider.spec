package org.jnario.suite.unit

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SuiteTestCreator
import org.jnario.runner.CreateWith
import org.jnario.suite.jvmmodel.SuiteExecutableProvider

import static org.jnario.lib.JnarioCollectionLiterals.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SuiteTestCreator))
describe SuiteExecutableProvider {
	
	@Inject extension ModelStore m
	
	before{
		parseSpec('''
			package demo
			describe "My Spec"{
				// this should be filtered
				describe "My Internal Spec"{
					
				}
			}
			describe String{
				
			}
		''')
		parseScenario('''
			package demo
			Feature: My Feature
			Scenario My Scenario
				Given nothing
				Then nothing
		''')
	}
	
	fact "returns contained suites"{
		parseSuite('''
			package demo
			import demo.*
			#My Suite
			
			##Child 1
			##Child 2
			###Grandchild
		''')
		
		subject.getExecutables(suite("My Suite")) => list(suite("Child 1"), suite("Child 2"))
	}
	
	fact "returns resolved specs via link"{
		parseSuite('''
			package demo
			import demo.*
			#My Suite
			
			- "My Spec"
			- "My Feature"
		''')
		
		subject.getExecutables(suite("My Suite")).toSet => set(exampleGroup("My Spec"), feature())
	}
	 
	fact "returns resolved specs via regex"{
		parseSuite('''
			package demo
			import demo.*
			#My Suite
			
			- \demo.*\
			
		''')
		
		subject.getExecutables(suite("My Suite")).toSet => set(exampleGroup("My Spec"), exampleGroup("String"), feature())
	}
}