/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static extension org.jnario.jnario.test.util.Helpers.*
import org.hamcrest.Matcher

/**
 * Jnario provides syntactic sugar for creating matchers.
 */
describe "Matcher"{
	
	fact "returns the boolean result of the evaluated expression"{
		val myMatcher = #[String input | input == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false")
	}    
	  
	fact "type can be coerced from the context"{
		val Matcher<String> myMatcher = #[it  == "true"]
		assert myMatcher.matches("true")
		assert !myMatcher.matches("false") 
	}
	
	fact "works with should"{
		"Hello" => #[it.startsWith("H")]
	}  
	  
	fact "uses the closure's code as description"{
		errorMessage[
			"a" => #[it.startsWith("b")]
		].is('''
		Expected "a" => #[it.startsWith("b")] but:
		     #[it.startsWith("b")] is [it.startsWith("b")]''')
	}   
	
}                                   

     