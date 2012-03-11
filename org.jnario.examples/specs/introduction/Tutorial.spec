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
import java.util.Stack

/*
 * Jnario Specs is based on [Xtend](http://www.xtend-lang.org). It is a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html)
 * before you get started with Jnario, because expressions, fields, methods and extensions in Jnario work exactly as in Xtend.
 *  
 * ### Installation
 * 
 * Jnario requires [Xtext](http://www.xtext.org) 2.3, [Eclipse](http://www.eclipse.org) 3.5 or higher and a Java SDK version 5 or above. 
 * The easiest way to install Jnario is via the Eclipse Marketplace. You find it in Eclipse in the Help-menu.
 * 
 *   
 */
describe "Jnario Specs - Tutorial"{
	
	/*
	 * The first example is a simple specification of a Stack. Use the spec wizard to create a new specification
	 * (**File** -> **New** -> **Other** -> **Jnario** -> **Spec**).
	 * To execute a specification, right click
	 * in the editor and select **Run As** -> **JUnit Test**. 
	 * 
	 * 	describe "A Stack"{
	 * 	  - "initially empty" 
	 * 	  - "increases its size when pushing an element"
	 * 	}
	 * 
	 * When we execute the specification it will
	 * pass, but the examples in our specification will be marked as _PENDING_ as they are not implemented yet.
	 * 
	 * _A Stack_
	 * 
	 * - _initially empty [PENDING]_
	 * - _increases its size when pushing an element [PENDING]_
	 * 
	 */
	describe "How to write a Specification"{

		/*
		 * 
		 * We use `=>` to describe the expected result of a expression. For 
		 * example, `new Stack.size => 0` will fail if the size is not `0`.
		 * If we execute our specification we will see that all specifications
		 * pass and that they are not marked as _PENDING_ anymore,
		 * 
		 * <span class="label label-info">Info</span> Declaring and importing other packages works similar 
		 * to Xtend (static imports work as well). 
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 - "Implementing examples" {
	      '''
	      package demo
	      
	      import java.util.Stack
	      
	      describe "A Stack"{
	        - "initially empty" {
	          new Stack.size => 0
	        }
	        - "increases its size when pushing an element"{
	          val subject = new Stack
	          subject.push("A String")
	          subject.size => 1
	        }
	      }
	      '''.executesSuccessfully
	     }
	     
	     /* In the previous specification we have a little redundancy:
	      * the creation of the Stack. We can get rid of it by creating 
	      * a field for the Stack. Declaring fields works exactly as in
	      * [Xtend](http://www.eclipse.org/xtend/documentation/index.html#fields).
	      * 
	      * @filter('''|.executesSuccessfully)  
	      */
	     - "Using Fields"{
	     	'''
		      package demo
		      
		      import java.util.Stack
		      
		      describe "A Stack"{
		        Stack subject = new Stack
		        - "initially empty" {
		          subject.size => 0
		        }
		        - "increases its size when pushing an element"{
		          subject.push("A String")
		          subject.size => 1
		        }
		      }
		      '''.executesSuccessfully
	     }
	     
	     /* 
	      * In our example we specify the behavior
	      * of a single class, which is actually a common use case. Jnario you can 
	      * directly reference the specified class in the describe clause:
	      * 
	      * 	describe Stack{
	      * 	  ...
	      * 	}
	      * 
	      * This way you achieve a strong link between specification
	      * and its target that works even if the target class is renamed.  
	      * Jnario will also automatically create a field called `subject` of
	      * the target type. Therefore we can get rid of the subject field in
	      * our stack specification. 
	      * 
	      * <span class="label label-important">Important</span> The implicit subject works
	      * only if the target class has a default constructor without any arguments, but it 
	      * is also possible to use Guice or other frameworks to automatically create
	      * the subjects ([more...](/link/to/implicitsubject)).
	      * 
	      * @filter('''|.executesSuccessfully)  
	      */
	     - "Implicit Subjects"{
	     	'''
		      package demo
		      
		      import java.util.Stack
		      
		      describe Stack{
		        - "initially empty" {
		          subject.size => 0
		        }
		        - "increases its size when pushing an element"{
		          subject.push("A String")
		          subject.size => 1
		        }
		      }
		      '''.executesSuccessfully
	     }
	     
	    /*
	     * Sometimes a class behaves differently in different contexts. 
	     * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 - "Hierarchical Specifications" {
	      '''
	      package demo
	      
	      import java.util.*
	      
	      describe Stack{
	        context "empty"{
	          - [subject.size => 0]
	          - throws EmptyStackException [subject.pop]
	        }
	        context "adding elements"{
	          - "increases size"{
	            subject.push("A String")
	            subject.size => 1
	          }		
	        }
	      }
	      '''.executesSuccessfully
	     }
		

		/*
		 * The following specification will print:
		 * 
		 * 	before all
		 * 	before
		 * 	do stuff
		 * 	after
		 * 	before
		 * 	do more stuff
		 * 	after
		 * 	after all
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		- "Setup & Teardown"{
			
			'''
			    describe "Setup & Teardown" {
			      before all{
			        println("before all")
			      }  
			      before{
			        println("before")
			      }
			      it "should do stuff" {
			        println("do stuff")
			      }
			      it "should do more stuff" {
			        println("do more stuff")
			      }
			      after{
			        println("after")
			      }
			      after all{
			        println("after all")
			      }
			    }  
			'''.executesSuccessfully
			
		}
		
		/*
		 * @filter('''|.executesSuccessfully) 
		 */
		 - "Helper methods"{
		  '''
	      describe "Helper Methods & Fields"{
	      
	        String subject = "World" 
	      
	        it "can access fields and methods"{
	          subject.greeting => "Hello World"
	        }
	        
	        def greeting(String s){
	          return "Hello " + s
	        }

	        context "shouting"{
	          
	          it "can access fields and methods from parent"{
	             subject.greeting.shout => "HELLO WORLD"
	          }
	          
	          def shout(String s){
	            return s.toUpperCase
	          }
	        }
	      }
	      '''.executesSuccessfully
		 }
		
	
	}
	
	/*
	 * Jnario provides different ways to write assertions.
	 */
	describe "Writing Assertions"{
	
		/*
		 * Jnario provides a special `assert` statement, which fails if 
		 * the following expression does not evaluate to `true`.
		 */
		- "'assert'"{
			assert true
			assert new Stack().empty
			assert "Hello".startsWith("H")
		}

		/*
		 * If you want to express how an object should behave, you can use  
		 * `should` or `must`. It passes if the result of the left expression is 
		 * equal to the result of the right expression. You can also use `not` to 
		 * assert that both expressions have different results. You have already seen 
		 * the short cut `=>` which has the same effect as `should be`.
		 */	
		- "'should', 'must' and `=>`"{
			true should be true
			"hello" must be "hello"
			1 + 1 should not be 1 
			"hello".toUpperCase must not be "hello"
			1 + 1 => 2 
		}   
		
		/*
		 * Assertions in Jnario are self-explainable. When an assertion fails, it tries to 
		 * provide as as much information as possible. They 
		 * print the exact expression that has failed together with the actual value
		 * of all subexpressions. This means that you don't need to debug a test to 
		 * see why it actually has failed.
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
		/*
		 * @filter('''|.executesSuccessfully) 
		 */				
		- "Writing Assertions"{
			'''
				describe "Tables" {
				  def additions{
				    | a | b | sum |
				    | 0 | 0 |  0  |
				    | 1 | 2 |  3  |
				    | 4 | 5 |  9  |
				  }
				  - [additions.forEach[a + b => sum]]
				}     
			'''.executesSuccessfully
		}

		- "Specifying the Column Type"
		
	}
	
	describe "Spec extensions"{
		
	}
	
	 
}  