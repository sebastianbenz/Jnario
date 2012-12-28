/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.documentation

import java.util.Collections
import java.util.HashMap
import java.util.List
import static extension java.util.Collections.*

/*  
 * This document teaches you everything 
 * you need to know about Xtend to effectively use
 * [Jnario](http://www.jnario.org). For a more detailed 
 * introduction see the offical [Xtend documentation]
 * (http://www.eclipse.org/xtend/documentation.html).
 * This document is automatically generated from a specification
 * written in Jnario. You can see the original source code 
 * by clicking on **source** in the upper right corner.
 */
describe "20 Facts about Xtend"{
  /* 
   * The syntax of Xtend is quite similar to Java, but Xtend code 
   * is usually a lot shorter than its Java counterpart. However, 
   * there are some important differences between Java and Xtend 
   * one should be aware of.
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
     * Variable declarations are preceded by `var` or, in case of 
     * final variables, by `val`.
     */
    fact "Variables are declared with var and val"{
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
     * it is syntactic sugar for a tuple. To further increase the confusion, the `=>` 
     * operator is part of Jnario and describes the expected behavior of objects. 
     */
    fact "Syntactic sugar: Pairs"{
      val pair = "spain" -> "italy"
      pair.key   => "spain"
      pair.value => "italy"
    }
    
    val greeting = "Hello "
    
    def sayHello(String name){
      greeting + name
    }
    
    /*
     * Fields and methods can be declared in Xtend exactly like in Java. The only difference id 
     * that method declarations must be preceded with `def`:
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
     * the return type of methods and the type of fields. Furthermore, methods are by default
     * public, so we can rewrite our previous example as:
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
  describe "Some important differences"{
    
    /*
     * Static class members are accessed via `::` and not `.` like in Java.
     * 
     * <span class="label label-warning">Important</span> This is probably the most 
     * often asked question on the Xtend [mailing list](https://groups.google.com/forum/?fromgroups#!forum/xtend-lang). 
     */
    fact "Accessing static members differs from Java"{
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
    fact "...as well as accessing types"{
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
    
  }
  
  
  /*
   * Xtend's switch expression is greatly improved over the one from Java.
   * There is no fall through which means only one case is 
   * evaluated at most and it is not limited to certain 
   * values but can be used for any object.
   */  
  describe "The Uber-Switch Expression"{
  
    /*
     * Cases support arbitrary expressions, if they evaluate to a boolean value, it will 
     * be used as result, otherwise, the evaluation result will be compared using `Object#equals(Object)`. 
     */
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
   * helpful as they can greatly improve the readability. They  
   * use a simple syntactic trick: the first parameter of a method
   * can either be passed in after opening the parentheses or before the 
   * method call. For example, given a method:
   * 
   * <pre class="prettyprint lang-spec"> 
   * def removeVowels (String s){
   *   s.replaceAll("[aeiouAEIOU]", "")
   * }
   * </pre>
   * 
   * We can call this method either like in Java:
   * 
   * <pre class="prettyprint lang-spec"> 
   * removeVowels("Hello")
   * </pre>
   * 
   * or as an extension method of String:
   * 
   * <pre class="prettyprint lang-spec"> 
   * "Hello".removeVowels
   * </pre>
   */
  describe "Readable Code with Extension Methods"{

    /*
     * You can import static methods as extensions, for example, when we import:
     * 
     * <pre class="prettyprint lang-spec"> 
     * import static extension java.util.Collections.&#42;
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
     * be used to write custom matchers:
     * 
     * <pre class="prettyprint lang-spec"> 
     * def hasOneElement(List<?> list){
     *  list.size == 1
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
     * Then we can share our helper between different specs, while still
     * using the instance methods as extensions:
     */
    fact "Extension fields"{
      assert list("red").hasOneElement
    }
  }
  
  /*
   * A great thing about Xtend is that it enables a more functional programming style,
   * with its native support for anonymous functions, the so called lambda expressions, 
   * and its rich library of extension methods. 
   */
  describe "Functional Programming FTW"{
    
    /*
     * Xtend provides a rich set of extension methods for collections. Accessing elements 
     * in lists.
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
    fact "'+' concatenates collections"{
      list(1, 2) + list(3, 4) => iterable(1, 2, 3, 4)
    }
    
    /*
     * Xtend has great support for lambda expressions. You can 
     * declare an anonymous function by surrounding the lambda 
     * expression by square brackets:
     * 
     * <pre class="prettyprint lang-spec"> 
     * var lambda = [String s | s.length] 
     * </pre>
     * 
     * The parameter type can be omitted if the type can be coerced from 
     * the expression on the left-hand side:
     * 
     * <pre class="prettyprint lang-spec"> 
     * var (String)=>int lambda = [s | s.length] 
     * </pre>
     * 
     * Single parameter functions don't need a parameter declaration and the
     * parameter can be accessed via the implicit variable 'it':
     * 
     * <pre class="prettyprint lang-spec"> 
     * var (String)=>int lambda = [it.length] 
     * </pre>
     * 
     * ...and we can even completely remove the 'it' variable:
     *
     */
    fact "Concise Lambda Expressions"{
      var (String)=>int lambda = [length] 
      lambda.apply("hello") => 5
    }
    
    /*
     * Lambda expressions are especially useful when working with 
     * collections. For example, when performing the same assertion on each element 
     * in a collection, the implicit `forEach` extension method is a lot more readable than 
     * a loop:
     */
    fact "Better loops"{
      list(11, 17, 19).forEach[assert it > 10]
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
     * reusing existing functions with lambda expressions. Here we are counting 
     * all characters in a list of Strings using the `map` and `reduce` extension methods.
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