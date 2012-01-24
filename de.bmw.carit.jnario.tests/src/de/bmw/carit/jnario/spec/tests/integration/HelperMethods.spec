package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
/**
 * @author Sebastian Benz
 */
describe "HelperMethods" {
 
	it "'should' wraps org.junit.Assert#assertThat"{
		val spec = '
			package bootstrap
			
			describe "HelperMethods" {
			
				it "should wraps org.junit.Assert#assertThat"{
					"MyString".should.be("MyString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
	
	it "'be' wraps CoreMatchers#is"{
		val spec = '
			package bootstrap
			
			describe "HelperMethods" {
			
				it "be should wrap CoreMatchers#is"{
					"MyString".should.be("MyString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
	
	it "'contains' wraps IsCollectionContaining#hasItem"{
		val spec = '
			package bootstrap

			describe "HelperMethods" {
			
				it "contains should wrap CoreMatchers#is"{
					newArrayList("MyString").should.contain("MyString")
					newArrayList("MyString").should.not.contain("MyOtherString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
			
}
	