/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.junit.Assert.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.jnario.spec.tests.integration.ExtensionExample.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject

/*
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 * For example, given a normal java class with some JUnit setup and tear down methods:
 * 
 * <pre class="prettify">
 * public class ExtensionExample {
 *   private static List<String> EXECUTED_METHODS = new ArrayList<String>();
 *   
 *   @BeforeClass
 *   public static void beforeClass(){
 *     run("ExtensionExample#beforeClass");
 *   }
 *   
 *   @Before
 *   public void before(){
 *     run("ExtensionExample#before");
 *   }
 *   
 *   @AfterClass
 *   public static void afterClass(){
 *     run("ExtensionExample#afterClass");
 *   }
 *   
 *   @After
 *   public void after(){
 *     run("ExtensionExample#after");
 *   }
 * 
 *   private static void run(String name) {
 *     EXECUTED_METHODS.add(name);
 *   }
 *   
 *   public static List<String> getExecutedMethods() {
 *     return EXECUTED_METHODS;
 *   }
 * }
 * </pre>
 * 
 * When you declare an instance of this class 
 * as an extension field in your spec, all the setup
 * and tear down methods will be executed before/after
 * each fact/spec, respectively:
 * 
 */
@CreateWith(typeof(SpecTestCreator))
describe "Spec Extensions"{
	@Inject extension BehaviorExecutor
	fact "Example:"{
		execute('''
			package bootstrap

			import org.jnario.spec.tests.integration.ExtensionExample

			describe "Extension"{
				extension static ExtensionExample = new ExtensionExample()

				fact "test 1"{
					ExtensionExample::executedMethods += "ExtensionSpec#test1"
				}
				
				fact "test 2"{
					ExtensionExample::executedMethods += "ExtensionSpec#test2"
				}
			}
		''')
		 
		executedMethods =>
			   list("ExtensionExample#beforeClass", 
					"ExtensionExample#before",  
					"ExtensionSpec#test1",  
					"ExtensionExample#after",  
					"ExtensionExample#before",
					"ExtensionSpec#test2",  
					"ExtensionExample#after",
					"ExtensionExample#afterClass")
	}

}