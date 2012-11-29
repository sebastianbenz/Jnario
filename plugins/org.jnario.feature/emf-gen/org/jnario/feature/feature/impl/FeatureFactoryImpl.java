/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jnario.feature.feature.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureFactoryImpl extends EFactoryImpl implements FeatureFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureFactory init()
	{
		try
		{
			FeatureFactory theFeatureFactory = (FeatureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.org/jnario/feature/Feature"); 
			if (theFeatureFactory != null)
			{
				return theFeatureFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFactoryImpl()
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
			case FeaturePackage.FEATURE: return createFeature();
			case FeaturePackage.BACKGROUND: return createBackground();
			case FeaturePackage.SCENARIO: return createScenario();
			case FeaturePackage.STEP: return createStep();
			case FeaturePackage.GIVEN: return createGiven();
			case FeaturePackage.WHEN: return createWhen();
			case FeaturePackage.THEN: return createThen();
			case FeaturePackage.AND: return createAnd();
			case FeaturePackage.FEATURE_FILE: return createFeatureFile();
			case FeaturePackage.GIVEN_REFERENCE: return createGivenReference();
			case FeaturePackage.WHEN_REFERENCE: return createWhenReference();
			case FeaturePackage.THEN_REFERENCE: return createThenReference();
			case FeaturePackage.AND_REFERENCE: return createAndReference();
			case FeaturePackage.STEP_REFERENCE: return createStepReference();
			case FeaturePackage.STEP_IMPLEMENTATION: return createStepImplementation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature()
	{
		FeatureImplCustom feature = new FeatureImplCustom();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background createBackground()
	{
		BackgroundImpl background = new BackgroundImpl();
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario()
	{
		ScenarioImplCustom scenario = new ScenarioImplCustom();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep()
	{
		StepImplCustom step = new StepImplCustom();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given createGiven()
	{
		GivenImpl given = new GivenImpl();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen()
	{
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then createThen()
	{
		ThenImpl then = new ThenImpl();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd()
	{
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFile createFeatureFile()
	{
		FeatureFileImplCustom featureFile = new FeatureFileImplCustom();
		return featureFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenReference createGivenReference()
	{
		GivenReferenceImpl givenReference = new GivenReferenceImpl();
		return givenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenReference createWhenReference()
	{
		WhenReferenceImpl whenReference = new WhenReferenceImpl();
		return whenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThenReference createThenReference()
	{
		ThenReferenceImpl thenReference = new ThenReferenceImpl();
		return thenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndReference createAndReference()
	{
		AndReferenceImpl andReference = new AndReferenceImpl();
		return andReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepReference createStepReference()
	{
		StepReferenceImplCustom stepReference = new StepReferenceImplCustom();
		return stepReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepImplementation createStepImplementation()
	{
		StepImplementationImpl stepImplementation = new StepImplementationImpl();
		return stepImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePackage getFeaturePackage()
	{
		return (FeaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturePackage getPackage()
	{
		return FeaturePackage.eINSTANCE;
	}

} //FeatureFactoryImpl
