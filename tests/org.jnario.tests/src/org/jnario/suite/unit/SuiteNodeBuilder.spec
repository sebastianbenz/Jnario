/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.suite.jvmmodel.SuiteNodeBuilder
import org.jnario.suite.suite.SuiteFactory
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator

import static extension org.jnario.lib.ExampleTableIterators.*
import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SuiteTestCreator))
describe SuiteNodeBuilder {
	
	@Inject extension ModelStore m
	
	context parent{
		@Inject extension SuiteNodeBuilder
		
		def examples{
			| suites 						| position 	| parent |
			| suites("#0", "#1")			| 0 		| null	 |
			| suites("#0", "##1")			| 1 		| "#0" 	 |
			| suites("#0", "###1")			| 1 		| "#0" 	 |
			| suites("#0", "#1", "###2")	| 2 		| "#1" 	 |
		}
		
		fact "parent is suite with less hashes"{
			examples.forEach[
				parent(suites, position)?.name should be parent
			]
		} 
	}
	
	context level{
		fact level("#")        => 1
		fact level("#Suite")   => 1
		fact level("##Suite")  => 2
		fact level("###Suite") => 3 
		
		def level(String name){
			subject.level(suite(name))
		}
	}
	
	def parseSuite(CharSequence s){
		val input = '''
		package test
		
		«s»
		'''
		m.parseSuite(input)
	}
	
	def suites(String... names){
		names.map[suite]
	}
	
	def suite(String name){
		val suite = SuiteFactory::eINSTANCE.createSuite
		suite.name = name
		suite
	}
}