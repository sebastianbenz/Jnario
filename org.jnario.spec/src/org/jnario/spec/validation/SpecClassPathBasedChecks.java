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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.ClasspathUriResolutionException;
import org.eclipse.xtext.resource.ClasspathUriUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xtend2.validation.ClasspathBasedChecks;
import org.eclipse.xtext.xtend2.validation.IssueCodes;
import org.eclipse.xtext.xtend2.xtend2.Xtend2Package.Literals;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;
@SuppressWarnings("restriction")
public class SpecClassPathBasedChecks extends ClasspathBasedChecks{

	
	@Override
	public void register(EValidatorRegistrar registrar) {
		// do nothing
	}

	@Check
	public void checkFileNamingConventions(XtendFile xtendFile) {
		Resource resource = xtendFile.eResource();
		// editor already closed
		if (resource == null || resource.getResourceSet() == null)
			return;
		URI resourceURI = resource.getURI();
		String packageName = xtendFile.getPackage();
		StringBuilder classpathURIBuilder = new StringBuilder(ClasspathUriUtil.CLASSPATH_SCHEME);
		classpathURIBuilder.append(":/");
		if (packageName != null)
			classpathURIBuilder.append(packageName.replace(".", "/")).append("/");
		classpathURIBuilder.append(resourceURI.lastSegment());
		URI classpathURI = URI.createURI(classpathURIBuilder.toString());
		URIConverter uriConverter = resource.getResourceSet().getURIConverter();
		try {
			URI normalizedURI = uriConverter.normalize(classpathURI);
			if(!resourceURI.equals(normalizedURI))
				reportInvalidPackage(packageName, classpathURI);
		} catch(ClasspathUriResolutionException e) {
			reportInvalidPackage(packageName, classpathURI);
		}
	}

	protected void reportInvalidPackage(String packageName, URI classpathURI) {
		error("The declared package '" + notNull(packageName) + "' does not match the expected package", 
				Literals.XTEND_FILE__PACKAGE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, IssueCodes.WRONG_PACKAGE);
	}
}
