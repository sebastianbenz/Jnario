/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import org.jnario.feature.feature.Step
import java.util.HashMap
import com.google.inject.Inject

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class PendingStepsCalculator {
	
	@Inject extension StepExpressionProvider
	
	HashMap<Step, Boolean> steps = newHashMap()
	
	def setSteps(Iterable<Step> steps){
		var hasPendingStep = false
		for(step: steps){
			if(hasPendingStep || !step.hasExpression){
				this.steps.put(step, true)
				hasPendingStep = true
			}
			else{
				this.steps.put(step, false)
			}
		}
	}
	
	def isPendingOrAPreviousStepIsPending(Step step){
		if(step != null && steps.containsKey(step)){
			return steps.get(step)
		}
		return false
	}
	
}