/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.validation;

import static com.google.common.base.Strings.isNullOrEmpty;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.jnario.ExampleColumn;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.spec.spec.TestFunction;
import org.jnario.validation.JnarioJavaValidator;

import com.google.inject.Inject;
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@ComposedChecks(validators={JnarioJavaValidator.class})
public class SpecJavaValidator extends AbstractSpecJavaValidator {
	
	@Inject
	private ExampleNameProvider exampleNameProvider;
	
	@Override
	public void checkLocalUsageOfDeclaredFields(XtendField field) {
		if(!(field instanceof ExampleColumn)){
			super.checkLocalUsageOfDeclaredFields(field);
		}
	}
	
	@Check
	public void checkExamplesHaveNames(TestFunction example){
		String methodName = exampleNameProvider.toMethodName(example);
		if(isNullOrEmpty(methodName)){
			error("Name must not be empty", SpecPackage.Literals.TEST_FUNCTION__NAME);
		}
	}
}
