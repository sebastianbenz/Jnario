/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.validation;

import static com.google.common.base.Strings.isNullOrEmpty;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xtend2.xtend2.XtendField;

import com.google.inject.Inject;

import de.bmw.carit.jnario.common.ExampleColumn;
import de.bmw.carit.jnario.common.validation.CommonJavaValidator;
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.SpecPackage;
import de.bmw.carit.jnario.spec.spec.TestFunction;
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@ComposedChecks(validators={CommonJavaValidator.class})
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
