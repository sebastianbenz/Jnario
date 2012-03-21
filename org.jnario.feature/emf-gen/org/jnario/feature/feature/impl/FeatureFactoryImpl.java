/**
 * <copyright>
 * </copyright>
 *

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
			case FeaturePackage.STEP_EXPRESSION: return createStepExpression();
			case FeaturePackage.FEATURE_FILE: return createFeatureFile();
			case FeaturePackage.GIVEN_REFERENCE: return createGivenReference();
			case FeaturePackage.WHEN_REFERENCE: return createWhenReference();
			case FeaturePackage.THEN_REFERENCE: return createThenReference();
			case FeaturePackage.AND_REFERENCE: return createAndReference();
			case FeaturePackage.STEP_REFERENCE: return createStepReference();
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
		FeatureImpl feature = new FeatureImpl();
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
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep()
	{
		StepImpl step = new StepImpl();
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
	public StepExpression createStepExpression()
	{
		StepExpressionImpl stepExpression = new StepExpressionImpl();
		return stepExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFile createFeatureFile()
	{
		FeatureFileImpl featureFile = new FeatureFileImpl();
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
		StepReferenceImpl stepReference = new StepReferenceImpl();
		return stepReference;
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
