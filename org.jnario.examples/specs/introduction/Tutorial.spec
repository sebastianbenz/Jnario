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
	
	
	describe "Writing Assertions"{
		
		- "Should"
		
		- "Using Assert"
		
		- "Expecting Exceptions"
		
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