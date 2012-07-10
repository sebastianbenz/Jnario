package org.jnario.suite.scoping

import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.jnario.spec.spec.SpecPackage
import static org.jnario.spec.scoping.SpecResourceDescriptionStrategy.*

class SuiteSpecFilter implements Predicate<IEObjectDescription>{
	
	extension val SpecPackage = SpecPackage::eINSTANCE 

	override apply(IEObjectDescription input) {
		switch input.EClass{
			case exampleGroup: isRoot(input)
			default: true
		}
	}
	
	def isRoot(IEObjectDescription input){
		input.getUserData(ROOT_SPEC) == TRUE
	}
	
}