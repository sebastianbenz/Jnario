/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.validation;

import org.eclipse.xtext.validation.ComposedChecks;

import de.bmw.carit.jnario.common.validation.CommonJavaValidator;
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@ComposedChecks(validators={CommonJavaValidator.class})
public class SpecJavaValidator extends AbstractSpecJavaValidator {
}
