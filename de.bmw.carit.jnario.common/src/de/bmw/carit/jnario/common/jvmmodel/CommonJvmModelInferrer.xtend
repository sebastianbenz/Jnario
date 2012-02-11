/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.ExampleRow
import de.bmw.carit.jnario.common.ExampleTable
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer
import org.eclipse.xtext.xtend2.xtend2.XtendField

import static org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.common.types.util.TypeConformanceComputer
import com.google.common.base.Predicate
import com.google.common.base.Predicates
import org.eclipse.xtext.common.types.JvmIdentifiableElement

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
class CommonJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ITypeProvider
	
	@Inject public XbaseCompiler compiler
	
	@Inject extension TypeConformanceComputer typeConformanceComputer
	
	def void updateTypeInExampleField(XtendField field){
		var examples = getContainerOfType(field, typeof(ExampleTable))
		if(examples == null || examples.heading == null){
			return
		}
		val heading = examples.heading
		if(!heading.getCells.contains(field)){
			return	
		}
		if(examples.rows.empty){
			return
		}
		
		if(!examples.isValidTable()){
			return
		}
		
		val column = heading.getCells.indexOf(field)
		
		val cells = examples.rows.map[
			it.cells.get(column)
		]
		val cellTypes = cells.map[
			it.type
		]
		field.setType(cellTypes.commonSuperType)
		field.setVisibility(JvmVisibility::PUBLIC)
	}
	
	def cellToAppendable(ExampleRow row, int i){
		var appendable = new StringBuilderBasedAppendable()
		if(row.getCells.size > i){
			compiler.toJavaExpression(row.getCells.get(i), appendable)
		}
		appendable
	}
	
	def toJavaExpression(XExpression expr){
		var appendable = new StringBuilderBasedAppendable()
		compiler.toJavaExpression(expr, appendable)
		appendable
	}
	
	def toJavaStatement(XExpression expr, boolean isReferenced){
		var appendable = new StringBuilderBasedAppendable()
		compiler.toJavaStatement(expr, appendable, isReferenced)
		appendable
	}
	
	def isValidTable(ExampleTable table){
		val expected = table.heading.cells.size
		for(row : table.rows){
			if(row.cells.size != expected){
				return false
			}
		}
		return true
	}

}
