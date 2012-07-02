package org.jnario.jnario.documentation

import java.util.Collections
import java.util.HashMap
import java.util.List
import static extension java.util.Collections.*
/*
 * This document will teach you all 
 * you need to know about Xtend to use [Jnario](http://www.jnario.org). All the
 * shown examples work also in Jnario specifications. For a more detailed 
 * introduction see the offical 
 * [Xtend documentation](http://www.eclipse.org/xtend/documentation.html).
 */
describe "21 Facts about Xtend"{

  describe "Syntax"{
    
      fact "No semicolons!"{
        var greeting = ""
        greeting = "Hello World"
        println(greeting)
      }
    
    fact "Declaring variables"{
      var String x = "I might change" 
      val String y = "I'll never change" // final  
    }
  
    fact "Less typing thanks to type inference"{
      val greeting = "Hello World"
      greeting => typeof(String)
      
      val greetings = newHashMap(
        "german"  -> "Hallo",
        "english" -> "Hello"
      )
      greetings => typeof(HashMap)
    }
    
    fact "Good to know: Pairs"{
      val pair = "spain" -> "italy"
      pair.key   => "spain"
      pair.value => "italy"
    }
    
    /*
     * Static members of a class are accessed via `::` and not via `.` like in Java.
     * 
     * <span class="label label-warning">Attention</span> This is probably the most 
     * asked question on the Xtend mailing list. 
     * 
     */
    fact "Accessing static members"{
      val colors = list("red", "blue", "green")
      Collections::sort(colors)
      colors => list("blue", "green", "red")
    }
    
    val greeting = "Hello "
    
    def sayHello(String name){
      greeting + name
    }
    
    /*
     * Methods in Xtend are declared like in Java. The only difference is that methods  
     * declarations are preceded with `def`.
     * 
     * <pre class="prettyprint lang-spec">
     * String greeting = "Hello "
     * 
     * def public String sayHello(String name){
     *   return greeting + name 
     * }
     * </pre>
     * 
     * 
     * The type inference also works for fields and methods. You can omit 
     * the return type of methods and the type of fields. Methods are by default
     * public. So declaring fields and methods becomes a lot more concise:
     * 
     * <pre class="prettyprint lang-spec"> 
     * val greeting = "Hello "
     * 
     * def sayHello(String name){
     *   greeting + name // return is optional
     * }
     * </pre>
     * 
     * Calling fields and methods works exactly like in Java:
     */
    fact "Declaring fields & methods"{
      sayHello("Sebastian") => greeting + "Sebastian"
    }
    
  }
  

  describe "Extension Methods"{
    fact "More readable code with extension methods"{
      val colors = list("red", "blue", "green")
      colors.sort
      list("blue", "green", "red")
    }
  }

  
  /*
   * Xtend's switch expression is very different from Java's switch statement. 
   * First, there is no fall through which means only one case is 
   * evaluated at most. Second, the use of switch is not limited to certain 
   * values but can be used for any object reference instead.
   */  
  describe "The Uber-Switch Expression"{
  
    fact "Case expressions"{
      val myString = "Hello"
      
      switch myString {
        case myString.length > 5 : "a long string."
        case 'some'              : "It's some string."
        default                  : "It's another short string."
      } 
      
      =>  "It's another short string."
    }
    
    fact "Type guards"{
      val x = list(1, 2, 3) as Object
      
      switch x {
        String case x.length > 0 : x.length // length from String 
        List<?>                  : x.size    // size from List
        default : -1
      } 
      
      => 3
    }
    
  }
  
  describe "Functional programming FTW"{
    
    fact "Closures are great"{
      var (String)=>String shout

      shout = [String s | s.toUpperCase]
      shout = [it.toUpperCase]
      shout = [toUpperCase]

      shout.apply("hello") => "HELLO"
    }
    
    /*
     * Accessing elements in lists.
     */
    fact "Heads or tails"{
      val colors = list("red", "blue", "green")
      colors.head => "red"
      colors.tail => iterable("blue", "green")
      colors.last => "green"
      colors.empty => false
    }
    
    /*
     * 
     */
    fact "Filtering by type"{
      list("a string", 42, true).filter(typeof(String)) => iterable("a string")
    }
    
    fact "Filtering with predicates"{
      list("red", "blue", "green").filter[startsWith("b")] => list("blue")
    }
    
    fact "Map & Reduce"{
      list("red", "blue", "green").map[toUpperCase] => list("RED", "BLUE", "GREEN")
      list(5, 3, 1).reduce[result, element | result + element] => 9
    }
    
    fact "Flatten collections"{
      list(list("red", "blue"), list("yellow", "green")).flatten => iterable("red", "blue", "yellow", "green")
    }
    
    fact "Concatenating collections"{
      list("red", "blue") + list("yellow", "green") => iterable("red", "blue", "yellow", "green")
    }
    
  }
  
  def <T> Iterable<T> iterable(T... elements){
    [|elements.iterator]
  }
  
  def <T> operator_doubleArrow(Iterable<T> actual, Iterable<T> expected){
    actual.toList == expected.toList
  }
}