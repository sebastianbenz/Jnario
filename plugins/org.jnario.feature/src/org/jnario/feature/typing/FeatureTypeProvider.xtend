package org.jnario.feature.typing

import com.google.inject.Singleton
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.XExpression
import org.jnario.feature.feature.Step
import org.jnario.typing.JnarioTypeProvider

@Singleton
class FeatureTypeProvider extends JnarioTypeProvider {
	
	
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