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
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;
import org.jnario.suite.suite.SuitePackage;
import org.jnario.validation.JnarioJavaValidator;
 
@SuppressWarnings("restriction")
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
	
	public Iterable<Suite> rootSuites(EObject context){
		return filter(((SuiteFile)context.eResource().getContents().get(0)).getXtendTypes(), Suite.class);
	}

	@Override
	protected void addIssue(String message, EObject source, String issueCode) {
		if(IssueCodes.IMPORT_WILDCARD_DEPRECATED == issueCode){
			return;
		}
		super.addIssue(message, source, issueCode);
	}
}
