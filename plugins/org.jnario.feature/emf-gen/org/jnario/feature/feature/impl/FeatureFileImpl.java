/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xtend.core.xtend.impl.XtendFileImpl;

import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.FeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FeatureFileImpl extends XtendFileImpl implements FeatureFile
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureFileImpl()
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
		return FeaturePackage.Literals.FEATURE_FILE;
	}

} //FeatureFileImpl
