/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.suite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jnario.suite.suite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuiteFactoryImpl extends EFactoryImpl implements SuiteFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuiteFactory init()
	{
		try
		{
			SuiteFactory theSuiteFactory = (SuiteFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jnario.org/suite/Suite"); 
			if (theSuiteFactory != null)
			{
				return theSuiteFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuiteFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SuitePackage.PATTERN_REFERENCE: return createPatternReference();
			case SuitePackage.SPEC_REFERENCE: return createSpecReference();
			case SuitePackage.SUITE: return createSuite();
			case SuitePackage.SUITE_FILE: return createSuiteFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternReference createPatternReference()
	{
		PatternReferenceImpl patternReference = new PatternReferenceImpl();
		return patternReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecReference createSpecReference()
	{
		SpecReferenceImpl specReference = new SpecReferenceImpl();
		return specReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suite createSuite()
	{
		SuiteImplCustom suite = new SuiteImplCustom();
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuiteFile createSuiteFile()
	{
		SuiteFileImpl suiteFile = new SuiteFileImpl();
		return suiteFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuitePackage getSuitePackage()
	{
		return (SuitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuitePackage getPackage()
	{
		return SuitePackage.eINSTANCE;
	}

} //SuiteFactoryImpl
