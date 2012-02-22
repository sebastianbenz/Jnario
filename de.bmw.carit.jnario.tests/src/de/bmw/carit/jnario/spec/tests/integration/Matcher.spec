/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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

     