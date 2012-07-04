/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.validation;

import static org.eclipse.xtext.util.Strings.notNull;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.core.validation.ClasspathBasedChecks;
import org.eclipse.xtend.core.validation.IssueCodes;
import org.eclipse.xtend.core.xtend.XtendPackage.Literals;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
@SuppressWarnings("restriction")
public class SpecClassPathBasedChecks extends ClasspathBasedChecks{

	
	@Override
	public void register(EValidatorRegistrar registrar) {
		// do nothing
	}

	protected void reportInvalidPackage(String packageName, URI classpathURI) {
		error("The declared package '" + notNull(packageName) + "' does not match the expected package", 
				Literals.XTEND_FILE__PACKAGE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, IssueCodes.WRONG_PACKAGE);
	}
}
