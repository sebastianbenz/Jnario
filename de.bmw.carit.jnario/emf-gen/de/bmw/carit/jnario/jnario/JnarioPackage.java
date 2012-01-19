/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xtend2.xtend2.Xtend2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.jnario.JnarioFactory
 * @model kind="package"
 * @generated
 */
public interface JnarioPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jnario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bmw.de/carit/jnario/Jnario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jnario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JnarioPackage eINSTANCE = de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.FeatureImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ANNOTATIONS = Xtend2Package.XTEND_CLASS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = Xtend2Package.XTEND_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXTENDS = Xtend2Package.XTEND_CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPLEMENTS = Xtend2Package.XTEND_CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_TYPES = Xtend2Package.XTEND_CLASS__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBERS = Xtend2Package.XTEND_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Super Call Referable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_CALL_REFERABLE = Xtend2Package.XTEND_CLASS__SUPER_CALL_REFERABLE;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE_PARAMETERS = Xtend2Package.XTEND_CLASS__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BACKGROUND = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.BackgroundImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__MEMBERS = 1;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ScenarioImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EXAMPLES = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MEMBERS = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.StepImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CODE = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__AND = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.GivenImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__CODE = STEP__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__AND = STEP__AND;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.WhenImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__CODE = STEP__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__AND = STEP__AND;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ThenImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThen()
	 * @generated
	 */
	int THEN = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__CODE = STEP__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__AND = STEP__AND;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.AndImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CODE = STEP__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__AND = STEP__AND;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.CodeImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Block Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BLOCK_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ExampleTableImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleTable()
	 * @generated
	 */
	int EXAMPLE_TABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__HEADING = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ROWS = 2;

	/**
	 * The number of structural features of the '<em>Example Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeading()
	 * @generated
	 */
	int EXAMPLE_HEADING = 10;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Example Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ExampleRowImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleRow()
	 * @generated
	 */
	int EXAMPLE_ROW = 11;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Example Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ExampleCellImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleCell()
	 * @generated
	 */
	int EXAMPLE_CELL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Example Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_CELL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
	 * @generated
	 */
	int JNARIO = 13;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO__IMPORTS = Xtend2Package.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO__XTEND_CLASS = Xtend2Package.XTEND_FILE__XTEND_CLASS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO__PACKAGE = Xtend2Package.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>Jnario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNARIO_FEATURE_COUNT = Xtend2Package.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.RefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.RefImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getRef()
	 * @generated
	 */
	int REF = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__CODE = STEP__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__AND = STEP__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__REFERENCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.GivenRefImpl <em>Given Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.GivenRefImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGivenRef()
	 * @generated
	 */
	int GIVEN_REF = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__ANNOTATIONS = REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__ANNOTATION_INFO = REF__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__CODE = REF__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__AND = REF__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF__REFERENCE = REF__REFERENCE;

	/**
	 * The number of structural features of the '<em>Given Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.WhenRefImpl <em>When Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.WhenRefImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhenRef()
	 * @generated
	 */
	int WHEN_REF = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__ANNOTATIONS = REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__ANNOTATION_INFO = REF__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__CODE = REF__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__AND = REF__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF__REFERENCE = REF__REFERENCE;

	/**
	 * The number of structural features of the '<em>When Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ThenRefImpl <em>Then Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.ThenRefImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThenRef()
	 * @generated
	 */
	int THEN_REF = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__ANNOTATIONS = REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__ANNOTATION_INFO = REF__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__CODE = REF__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__AND = REF__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF__REFERENCE = REF__REFERENCE;

	/**
	 * The number of structural features of the '<em>Then Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.AndRefImpl <em>And Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.jnario.impl.AndRefImpl
	 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAndRef()
	 * @generated
	 */
	int AND_REF = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__ANNOTATIONS = REF__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__ANNOTATION_INFO = REF__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__CODE = REF__CODE;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__AND = REF__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF__REFERENCE = REF__REFERENCE;

	/**
	 * The number of structural features of the '<em>And Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.bmw.carit.jnario.jnario.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.bmw.carit.jnario.jnario.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Feature#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see de.bmw.carit.jnario.jnario.Feature#getBackground()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Background();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see de.bmw.carit.jnario.jnario.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Background#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see de.bmw.carit.jnario.jnario.Background#getSteps()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Background#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see de.bmw.carit.jnario.jnario.Background#getMembers()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_Members();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see de.bmw.carit.jnario.jnario.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Scenario#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see de.bmw.carit.jnario.jnario.Scenario#getExamples()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Examples();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.jnario.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Scenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see de.bmw.carit.jnario.jnario.Scenario#getSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Scenario#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see de.bmw.carit.jnario.jnario.Scenario#getMembers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Members();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see de.bmw.carit.jnario.jnario.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.jnario.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Step#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see de.bmw.carit.jnario.jnario.Step#getCode()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Step#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see de.bmw.carit.jnario.jnario.Step#getAnd()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_And();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see de.bmw.carit.jnario.jnario.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see de.bmw.carit.jnario.jnario.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see de.bmw.carit.jnario.jnario.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.bmw.carit.jnario.jnario.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see de.bmw.carit.jnario.jnario.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Code#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see de.bmw.carit.jnario.jnario.Code#getAnnotations()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Code#getBlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Expression</em>'.
	 * @see de.bmw.carit.jnario.jnario.Code#getBlockExpression()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_BlockExpression();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleTable
	 * @generated
	 */
	EClass getExampleTable();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.ExampleTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleTable#getName()
	 * @see #getExampleTable()
	 * @generated
	 */
	EAttribute getExampleTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.ExampleTable#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heading</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleTable#getHeading()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleTable#getRows()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Rows();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleHeading <em>Example Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Heading</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleHeading
	 * @generated
	 */
	EClass getExampleHeading();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.ExampleHeading#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleHeading#getParts()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Parts();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Row</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleRow
	 * @generated
	 */
	EClass getExampleRow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.ExampleRow#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleRow#getParts()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Parts();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleCell <em>Example Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Cell</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleCell
	 * @generated
	 */
	EClass getExampleCell();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.ExampleCell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.jnario.ExampleCell#getName()
	 * @see #getExampleCell()
	 * @generated
	 */
	EReference getExampleCell_Name();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Jnario <em>Jnario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jnario</em>'.
	 * @see de.bmw.carit.jnario.jnario.Jnario
	 * @generated
	 */
	EClass getJnario();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.GivenRef <em>Given Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given Ref</em>'.
	 * @see de.bmw.carit.jnario.jnario.GivenRef
	 * @generated
	 */
	EClass getGivenRef();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.WhenRef <em>When Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Ref</em>'.
	 * @see de.bmw.carit.jnario.jnario.WhenRef
	 * @generated
	 */
	EClass getWhenRef();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ThenRef <em>Then Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Ref</em>'.
	 * @see de.bmw.carit.jnario.jnario.ThenRef
	 * @generated
	 */
	EClass getThenRef();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.AndRef <em>And Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Ref</em>'.
	 * @see de.bmw.carit.jnario.jnario.AndRef
	 * @generated
	 */
	EClass getAndRef();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see de.bmw.carit.jnario.jnario.Ref
	 * @generated
	 */
	EClass getRef();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.jnario.Ref#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see de.bmw.carit.jnario.jnario.Ref#getReference()
	 * @see #getRef()
	 * @generated
	 */
	EReference getRef_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JnarioFactory getJnarioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.FeatureImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BACKGROUND = eINSTANCE.getFeature_Background();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.BackgroundImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__STEPS = eINSTANCE.getBackground_Steps();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__MEMBERS = eINSTANCE.getBackground_Members();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ScenarioImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__EXAMPLES = eINSTANCE.getScenario_Examples();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__MEMBERS = eINSTANCE.getScenario_Members();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.StepImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CODE = eINSTANCE.getStep_Code();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__AND = eINSTANCE.getStep_And();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.GivenImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.WhenImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ThenImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.AndImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.CodeImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__ANNOTATIONS = eINSTANCE.getCode_Annotations();

		/**
		 * The meta object literal for the '<em><b>Block Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__BLOCK_EXPRESSION = eINSTANCE.getCode_BlockExpression();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleTableImpl <em>Example Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ExampleTableImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleTable()
		 * @generated
		 */
		EClass EXAMPLE_TABLE = eINSTANCE.getExampleTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TABLE__NAME = eINSTANCE.getExampleTable_Name();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__HEADING = eINSTANCE.getExampleTable_Heading();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TABLE__ROWS = eINSTANCE.getExampleTable_Rows();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeading()
		 * @generated
		 */
		EClass EXAMPLE_HEADING = eINSTANCE.getExampleHeading();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__PARTS = eINSTANCE.getExampleHeading_Parts();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ExampleRowImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleRow()
		 * @generated
		 */
		EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__PARTS = eINSTANCE.getExampleRow_Parts();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ExampleCellImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleCell()
		 * @generated
		 */
		EClass EXAMPLE_CELL = eINSTANCE.getExampleCell();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_CELL__NAME = eINSTANCE.getExampleCell_Name();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
		 * @generated
		 */
		EClass JNARIO = eINSTANCE.getJnario();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.GivenRefImpl <em>Given Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.GivenRefImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGivenRef()
		 * @generated
		 */
		EClass GIVEN_REF = eINSTANCE.getGivenRef();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.WhenRefImpl <em>When Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.WhenRefImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhenRef()
		 * @generated
		 */
		EClass WHEN_REF = eINSTANCE.getWhenRef();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ThenRefImpl <em>Then Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.ThenRefImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThenRef()
		 * @generated
		 */
		EClass THEN_REF = eINSTANCE.getThenRef();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.AndRefImpl <em>And Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.AndRefImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAndRef()
		 * @generated
		 */
		EClass AND_REF = eINSTANCE.getAndRef();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.RefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.jnario.impl.RefImpl
		 * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getRef()
		 * @generated
		 */
		EClass REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF__REFERENCE = eINSTANCE.getRef_Reference();

	}

} //JnarioPackage
