package org.jnario.jnario.test.util

import org.jnario.spec.spec.SpecFactory
import org.jnario.spec.spec.Example

class Specs {
	
	static val factory = SpecFactory::eINSTANCE
	
	def static pendingExample(){
		example("pending")
	}
	
	def static implementedExample(){
		val example = example("with implementation")
		example.expr = Features::implementation
		example
	}
	
	def static example(String name){
		val example = factory.createExample
		example.name = name
		example
	}
	
	def static exampleGroupWith(Example... examples){
		val group = exampleGroup("with examples")
		group.members.addAll(examples)
		group
	}
	
	def static exampleGroup(String name){
		val group = factory.createExampleGroup
		group.name = name
		group
	}
	
}