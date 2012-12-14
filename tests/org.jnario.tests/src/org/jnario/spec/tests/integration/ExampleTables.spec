/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith

import static extension org.jnario.jnario.test.util.Helpers.*
import static extension org.jnario.lib.ExampleTableIterators.*
import static extension org.jnario.lib.Should.*

/*
 * Example tables are a great way to structure input and expected output data.
 */
@CreateWith(typeof(SpecTestCreator))
describe "Using Tables"{
  @Inject extension BehaviorExecutor
  /*
   * Examples are stored within a table. Assertions for the table's values are
   * best implemented by iterating over each table row using `forEach`. 
   * Inside the procedure that is passed to `forEach`, each value in a row can be 
   * directly accessed by it's column's name making use of 
   * Xtend's [implicit 'it'](http://www.eclipse.org/xtend/documentation/index.html#closures).
   * @filter('''|.executesSuccessfully) 
   */ 
  fact "accessing values"{    
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def myExamples{
        |    input      |  result       |  
        | "Hello World" | "HELLO WORLD" | 
        | "Hallo Welt"  | "HALLO WELT"  |
      } 
      
      fact "can be accessed via the table name"{
        myExamples.forEach[   
          input.toUpperCase should be result
        ] 
      }
    }
    '''.executesSuccessfully 
  }    
   
  /*
   * Naming an example table is optional. If no name is provided, the default name 'examples' will be used. 
   * @filter('''|.executesSuccessfully) 
   */
  fact "Naming examples"{   
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def{
        | a | b | 
        | 0 | 1 |
      }

      fact "name is optional"{    
        examples should not be null
      }     
    } 
    '''.executesSuccessfully 
  }       
  
  /* 
   * Values in an example table can be arbitrary non-void expressions, for examples closures:
   * @filter('''|.executesSuccessfully) 
   */
  fact "Expressions in tables"{
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def myExampleWithClosures{
        | input |       operation            | result |
        |   "a" | [String s | s.toUpperCase] |   "A"  |
        |   "B" | [String s | s.toLowerCase] |   "b"  | 
      }  

      fact "supports closures as values"{   
        myExampleWithClosures.forEach[
          operation.apply(input) should be result
        ]
      }       
    }
    '''.executesSuccessfully 
  }
  
  /* 
   * It is also possible to call methods or reference fields from within a table.
   * @filter('''|.executesSuccessfully) 
   */
  fact "Referencing members"{
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      String field = "Hello"

      def method(){
        "World"
      }  
    
      def myExampleWithMemberCalls{
        | input    | result  |
        | field    | "Hello" |
        | method() | "World" | 
      }       
       
      fact "supports closures as values"{   
        myExampleWithMemberCalls.forEach[
          input should be result
        ] 
      }   
    }
    '''.executesSuccessfully 
  }
  

  /*
   * Jnario automatically infers the type of a column. It will use the 
   * common supertype of all expressions in a column. 
   * @filter('''|.executesSuccessfully) 
   */
  fact "Column type inference"{
  '''
  package bootstrap
  
  import java.util.*

  describe "Example Tables"{
    def examplesWithTypeInference{
      |          list            |
      | new ArrayList<String>()  |
      | new LinkedList<String>() |
    }     

    fact "computes the common super type"{
      examplesWithTypeInference.forEach[
        assert list.empty // works only if the type of list has been inferred as List<String>
      ]
    }
  }
  '''.executesSuccessfully       
  }
  
  /*
   * It is also possible to explicitly define the type of a column. 
   * @filter('''|.executesSuccessfully) 
   */
  fact "Specifying column types"{
  '''
	import java.util.ArrayList
	import java.util.LinkedList
	
	describe "Example Tables"{
	  def examplesWithType{
	    | Iterable<String> list    |
	    | new ArrayList<String>()  |
	    | new LinkedList<String>() |
	  }
	    
	  fact "computes the common super type"{
	    examplesWithType.forEach[
	      assert list.empty
	    ]
	  }
	}
  '''.executesSuccessfully       
  }
  
  
  /*
   * Jnario will include example tables in the generated documentation. 
   * (The errors in the table are intentional, we need it in the next example). 
   * 
   */
	def example{
		| value1 | value2 | sum |
		|   1    |    2   |  3  |
		|   4    |    5   |  7  |
		|   7    |    8   | 14  |
	}
	
  /*
   * `ExampleTable#forEach` executes the passed in procedure for all table rows. 
   * It will generate an error message for all procedures that have failed with the reason why they failed.
   */
   fact "Error message"{
		errorMessage[
		  example.forEach[
		  	value1 + value2 => sum
		  ]
		].is('''
			example failed
			
			        | value1     | value2     | sum      |
			        | <1>        | <2>        | <3>      | ✓
			        | <4>        | <5>        | <7>      | ✘     (1)
			        | <7>        | <8>        | <14>     | ✘     (2)
			
			(1) java.lang.AssertionError: 
			Expected value1 + value2 => sum but
			     value1 + value2 is <9>
			     value1 is <4>
			     value2 is <5>
			     sum is <7>
			
			(2) java.lang.AssertionError: 
			Expected value1 + value2 => sum but
			     value1 + value2 is <15>
			     value1 is <7>
			     value2 is <8>
			     sum is <14>''')
	}    

}               