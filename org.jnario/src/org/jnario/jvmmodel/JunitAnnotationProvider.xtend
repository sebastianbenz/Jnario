/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.jnario.runner.ExampleGroupRunner
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.jnario.runner.FeatureExamplesRunner
import org.jnario.runner.FeatureRunner

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class JunitAnnotationProvider {

	@Inject extension ExtendedJvmTypesBuilder
	
	def getExampleGroupRunnerAnnotation(EObject context){
		return context.toAnnotation(typeof(RunWith), typeof(ExampleGroupRunner))
	}
	
	def getFeatureRunner(EObject context){
		return context.toAnnotation(typeof(RunWith), typeof(FeatureRunner))
	}
	
	def getFeatureExamplesRunner(EObject context){
		return context.toAnnotation(typeof(RunWith), typeof(FeatureExamplesRunner))
	}
	
	def getTestAnnotations(EObject context, boolean isPending){
		val annotations = <JvmAnnotationReference>newArrayList()
		annotations += context.toAnnotation(typeof(Test))
		if(isPending){
			annotations += context.toAnnotation(typeof(Ignore))
		}
		return annotations
	}
	
	def getBeforeAnnotation(EObject context, boolean isBeforeAll){
		if(isBeforeAll) {
			context.toAnnotation(typeof(BeforeClass))
		} else{
			context.getBeforeAnnotation()
		}
	}
	
	def getBeforeAnnotation(EObject context){
		return context.toAnnotation(typeof(org.junit.Before))
	}
	
	def getAfterAnnotation(EObject context, boolean isAfterAll){
		if(isAfterAll){
			return context.toAnnotation(typeof(AfterClass))
		} else{
			return context.toAnnotation(typeof(org.junit.After))
		}
	}
	
}