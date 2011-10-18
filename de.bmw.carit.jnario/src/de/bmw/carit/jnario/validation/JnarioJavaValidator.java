package de.bmw.carit.jnario.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.JnarioPackage;
 

public class JnarioJavaValidator extends AbstractJnarioJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(Examples examples){
		ExampleRow heading = examples.getHeading();
		EList<ExampleRow> rows = examples.getRows();
		int headingColumnNumber = heading.getParts().size();
		for(ExampleRow row: rows){
			if(row.getParts().size() != headingColumnNumber){
				error("Examples rows have to have the same number of columns", JnarioPackage.Literals.EXAMPLES__HEADING);
			}
		}
		
	}

}
