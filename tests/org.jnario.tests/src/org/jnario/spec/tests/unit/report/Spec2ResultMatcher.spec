package org.jnario.spec.tests.unit.report

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.report.SpecExecution
import org.jnario.runner.CreateWith
import org.jnario.spec.spec.Example

import static org.jnario.report.SpecExecution.*
import static org.jnario.spec.tests.unit.report.Spec2ResultMatcherSpec.*

import static extension org.jnario.lib.Should.*
import org.jnario.spec.report.Spec2ResultMatcher

@CreateWith(typeof(SpecTestCreator))
describe Spec2ResultMatcher {

	@Inject extension ModelStore m
	
	static val anyExecutionTime = 0.0

	context "Example"{
		
		fact "matches if classname and name are equal"{
			m.parseSpec(
			'''
				package example
				describe "Something"{
					fact "a fact"{""}
				}
			''')
			example should match passingSpec("example.SomethingSpec", "a fact", anyExecutionTime)
			example should not match passingSpec("example.DifferentSpec", "a fact", anyExecutionTime)
			example should not match passingSpec("example.SomethingSpec", "a different fact", anyExecutionTime)	
		}
		
		fact "includes pending state when matching"{
			m.parseSpec(
			'''
				package example
				describe "Something"{
					fact "a fact"
				}
			''')
			example should match passingSpec("example.SomethingSpec", "a fact [PENDING]", anyExecutionTime)
		}
		
		fact "handles escaped characters"{
			m.parseSpec(
			'''
				package example
				describe "Something"{
					fact 'With special "chars" and umläuts'
				}
			''')
			val factName = '''
				With special \&quot;chars\&quot; and uml\u00E4uts [PENDING]
			'''.toString.trim
			example should match passingSpec("example.SomethingSpec", factName, anyExecutionTime)
		}
	}

	
	def should_match(Example example, SpecExecution execution){
		subject.matches(example, execution) 
	}
	
	def example(){
		first(typeof(Example))
	} 
	
}