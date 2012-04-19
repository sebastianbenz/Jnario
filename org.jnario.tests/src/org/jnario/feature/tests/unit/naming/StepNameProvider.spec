/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.naming

import com.google.inject.Inject
import org.jnario.runner.InstantiateWith

import static org.jnario.jnario.test.util.Query.*
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jnario.test.util.ModelStore
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.FeatureFactory

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@InstantiateWith(typeof(SpecTestInstantiator))
describe StepNameProvider{

	@Inject extension ModelStore modelStore
	
	context nameOf{
		fact "returns null if the step has no name"{
			assert subject.nameOf(emptyStep) == null
		}
		
		fact "returns null if the step has no reference"{
			assert subject.nameOf(emptyRef) == null
		}
		
		fact "returns the name for a step with definition"{
			parseScenario('''
					Scenario: MyScenario
						Given a step with an implementation
							1 + 1 => 2
			''')
			
			stepName => "Given a step with an implementation"
		}
		
		fact "returns the name for a step with resolved reference"{
			parseScenario('''
					Scenario: MyScenario 2
						Given a step with a resolved reference
					Scenario: MyScenario 1
						Given a step with a resolved reference
							"implementation"
			''')
			
			stepName => "Given a step with a resolved reference"
		}
		
		fact "returns the name for a step with unresolved reference"{
			parseScenario('''
					Scenario: MyScenario 2
						Given a step with an unresolved reference
			''')
			
			stepName => "Given a step with an unresolved reference"
		}
		
		
		fact "keeps parameter values"{
			parseScenario('''
					Scenario: MyScenario 2
						Given a step with two values "a" and "b"
						 1 + 1 => 2
			''')
			
			stepName => 'Given a step with two values "a" and "b"'
		}
		
	}
	
	context ^describe{
		fact "removes multilines parameters"{
			parseScenario('''
					Scenario: MyScenario 2
						Given a step with multiline parameter
							"the parameter"
						 1 + 1 => 2
			''')
			
			describeStep => 'Given a step with multiline parameter'
		}
	}
	
	context removeKeywordsAndArguments{
		
		def examples{
			| step 									| result 		|
			| 'Given a step' 						| 'a step'		|
			| 'Then a step' 						| 'a step'		|
			| 'When a step' 						| 'a step'		|
			| 'And a step' 							| 'a step'		|
			| 'Given a "value"' 					| 'a ""'		| 			
			| 'Given a "value" and "anothervalue"' 	| 'a "" and ""'	| 			
		}
		
		fact "examples do pass"{ 
			examples.forEach[
				parseScenario('''
					Scenario: scenario
					«step»
				''')
				subject.removeKeywordsAndArguments(step) => result
			]
		}
	}
	
	def step(){
		query(modelStore).first(typeof(Step))
	}
	
	def stepName(){
		return subject.nameOf(step)
	}
	
	def String describeStep(){
		return subject.^describe(step)
	}
	
	def emptyStep(){
		return FeatureFactory::eINSTANCE.createGiven
	}
	
	def emptyRef(){
		return FeatureFactory::eINSTANCE.createGivenReference
	}
	
	def parseScenario(CharSequence s){
		val input = '''
			Feature: example
			«s»
		'''
		modelStore.parseScenario(input)
	}
	
}