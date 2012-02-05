package de.bmw.carit.jnario.spec.tests.integration

import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.junit.Assert
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
}                                