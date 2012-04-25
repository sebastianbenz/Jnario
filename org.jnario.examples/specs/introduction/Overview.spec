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
/*
 * <p align="center"><img src="file://localhost/Users/sebastian/Desktop/Specs.png"/></p>
 *  
 * *Jnario* is a framework helping you write executable software specifications. 
 * It leverages the expressiveness of [Xtend](http://www.xtend-lang.org) and is easy to 
 * integrate, as it compiles to plain [JUnit](http://www.junit.org/) tests. 
 * In our other [presentation](http://www.eclipsecon.org/2012/sessions/program-thou-shalt-behave) 
 * at this EclipseCon, we demonstrate how to use Jnario for writing executable acceptance 
 * specifications in a business readable fashion. 
 * This session introduces you to *Jnario Specs* fact another language of Jnario allowing 
 * software behavior specification on a unit level. We demonstrate how you can design and document 
 * your software at the same time.
 * For example, this document is actually generated from a [spec](https://gist.github.com/1762405) written 
 * with *Jnario Specs*.
 */ 
describe "Jnario Specs fact BDD for Java"{
 
  /* 
   * Jnario improves the readability of tests by providing assertion methods which can extend 
   * any object (making use of Xtend's [extension methods](http://www.eclipse.org/xtend/#extensionmethods)).
   * These assertions help you express how an object should behave. They can be combined with any 
   * [Hamcrest](http://code.google.com/p/hamcrest/) matcher, giving you the freedom to choose from 
   * a wide range of existing matchers.
   */
  fact "Should-style Assertions"{
  	"hello" should be "hello" 
    true should not be false
    "hello" should be typeof(String) 
  } 
  
  /*
   * With Jnario, debugging a failing test to discover the reason for its failure becomes 
   * a thing of the past. Jnario provides a special assert statement that reports, when the assertion fails, 
   * the value of all involved expressions. 
   */
  fact "Self-explaining Assertions"{  
    val x = 0  
    val y = 1
    errorMessage[assert x == 1 && y == 0].is('''
      Expected x == 1 && y == 0 but:
           x == 1 is false
           x is 0
           y == 0 is false  
           y is 1'''
      )  
  }   

  /*
   * *Jnario Specs* helps you write less boilerplate code in your 
   * specifications. In the following example, `describe Calculator` 
   * references the existing Java type `Calculator`. 
   * Using this information Jnario will automatically create and instantiate a field `subject`, 
   * which you can use in your specification. It is even possible to use 
   * [Google Guice](http://code.google.com/p/google-guice/) to instantiate your subjects.
   * 
   * @filter(\.executesSuccessfully|''')   
   */
  fact "Implicit subject creation" {
      '''
      package bootstrap
      
      import java.util.ArrayList
      
      describe ArrayList{

        fact "should automatically create an instance of ArrayList called subject"{
          subject should be typeof(ArrayList)
        }

      }
      '''.executesSuccessfully
  }  
  
  
}