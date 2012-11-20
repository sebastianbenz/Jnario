/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*

import static extension org.jnario.jnario.test.util.SpecExecutor.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor
import org.jnario.jnario.test.util.ConsoleRecorder


@CreateWith(typeof(SpecTestCreator))
describe "Setup & Teardown" {
	
 	@Inject extension BehaviorExecutor
	describe "BeforeAll" {
		fact "Executes before all tests"{
			'''
				describe "BeforeAll"{
					before all{
						println("before all")
					}
					fact println("fact 1")
					fact println("fact 2")
				}
			'''.prints(
			'''
				before all
				fact 1
				fact 2
			''')
		}
	
	}
	
	describe "Before" {
		fact "Executes before each test"{
			'''
				describe "Before"{
					before{
						println("before")
					}
					fact println("fact 1")
					fact println("fact 2")
				}
			'''.prints(
			'''
				before
				fact 1
				before
				fact 2
			''')
		}
	}
	
	describe "AfterAll" {
		fact "Execute once after all tests"{
			'''
				describe "After All"{
					after all{
						println("after all")
					}
					fact println("fact 1")
					fact println("fact 2")
				}
			'''.prints(
			'''
				fact 1
				fact 2
				after all
			''')
		}
	}
 	
 	describe "After"{
		fact "Executes after each test"{
				'''
				describe "After"{
					after{
						println("after")
					}
					fact println("fact 1")
					fact println("fact 2")
				}
			'''.prints(
			'''
				fact 1
				after
				fact 2
				after
			''')
		}
 	}
 	
 	describe "Nesting before & after"{
 		fact "Before and after in parent are executed for childs"{
	 		'''
				describe "Setup & Teardown"{ 
					before all println("Spec: before all")
					before println("Spec: before")
					fact println("Spec: fact 1")
					fact println("Spec: fact 2")
					context "Context1"{
						before all println("Context1: before all")
						before println("Context1: before")
						fact println("Context1: fact 1.1")
						fact println("Context1: fact 1.2")
						after println("Context1: after")
						after all println("Context1: after all")
					}
					context "Nested Spec 2"{
						before all println("Context2: before all")
						before println("Context2: before")
						fact println("Context2: fact 2.1")
						fact println("Context2: fact 2.2")
						after println("Context2: after")
						after all println("Context2: after all")
					}
					after println("Spec: after")
					after all println("Spec: after all")
				}  
	 		'''.prints('''
					Spec: before all
					Context1: before all
					Spec: before
					Context1: before
					Context1: fact 1.1
					Context1: after
					Spec: after
					Spec: before
					Context1: before
					Context1: fact 1.2
					Context1: after
					Spec: after
					Context1: after all
					Context2: before all
					Spec: before
					Context2: before
					Context2: fact 2.1
					Context2: after
					Spec: after
					Spec: before
					Context2: before
					Context2: fact 2.2
					Context2: after
					Spec: after
					Context2: after all
					Spec: before
					Spec: fact 1
					Spec: after
					Spec: before
					Spec: fact 2
					Spec: after
					Spec: after all
	 		''')
 		}
 	}
 	
 	
 	def void prints(CharSequence spec, String expected) {
		val recording = ConsoleRecorder::start
		spec.executesSuccessfully
		val actual = recording.stop
		assertEquals(expected, actual) 
	}

}