/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.xbase.XbaseFactory
import org.jnario.spec.spec.SpecFactory

import static org.jnario.jnario.test.util.Specs.*

class Specs {
	
	static val factory = SpecFactory::eINSTANCE
	
	def static pendingExample(){
		val example = example("pending")
		example.pending = true
		example
	}
	
	def static implementedExample(){
		val example = example("with implementation")
		example.expr = Features::implementation
		example
	}
	
	def static example(String name){
		val example = factory.createExample
		example.name = name
		example.pending = false
		example.expr = XbaseFactory::eINSTANCE.createXBooleanLiteral
		example
	}
	
	def static pendingExampleGroup(){
		exampleGroupWith(pendingExample)
	}
	
	def static exampleGroupWith(XtendMember... examples){
		exampleGroup("with examples", examples)
	}
	
	def static exampleGroup(String name, XtendMember... examples){
		val group = exampleGroup(name)
		group.members.addAll(examples)
		group
	}
	
	def static exampleGroup(String name){
		val group = factory.createExampleGroup
		group.name = name
		group
	}
	
}