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

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
class CommonJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ITypeProvider
	
	@Inject public XbaseCompiler compiler
	
	def void updateTypeInExampleField(XtendField field){
		var examples = getContainerOfType(field, typeof(ExampleTable))
		if(examples == null){
			return
		}
		var heading = examples.heading
		if(!heading.getCells.contains(field)){
			return	
		}
		var index = heading.getCells.indexOf(field)
		if(examples.rows.empty){
			return
		}
		var exampleRow = examples.rows.get(0)
		if(index < exampleRow.getCells.size){
			var exampleCell = exampleRow.getCells.get(index)
			field.setType(getType(exampleCell))
			field.setVisibility(JvmVisibility::PUBLIC)
		}
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

}
