/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel

import com.google.inject.Inject
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XTypeLiteral
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.jnario.ExampleColumn
import org.jnario.runner.Extends
import org.jnario.runner.Extension

import static extension com.google.common.collect.Iterables.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
class JnarioJvmModelInferrer extends XtendJvmModelInferrer {

	@Inject public XbaseCompiler compiler
	@Inject extension TypeReferences
	@Inject extension IJvmModelAssociations
	@Inject TestRuntimeProvider runtime
	TestRuntimeSupport testRuntime
	@Inject	extension JvmTypesBuilder jvmTypesBuilder;

	def toField(ExampleColumn column){
		val field = column.toField(column.name, column.getOrCreateType)
		if(field != null){
			field.visibility = JvmVisibility::PUBLIC
		}
		return field
	}
	
	def getOrCreateType(ExampleColumn source){
		if (source.type == null) {
			source.setType(getTypeProxy(source));
		}
		source.type
	}

	override infer(EObject obj, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		try{
			testRuntime = runtime.get(obj)
		}catch(NoSuchElementException ex){
			return
		}
		doInfer(obj, acceptor, preIndexingPhase)
	}
	
	def doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		throw new UnsupportedOperationException
	}
	
	override protected transform(XtendField source, JvmGenericType container) {
		if(source.visibility == JvmVisibility::PRIVATE){
			source.visibility = JvmVisibility::DEFAULT
		}
		super.transform(source, container)
		if (source.isExtension()){
			val field = source.jvmElements.head as JvmField
			field.setVisibility(JvmVisibility::PUBLIC)
			field.annotations += source.toAnnotation(typeof(Extension))
		}
	}
	
	def serialize(EObject obj){
		return obj.node?.text
	}
	
	def xtendFile(EObject obj){
		EcoreUtil2::getContainerOfType(obj, typeof(XtendFile))
	}
	
	def packageName(EObject obj){
		obj.xtendFile?.^package
	}
	
	def protected getTestRuntime(){
		testRuntime
	}
	
	def protected void addSuperClass(XtendClass xtendClass){
		var EObject xtendType = xtendClass
		while(xtendType != null && xtendType instanceof XtendClass){
			val current = xtendType as XtendClass
			for(extendedType : current.annotations.filter[it.hasExtendsAnnotation].map[value as XTypeLiteral]){
				if(current.superTypes.empty && extendedType.type != null){
					xtendClass.^extends = extendedType.type.createTypeRef()
					return
				}
			}	
			xtendType = xtendType.eContainer
		}
	}
	
	def protected hasExtendsAnnotation(XAnnotation annotation){
		annotation.annotationType?.qualifiedName == typeof(Extends).name && annotation.value instanceof XTypeLiteral
	}
}