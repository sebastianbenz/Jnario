/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.jnario.spec.tests.unit.naming

import org.eclipse.xtext.xbase.XBlockExpression
import org.jnario.Should
import org.jnario.jnario.test.util.ModelStore
import org.jnario.spec.spec.Example
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator

import static org.hamcrest.CoreMatchers.*
import static org.jnario.jnario.test.util.Query.*

import static extension org.jnario.lib.ExampleTableIterators.*
import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe Example {
	 
	describe "name"{
		def examples{
			| example 											| name 								|
			| "fact 'with description'"							| "with description"   				|
			| "fact 'with code' => 'with code'"					| "'with code' => 'with code'"		|
			| "fact 'multiline code' => \n'with code'"			| "'multiline code' => 'with code'"	|
		}
	
		fact examples.forEach[println(example.parse.name) should be name]
	}
	
	describe "implementation"{
		def examples{
			| example 											| type 						|
			| "fact 'with body' {1}"							| typeof(XBlockExpression)	|
			| "fact 'with code' should be 'with code'"			| typeof(Should)			|
		}
	
		fact examples.forEach[example.parse.expression should be instanceOf(type)]
	}
	
	
	describe "Pending"{
		def examples{
			| example 													| expected |
			| "fact 'with description'"									| true     |
			| "fact 'with description and empty block' {}"				| true     |
			| "fact 'with description and code block' {1 => 1}"			| false    |
			| "fact 1 => 1"												| false    |
			| "pending fact 'with description and code block' {1 => 1}"	| true     |
		}
	
		fact examples.forEach[pendingStateOf(example) should be expected]
	
	}
	
	def parse(String content){
		val modelStore = new ModelStore()
		modelStore.parseSpec('''
			describe "test"{
				«content»
			}
		''')
		return query(modelStore).first(typeof(Example))
	}
	
	def pendingStateOf(String string){
		return parse(string).^pending
	}

}