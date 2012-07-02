package org.jnario.jnario.documentation

import java.util.Collections
import java.util.HashMap
import java.util.List
import static extension java.util.Collections.*
/*
 * This document teaches you everything 
 * you need to know about Xtend in order to successfully use
 * [Jnario](http://www.jnario.org). For a more detailed 
 * introduction see the offical 
 * [Xtend documentation](http://www.eclipse.org/xtend/documentation.html).
 */
describe "21 Facts about Xtend"{

  /*
   * The syntax of Xtend is quite similar to Java, but Xtend code is usually
   * a lot shorter than its Java counterpart. However, there are some important
   * differences between Java and Xtend one should be aware of!
   */
  describe "A modernized Java"{
    
      /*
       * Semicolons are optional in Xtend.
       */
      fact "No semicolons"{
        var greeting = ""
        greeting = "Hello World"
        println(greeting)
      }
    /*
     * Variable declarations are preceded by `var` or, for in case of 
     * final variables, by `val`.
     */
    fact "Declare variables with var and val"{
      var String x = "I might change" 
      val String y = "I'll never change" // final  
    }
    
    /*
     * Having to precede variable declarations with `var` or `val` seems like a 
     * step backwards at first glance, but the type of a variable can be inferred
     * from the expression on the right-hand side. This means we can omit the 
     * type information for variable declarations, which makes code a lot more readable.  
     */
    fact "Less typing thanks to type inference"{
      val greeting = "Hello World"
      greeting => typeof(String)
      
      val greetings = newHashMap(
        "german"  -> "Hallo",
        "english" -> "Hello"
      )
      greetings => typeof(HashMap)
    }
    
    /*
     * In case you are wondering what the `->` does in the previous example,
     * it is syntactic sugar for a tuple:
     */
    fact "Syntactic sugar: Pairs"{
      val pair = "spain" -> "italy"
      pair.key   => "spain"
      pair.value => "italy"
    }
    
    /*
     * Static class members are accessed via `::` and not `.` like in Java.
     * 
     * <span class="label label-warning">Important</span> This is probably the most 
     * often asked question on the Xtend [mailing list](https://groups.google.com/forum/?fromgroups#!forum/xtend-lang). 
     */
    fact "Accessing static members is different!"{
      val colors = list("red", "blue", "green")
      Collections::sort(colors)
      colors => list("blue", "green", "red")
    }
    
    /*
     * Accessing classes has also a different syntax in Xtend. Instead of writing
     * `String.class` like in Java, you need to write `typeof(String)` in Xtend.
     * 
     * <span class="label label-warning">Important</span> This is probably the second most 
     * most often asked question on the Xtend mailing list.
     * 
     */
    fact "Accessing types"{
      typeof(String).name => "java.lang.String"
    }
    
    /*
     * Type casts behave exactly like in Java, but have a slightly more 
     * readable syntax:
     */
    fact "Casts have a different syntax"{
    	val Object obj = "a string"
    	val String s = obj as String
    }
    
    val greeting = "Hello "
    
    def sayHello(String name){
      greeting + name
    }
    
    /*
     * Fields in Xtend can be declared exactly like in Java.
     * Methods in Xtend are also declared like in Java, but with the difference that method  
     * declarations are preceded with `def`:
     * 
     * <pre class="prettyprint lang-spec">
     * String greeting = "Hello "
     * 
     * def public String sayHello(String name){
     *   return greeting + name 
     * }
     * </pre>
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
     * Calling fields and methods works exactly like in Java, but it is possible to 
     * omit the parentheses when calling a method without parameters.
     */
    fact "Fields & methods work almost like in Java"{
      sayHello("Sebastian") => greeting + "Sebastian"
      42.toString => "42"
    }
    
  }
  
  
  /*
   * Xtend's switch expression is greatly improved over the one from Java.
   * There is no fall through which means only one case is 
   * evaluated at most and is not limited to certain 
   * values but can be used for any object.
   */  
  describe "The Uber-Switch Expression"{
  
    fact "Supports case expressions"{
      val myString = "Hello"
      
      switch myString {
        case myString.length > 5 : "a long string."
        case 'some'              : "It's some string."
        default                  : "It's another short string."
      } 
      
      =>  "It's another short string."
    }
    
    /*
     * You can also write type guards in the case statements. Note that 
     * on the right-hand side of the case statement you can directly 
     * access the features of the guarded type without an explicit cast; 
     */
    fact "...and type guards (with type inference)"{
      val x = list(1, 2, 3) as Object
      
      switch x {
        String case x.length > 0 : x.length // length from String 
        List<?>                  : x.size    // size from List
        default : -1
      } 
      
      => 3
    }
    
  }
  
  /*
   * Extension methods allow adding new methods to existing 
   * types without modifying them. When writing specs this is really 
   * helpful as they can greatly improve the readability.
   */
  describe "Readable Code with Extension Methods"{
  	
  	/*
  	 * You can import static methods as extensions, for example, when we import:
  	 * 
  	 * <pre class="prettyprint lang-spec"> 
  	 * import static extension java.util.Collections.*
  	 * </pre>
  	 * 
  	 * we can directly call the imported static methods on our list objects:
  	 */
    fact "Import static extension methods."{
      val colors = list("red", "blue", "green")
      colors.sort // sort is implemented by Collections#sort(List<T>)
      colors => list("blue", "green", "red")
    }
    
    /*
     * All visible non-static methods of the current class and its super 
     * types are automatically available as extensions. In specs this can 
     * be used to write custom matcher:
     * 
     * <pre class="prettyprint lang-spec"> 
     * def hasOneElement(List<?> list){
     *	list.size == 1
     * }
     * </pre>
     * 
     * We can then use this method in our assertion:
     */
    fact "Local extension methods."{
      assert list("red").hasOneElement
    }
    
    def hasOneElement(List<?> list){
    	list.size == 1
    }
    
    /*
     * By adding the extension keyword to a field declaration, 
     * its instance methods become extension methods. We use this
     * feature a lot to share helper methods or
     * setup and tear-down operations between different specs. For example,
     * we could move our `hasOneElement` method to a separate helper class 
     * `ListHelpers` and declare it as an extension field:
     * 
     * <pre class="prettyprint lang-spec"> 
     * extension ListHelpers = new ListHelpers
     * </pre>
     * 
     * Then we can share our helper between different specs, but can still
     * use the provided methods as extensions:
     */
    fact "Extension fields"{
      assert list("red").hasOneElement
    }
  }
  
  describe "Functional Programming FTW"{
    
    /*
     * Accessing elements in lists.
     */
    fact "Simple access to list elements"{
      val colors = list("red", "blue", "green")
      colors.head => "red"
      colors.tail => iterable("blue", "green")
      colors.last => "green"
      colors.empty => false
    }
    
    /*
     * Here is another useful fact about Xtend, you can concatenate collections 
     * using the `+` operator. 
     */
    fact "Concatenate collections with +"{
      list("red", "blue") + list("yellow", "green") => iterable("red", "blue", "yellow", "green")
    }
    
    fact "Concise Lambda Expressions"{
      // declaring a function object
      var (String)=>String shout 
      // explicitly defining the parameter with type
      shout = [String s | s.toUpperCase] 
      // omit the type
      shout = [s | s.toUpperCase] 
      // using the implicit variable 'it' for lambdas with one parameter
      shout = [it.toUpperCase] 
      // but you can also omit the 'it'
      shout = [toUpperCase] 
      // apply the function to an object
      shout.apply("hello") => "HELLO"
    }
    
    /*
     * Lambda expressions are especially useful when working with 
     * collections. For example, when applying side effects from a collection
     * it is often better to use the implicit `forEach` extension method 
     * instead of a loop:
     */
    fact "Better loops"{
    	list("red", "blue", "green").forEach[println]
    }
    
    /*
     * The `filter` extension method is really helpful when you are only interested
     * in a subset of a collection. You can filter by type:
     */
    fact "Filter iterables by type"{
      list("a string", 42, true).filter(typeof(String)) => iterable("a string")
    }
    
    /*
     * In this case we provide a lambda expressions that returns true for the 
     * elements we are interested in:
     */
    fact "... or via a custom predicate"{
      list("red", "blue", "green").filter[startsWith("b")] => list("blue")
    }
    
    /*
     * This examples demonstrates how you can realize complex operations by
     * composing different functions. Here we are counting all characters in a list of Strings using the
     * `map` and `reduce` extension methods.
     */
    fact "Map/Reduce made easy"{
      val strings = list("red", "blue", "green")
      val charCount = strings.map[s|s.length].reduce[sum, size | sum + size]
      charCount => 12
    }
    
  }
  
  def <T> Iterable<T> iterable(T... elements){
    [|elements.iterator]
  }
  
  def <T> operator_doubleArrow(Iterable<T> actual, Iterable<T> expected){
    actual.toList == expected.toList
  }
}