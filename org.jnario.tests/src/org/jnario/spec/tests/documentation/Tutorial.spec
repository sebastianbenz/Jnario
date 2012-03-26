/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.documentation

import static extension org.jnario.jnario.test.util.Helpers.*
import static extension org.jnario.lib.Each.*
import static extension org.jnario.lib.Should.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*
import java.util.Stack

/*
 * This tutorial gives you an introduction on how to write unit specifications with Jnario.
 * Jnario Specs is based on [Xtend](http://www.xtend-lang.org). it might be a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html) as well, 
 * because expressions, fields, methods and extensions in Jnario work exactly as in Xtend.
 *  
 * ### Installation & Runtime Library
 *
 * Jnario currently requires [Eclipse](http://www.eclipse.org) 3.5 or higher with [Xtext](http://www.xtext.org) 2.3,  and a Java SDK version 5 or above. 
 * You can install the most recent version from this update site: `http://www.jnario.org/updates/snapshot/`. Jnario requires a small runtime library that contains
 * the JUnit integration. You can download the jar [here](http://jnario.org/updates/snapshot/org.jnario.lib-0.1.0-SNAPSHOT.jar).
 *    
 */ 
describe "Jnario Specs - Tutorial"{

	/*
	 * To get started create a new specification using the spec wizard
	 * (**File** -> **New** -> **Other** -> **Jnario** -> **Spec**).
	 * 
	 * <p align="center"><img src="/img/tutorial/spec_wizard.png" alt="New Spec Wizard"/></p> 
	 * In Jnario we *describe facts* about our program. Here are two simple facts of a stack:
	 * 
	 * <pre class="prettyprint lang-spec">
	 * describe "A Stack"{
	 *   fact "initial size is 0" 
	 *   fact "increases its size when pushing an element"
	 * }
	 * </pre>
	 *  
	 * To execute this specification, right click
	 * in the editor and select **Run As** -> **JUnit Test**. 
	 * The specification will
	 * pass, but the facts in our specification will be marked as _PENDING_ as they are not implemented yet.
	 * 
	 * <pre class="prettyprint lang-none">A Stack
	 *   - initial size is 0 [PENDING]
	 *   - increases its size when pushing an element [PENDING]
	 * </pre>
	 * 
	 * In the background, Jnario automatically translates the stack specification into a JUnit test case `AStackSpec.java` 
	 * in the `xtend-gen`folder.  
	 */
	describe "How to write a Specification"{
  
		/*
		 * The next step is to enrich our facts with the required logic to
		 * check whether our stack behaves as specified. Checks are implemented by adding  
		 * a block expression to your facts.
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
		 fact "Checking your facts" {
	      '''
	      package demo
	      
	      import java.util.Stack
	      
	      describe "A Stack"{
	        fact "initial size is 0" {
	          new Stack().size => 0
	        }
	        fact "increases its size when pushing an element"{
	          val subject = new Stack
	          subject.push("A String")
	          subject.size => 1
	        }
	      }
	      '''.executesSuccessfully
	     }
	     
	     /*
	      * If we look at our first fact:
	      *  
	      * <pre class="prettyprint lang-spec">
	      * describe "A Stack"{
	      *   fact "initial size is 0" {
	      *    new Stack().size => 0
	      *  }
	      *  // ... 
	      * }
	      * </pre>
	      * 	
	      * we see that the string description looks pretty similar to the actual code.
	      * We can make this even more obvious by replacing `new Stack().size => 0` 
	      * with `new Stack().size should be 0`, using the more descriptive `should be`
	      * assertion “instead of `=>`. In Jnario you can avoid such redundancies between code 
	      * and description by leaving the description out. The code becomes 
	      * the actual description:
	      * 
	      * <pre class="prettyprint lang-none">A Stack
	      *   - new Stack().size should be 0
	      *   - increases its size when pushing an element</pre>
	      *  
	      * <span class="label label-important">Important</span> Facts without description
	      * can only have a single statement. If you need more statements, you should 
	      * add a description. 
	      * 
	      * Here is the updated version of our specification:
	      * 
	      * @filter('''|.executesSuccessfully) 
	      */ 
	     fact "Less boilerplate"{
	     	'''
				package demo
				
				import java.util.Stack
				
				describe "A Stack"{
				  fact new Stack().size should be 0
				  fact "increases its size when pushing an element"{
				    val subject = new Stack
				    subject.push("A String")
				    subject.size => 1
				  }
				}
		      '''.executesSuccessfully
	     }
	     
	     /* 
	      * In the previous specification we have a little redundancy:
	      * the creation of the Stack. We can get rid of it by creating 
	      * a field for the Stack. Declaring fields works exactly as in
	      * [Xtend](http://www.eclipse.org/xtend/documentation/index.html#fields).
	      * 
	      * @filter('''|.executesSuccessfully)  
	      */
	     fact "Using Fields"{
	     	'''
		      package demo
		      
		      import java.util.Stack
		      
		      describe "A Stack"{
		        Stack subject = new Stack
		        fact "initially empty" {
		          subject.size => 0
		        }
		        fact "increases its size when pushing an element"{
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
	      * <pre class="prettyprint lang-spec">	
	      * package demo
	      * 
	      * import java.util.Stack
	      * 
	      * describe Stack{
	      *   ...
	      * }
	      * </pre>
	      * This way you achieve a strong link between specification
	      * and its target that works even if the target class is renamed.  
	      * Jnario will also implicitly create a field called `subject` of
	      * the target type ([more...](/org/jnario/spec/tests/integration/ImplicitSubjectSpec.html)). Therefore we can get rid of the subject field in
	      * our stack specification. 
	      * 
	      * <span class="label label-important">Important</span> The implicit subject works
	      * only if the target class has a default constructor without any arguments, but it 
	      * is also possible to use Guice or other frameworks to automatically create
	      * the subjects ([more...](/org/jnario/spec/tests/integration/SpecInstantiationSpec.html)).
	      * 
	      *
	      * @filter('''|.executesSuccessfully)  
	      */
	     fact "Implicit Subjects"{
	     	'''
		      package demo
		      
		      import java.util.Stack
		      
		      describe Stack{
		        fact subject.size should be 0
		        fact "increases its size when pushing an element"{
		          subject.push("A String")
		          subject.size => 1
		        }
		      }
		      '''.executesSuccessfully
	     }
	     
	    /*
	     * Sometimes a class behaves differently in different contexts. 
	     * For example, the behavior when calling pop on a stack depends on whether 
	     * the stack empty or not. You can define
	     * contexts within Jnario specs to further structure your facts:
	     * 
	     * <pre class="prettyprint lang-none">
	     * Stack
		 *   when empty
		 *     - subject.size => 0
		 *     - subject.pop throws EmptyStackException
		 *   with elements
		 *     - pop decreases size
		 *     - pop removes last element"
	     * </pre>
	     * 
	     * In this example we also use the `throws` statement in 
	     * `subject.pop throws EmptyStackException`. It fails
	     * if the previous statement does not throw an instance of the 
	     * specified exception.
	     * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 fact "Defining Contexts" {
	      '''
			package demo
				      
			import java.util.Stack
			import java.util.EmptyStackException
			
			describe Stack{
			  context "when empty"{
			    fact subject.size => 0
			    fact subject.pop throws EmptyStackException
			  }
			  context "with elements"{
			    before subject.add("an element")
			    fact "pop decreases size"{
			      subject.pop
			      subject.size => 0
			    }	
			    fact "pop removes last element"{
			      subject.pop => "an element"
			    }		
			  }
			}
	      '''.executesSuccessfully
	     }

		/*
		 * You can structure your example data in tables. The
		 * type of each column will be automatically inferred from
		 * all column values. A cell in a table can have an arbitrary 
		 * non-void expression as a value. You can perform assertions 
		 * on tables using the `forEach` extension method:
		 * 
		 * <pre class="prettyprint lang-spec">
		 * describe "Addition" {
		 *   def additions{
		 *     | a | b | sum |
		 *     | 0 | 0 |  0  |
		 *     | 1 | 2 |  3  |
		 *     | 4 | 5 |  9  | 
		 *  }
		 *  fact additions.forEach[a + b should be sum]
		 * }
		 * </pre> 
		 * 
		 * The `forEach` extension method expects a closure as argument. 
		 * Within the closure you can directly access all values in a row 
		 * by their column name. The great thing about example tables is that
		 * they will give you detailed error messages when one of the 
		 * assertions fails ([more...](/org/jnario/spec/tests/integration/SpecsExampleTablesSpec.html)):
		 * 
		 * <pre class="prettyprint lang-none">
		 * java.lang.AssertionError: additions failed
		 * 
		 *         | a     | b     | sum     |
		 *         | 0     | 0     | 0       | OK
		 *         | 1     | 2     | 4       | FAILED     (1)
		 *         | 4     | 5     | 9       | OK
		 * 
		 * (1) Expected a + b should be sum but:
		 *          a + b is 3
		 *          a is 1
		 *          b is 2
		 *          sum is 4
		 * </pre>
		 * 
		 * @filter(.*) 
		 */				
		fact "Example Tables"{
			'''
			package demo 
			
			describe "Addition" {
			  def additions{
			    | a | b | sum |
			    | 0 | 0 |  0  |
			    | 1 | 2 |  3  |
			    | 4 | 5 |  9  |
			  }
			  fact additions.forEach[a + b should be sum]
			}
			'''.executesSuccessfully
		} 

		/* 
		 * Jnario can generate html documents from your specifications. The documentation will
		 * be generated automatically when you create a folder `doc-gen` in the project root.
		 * You can further extend the documentation by enriching your specification with 
		 * Javadoc like comments. You can even use [Markdown Syntax](http//daringfireball.net/projects/markdown/) 
		 * to format your specifications.
		 *
		 * <p align="center"><a href="/img/tutorial/doc_stack_example.png"><img src="/img/tutorial/doc_stack_example_small.png" alt="Generated documentation for the stack specification"/></a></p>  
		 * 
		 * This tutorial has actually been generated from a [specification](https://github.com/bmwcarit/Jnario/blob/master/org.jnario.tests/src/org/jnario/spec/tests/documentation/Tutorial.spec).
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 fact "Generating Documentation" {
	      '''
			package demo
							      
			import java.util.Stack
			import java.util.EmptyStackException
			
			/*
			 * In computer science, a **stack** is a last in, first out 
			 * (LIFO) abstract data type and linear data structure. A 
			 * stack can have any abstract data type as an element, 
			 * but is characterized by two fundamental operations, 
			 * called push and pop. 
			 * (source [Wikipedia](http://en.wikipedia.org/wiki/Stack)).
			 */
			describe Stack{
			  context "when empty"{
			    fact subject.size => 0
			    fact subject.pop throws EmptyStackException
			  }
			  /*
			   * A stack with a single element: "an element".
			   */
			  context "with elements"{
			    before subject.add("an element")
			    fact "pop decreases size"{
			      subject.pop
			      subject.size => 0
			    }	
			    fact "pop removes last element"{
			      subject.pop => "an element"
			    }		
			  }
			} 
	      '''.executesSuccessfully
	     }
		

		/*
		 * Setting up a fixture or tearing it down works similar to JUnit,
		 * but the syntax is less verbose. The following specification will print:
		 * 
		 * <pre class="prettyprint lang-none">
		 * 	before all
		 * 	before
		 * 	do stuff
		 * 	after
		 * 	before
		 * 	do more stuff
		 * 	after
		 * 	after all
		 * </pre>
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */ 
		fact "Setup & Teardown"{ 
				'''
			    describe "Setup & Teardown" {
			      before all{
			        println("before all")
			      }  
			      before{
			        println("before")
			      }
			      fact "should do stuff" {
			        println("do stuff")
			      }
			      fact "should do more stuff" {
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
		 * When you have to perform the same setup and tear down operations 
		 * for different specs you can use spec extensions.
		 * For example, we need to open and close a database connection before and 
		 * after each test case. With Jnario you can encapsulate these operations 
		 * into a separate class and use the normal JUnit @before and @after annotations
		 * to mark the methods that should be executed before and after a spec run. 
		 *
		 *	package demo
		 *	
		 *	import org.junit.Before
		 *	import org.junit.After
		 *	
		 *	class DatabaseExtension {
		 *	  @Before
		 *	  def void openDatabaseConnection(){
		 *	    println("openDatabaseConnection")
		 *	  }
		 *	  def query(String statement){
		 *	    println("query: " + statement)
		 *	  }
		 *	  @After
		 *	  def void closeDatabaseConnection(){
		 *	    println("closeDatabaseConnection")
		 *	  }
		 *	}
		 * 
		 * If we create an [extension field](http://www.eclipse.org/xtend/documentation/index.html#Extension_Fields)  
		 * for our database helper class in our spec:
		 * 
		 * 	extension DatabaseExtension db = new DatabaseExtension
		 * 
		 * its setup and tear down methods will be automatically executed before and after each fact.  
		 * Due to Xtends extension mechanism, this has the additional benefit that we can directly access all methods in thw
		 * database extension without the field name. 
		 * 
		 * <pre class="prettyprint lang-none">
		 * openDatabaseConnection
		 * query: SELECT * FROM content
		 * closeDatabaseConnection
		 * </pre>
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		fact "Spec extensions"{
			'''
			describe "Spec Extensions"{
			  extension DatabaseExtension db = new DatabaseExtension
			  fact query("SELECT * FROM content")	      
			}
			'''.executesSuccessfully
		}
 
		/*
		 * Helper methods can be directly declared in Jnario files. 
		 * They have the same syntax as in Xtend. Helper methods and fields
		 * can also be defined in nested contexts. 
		 * 
		 * @filter('''|.executesSuccessfully) 
		 */
		 fact "Helper methods"{
		  '''
	      describe "Helper Methods & Fields"{
	        String subject = "World" 
	        fact "can access fields and methods"{
	          subject.greeting => "Hello World"
	        }
	        def greeting(String s){
	          return "Hello " + s
	        }
	        context "shouting"{
	          String emphasize = "!" 
	          fact "can access fields and methods from parent"{
	             subject.greeting.shout => "HELLO WORLD!"
	          }
	          def shout(String s){
	            return s.toUpperCase + emphasize
	          }
	        }
	      }
	      '''.executesSuccessfully
		 }
	
  }		

	/*
	 * Jnario provides different statements for writing assertions ([more...](/org/jnario/spec/tests/integration/AssertionSpec.html)).
	 */
	describe "Writing Assertions"{
	
		/*
		 * The `assert` statement fails if 
		 * the following expression does not evaluate to `true`.
		 */
		fact "'assert'"{
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
		fact "'should', 'must' and `=>`"{
			true should be true
			"hello" must be "hello"
			1 + 1 should not be 1 
			"hello".toUpperCase must not be "hello"
			1 + 1 => 2 
		}   
		
		/*
		 * Assertions in Jnario are self-explainable. When an assertion fails, it tries to 
		 * provide as as much information as possible. It will 
		 * print the exact expression that has failed together with the actual value
		 * of all subexpressions. This means that you don't need to debug a test to 
		 * see why it actually has failed.
		 */
		fact "Self-explaining failures"{
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
		
	}
	
	
}  