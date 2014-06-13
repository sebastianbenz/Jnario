/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.suite.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xtend.core.xtend.impl.XtendFileImpl;

import org.jnario.suite.suite.SuiteFile;
import org.jnario.suite.suite.SuitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SuiteFileImpl extends XtendFileImpl implements SuiteFile
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuiteFileImpl()
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
		return SuitePackage.Literals.SUITE_FILE;
	}

} //SuiteFileImpl
