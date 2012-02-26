/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming

import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class StepExpressionProvider {

	def expressionOf(Step step){
		if(step instanceof StepReference){
			getOrCreateExpression(step as StepReference)
		}
		return step.stepExpression
	}
	
	def getOrCreateExpression(StepReference ref){
		val expr = EcoreUtil::copy(ref?.reference?.stepExpression)
		ref.stepExpression = expr
		return expr
	}

}