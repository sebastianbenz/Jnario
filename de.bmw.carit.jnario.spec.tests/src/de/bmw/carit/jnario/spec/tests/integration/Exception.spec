package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.experimental.results.ResultMatchers.*


import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*


describe "Exception" {
 
		it "should except exceptions for examples"{
			val spec = '
				package bootstrap
	
				describe "Example" {
				 
				   it throws IllegalArgumentException " should pass when exception is thrown"{
					  	throw new IllegalArgumentException()
				   }
				   
				}
				'
		spec.execute.should.be(successful)
	} 

}