package de.bmw.carit.jnario.spec.validation;

import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xtend2.validation.ClasspathBasedChecks;
import org.eclipse.xtext.xtend2.validation.Xtend2JavaValidator;
 

@ComposedChecks(validators = { })
public class SpecJavaValidator extends Xtend2JavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	
}
