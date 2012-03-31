/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration


import static extension org.jnario.jnario.test.util.Helpers.*
import static org.hamcrest.CoreMatchers.*
import static org.hamcrest.Matchers.*

/*
 * You can use the `should` statement to express the expected behavior of objects.
 */
describe "Using Should"{

	/*
	 * `should` passes if the result of the left expression is 
	 * equal to the result of the right expression. You can use `not` to 
	 * assert that the expressions have different results. There is also 
	 * a short cut available: `=>` which has the same effect as `should be`.
	 */
	fact "To pass.."{
		// equality
		true should be true
		1 + 1 should not be 1 
		"something" should not be null 
		1 + 1 => 2 
		
		// types
		"a string" => typeof(String)
		
		// strings
		"something" should contain "thing"
		"something" should not contain "any"
		
		// iterables
		newArrayList("something") should contain "something"
		newArrayList("something") should not contain "something else"
	}     
 
	/*     
	 * `should` throws an AssertionError if the result of the left 
	 * expression does not equal the result of the right expression.
	 */
	fact "...or not to pass"{
	  1 + 1 should be 1  throws AssertionError
	  1 + 1 should not be 1  throws AssertionError
	  1 + 1 => 1  throws AssertionError
	}   
 
	/*
	 * When failing, `should` and `=>` try to give you as much context information as possible. 
	 * The error message will print the values of all expressions and their subexpressions.
	 *  
	 */
	fact "Why did it fail?"{
		errorMessage[1 + 1 => 1].is('''
		  Expected 1 + 1 => 1 but:
		       1 + 1 is 2''')	
		
		val x = "hello"        
		errorMessage[x.toUpperCase should not be "HELLO"].is('''
		  Expected x.toUpperCase should not be "HELLO" but:
		       x.toUpperCase is "HELLO"
		       x is "hello"''')	  
		       
		val y = "world"        
		errorMessage[x => y].is('''
		  Expected x => y but:
		       x is "hello"
		       y is "world"''')	  
	}  
		
    
	/*
	 * You can also the `should` and `=>` together with [hamcrest](http://code.google.com/p/hamcrest/) 
	 * matchers. The following static import statements are needed to run the examples.
	 *  
	 *     import static org.hamcrest.CoreMatchers.startsWith
	 *     import static org.hamcrest.CoreMatchers.equalTo
	 *     import static org.hamcrest.Matchers.hasItem
	 * 
	 */ 
	fact "Combining hamcrest and should"{
		"hello" => startsWith("h")
		newArrayList("red", "green") => hasItem("red")
		"hello" should be equalTo("hello")
	}
		
}