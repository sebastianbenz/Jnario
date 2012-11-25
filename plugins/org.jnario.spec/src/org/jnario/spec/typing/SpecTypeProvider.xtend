package org.jnario.spec.typing

import org.jnario.typing.JnarioTypeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.jnario.spec.spec.Example
import com.google.inject.Singleton
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.EcoreUtil2

@Singleton
class SpecTypeProvider extends JnarioTypeProvider {
	
	override expectedType(EObject container, EReference reference, int index, boolean rawType) {
//		switch(container){
//			Example : return getTypeReferences().getTypeForName(Void::TYPE, container)
//		}
		return super.expectedType(container, reference, index, rawType)
	}
	
	override getExpectedReturnType(XExpression expr, boolean rawType) {
		val returnType = super.getExpectedReturnType(expr, rawType);
		if (returnType != null) {
			return returnType;
		}
		val function = EcoreUtil2::getContainerOfType(expr, typeof(Example))
		if (function==null)
			return null;
		return getPrimitiveVoid(function.expression)
	}
	
}