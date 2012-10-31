/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static extension org.jnario.jnario.test.util.SpecExecutor.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor

@CreateWith(typeof(SpecTestCreator))
describe "Throws"{
	@Inject extension BehaviorExecutor
	fact "passes if exception is thrown"{
		'''
			package bootstrap
			
			import java.util.Stack
			import java.util.EmptyStackException
			
			describe "throws" {
			  fact new Stack<String>().pop throws EmptyStackException 
			}
		'''.executesSuccessfully
	} 
	
	fact "passes if exception of expected sub type is thrown"{
		'''
			package bootstrap
			
			import java.util.Stack
			
			describe "throws" {
			  fact new Stack<String>().pop throws Throwable 
			}
		'''.executesSuccessfully
	} 
	
	fact "fails if no exception is thrown"{
		'''
			package bootstrap
			
			describe "throws" {
			  fact 1 + 1 throws RuntimeException 
			}
		'''.executionFails
	} 
	
//	fact "returns the caught exception"{
//		'''
//			package bootstrap
//			import java.util.Stack
//			describe "throws" {
//			  fact "example"{
//			  	val exception = new Stack<String> throws EmptyStackException
//			  	exception => typeof(EmptyStackException)
//			  } 
//			}
//		'''.executesSuccessfully
//	} 
 
}