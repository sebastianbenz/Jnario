package de.bmw.carit.jnario.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xtend2.validation.ClasspathBasedChecks;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;

public class JnarioClasspathBasedChecks extends ClasspathBasedChecks {
	
	
	// no checks on scenario name currently
	@Check
	@Override
	public void checkFileNamingConventions(XtendFile xtendFile) {
	}

}
