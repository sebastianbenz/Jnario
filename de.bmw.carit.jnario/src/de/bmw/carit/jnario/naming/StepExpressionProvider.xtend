package de.bmw.carit.jnario.naming

import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.Ref
import org.eclipse.emf.ecore.util.EcoreUtil

class StepExpressionProvider {
	
	def expressionOf(Step step){
		if(step instanceof Ref){
			getOrCreateExpression(step as Ref)
		}
		return step.code
	}
	
	def getOrCreateExpression(Ref ref){
		val expr = EcoreUtil::copy(ref?.reference?.code)
		ref.code = expr
		return expr
	}
	
}