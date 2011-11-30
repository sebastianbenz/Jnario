package de.bmw.carit.jnario.spec.tests

import static org.junit.Assert.*
import static extension de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.experimental.results.ResultMatchers.*
import org.junit.experimental.results.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*


describe "Exceptions" {
 
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