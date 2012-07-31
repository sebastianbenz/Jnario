/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jvmmodel

import com.google.common.collect.Iterables
import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeConformanceComputer
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.jnario.ExampleColumn
import org.jnario.runner.Named

import static com.google.common.base.Predicates.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

import static extension com.google.common.collect.Iterables.*
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmField
import org.jnario.runner.Extension
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
class JnarioJvmModelInferrer extends XtendJvmModelInferrer {

	@Inject public XbaseCompiler compiler
	@Inject extension ITypeProvider
	@Inject extension TypeConformanceComputer
	@Inject extension TypeReferences
	@Inject extension JvmTypesBuilder
	@Inject extension IJvmModelAssociations 
	
	def toField(ExampleColumn column){
		val field = column.toField(column.name, column.getOrCreateType)
		if(field != null){
			field.visibility = JvmVisibility::PUBLIC
		}
		return field
	}
	
	def getOrCreateType(ExampleColumn column){
		if(column.type == null || column.type.type == null){
			if(column.cells.empty){
				column.type = getTypeForName(typeof(Object), column)
			}else{
				var cellTypes = column.cells.transform[type]
				cellTypes = Iterables::filter(cellTypes, notNull)
				val cellTypeList = Lists::newArrayList(cellTypes)
				if(cellTypeList.empty){
					column.type = getTypeForName(typeof(Object), column)
				}else{
					column.type = cellTypeList.commonSuperType.cloneWithProxies
				}
			}
		}
		return column.type
	}

	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		throw new UnsupportedOperationException("Auto-generated function stub")
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

}
