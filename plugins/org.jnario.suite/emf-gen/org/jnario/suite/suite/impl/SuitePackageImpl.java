/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.suite.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.jnario.JnarioPackage;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.suite.SuiteFile;
import org.jnario.suite.suite.SuitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuitePackageImpl extends EPackageImpl implements SuitePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jnario.suite.suite.SuitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuitePackageImpl()
	{
		super(eNS_URI, SuiteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SuitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuitePackage init()
	{
		if (isInited) return (SuitePackage)EPackage.Registry.INSTANCE.getEPackage(SuitePackage.eNS_URI);

		// Obtain or create and register package
		SuitePackageImpl theSuitePackage = (SuitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuitePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JnarioPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuitePackage.createPackageContents();

		// Initialize created meta-data
		theSuitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuitePackage.eNS_URI, theSuitePackage);
		return theSuitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternReference()
	{
		return patternReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternReference_Pattern()
	{
		return (EAttribute)patternReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecReference()
	{
		return specReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecReference_Spec()
	{
		return (EReference)specReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecReference_Text()
	{
		return (EAttribute)specReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuite()
	{
		return suiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuite_Elements()
	{
		return (EReference)suiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuiteFile()
	{
		return suiteFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference()
	{
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuiteFactory getSuiteFactory()
	{
		return (SuiteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		patternReferenceEClass = createEClass(PATTERN_REFERENCE);
		createEAttribute(patternReferenceEClass, PATTERN_REFERENCE__PATTERN);

		specReferenceEClass = createEClass(SPEC_REFERENCE);
		createEReference(specReferenceEClass, SPEC_REFERENCE__SPEC);
		createEAttribute(specReferenceEClass, SPEC_REFERENCE__TEXT);

		suiteEClass = createEClass(SUITE);
		createEReference(suiteEClass, SUITE__ELEMENTS);

		suiteFileEClass = createEClass(SUITE_FILE);

		referenceEClass = createEClass(REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JnarioPackage theJnarioPackage = (JnarioPackage)EPackage.Registry.INSTANCE.getEPackage(JnarioPackage.eNS_URI);
		XtendPackage theXtendPackage = (XtendPackage)EPackage.Registry.INSTANCE.getEPackage(XtendPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patternReferenceEClass.getESuperTypes().add(this.getReference());
		specReferenceEClass.getESuperTypes().add(this.getReference());
		suiteEClass.getESuperTypes().add(theJnarioPackage.getSpecification());
		suiteFileEClass.getESuperTypes().add(theXtendPackage.getXtendFile());

		// Initialize classes and features; add operations and parameters
		initEClass(patternReferenceEClass, PatternReference.class, "PatternReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternReference_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, PatternReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specReferenceEClass, SpecReference.class, "SpecReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecReference_Spec(), theJnarioPackage.getSpecification(), null, "spec", null, 0, 1, SpecReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecReference_Text(), ecorePackage.getEString(), "text", null, 0, 1, SpecReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suiteEClass, Suite.class, "Suite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuite_Elements(), this.getReference(), null, "elements", null, 0, -1, Suite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suiteFileEClass, SuiteFile.class, "SuiteFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SuitePackageImpl
