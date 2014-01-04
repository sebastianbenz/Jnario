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
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmDeclaredType
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
import org.jnario.runner.Extends
import org.jnario.runner.Extension

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
	@Inject extension JnarioNameProvider
	TestRuntimeSupport testRuntime
	@Inject	extension JvmTypesBuilder jvmTypesBuilder;

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
		super.transform(source, container)
		val field = source.jvmElements.head as JvmField
		if(field == null){
			return
		}
		if(field.visibility == JvmVisibility::PRIVATE){
			field.setVisibility(JvmVisibility::DEFAULT)
		}
		if (source.isExtension()){
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
				if(current.^implements.empty && extendedType.type != null){
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
	
	override protected void setNameAndAssociate(XtendFile file, XtendTypeDeclaration xtendType, JvmDeclaredType javaType) {
		super.setNameAndAssociate(file, xtendType, javaType)
		javaType.simpleName = xtendType.toJavaClassName
	}
}