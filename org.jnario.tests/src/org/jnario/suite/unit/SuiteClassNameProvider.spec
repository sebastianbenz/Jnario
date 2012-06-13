package org.jnario.suite.unit

import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.suite.SuiteFactory
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.SuiteTestInstantiator

@InstantiateWith(typeof(SuiteTestInstantiator))
describe SuiteClassNameProvider {
	
	context getClassName{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "MySuiteSuite"	|
			| "##My Suite \n with multiple lines"		| "MySuiteSuite"	|
		}
		
		fact examples.forEach[subject.getClassName(suite(name)) => expectedClassName]
	}
	
	context ^describe{
		def examples{
			| name 										| expectedClassName |
			| null										| null				|
			| "#"										| null				|
			| "#my Suite"								| "my Suite"		|
			| "##My Suite \n with multiple lines"		| "My Suite"		|
		}
		
		fact examples.forEach[subject.^describe(suite(name)) => expectedClassName]
	}	
 
	def suite(String name){
		val suite = SuiteFactory::eINSTANCE.createSuite
		suite.name = name
		suite
	}
}