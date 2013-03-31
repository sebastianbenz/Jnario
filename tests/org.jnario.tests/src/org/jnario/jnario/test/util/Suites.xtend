/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import org.jnario.suite.suite.SuiteFactory
import org.jnario.Specification
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite

class Suites {
	
	static val SuiteFactory factory = SuiteFactory::eINSTANCE
	
	def static suiteFile(Suite... suites){
		val file = factory.createSuiteFile
		file.xtendTypes.addAll(suites)
		return file
	}
	
	def static suiteWith(String name, SpecReference... references){
		val suite = suite(name)
		suite.elements.addAll(references)
		suite
	}
	
	def static suite(String name){
		val suite = factory.createSuite
		suite.name = name
		suite
	}
	
	def static suite(String name, String packageName){
		val suite = factory.createSuite
		suite.name = name
		val file = factory.createSuiteFile
		file.^package = packageName
		file.xtendTypes += suite 
		suite
	}
	
	def static specReference(Specification spec){
		val result = factory.createSpecReference
		result.spec = spec
		result
	}
	
}