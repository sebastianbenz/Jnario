package de.bmw.carit.jnario.spec.tests.integration2

import java.util.ArrayList
import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*
import java.util.LinkedList
import java.util.List
import org.junit.Ignore

/*
 * Example tables are a great way to structure input and expected output data.
 * They can be used in examples to write assertions that . 
 */
describe "Example Tables"{
   
  /*
   * Examples are stored within a table. Written assertions using the table's values is 
   * best done using Xtend's `forEach` method. Inside a closure that is passed to `forEach`, 
   * each value in a row can be accessed by it's column's name.
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
  it "Naming examples"{   
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
   * Values in an example table can be arbitrary non-void expressions. For examples closures:
   */
  it "expressions in tables"{
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
  it "Specifying column types"{
  '''
  package bootstrap
  
  import java.util.*

  describe "Example Tables"{
    def examplesWithType{
      |          list            |
      | new ArrayList<String>()  |
      | new LinkedList<String>() |
    }     

    it "the type can be specified"{
      examplesWithType.forEach[
        assert list.empty
      ]
    }
  }
  '''.executesSuccessfully       
  }
    
}               