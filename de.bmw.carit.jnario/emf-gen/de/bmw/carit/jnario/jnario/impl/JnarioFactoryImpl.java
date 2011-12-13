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
			case JnarioPackage.JNARIO: return createJnario();
			case JnarioPackage.BACKGROUND: return createBackground();
			case JnarioPackage.SCENARIO: return createScenario();
			case JnarioPackage.ANNOTATION: return createAnnotation();
			case JnarioPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jnario createJnario()
	{
		JnarioImplCustom jnario = new JnarioImplCustom();
		return jnario;
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
	public Annotation createAnnotation()
	{
		AnnotationImplCustom annotation = new AnnotationImplCustom();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration()
	{
		VariableDeclarationImplCustom variableDeclaration = new VariableDeclarationImplCustom();
		return variableDeclaration;
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
