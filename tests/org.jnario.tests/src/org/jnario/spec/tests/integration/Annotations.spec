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
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor


/**
 * @author Sebastian Benz - Initial contribution and API
 */ 
@CreateWith(typeof(SpecTestCreator))
describe "Annotations" {
  	@Inject extension BehaviorExecutor
	fact "should support class annotations for 'describe'"{
		val spec = '
			package bootstrap
			import static org.hamcrest.CoreMatchers.*			
			import com.google.inject.Singleton

			@Singleton			
			describe "Annotations" {
			
			fact "should support class annotations for describe"{
					val annotation = typeof(AnnotationsSpec).getAnnotation(typeof(Singleton))
					annotation should not be null
				} 
						
			}
		'
		spec.executesSuccessfully
	} 
	
	fact "should support method annotations for 'examples'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*

			describe "Annotations" {
			
				@Inject			
				fact "example"{
					val annotation = typeof(AnnotationsSpec).getMethod("_example").getAnnotation(typeof(Inject))
					annotation should not be null
				} 
						
			}
		'
		spec.executesSuccessfully
	}
	
	fact "should support method annotations for 'contexts'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Singleton
			
			describe "Annotations" {
			
				@Singleton
				context "Context"{
					fact "example"{
						assert typeof(AnnotationsContextSpec).isAnnotationPresent(typeof(Singleton))
					} 
				}			
			}
		'
		spec.executesSuccessfully
	}
	
	fact "should support annotations for 'fields'"{
		val spec = '
			package bootstrap
			
			import com.google.inject.Inject
			import static org.hamcrest.CoreMatchers.*
			
			describe "Annotations" {
			
				@Inject		
				String myField
					
				fact "example"{
					val annotation = typeof(AnnotationsSpec).getDeclaredField("myField").getAnnotation(typeof(Inject))
					annotation should not be null
				} 
						
			}
		'
		spec.executesSuccessfully
	}

}
	