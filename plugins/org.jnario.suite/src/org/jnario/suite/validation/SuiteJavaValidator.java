/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.validation;

import static com.google.common.collect.Iterables.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;
import org.jnario.suite.suite.SuitePackage;
import org.jnario.validation.JnarioJavaValidator;
 
@ComposedChecks(validators={JnarioJavaValidator.class})
public class SuiteJavaValidator extends AbstractSuiteJavaValidator {

	@Check
	public void checkSuitesDoesNotReferenceItself(SpecReference specReference) {
		for (Suite rootSuite : rootSuites(specReference)) {
			if(rootSuite.equals(specReference.getSpec())){
				error("Suites cannot include themselves", SuitePackage.Literals.SPEC_REFERENCE__SPEC);
			}
		}
	}
	
	@SuppressWarnings("restriction")
	public Iterable<Suite> rootSuites(EObject context){
		return filter(((SuiteFile)context.eResource().getContents().get(0)).getXtendTypes(), Suite.class);
	}

	protected void warning(String message, EObject source, EStructuralFeature feature, String code, String... issueData) {
		// avoids overriding the whole method
		if("The use of wildcard imports is deprecated.".equals(message)){
			return;
		}
		getMessageAcceptor().acceptWarning(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, code, issueData);
	}
	
	
}
