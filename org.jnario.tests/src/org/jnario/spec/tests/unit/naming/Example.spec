package org.jnario.spec.tests.unit.naming

import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.jnario.runner.InstantiateWith
import org.jnario.spec.spec.Example
import static org.hamcrest.CoreMatchers.*
import static org.jnario.jnario.test.util.Query.*

import static extension org.jnario.lib.ExampleTableIterators.*
import org.jnario.Should
import org.eclipse.xtext.xbase.XBlockExpression

@InstantiateWith(typeof(SpecTestInstantiator))
describe Example {
	 
	describe "name"{
		def examples{
			| example 											| name 							|
			| "fact 'with description'"							| "with description"   			|
			| "fact 'with code' => 'with code'"					| "'with code' => 'with code'"	|
		}
	
		fact examples.forEach[example.parse.name should be name]
	}
	
	describe "implementation"{
		def examples{
			| example 											| type 						|
			| "fact 'with body' {1}"							| typeof(XBlockExpression)	|
			| "fact 'with code' => 'with code'"					| typeof(Should)			|
		}
	
		fact examples.forEach[example.parse.implementation should be instanceOf(type)]
	}
	
	
	describe "Pending"{
		def examples{
			| example 											| expected |
			| "fact 'with description'"							| true     |
			| "fact 'with description and empty block' {}"		| true     |
			| "fact 'with description and code block' {1 => 1}"	| false    |
			| "fact 1 => 1"										| false    |
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
		return parse(string).pending
	}

}