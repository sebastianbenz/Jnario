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
import org.jnario.jnario.test.util.ConsoleRecorder

/*
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 * For example, given a normal java class with some JUnit setup and tear down methods:
 * 
 * <pre class="prettify">
 * public class ExtensionExample {
 *   @BeforeClass
 *   public static void beforeClass(){
 *     System.out.println("before Class");
 *   }
 *   
 *   @Before
 *   public void before(){
 *     System.out.println("before");
 *   }
 *   
 *   @AfterClass
 *   public static void afterClass(){
 *     System.out.println("after Class");
 *   }
 *   
 *   @After
 *   public void after(){
 *     System.out.println("after");
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
		'''
			import org.jnario.spec.tests.integration.ExtensionExample

			describe "Extension"{
				extension static ExtensionExample = new ExtensionExample()

				context "Nested Spec"{
					fact println("test 3")
				}
				fact println("test 1")
				fact println("test 2")
				
			}
		'''.prints('''
				before Class
				before
				test 3
				after
				before
				test 1
				after
				before
				test 2
				after
				after Class
		''')
	}
	
	def void prints(CharSequence spec, String expected) {
		val recording = ConsoleRecorder::start
		spec.executesSuccessfully
		val actual = recording.stop
		assertEquals(expected, actual) 
	}
}