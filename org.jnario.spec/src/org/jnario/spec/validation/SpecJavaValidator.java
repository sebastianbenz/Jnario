/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.validation;

import static com.google.common.base.Strings.isNullOrEmpty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.ExampleColumn;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
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
	
	protected void mustBeJavaStatementExpression(XExpression expr) {
		// disabled as this is the case for example definitions
	}
	
	@Override
	protected void checkNoJavaKeyword(EObject obj, EAttribute attribute) {
		if (obj instanceof ExampleGroup) {
			return;
		}
		super.checkNoJavaKeyword(obj, attribute);
	}
}
