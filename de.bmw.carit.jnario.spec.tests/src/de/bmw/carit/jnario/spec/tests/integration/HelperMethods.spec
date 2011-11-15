package de.bmw.carit.jnario.spec.tests

import static org.junit.Assert.*
import static de.bmw.carit.jnario.spec.tests.util.SpecExecutor.*
import static org.junit.experimental.results.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*

describe "HelperMethods" {
 
	it "'should' wraps org.junit.Assert#assertThat"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe "HelperMethods" {
			
				it "should wraps org.junit.Assert#assertThat"{
					"MyString".should(equalTo("MyString")) 
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
	
	it "'be' wraps CoreMatchers#is"{
		val spec = '
			package bootstrap

			import static org.hamcrest.CoreMatchers.*
			
			describe "HelperMethods" {
			
				it "should wrap CoreMatchers#is"{
					"MyString".should.be("MyString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
			
}
	