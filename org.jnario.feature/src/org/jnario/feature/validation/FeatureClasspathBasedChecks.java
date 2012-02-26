/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtend.core.validation.ClasspathBasedChecks;
import org.eclipse.xtend.core.xtend.XtendFile;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureClasspathBasedChecks extends ClasspathBasedChecks {
	
	
	// no checks on scenario name currently
	@Check
	@Override
	public void checkFileNamingConventions(XtendFile xtendFile) {
	}

}
