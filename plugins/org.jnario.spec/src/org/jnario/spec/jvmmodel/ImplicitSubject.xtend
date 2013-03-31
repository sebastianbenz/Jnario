/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.jvmmodel

import com.google.inject.Inject
import java.util.Iterator
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendFactory
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsFactory
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.runner.Subject
import org.jnario.spec.spec.ExampleGroup
import org.jnario.util.Nodes

import static org.eclipse.xtext.EcoreUtil2.*
import static org.jnario.spec.jvmmodel.Constants.*

import static extension com.google.common.collect.Iterables.*
import static extension com.google.common.collect.Iterators.*
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
class ImplicitSubject {
	
	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension TypeReferences

	def void addImplicitSubject(ExampleGroup exampleGroup){
		val targetType = exampleGroup.resolveTargetType()
		if(targetType == null || targetType.eIsProxy()) return;
		if(exampleGroup.hasSubject()) return;
		if(exampleGroup.neverUsesSubject()) return;
		
		val subjectField = XtendFactory::eINSTANCE.createXtendField
		subjectField.name = SUBJECT_FIELD_NAME
		subjectField.type = targetType
		
		if(exampleGroup.doesNotInitializeSubject){
			val annotation = XAnnotationsFactory::eINSTANCE.createXAnnotation
//			val subjectType = getTypeForName(typeof(Subject), exampleGroup)
//			annotation.annotationType = subjectType.type
//			subjectField.annotations += annotation
		}
		
		exampleGroup.members.add(0, subjectField)
	}
	
	def JvmTypeReference resolveTargetType(ExampleGroup exampleGroup){
		if(exampleGroup.targetType != null){
			return exampleGroup.targetType.cloneWithProxies
		}
		val parentGroup = exampleGroup.parent
		if(parentGroup == null){
			return null
		}
		return resolveTargetType(parentGroup)
	}
	
	
	def parent(ExampleGroup exampleGroup){
		getContainerOfType(exampleGroup.eContainer, typeof(ExampleGroup))
	}
	
	def boolean hasSubject(XtendClass type){
		val fields = type.members.filter(typeof(XtendField))
		val subjectField = fields.findFirst[name == SUBJECT_FIELD_NAME]
		if(subjectField != null){
			return true
		}
		val extendedClass = EcoreUtil2::getContainerOfType(type.eContainer, typeof(XtendClass))
		if(extendedClass == null){
			return false
		}
		return hasSubject(extendedClass)		
	}
	
	def neverUsesSubject(ExampleGroup exampleGroup){
		var Iterator<XAbstractFeatureCall> allFeatureCalls = emptyIterator
		val members = exampleGroup.members
		for(example : members.filter(typeof(XtendFunction))){
			allFeatureCalls = concat(allFeatureCalls, example.eAllContents.filter(typeof(XAbstractFeatureCall)))
		}
		return null == allFeatureCalls.findFirst[it.concreteSyntaxFeatureName == SUBJECT_FIELD_NAME]
	}
	
	def doesNotInitializeSubject(ExampleGroup exampleGroup){
		var Iterator<XAssignment> allAssignments = emptyIterator
		val members = exampleGroup.members
		for(example : members.filter(typeof(XtendFunction))){
			allAssignments = concat(allAssignments, example.eAllContents.filter(typeof(XAssignment)))
		}
		return null == allAssignments.findFirst[
			val assignable = Nodes::textForFeature(it, XbasePackage::eINSTANCE.XAbstractFeatureCall_Feature)
			return assignable == SUBJECT_FIELD_NAME
		]
	}
	
}
