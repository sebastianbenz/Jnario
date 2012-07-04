/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
 

public class SuiteJavaValidator extends AbstractSuiteJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	protected void warning(String message, EObject source, EStructuralFeature feature, String code, String... issueData) {
		// avoids overriding the whole method
		if("The use of wildcard imports is deprecated.".equals(message)){
			return;
		}
		getMessageAcceptor().acceptWarning(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, code, issueData);
	}
	
}
