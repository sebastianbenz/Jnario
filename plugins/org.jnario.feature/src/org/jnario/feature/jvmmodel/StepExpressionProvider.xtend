/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class StepExpressionProvider {
  
 	@Inject extension ExpressionCopier
 
 	def List<XExpression> getExpressions(Step step){
 		if(step == null){
 			return emptyList;
 		}
 		val stepExpression = step.expression;
		val blockExpression = stepExpression as XBlockExpression;
		if(blockExpression == null){
			return emptyList;
		}
		return blockExpression.getExpressions();
 	}
 
	def expressionOf(Step step){
		if(step instanceof StepReference){
			getOrCreateExpression(step as StepReference)
		}
		return step.expression
	}
	
	def private getOrCreateExpression(StepReference ref){
		if(ref.expression != null)
			return ref.expression
		val step = ref?.reference
		if(step == null || step.eIsProxy){
			return null
		}
		val expr = cloneWithProxies(step.expression) as XExpression
		ref.expression = expr
		return expr
	}
	
	def hasExpression(Step step){
		if(step.expression != null){
			return true
		}
		if(step instanceof StepReference){
			val refStep = (step as StepReference).reference
			if(refStep != null && !refStep.eIsProxy){
				return true
			}
		}
		return false
	}
}