package org.jnario.suite.unit

import org.jnario.suite.jvmmodel.SpecificationResolver
import org.jnario.jnario.test.util.SuiteTestInstantiator
import org.jnario.runner.InstantiateWith
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuiteFactory

@InstantiateWith(typeof(SuiteTestInstantiator))
describe SpecificationResolver {

	@Inject extension ModelStore m
	
	before{
		parseSpec('''
			package demo
			describe "My Spec"{
				// this should be filtered
				describe "My Internal Spec"{
					
				}
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

	fact "resolves referenced specs"{
		parseSuite('''
			package demo
			import demo.*
			#My Suite
			
			- "My Spec"
			- "My Feature"
		''')
		
		resolvedSpecs(firstSuite) => set("My Spec", "My Feature")
	}
	
	describe "evaluates regular expressions"{
		fact "example 1"{
				m.parseSuite('''
				package demo
				import demo.*
				#The Suite
				
				- \demo\.My.*\
			''')
			
			resolvedSpecs(m.firstSuite) => set("My Spec", "My Feature")
		}

		fact "example 2"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \.*Spec\
			''')
			
			resolvedSpecs(m.firstSuite) => set("My Spec")
		}
		
		fact "returns empty list on null input"{
			subject.resolveSpecs(SuiteFactory::eINSTANCE.createPatternReference) => list()
		}
		
		fact "ignores unresolved elements"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \NonExistent\
			''')
			
			resolvedSpecs(m.firstSuite) => set()
		}
		
		fact "ignores containing suite"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \.*\
			''')
			
			resolvedSpecs(m.firstSuite) => set("My Spec", "My Feature")
		}
	}
	
	def resolvedSpecs(Suite suite){
		subject.resolveSpecs(suite).map[name].toSet
	}

}