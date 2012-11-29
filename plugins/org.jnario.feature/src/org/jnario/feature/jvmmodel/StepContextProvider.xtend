package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer
import org.jnario.feature.feature.Step

class StepContextProvider {

	@Inject extension StepExpressionProvider 
	@Inject extension IJvmModelAssociations
	@Inject extension VisibleMembersCalculator

	def usedFields(Step step){
		val expr = expressionOf(step)
		step.allVisibleMembers.filter(typeof(XtendField)).filter[
			val field = it.jvmElements.filter(typeof(JvmField)).iterator.next
			val usages = XbaseUsageCrossReferencer::find(field, newArrayList(expr))
			!usages.empty
		].toSet
	} 	
}