package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*


import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*

/**
 * @author Sebastian Benz
 */
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