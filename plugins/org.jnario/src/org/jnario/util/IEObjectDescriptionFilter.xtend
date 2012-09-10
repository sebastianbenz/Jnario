package org.jnario.util

import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EClass

@Data
class IEObjectDescriptionFilter implements Predicate<IEObjectDescription>{
	
	EClass type

	override apply(IEObjectDescription input) {
		type.isSuperTypeOf(input.EClass)
	}
	
}