package de.bmw.carit.jnario.spec.tests.integration

import static extension de.bmw.carit.jnario.common.test.util.Helpers.*
import org.hamcrest.Matcher

/**
 * Jnario provides syntactic sugar for creating matchers.
 */
describe "Matcher"{
	
	it "returns the boolean result of the evaluated expression"{
		val myMatcher = #[String input | input == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false")
	}    
	  
	it "type can be coerced from the context"{
		val Matcher<String> myMatcher = #[it  == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false") 
	}
	
	it "works with should"{
		"Hello".should.be(#[it.startsWith("H")])
	}  
	
	it "uses the closure's code as description"{
		errorMessage[
			"a".should.be(#[it.startsWith("b")])
		].is('''
		Expected: is [it.startsWith("b")]
		     got: "a"''')
	}  
	
}                                   

     