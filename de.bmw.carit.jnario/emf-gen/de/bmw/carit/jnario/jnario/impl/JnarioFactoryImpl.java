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
		return new JnarioFactoryImpl();
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
			case JnarioPackage.STEP_EXPRESSION: return createStepExpression();
			case JnarioPackage.EXAMPLE_TABLE: return createExampleTable();
			case JnarioPackage.EXAMPLE_HEADING: return createExampleHeading();
			case JnarioPackage.EXAMPLE_ROW: return createExampleRow();
			case JnarioPackage.EXAMPLE_CELL: return createExampleCell();
			case JnarioPackage.JNARIO_FILE: return createJnarioFile();
			case JnarioPackage.GIVEN_REFERENCE: return createGivenReference();
			case JnarioPackage.WHEN_REFERENCE: return createWhenReference();
			case JnarioPackage.THEN_REFERENCE: return createThenReference();
			case JnarioPackage.AND_REFERENCE: return createAndReference();
			case JnarioPackage.STEP_REFERENCE: return createStepReference();
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
	public ExampleTable createExampleTable()
	{
		ExampleTableImpl exampleTable = new ExampleTableImpl();
		return exampleTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleHeading createExampleHeading()
	{
		ExampleHeadingImpl exampleHeading = new ExampleHeadingImpl();
		return exampleHeading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRow createExampleRow()
	{
		ExampleRowImpl exampleRow = new ExampleRowImpl();
		return exampleRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleCell createExampleCell()
	{
		ExampleCellImpl exampleCell = new ExampleCellImpl();
		return exampleCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioFile createJnarioFile()
	{
		JnarioFileImpl jnarioFile = new JnarioFileImpl();
		return jnarioFile;
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
