/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.linking

import static org.jnario.jnario.test.util.Features.*
import org.jnario.feature.jvmmodel.StepArgumentsProvider
import com.google.inject.Inject
import org.jnario.feature.feature.Step
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.util.StringInputStream
import org.jnario.jnario.test.util.Query
import java.io.InputStreamReader
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator

import static org.jnario.lib.JnarioCollectionLiterals.*

@CreateWith(typeof(FeatureTestCreator))
describe StepArgumentsProvider {

	@Inject LazyLinkingResource resource

	def examples{
		| step												| expectedArgs  			|
		| 'Given no values'    								| list()		 			|
		| 'Given "hello"'     								| list("hello") 			|
		| 'Given "hello" and "world"'						| list("hello", "world") 	|
		| 'Given "hello" and "world"'						| list("hello", "world") 	|
		| "Given a multiline \n'''hello'''"					| list("hello") 			|
		| "Given a multiline \n'''hello 'nested' '''"		| list("hello 'nested' ") 	|
		| "Given a multiline \n\t\t'''hello'''"				| list("hello") 			|		
		| "Given a multiline \n 1+1 => 2 '''hello'''" 		| list() 					|
		| "Given a multiline \n\t\t'''hello"				| list() 					|
		| "Given a multiline \n\t\t'''"						| list() 					|
	}
	
	fact "extracts arguments from step descriptions"{
		examples.forEach[
			val singleOrDoubleQuotes = list(step, step?.replaceAll('"', "'"))
			for(each : singleOrDoubleQuotes){
				val foundArgs = subject.findStepArguments(create(each))
				foundArgs => expectedArgs
			}
		]
	}
	
	facts "returns empty list if step has no name"{
		subject.findStepArguments(step(null)) => list()
	}
 
	def create(String step){
		if(step == null){
			return null
		}
		val scenario = '''
			Feature: dummy
				Scenario: dummy 
					«step»
					
		'''
		// we have to access the model before linking
		val parseResult = resource.parser.parse(new InputStreamReader(new StringInputStream(scenario.toString)))
		Query::query(parseResult.rootASTElement.eAllContents.toList).first(typeof(Step))
	}

}