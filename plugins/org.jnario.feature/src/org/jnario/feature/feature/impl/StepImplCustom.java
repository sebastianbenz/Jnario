 package org.jnario.feature.feature.impl;

import org.eclipse.xtext.xbase.XBlockExpression;

public class StepImplCustom extends StepImpl {

	@Override
	public boolean isPending() {
		if(getStepExpression() == null){
			return true;
		}
		XBlockExpression blockExpression = getStepExpression().getBlockExpression();
		if(blockExpression == null){
			return true;
		}
		return blockExpression.getExpressions().isEmpty();
	}
	
}
