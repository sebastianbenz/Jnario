/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.documentation

import static extension org.jnario.jnario.test.util.Helpers.*
import static extension org.jnario.lib.Each.*
import static extension org.jnario.lib.Should.*
import static extension org.jnario.jnario.test.util.FeatureExecutor.*

/*
 * Jnario Features are based on [Xtend](http://www.xtend-lang.org). It is a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html)
 * before you get started with Jnario, because expressions, fields, methods and extensions in Jnario work exactly as in Xtend.
 *  
 * ### Installation
 * 
 * Jnario currently requires [Eclipse](http://www.eclipse.org) 3.5 or higher with [Xtext](http://www.xtext.org) 2.3,  and a Java SDK version 5 or above. 
 * You can install the most recent version from this update site: `http://www.jnario.org/updates/snapshot/`. Jnario requires a small runtime library that contains
 * the JUnit integration. You can download the jar [here](http://jnario.org/updates/snapshot/org.jnario.lib-0.1.0-SNAPSHOT.jar).
 * 
 *   
 */
describe "Jnario Features - Tutorial"{
  
  /*
   * The first example for using Jnario Features is the specification of a calculator. Start out with creating
   * a new file (**File** -> **New** -> **File**) and giving it the file extension _*.feature_.
   * 
   * A feature file consists of the a feature and the scenarios that are the acceptance criteria for the feature.
   * For the calculator the the feature description in form of a story and one scenario for adding
   * numbers looks as follows:
   * 
   * <pre class="prettyprint lang-feature">
   * Feature: Calculator
   *     
   *   As a math dummy
   *   I want a calculator that helps me with basic math operations
   *   In order to check my capabilities
   * 
   *   Scenario: Adding two numbers
   *     
   *     Given a calculator
   *     When I enter two numbers and press add
   *     Then it should show the sum
   * </pre>
   * 
   * A feature consists of the name of the feature, it's narrative and a number of scenarios. The narrative can be arbitrary
   * text. You should use it to describe the rationale of the feature.
   * Those scenarios
   * are examples for the behavior expected from the feature. For the calculator possible
   * scenarios are, for example, addition or subtraction.
   * 
   * Each scenario is defined by the steps that describe the expected behavior. **Given** steps give
   * all the necessary information about the context of the scenario. **When** describes the action
   * and **Then** describes the expected outcome that we want to verify. You can use the keyword **And** to 
   + split a step into different sub steps.
   *   
   * When you save the file an xtend-gen folder will be created and the corresponding generated java files will
   * be created. Those files can be executed as JUnit-Tests. Right click and select **Run As** -> **JUnit Test**
   * You will see the result of the run and it will be green. Since the steps from scenario are not implemented
   * yet all the steps will be marked as _PENDING_ as an reminder that there is still work to do.
   */
   describe "How to write a Feature"{
     /*
     * 
     * @filter('''|.executesSuccessfully) 
     * @lang(feature)
     *
        * To turn our scenario into an executable specification you have to add the necessary code to each
        * of our steps. For each step the implementation is done directly after the description
        * of the step. The language used to define the logic is [Xtend](http://www.eclipse.org/xtend/documentation/index.html#fields).
        * Create a Java class with the name Calculator in the same project as your feature file.
        * Add the necessary import to the feature file or include it by auto completion while typing (CTRL + SPACE).
		*
		* <span class="label label-info">Info</span> Specifying the package and declaring and importing other packages
        * works similar to Xtend (static imports work as well).</span> 
        *
        * First we will declare a field `Calculator calculator` which we initialize in our **Given** step (we could
        * also directly initialize the field `Calculator calculator = new Calculator`). We will also create a
        * integer field named `result` to store the result of our calculation.
        * In the **When** step we call `add` on the calculator and pass in the two parameters specified in the step.
        * The return value is assigned to the `result` field.
        *
        * Parameters can be defined in steps using quotes: `"I am a parameter"`. Within your step implementation,
        * you can access these parameters by an implicitly created variable `args`. Jnario provides some 
        * [extension methods](http://www.eclipse.org/xtend/documentation/index.html#extensionMethods) that 
        * simplify converting strings to other primitives. Here we use the `toInt` extension to convert the 
        * string parameter into an integer.  
        *
        * Now we need to define a method `add` in our calculator to remove the compile errors.
        * In the **Then** step we will assert the behavior of our calculator. For writing readable short assertions
        * different additional assertions come with Jnario. All of the possibilities are
        * described [here](/org/jnario/spec/tests/integration/AssertionSpec.html).
        * Here we use for describing the expected outcome of an expression `=>`.
        * 
        * @filter('''|.executesSuccessfully)
        * @lang(feature)
        */
       fact "Implementing Steps"{
         '''
       package demo
       
       import org.jnario.feature.documentation.Calculator
       
       Feature: Calculator
       
       Scenario: Adding two numbers
         Calculator calculator
         int result
         Given a calculator
           calculator = new Calculator
         When I add two numbers "20" and "70"
           result = calculator.add(args.first.toInt, args.second.toInt)
         Then it prints "90"
           result => args.first.toInt
         '''.executesSuccessfully
       }
       
       /*
        * **Given** steps that are used in all scenarios of the same feature can be defined in a `Background`.
        * For example, if we add a second scenario to describe the division of two values, we can move the 
        * **Given** step together with it's used fields to a **Background**. 
        * All steps defined as background steps will be executed before each steps of a scenario.
        * 
        * @filter('''|.executesSuccessfully)
        * @lang(feature)
        */
       fact "Background"{
         '''
       package demo
       
       import org.jnario.feature.documentation.Calculator
       
       Feature: Calculator
       
       Background:
         Calculator calculator
         int result
         Given a calculator
         	calculator = new Calculator
       
       Scenario: Adding two numbers
         When I add two numbers "20" and "70"
           result = calculator.add(20,70)
         Then it prints "90"
           result => args.first.toInt
         
       Scenario: Dividing two numbers
        When I divide "70" by "10"
        	 result = calculator.divide(70,10)
        Then it prints "7"
         '''.executesSuccessfully
       }
      
      /*
       * Often you want to verify the behavior of a scenario with multiple examples.
       * In case of the calculator you might want to define what happens using negative numbers
       * or large numbers. In this case you can define a table with values that can be used
       * by the scenario steps. Each scenario will be executed separately for each row in the table.
       * 
       * The header of the example table serves as field declaration of the header names. The
       * type is derived from the common super type of all cells in a column.
       * 
       * @filter('''|.executesSuccessfully)
       * @lang(feature)
       */ 
      fact "Example tables"{
         '''
         package demo
         import org.jnario.feature.documentation.Calculator

         Feature: Calculator
         
         Scenario: Adding two numbers
           Calculator calculator
           int result
           Given a calculator
             calculator = new Calculator
           When adding two numbers a and b. 
             result = calculator.add(a, b)
           Then it returns the result
             result => expected
             
           Examples: additions
           |  a  |  b  | expected |
           |  0  |  0  |     0    |
           | 21  | 21  |    42    |
           | -3  | -5  |    -8    |
            
         '''.executesSuccessfully
       }
       
       /*
        * Once a step is defined including the execution code it can be referenced from
        * other scenarios. The textual description of the step serves as identifier.
        * When you reuse the step in a different scenario and provide no implementation
        * the existing implementation from the referenced step will be used for this step.
        * 
        * Referenced steps are highlighted in grey so you see when you are actually using
        * a referenced step. You can also jump directly to the original step declaration
        * to have a look at the implementation.
        * 
        * @filter('''|.executesSuccessfully)
        * @lang(feature)
        */
       fact "Step references"{
         '''
	       package demo
	       import org.jnario.feature.documentation.Calculator

	       Feature: Calculator
	       
	       Background:
	         Calculator calculator
	         int result
	         Given a calculator
	           calculator = new Calculator
	       
	       Scenario: Adding two numbers
	         When adding two numbers a and b. 
	           result = calculator.add(a, b)
	         Then it returns the expected result
	           result => expected
	           
	         Examples:
	         |  a  |  b  | expected |
	         |  0  |  0  |   0    |
	         | -3  | -5  |  -8    |
	         
	       Scenario: Dividing two numbers
	        When entering two numbers a and b and pressing enter. 
	          result = calculator.divide(a,b)
	        Then it returns the expected result
	        
	        Examples:
	        |  a  |  b  | expected |
	        |  8  |  1  |     8    |
	        
         '''.executesSuccessfully
       }
   }   
  
}