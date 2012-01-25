package de.bmw.carit.jnario.naming

import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.StepReference
import org.eclipse.emf.ecore.util.EcoreUtil

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