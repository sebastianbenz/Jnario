package org.jnario.jnario.test.util

import org.jnario.suite.suite.SuiteFactory

class Suites {
	
	static val SuiteFactory factory = SuiteFactory::eINSTANCE
	
	def static suite(String name){
		val suite = factory.createSuite
		suite.name = name
		suite
	}
	
}