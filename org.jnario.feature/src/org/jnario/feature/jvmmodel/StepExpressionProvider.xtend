/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmGenericType
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepExpression
import org.jnario.feature.feature.StepReference
import org.eclipse.xtext.xbase.XExpression
import java.util.List

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class StepExpressionProvider {
 
 	def List<XExpression> getExpressions(Step step){
 		if(step == null){
 			return emptyList;
 		}
 		val stepExpression = step.getStepExpression();
		if(stepExpression == null){
			return emptyList;
		}
		val blockExpression = stepExpression.getBlockExpression();
		if(blockExpression == null){
			return emptyList;
		}
		return blockExpression.getExpressions();
 	}
 
	def expressionOf(Step step, JvmGenericType type){
		if(step instanceof StepReference){
			getOrCreateExpression(step as StepReference, type)
		}
		return step.stepExpression
	}
	
	def getOrCreateExpression(StepReference ref, JvmGenericType type){
		if(ref.stepExpression != null)
			return ref.stepExpression
		val step = ref?.reference
		val expr = EcoreUtil2::cloneWithProxies(step?.stepExpression) as StepExpression
		ref.stepExpression = expr
		return expr
	}
}