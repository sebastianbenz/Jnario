/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
