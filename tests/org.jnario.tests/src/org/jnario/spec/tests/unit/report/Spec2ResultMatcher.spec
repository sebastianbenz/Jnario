package org.jnario.spec.tests.unit.report

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.report.HashBasedSpec2ResultMapping
import org.jnario.report.SpecExecution
import org.jnario.runner.CreateWith
import org.jnario.spec.spec.Example

import static org.jnario.report.SpecExecution.*
import static org.jnario.spec.tests.unit.report.HashBasedSpec2ResultMappingSpec.*
import static org.mockito.Mockito.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe HashBasedSpec2ResultMapping {

	@Inject extension ModelStore m
	
	static val anyExecutionTime = 0.0

	context "Example"{
		
		val anyExecutable = mock(typeof(Example))
		
		val aResult = passingSpec("example.SomethingSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentClassName = passingSpec("example.DifferentSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentName = passingSpec("example.SomethingSpec", "another fact", anyExecutionTime)
		
		fact "returns empty execution for null"{
			subject.getResult(null) => NO_EXECUTION
		}
		
		fact "returns empty execution if no matching spec exists"{
			subject.getResult(anyExecutable) => NO_EXECUTION
		}
		
		fact "matches if classname and name are equal"{
			m.parseSpec(
			'''
				package example
				describe "Something"{
					fact "a fact"{""}
				}
			''')
			
			subject.accept(aResult)
			
			example should match aResult
			example should not match aResultWithDifferentClassName
			example should not match aResultWithDifferentName	
		}
		
		
		
		fact "includes pending state when matching"{
			m.parseSpec(
			'''
				package example
				describe "Something"{
					fact "a fact"
				}
			''')
			val pendingResult = passingSpec("example.SomethingSpec", "a fact [PENDING]", anyExecutionTime)
			subject.accept(pendingResult)
			example should match pendingResult
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
			val resultWithUnicodeChars = passingSpec("example.SomethingSpec", factName, anyExecutionTime)
			subject.accept(resultWithUnicodeChars)
			example should match resultWithUnicodeChars
		}
	}
	
	
	def should_match(Example example, SpecExecution execution){
		subject.getResult(example) == execution
	}
	
	def example(){
		first(typeof(Example))
	} 
	
}