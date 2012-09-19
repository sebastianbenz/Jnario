/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.jvmmodel

import static org.eclipse.xtext.util.Strings.*
import com.google.inject.Inject
import org.jnario.Specification
import org.jnario.feature.feature.Feature
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.ExampleGroup
import org.jnario.suite.suite.Suite

import static org.jnario.suite.jvmmodel.SuiteClassNameProvider.*

import static extension com.google.common.base.Strings.*
import static extension org.jnario.util.Strings.*
import org.jnario.jvmmodel.JnarioNameProvider
import org.eclipse.emf.ecore.EObject

class SuiteClassNameProvider extends JnarioNameProvider{
	
	ExampleNameProvider exampleNameProvider
	FeatureClassNameProvider featureNameProvider
	
	@Inject
	new(ExampleNameProvider exampleNameProvider, FeatureClassNameProvider featureNameProvider){
		this.exampleNameProvider = exampleNameProvider
		this.featureNameProvider = featureNameProvider
	}
	
	static val POSTFIX = "Suite"
	
	def removePrefix(Suite suite){
		var name = suite.name.firstLine
		if(name.nullOrEmpty) return null
		name = name.substring(name.lastIndexOf('#')+1).trim
		if(name.nullOrEmpty) return null else name
	}
	
	def dispatch getClassName(Suite suite){
		val name = suite.removePrefix
		if(name == null) return null
		name.toClassName + POSTFIX
	}
	
	def dispatch getClassName(ExampleGroup element){
		exampleNameProvider.toJavaClassName(element)
	}

	def dispatch getClassName(Feature element){
		featureNameProvider.getClassName(element)
	}
	
	def dispatch String getClassName(EObject element){
		throw new UnsupportedOperationException("Cannot get class name for " + element.eClass.name)
	}	

	override describe(EObject eObject) {
		doDescribe(eObject)
	}
	
	def dispatch doDescribe(Suite suite){
		suite.removePrefix?.convertToJavaString(true)
	}
	
	def dispatch doDescribe(ExampleGroup element){
		exampleNameProvider.describe(element)
	}
	
	def dispatch doDescribe(Feature element){
		element.name
	}
	
	def dispatch String doDescribe(EObject element){
		throw new UnsupportedOperationException("Cannot describe " + element.eClass.name)
	}
	
	override toJavaClassName(EObject eObject) {
		getClassName(eObject)
		
	}
	
}