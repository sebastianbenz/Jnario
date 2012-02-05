package de.bmw.carit.jnario.spec.tests.integration

import static extension de.bmw.carit.jnario.common.test.util.Helpers.*
import org.hamcrest.Matcher

/**
 * 
 */
describe "Matcher"{
	
	"returns the boolean result of the evaluated expression"{
		val myMatcher = #[String input | input == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false")
	}    
	  
	"type can be coerced from the context"{
		val Matcher<String> myMatcher = #[it  == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false") 
	}
	
	"works with should"{
		"Hello".should(#[it.startsWith("H")])
	}  
	
	"uses the closure's code as description"{
		errorMessage[
			"a".should.be(#[it.startsWith("b")])
		].is('''
		Expected: is [it.startsWith("b")]
		     got: "a"''')
	}  
	
}                                   

     