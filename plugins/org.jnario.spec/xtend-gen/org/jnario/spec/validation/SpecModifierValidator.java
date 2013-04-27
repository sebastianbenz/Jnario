package org.jnario.spec.validation;

import java.util.List;
import org.eclipse.xtend.core.validation.ModifierValidator;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

@SuppressWarnings("all")
public class SpecModifierValidator extends ModifierValidator {
  public SpecModifierValidator(final List<String> allowedModifiers, final AbstractDeclarativeValidator validator) {
    super(allowedModifiers, validator);
  }
  
  @Check
  public void checkModifiers(final XtendMember member, final String memberName) {
    super.checkModifiers(member, memberName);
  }
}
