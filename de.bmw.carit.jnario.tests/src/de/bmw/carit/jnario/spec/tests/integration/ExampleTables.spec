package de.bmw.carit.jnario.spec.tests.integration

import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*
import org.junit.Ignore
/*
 * Example tables are a great way to structure input and expected output data.
 */
describe "Example Tables"{
   
  /*
   * Examples are stored within a table. Assertions for the table's values are
   * best implemented by iterating over each table row with Xtend's `forEach` method. 
   * Inside the closure that is passed to `forEach`, each value in a row can be 
   * directly accessed by it's column's name making use of 
   * [Xtend's implicit 'it'](http://www.eclipse.org/xtend/documentation/index.html#closures).
   */ 
  - "accessing values"{    
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def myExamples{
        |    input      |  result       |  
        | "Hello World" | "HELLO WORLD" | 
        | "Hallo Welt"  | "HALLO WELT"  |
      } 
      
      it "can be accessed via the table name"{
        myExamples.forEach[   
          input.toUpperCase.should.be(result) 
        ] 
      }
    }
    '''.executesSuccessfully 
  }    
   
  /*
   * Naming an example table is optional. If no name is provided, the default name 'examples' will be used. 
   */
  - "Naming examples"{   
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def{
        | a | b | 
        | 0 | 1 |
      }

      it "name is optional"{    
        assert examples != null
      }     
    } 
    '''.executesSuccessfully 
  }       
  
  /* 
   * Values in an example table can be arbitrary non-void expressions, for examples closures:
   */
  - "expressions in tables"{
    '''
    package bootstrap
    
    describe "Example Tables"{
      
      def myExampleWithClosures{
        | input |       operation        | result |
        |   "a" | [String s | s.toUpperCase] |   "A"  |
        |   "B" | [String s | s.toLowerCase] |   "b"  | 
      }  

      it "supports closures as values"{   
        myExampleWithClosures.forEach[
          operation.apply(input).should.be(result)
        ]
      }       
    }
    '''.executesSuccessfully 
  }
  
  /*
   * Jnario automatically infers the type of a column. It will use the 
   * common supertype of all expressions in a column. 
   */
  @Ignore
  - "Specifying column types"{
  '''
  package bootstrap
  
  import java.util.*

  describe "Example Tables"{
    def examplesWithType{
      |          list            |
      | new ArrayList<String>()  |
      | new LinkedList<String>() |
    }     

    it "computes the common super type"{
      examplesWithType.forEach[
        assert list.empty
      ]
    }
  }
  '''.executesSuccessfully       
  }
  
  /*
   * Jnario will include example tables in the generated documentation.
   */
  describe "Documentation"{
  	
  	def Additions{
  		| Value1 | Value2 | Sum |
  		|   1    |    2   |  3  |
  		|   4    |    5   |  9  |
  		|   7    |    8   | 15  |
  	}
  	
  }  
}               