/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package introduction

import static extension org.jnario.jnario.test.util.Helpers.*
import static extension org.jnario.lib.Each.*
import static extension org.jnario.lib.Should.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*

describe "Jnario Specs - Tutorial"{

	describe "How to write a Specification"{
		
		/*
		 * *Note:* You can declare packages and import other packages similar 
		 * to Java (static imports work as well). 
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 - "A simple specification" {
	      '''
	      package demo
	      
	      import java.util.Stack
	      
	      describe "A Stack"{
	        - "initially empty"{
	          assert new Stack().size == 0	
	        }
	        - "increases its size"{
	          val subject = new Stack<String>()
	          subject.add("A String")
	          assert subject.size == 1
	        }
	        // ...
	      }
	      '''.executesSuccessfully
	     }
		 
		/*
		 * The following specification will be executed as:
		 * 
		 *     Calculator
		 *       - addition
		 *         - adds two values
		 *       - division
		 *         - divides two values
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
	     - "Hierarchical Specifications"{
			'''
			describe "Calculator"{
			  context "addition"{
			    it "adds two values"{
			      assert new Calculator().add(1, 2) == 3
			    }
			  }
			  context "division"{
			    it "divides two values"{
			      assert new Calculator().divide(4, 2) == 2
			    }
			  }
			}
			'''.executesSuccessfully
	     }

		/*
		 * @filter('''|.executesSuccessfully) 
		 */
		 - "Helper methods and fields"{
		  '''
	      describe "Helper Methods & Fields"{
	      
	        String subject = "World" 
	      
	        it "can access fields and methods"{
	          assert subject.greeting == "Hello World"
	        }
	        
	        def greeting(String s){
	          return "Hello " + s
	        }

	        context "shouting"{
	          
	          it "can access fields and methods from parent"{
	             assert subject.greeting.shout == "HELLO WORLD"
	          }
	          
	          def shout(String s){
	            return s.toUpperCase
	          }
	        }
	      }
	      '''.executesSuccessfully
		 }
			
	     - "Pending"{
			
	     }
	}
	
	describe "Setup and Teardown"{
		
	}
	
	/*
	 * Jnario provides different ways to write assertions.
	 */
	describe "Writing Assertions"{
	
		/*
		 * Jnario provides a special `assert` statement that makes it easy to 
		 * write meaningful assertions.
		 */
		- "'assert'"{
			assert true
			assert 1 == 1
			assert "Hello".startsWith("H")
		}

		/*
		 * If you want to express how an object should behave, you can use  
		 * `should` or `must`. It passes if the result of the left expression is 
		 * equal to the result of the right expression. You can also use `not` to 
		 * assert that both expressions have different results. There is also 
		 * a short cut available: `=>` which has the same effect as `should be`.
		 */	
		- "'should', 'must' and `=>`"{
			true should be true
			"hello" must be "hello"
			1 + 1 should not be 1 
			"hello".toUpperCase must not be "hello"
			1 + 1 => 2 
		}   
		
		/*
		 * Assertions in Jnario are selfexplainable. This means, when failing, they try to 
		 * provide as as much information as possible. In that case, they 
		 * print the exact expression that has failed together with the actual value
		 * of all subexpressions.
		 */
		- "Self-explaining failures"{
			val x = 0 
			val y = 1 
			errorMessage[assert x == 1 && y == 0].is('''
			  Expected x == 1 && y == 0 but:
			       x == 1 is false
			       x is 0
			       y == 0 is false
			       y is 1''')
			       
			val greeting = "hello"        
			errorMessage[greeting.toUpperCase should not be "HELLO"].is('''
			  Expected x.toUpperCase should not be "HELLO" but:
			     x.toUpperCase is "HELLO"
			     x is "hello"''')	  
		}
		
		/*
		 * There are two ways on how to check whether an expression is thrown.
		 * The first one is to declare the type the expected Exception in the
		 * example header after the `throws` keyword. If you want to check
		 * for multiple exceptions in the same example, you can use the build in
		 * `expect` extension method. The first parameter is the type of the 
		 * expected exception and the second parameter is a closure with the
		 * expression that should throw the exception. 
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		- "Expecting Exceptions"{
			'''
			 describe "Division"{
			   it throws ArithmeticException "on division by zero"{
			     val x = 1 / 0
			   }
			   it "throws an ArithmeticException on division by zero"{
			     expect(typeof(ArithmeticException))[
			       val x = 1 / 0
			     ]
			    }
			  }
			'''.executesSuccessfully
		}
		
	}

	describe "Using Example Tables"{
		
		- "Writing Assertions"

		- "Specifying the Column Type"
		
	}
	
	describe "Type-safe specifications"{
	     
	     - "Describing Java Classes"
	     
	     - "Describing Java Methods"
	     
	     - "Implicit Subject Creation"
	     
	}
	
	describe "Spec extensions"{
		
	}
	
	 
}  