package org.jnario.spec.validation

import java.util.List
import org.eclipse.xtend.core.validation.ModifierValidator
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.validation.AbstractDeclarativeValidator
import org.eclipse.xtext.validation.Check

class SpecModifierValidator extends ModifierValidator {
	
	new(List<String> allowedModifiers, AbstractDeclarativeValidator validator) {
		super(allowedModifiers, validator)
	}
	
	@Check
	override checkModifiers(XtendMember member, String memberName) {
		super.checkModifiers(member, memberName)
	}
	
}