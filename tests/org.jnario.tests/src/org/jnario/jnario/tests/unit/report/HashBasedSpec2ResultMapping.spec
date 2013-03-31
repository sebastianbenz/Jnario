package org.jnario.jnario.tests.unit.report

import static org.hamcrest.CoreMatchers.*
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
import static org.jnario.report.NotRun.*
import static org.jnario.report.Passed.*
import static org.jnario.report.Failed.*
import org.jnario.feature.feature.Scenario
import org.jnario.jnario.test.util.Specs
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Background
import org.jnario.report.Pending

@CreateWith(typeof(SpecTestCreator))
describe HashBasedSpec2ResultMapping {
	
	static val SCENARIO_CLASSNAME = "test.MyFeatureFeatureMyScenario"
	static val OTHER_SCENARIO_CLASSNAME = "test.MyFeatureFeatureMyOtherScenario" 
	
	@Inject extension ModelStore m
	
	static val anyExecutionTime = 0.0
	val anyExecutable = Specs::example("")
	val anyFailure = new SpecFailure("", "", "")
	
	fact "returns empty execution if no matching spec exists"{
		subject.getResult(anyExecutable) => typeof(NotRun)
	}
	
	fact "returns empty execution if executable is null"{
		subject.getResult(null) => typeof(NotRun)
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
		
	}
	
	context "ExampleGroup"{
		
		static val CLASSNAME = "RootSpec"
		
		fact "returns Pending if children are not executed and have no implementation"{
			m.parseSpec('''
			describe "Root"{
				fact "fact 1"
				fact "fact 2"
			}
			''')										 
			m.exampleGroup("Root").result => typeof(Pending)
		}
		
		fact "returns NotRun if children are not executed but have an implementation"{
			m.parseSpec('''
			describe "Root"{
				fact "fact 1"{ "with implementation" }
				fact "fact 2"{ "with implementation" }
			}
			''')										 
			m.exampleGroup("Root").result => typeof(NotRun)
		}
		
		fact "passes if all children pass"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"{ "with implementation" }
				fact "Example 2"{ "with implementation" }
			}
			''')							 
			passes("Example 1", "Example 2")
			m.exampleGroup("Root").result => typeof(Passed)
		}
		
		fact "fails if one child has failed"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"{ "with implementation" }
				fact "Example 2"{ "with implementation" }
			}
			''')							 
			passes("Example 1")
			fails("Example 2")
			m.exampleGroup("Root").result => typeof(Failed)
		}
		
		fact "execution time is sum of all child examples"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"{ "with implementation" }
				fact "Example 2"{ "with implementation" }
			}
			''')	
			exampleExecutedIn("Example 1", 1.0)
			exampleExecutedIn("Example 2", 2.0)
			m.exampleGroup("Root").result.executionTimeInSeconds => 3.0
		}
		
		fact "class name is from spec"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"{ "with implementation" }
				fact "Example 2"{ "with implementation" }
			}
			''')	
			passes("Example 1")
			m.exampleGroup("Root").result.className => "RootSpec"
		}
		
		fact "name is from spec"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"
				fact "Example 2"
			}
			''')	
			passes("Example 1")
			m.exampleGroup("Root").result.name => "Root"
		}
		
		fact "caches calculated results"{
			m.parseSpec('''
			describe "Root"{
				fact "Example 1"
				fact "Example 2"
			}
			''')	
			passes("Example 1")
			val exampleGroup = m.exampleGroup("Root")
			val first = exampleGroup.result
			val second = exampleGroup.result
			first => sameInstance(second)
		}
		
		def exampleExecutedIn(String name, double time){
			subject.accept(passingSpec(CLASSNAME, name, time))
		}
		
		def fails(String name){
			subject.accept(failingSpec(CLASSNAME, name, anyExecutionTime, anyFailure))
		}
		
		def passes(String... names){
			names.forEach[
				subject.accept(passingSpec(CLASSNAME, it, anyExecutionTime))
			]
		}
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	context "Step"{
		val aResult = passingSpec("example.SomethingFeatureMyScenario", "Given a step", anyExecutionTime)
		val aResultWithDifferentClassName = passingSpec("example.DifferentSpec", "a fact", anyExecutionTime)
		val aResultWithDifferentName = passingSpec("example.SomethingSpec", "another fact", anyExecutionTime)
		val pendingResult = passingSpec("example.SomethingFeatureMyScenario", "Given a pending step [PENDING]", anyExecutionTime)
		val resultWithUnicodeChars = passingSpec("example.SomethingFeatureMyScenario", '''Given step with uml\u00E4uts''', anyExecutionTime)
		val resultWithArgs = passingSpec("example.SomethingFeatureMyScenario", '''Given step with \"args\"''', anyExecutionTime)

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
		
		before{
			m.parseScenario('''
				package test 
				Feature: My Feature
				Scenario: My Scenario
				Given my Step
					"with implementation"
				And other Step
					"with implementation"
			''')
		}
		
		fact "returns **Passed** if all children passed"{
			passedStep("Given my Step")
			passedStep("And other Step")
			scenario.result => typeof(Passed)
		}
		
		fact "returns **Failed** if one child failed"{
			passedStep("Given my Step")
			failedStep("And other Step")
			scenario.result => typeof(Failed)
		}
		
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	context "Feature"{
		before{
			m.parseScenario('''
				package test 
				Feature: My Feature
				Scenario: My Scenario
				Given a step
					"with implementation"
				Scenario: My other Scenario
				Given another step
					"with implementation"
			''')
		}

		fact "returns **Passed** if all scenarios passed"{
			passedStep("Given a step")
			passedStep(OTHER_SCENARIO_CLASSNAME, "Given another step")
			feature.result => typeof(Passed)
		}
		
		fact "returns **Failed** if one scenario failed"{
			passedStep("Given a step")
			failedStep(OTHER_SCENARIO_CLASSNAME, "Given another step")
			feature.result => typeof(Failed)
		}
		
	}
	
	@CreateWith(typeof(FeatureTestCreator))
	context "Background"{
		before{
			m.parseScenario('''
				package test 
				Feature: My Feature
				Background:
					Given a step
						"with implementation"
				Scenario: My Scenario
					Given another step
						"with implementation"
			''')
		}

		fact "returns **Passed** if all scenarios passed"{
			passedStep("Given a step")
			passedStep("Given another step")
			background.result => typeof(Passed)
		}
		
		fact "returns **Failed** if one scenario failed"{
			failedStep("Given a step")
			background.result => typeof(Failed)
		}
		
	}
	
	context "Suite"{
		
		fact "matches referenced suites"
		
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

	def feature(){
		first(typeof(Feature))
	} 
	
	def background(){
		first(typeof(Background))
	} 
	
	def scenario(){
		first(typeof(Scenario))
	} 
	
	def result(Executable executable){
		subject.getResult(executable)
	}
	
	def passedStep(String name){
		passedStep(SCENARIO_CLASSNAME, name)
	}
	
	def passedStep(String className, String name){
		subject.accept(passingSpec(className, name, 0.0))
	}
		
	def failedStep(String name){
		failedStep(SCENARIO_CLASSNAME, name)
	}
	
	def failedStep(String className, String name){
		subject.accept(failingSpec(className, name, 0.0, anyFailure))
	}
}