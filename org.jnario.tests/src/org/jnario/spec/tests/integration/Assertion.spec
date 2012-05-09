/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.jnario.spec.tests.integration

import static extension org.jnario.jnario.test.util.Helpers.*

describe "Assertion"{
	
	/**
	 * Jnario provides a special `assert` statement that makes it really easy to 
	 * write meaningful assertions.
	 */
	context "Introduction"{
	 
		/*
		 * `assert` passes if the expression evaluates to true.
		 */	
		fact "To pass.."{
			assert true
			assert 1 == 1
		}
		/*
		 * `assert` throws an AssertionError if the expression evaluates to false.
		 */
		fact "...or not to pass"{
			{assert false} throws AssertionError
		} 
	}
	/* 
	 * Assertions in Jnario are selfexplainable. This means, when failing, they try to 
	 * provide as as much information as possible. In that case, they 
	 * print the exact expression that has failed together with the actual value
	 * of all subexpressions.
	 */
	context "No more debugging..."{
		
		/*
		 * For example, it will print the value of all referenced variables.
		 */
		fact "Variable Access"{ 
			val y = false
			errorMessage[assert y].is(  
			'''
			Expected y but
			     y is false''')
		}                           
		
		/*
		 * Literal values obviously won't be printed.
		 */               
		fact "Filters literals"{           
			val x = 0  
			errorMessage[assert x == 42].is('''
			  Expected x == 42 but
			       x is 0''')	 
		}      
		
		/*
		 * Here is another example .
		 */
		fact "Not Equals"{           
			val x = 42     
			errorMessage[assert !(x == 42)].is('''
			  Expected !(x == 42) but
			       x == 42 is true
			       x is 42''')	  
		}   
		
		/*
		 * The result of a function call will be printed as well.
		 */     
		fact "Function Calls"{
			errorMessage[assert greet("World") == "Hello World!"].is('''
			  Expected greet("World") == "Hello World!" but
			       greet("World") is "Hello World"''')
		}    
		
		/*
		 * The result of each feature call will be printed.
		 */     
		fact "Feature Calls"{
			errorMessage[assert "Hello".toUpperCase.toLowerCase == "HELLO"].is('''
			  Expected "Hello".toUpperCase.toLowerCase == "HELLO" but
			       "Hello".toUpperCase.toLowerCase is "hello"
			       "Hello".toUpperCase is "HELLO"''')
		}      
		
		/* 
		 * This example involves two expressions with `&&`. 
		 */
		fact "And expressions"{
			val x = 0 
			val y = 1 
			errorMessage[assert x == 1 && y == 0].is('''
			  Expected x == 1 && y == 0 but
			       x == 1 is false
			       x is 0
			       y == 0 is false
			       y is 1''')
		}    
 
  		/*
  		 * If the same variable is accessed multiple times it will be printed only once.
  		 */
 		fact "Removes duplicate feature calls"{
			val x = 0 
			errorMessage[assert x > 0 && x < 10].is('''
			  Expected x > 0 && x < 10 but
			       x > 0 is false
			       x is 0
			       x < 10 is true''')
 		}
 		
 		/*
		 * Variable declarations in blocks are currently not supported. The following example results in a compile error.
		 */
		/*
		fact "Block expressions"{
			errorMessage[assert {val x = "hello"; x} == ""].is('''''')
		}    
 		*/
   
		def greet(String name){
			return "Hello " + name
		}		   
	}      
	  

}                                