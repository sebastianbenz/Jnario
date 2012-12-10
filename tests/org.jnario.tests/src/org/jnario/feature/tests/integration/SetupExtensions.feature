/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static extension org.jnario.jnario.test.util.FeatureExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import org.jnario.jnario.test.util.ConsoleRecorder
import static org.junit.Assert.*
import org.eclipse.xtext.util.Strings

/**
 * @author Sebastian Benz - Initial contribution and API
 */
Feature: Setup & Teardown with Feature Extensions

  Feature extensions can be used to share common setup and teardown 
  operations between different features and/or specs. Whenever you are
  missing helper methods in feature definitions, you should use extensions
  instead. You can declare extension fields in scenarios to perform setup and
  teardown operations before/after the scenario is executed.

  Scenario: Using an Extension
    var CharSequence feature
    var ConsoleRecorder recorder

/*    Given a class **ExampleExtension** with JUnit before and after methods:
      ''' 
        package org.jnario.feature.tests.integration

        import org.junit.Before
        import org.junit.After
        
        class ExampleExtension {
          @Before def before(){
            println("before")
          }
          
          @After def after(){
            println("after")
          }
//          @BeforeClass def beforeAll(){
//            println("before all")
//          }
//  
//          @AfterClass def afterAll(){
//            println("after all")
//          }
        }
      ''' */
    When I declare an extension field of type **ExampleExtension** in the background
          '''
        import org.jnario.feature.tests.integration.ExampleExtension

        Feature: Feature with extensions
          
          Background: A common extension to all scenarios
              extension static ExampleExtension = new ExampleExtension 
            
          Scenario: Scenario 1
            Given a step 
              println("step 1")
            Then we have two steps
            println("step 2")
          Scenario: Scenario 2
            Given a step 
              println("step 3")
            Then we have two steps
              println("step 4")
      '''
      feature = args.first
      And execute the feature
            recorder = ConsoleRecorder::start
       feature.isSuccessful
    Then the execution order is
          '''
        before
        step 1
        step 2
        after
        before
        step 3
        step 4
        after
      '''
      val actual = recorder.stop.trim
      val expected = args.first.trim.split("\n").map[trim].join(Strings::newLine)
      assertEquals(expected, actual) 