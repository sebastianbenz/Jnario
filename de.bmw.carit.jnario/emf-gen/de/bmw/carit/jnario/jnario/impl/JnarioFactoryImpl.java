/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario.impl;

import de.bmw.carit.jnario.jnario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JnarioFactoryImpl extends EFactoryImpl implements JnarioFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JnarioFactory init()
	{
		try
		{
			JnarioFactory theJnarioFactory = (JnarioFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bmw.de/carit/jnario/Jnario"); 
			if (theJnarioFactory != null)
			{
				return theJnarioFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JnarioFactoryImplCustom();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFactoryImpl()
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
			case JnarioPackage.FEATURE: return createFeature();
			case JnarioPackage.BACKGROUND: return createBackground();
			case JnarioPackage.SCENARIO: return createScenario();
			case JnarioPackage.STEP: return createStep();
			case JnarioPackage.GIVEN: return createGiven();
			case JnarioPackage.WHEN: return createWhen();
			case JnarioPackage.THEN: return createThen();
			case JnarioPackage.AND: return createAnd();
			case JnarioPackage.CODE: return createCode();
			case JnarioPackage.EXAMPLE_TABLE: return createExampleTable();
			case JnarioPackage.EXAMPLE_HEADING: return createExampleHeading();
			case JnarioPackage.EXAMPLE_ROW: return createExampleRow();
			case JnarioPackage.EXAMPLE_CELL: return createExampleCell();
			case JnarioPackage.JNARIO: return createJnario();
			case JnarioPackage.GIVEN_REF: return createGivenRef();
			case JnarioPackage.WHEN_REF: return createWhenRef();
			case JnarioPackage.THEN_REF: return createThenRef();
			case JnarioPackage.GIVEN_STEPS: return createGivenSteps();
			case JnarioPackage.AND_REF: return createAndRef();
			case JnarioPackage.AND_STEP: return createAndStep();
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
		BackgroundImplCustom background = new BackgroundImplCustom();
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
		GivenImplCustom given = new GivenImplCustom();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen()
	{
		WhenImplCustom when = new WhenImplCustom();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then createThen()
	{
		ThenImplCustom then = new ThenImplCustom();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd()
	{
		AndImplCustom and = new AndImplCustom();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode()
	{
		CodeImplCustom code = new CodeImplCustom();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTable createExampleTable()
	{
		ExampleTableImplCustom exampleTable = new ExampleTableImplCustom();
		return exampleTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleHeading createExampleHeading()
	{
		ExampleHeadingImplCustom exampleHeading = new ExampleHeadingImplCustom();
		return exampleHeading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRow createExampleRow()
	{
		ExampleRowImplCustom exampleRow = new ExampleRowImplCustom();
		return exampleRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleCell createExampleCell()
	{
		ExampleCellImplCustom exampleCell = new ExampleCellImplCustom();
		return exampleCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jnario createJnario()
	{
		JnarioImpl jnario = new JnarioImpl();
		return jnario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenRef createGivenRef()
	{
		GivenRefImpl givenRef = new GivenRefImpl();
		return givenRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenRef createWhenRef()
	{
		WhenRefImpl whenRef = new WhenRefImpl();
		return whenRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThenRef createThenRef()
	{
		ThenRefImpl thenRef = new ThenRefImpl();
		return thenRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GivenSteps createGivenSteps()
	{
		GivenStepsImpl givenSteps = new GivenStepsImpl();
		return givenSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRef createAndRef()
	{
		AndRefImpl andRef = new AndRefImpl();
		return andRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndStep createAndStep()
	{
		AndStepImpl andStep = new AndStepImpl();
		return andStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioPackage getJnarioPackage()
	{
		return (JnarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JnarioPackage getPackage()
	{
		return JnarioPackage.eINSTANCE;
	}

} //JnarioFactoryImpl
