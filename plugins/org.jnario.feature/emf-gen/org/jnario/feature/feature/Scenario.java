/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtend.core.xtend.XtendClass;

import org.jnario.Executable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.jnario.feature.feature.FeaturePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends XtendClass, Executable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Step> getSteps();

} // Scenario
