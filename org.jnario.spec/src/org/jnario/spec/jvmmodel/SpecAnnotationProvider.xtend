/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.jvmmodel

import com.google.inject.Inject
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.spec.spec.Example
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.junit.Ignore
import org.junit.Test
import org.jnario.spec.spec.Before
import org.junit.BeforeClass
import org.jnario.spec.spec.After
import org.junit.AfterClass
import org.jnario.runner.ExampleGroupRunner
import org.junit.runner.RunWith
/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecAnnotationProvider {
	
	@Inject extension ExtendedJvmTypesBuilder
	
	def getRunnerAnnotation(){
		return typeof(RunWith) -> typeof(ExampleGroupRunner)
	}
	
	def getTestAnnotations(Example element){
		val annotations = <JvmAnnotationReference>newArrayList()
		if(element.exception == null){
			annotations += element.toAnnotation(typeof(Test))
		}else{
			annotations += element.toAnnotation(typeof(Test).name, "expected", element.exception)
		}
		if(element.isPending()){
			annotations += element.toAnnotation(typeof(Ignore))
		}
		return annotations
	}
	
	def Class<?> getBeforeAnnotation(Before element){
		if(element.beforeAll) {
			return typeof(BeforeClass)
		} else{
			return getBeforeAnnotation
		}
	}
	
	def Class<?> getBeforeAnnotation(){
		return typeof(org.junit.Before)
	}
	
	def Class<?> getAfterAnnotation(After element){
		if(element.afterAll) {
			return typeof(AfterClass)
		} else{
			return typeof(org.junit.After)
		}
	}
	
}