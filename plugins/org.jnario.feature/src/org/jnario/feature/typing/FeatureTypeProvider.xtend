package org.jnario.feature.typing

import org.jnario.typing.JnarioTypeProvider
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.EcoreUtil2
import org.jnario.feature.feature.Step
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.common.types.JvmTypeReference
import org.jnario.feature.feature.StepExpression
import com.google.inject.Singleton

@Singleton
class FeatureTypeProvider extends JnarioTypeProvider {
	
	override JvmTypeReference expectedType(EObject container, EReference reference, int index, boolean rawType){
		if (container instanceof StepExpression) {
			_expectedType(container.eContainer as XtendFunction, reference, index, rawType)
		}else{
			super.expectedType(container, reference, index, rawType)
		}
	}
	
	override getExpectedReturnType(XExpression expr, boolean rawType) {
		val returnType = super.getExpectedReturnType(expr, rawType);
		if (returnType != null) {
			return returnType;
		}
		val function = EcoreUtil2::getContainerOfType(expr, typeof(Step))
		if (function==null)
			return null;
		return getPrimitiveVoid(function.expression)
	}
}