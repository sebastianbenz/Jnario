/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import org.eclipse.emf.ecore.EClass;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.GivenReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Given Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GivenReferenceImpl extends StepReferenceImpl implements GivenReference
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GivenReferenceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FeaturePackage.Literals.GIVEN_REFERENCE;
	}

} //GivenReferenceImpl
