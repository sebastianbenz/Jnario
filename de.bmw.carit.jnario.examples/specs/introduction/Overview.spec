package introduction

import static org.junit.Assert.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static extension de.bmw.carit.jnario.common.test.util.Helpers.*
import static org.hamcrest.CoreMatchers.*

/*
 * ![Alt text](file://localhost/Users/sebastian/Desktop/Specs.png)
 * 
 * Jnario is a framework that helps you to effectively write executable software specifications. 
 * It leverages the expressiveness of [Xtend](http://www.xtend-lang.org) and is easy to integrate
 * by being compiled to [Junit](http://www.junit.org/) tests. This EclipseCon, we show in a different 
 * [session](http://www.eclipsecon.org/2012/sessions/program-thou-shalt-behave) how to use Jnario for 
 * writing executable acceptance specifications. This session focuses on a different aspect of Jnario. 
 * We demonstrate how you can use Jnario to specify software behavior on a unit level. By the way, 
 * this document is actually generated from a [spec](https://gist.github.com/1762405) written with Jnario.
 */
describe "Jnario Specs - BDD for Java"{

  /*
   * In order to make tests more readable, Jnario provides assertion methods that extend any object 
   * (using Xtend's [extension methods](http://www.eclipse.org/xtend/#extensionmethods)).
   * These assertions help you to express how an object should behave.
   * They can be combined with any existing [Hamcrest](http://code.google.com/p/hamcrest/) matcher, 
   * so you can choose from large library of existing matchers.
   */
  it "Should-style Assertions"{
    "hello".should.be("hello") 
    true.should.not.be(false)
    newArrayList("jnario", "java").each.should.startWith("j")
    "hello".should.be(typeof(String))
  }
  
  /*
   * With Jnario, debugging a failing test to discover the reason for its failure, becomes 
   * a thing of the past. Jnario provides a special assert statement that prints the value 
   * of all involved expressions, making it easy to  debugging a failing test. 
   */
  it "Self-explaining Assertions"{
    val x = 0  
    val y = 1
    errorMessage[assert x == 1 && y == 0].is('''
      Expected x == 1 && y == 0 but:
           x == 1 is false
           x is 0
           y == 0 is false
           y is 1
    ''')
  }
  
  /*
   * The next example shows you how Jnario helps you to write less boilerplate code in your 
   * specifications. `Calculator` in `describe Calculator` references an existing Java type. 
   * Using this information Jnario will automatically create and instantiate a field `subject`, 
   * which you can use in your specification. It is even possible to use 
   * [Google Guice](http://code.google.com/p/google-guice/) to instantiate your subjects. 
   */
  it "Implicit subject creation"{
    val exampleSpec = '''
      package calculator
      
      import static org.hamcrest.CoreMatchers.* 

      describe Calculator {

        it "subject should be instantiated automatically"{
          subject.should.not.be(nullValue)
        }

      }
      '''
    assertThat(execute(exampleSpec), is(successful))
  } 
}