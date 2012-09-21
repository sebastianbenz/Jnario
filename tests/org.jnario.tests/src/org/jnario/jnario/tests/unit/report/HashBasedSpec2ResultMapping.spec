package org.jnario.jnario.tests.unit.report

import com.google.inject.Inject
import org.jnario.Executable
import org.jnario.feature.feature.Step
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.report.HashBasedSpec2ResultMapping
import org.jnario.report.SpecExecution
import org.jnario.report.SpecFailure
import org.jnario.runner.CreateWith
import org.jnario.spec.spec.Example

import static org.jnario.jnario.test.util.Specs.*
import static org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingExampleGroupSpec.*
import static org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec.*
import static org.jnario.report.SpecExecution.*
import static org.mockito.Mockito.*

import static org.jnario.jnario.test.util.Features.*
import static extension org.jnario.lib.Should.*
import org.jnario.report.NotRun
import org.jnario.report.Passed
import org.jnario.report.Failed
import org.jnario.feature.feature.Scenario

@CreateWith(typeof(SpecTestCreator))
describe HashBasedSpec2ResultMapping {

	@Inject extension ModelStore m
	
	static val anyExecutionTime = 0.0
	val anyExecutable = example("")
	val anyFailure = new SpecFailure("", "", "")
	
	fact "returns empty execution if no matching spec exists"{
		subject.getResult(anyExecutable) => typeof(NotRun)
	}
	
	context "Example"{
		
		val aResult = passingSpec("example.SomethingSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentClassName = passingSpec("example.DifferentSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentName = passingSpec("example.SomethingSpec", "another fact", anyExecutionTime)
		
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
	
	context "ExampleGroup"{
		
		static val CLASSNAME = "ExampleGroupSpec"
		
		fact "returns NotRun if children are not executed"{
			val exampleGroup = exampleGroup("ExampleGroup", example("Example 1"),
										 					example("Example 2"))
										 
			exampleGroup.result => typeof(NotRun)
		}
		
		fact "passes if all children pass"{
			val exampleGroup = exampleGroup("ExampleGroup", passingExample("Example 1"),
										 					passingExample("Example 2"))
										 
			exampleGroup.result => typeof(Passed)
		}
		
		fact "fails if one child has failed"{
			val exampleGroup = exampleGroup("ExampleGroup", passingExample("Example 1"),
										 					failingExample("Example 2"))
										 
			exampleGroup.result => typeof(Failed)
		}
		
		fact "execution time is sum of all child examples"{
			val exampleGroup = exampleGroup("ExampleGroup", exampleExecutedIn("Example 1", 1.0),
										 					exampleExecutedIn("Example 2", 2.0))
			exampleGroup.result.executionTimeInSeconds => 3.0
		}
		
		fact "class name is from spec"{
			val exampleGroup = exampleGroup("ExampleGroup", passingExample("Example 1"))
			exampleGroup.result.className => "ExampleGroupSpec"
		}
		
		fact "name is from spec"{
			val exampleGroup = exampleGroup("ExampleGroup", passingExample("Example 1"))
			exampleGroup.result.name => "ExampleGroup"
		}
		
		fact "caches calculated results"{
			val exampleGroup = exampleGroup("ExampleGroup", passingExample("Example 1"))
			val first = exampleGroup.result
			val second = exampleGroup.result
			first => sameInstance(second)
		}
		
		def exampleExecutedIn(String name, double time){
			subject.accept(passingSpec(CLASSNAME, name + " [PENDING]", time))
			example(name)
		}
		
		def failingExample(String name){
			subject.accept(failingSpec(CLASSNAME, name + " [PENDING]", anyExecutionTime, anyFailure))
			example(name)
		}
		
		def passingExample(String name){
			subject.accept(passingSpec(CLASSNAME, name + " [PENDING]", anyExecutionTime))
			example(name)
		}
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	context "Step"{
		val aResult = passingSpec("example.SomethingFeatureMyScenario", "Given a step", anyExecutionTime)
		val aResultWithDifferentClassName = passingSpec("example.DifferentSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentName = passingSpec("example.SomethingSpec", "another fact", anyExecutionTime)
		val pendingResult = passingSpec("example.SomethingFeatureMyScenario", "Given a pending step [PENDING]", anyExecutionTime)
		val resultWithUnicodeChars = passingSpec("example.SomethingFeatureMyScenario", '''Given step with uml\u00E4uts''', anyExecutionTime)
		val resultWithArgs = passingSpec("example.SomethingFeatureMyScenario", '''Given step with \&quot;args\&quot;''', anyExecutionTime)
		
		fact "matches if classname and name are equal"{
			m.parseScenario(
			'''
				package example
				Feature: Something
					Scenario: MyScenario
						Given a step
							1 + 1 => 2
			''')
			
			subject.accept(aResult)
			
			step should match aResult
			step should not match aResultWithDifferentClassName
			step should not match aResultWithDifferentName	
		}
		
		fact "includes pending state when matching"{
			m.parseScenario(
			'''
				package example
				Feature: Something
					Scenario: MyScenario
						Given a pending step
			''')
			
			subject.accept(pendingResult)
			step should match pendingResult
		}
		
		fact "handles escaped characters"{
			m.parseScenario(
			'''
				package example
				Feature: Something
					Scenario: MyScenario
					Given step with umläuts
						1 =>1
			''')
			subject.accept(resultWithUnicodeChars)
			step should match resultWithUnicodeChars
		}
		
		fact "handles step arguments"{
			m.parseScenario(
			'''
				package example
				Feature: Something
					Scenario: MyScenario
					Given step with "args"
						1 =>1
			''')
			subject.accept(resultWithArgs)
			step should match resultWithArgs
		}
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	context "Scenario"{
		static val SCENARIO_CLASSNAME = "test.MyFeatureFeatureMyScenario" 
		
		
		before{
			m.parseScenario('''
				package test 
				Feature: My Feature
				Scenario: My Scenario
				Given my Step
				And other Step
			''')
		}
		
		fact "returns **Passed** if all children passed"{
			passedStep("Given my Step")
			passedStep("And My other Step")
			scenario.result => typeof(Passed)
		}
		
		pending fact "returns **Failed** if one child failed"{
			passedStep("Given my Step")
			scenario.result => typeof(Failed)
		}
		
		def passedStep(String name){
			subject.accept(new Passed(SCENARIO_CLASSNAME, name + " [PENDING]", 0.0))
		}
	}
	
	def should_match(Executable example, SpecExecution execution){
		subject.getResult(example) == execution
	}
	
	def example(){
		first(typeof(Example))
	} 
	
	def step(){
		first(typeof(Step))
	} 
	
	def scenario(){
		first(typeof(Scenario))
	} 
	
	def result(Executable executable){
		subject.getResult(executable)
	}
}