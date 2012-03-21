/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.feature.feature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtend.core.xtend.XtendPackage;

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
 * @see org.jnario.feature.feature.FeatureFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org/jnario/feature/Feature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "feature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturePackage eINSTANCE = org.jnario.feature.feature.impl.FeaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.FeatureImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeature()
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
	int FEATURE__ANNOTATIONS = XtendPackage.XTEND_CLASS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = XtendPackage.XTEND_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXTENDS = XtendPackage.XTEND_CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPLEMENTS = XtendPackage.XTEND_CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_TYPES = XtendPackage.XTEND_CLASS__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBERS = XtendPackage.XTEND_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Super Call Referable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_CALL_REFERABLE = XtendPackage.XTEND_CLASS__SUPER_CALL_REFERABLE;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE_PARAMETERS = XtendPackage.XTEND_CLASS__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = XtendPackage.XTEND_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BACKGROUND = XtendPackage.XTEND_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = XtendPackage.XTEND_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.BackgroundImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBackground()
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
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ScenarioImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getScenario()
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
	int SCENARIO__ANNOTATIONS = XtendPackage.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ANNOTATION_INFO = XtendPackage.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EXAMPLES = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STEPS = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MEMBERS = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStep()
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
	int STEP__ANNOTATIONS = XtendPackage.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ANNOTATION_INFO = XtendPackage.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_EXPRESSION = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__AND = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = XtendPackage.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.GivenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGiven()
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
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__STEP_EXPRESSION = STEP__STEP_EXPRESSION;

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
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.WhenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhen()
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
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__STEP_EXPRESSION = STEP__STEP_EXPRESSION;

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
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ThenImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThen()
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
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__STEP_EXPRESSION = STEP__STEP_EXPRESSION;

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
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.AndImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAnd()
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
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__STEP_EXPRESSION = STEP__STEP_EXPRESSION;

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
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepExpressionImpl <em>Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepExpressionImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepExpression()
	 * @generated
	 */
	int STEP_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXPRESSION__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Block Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXPRESSION__BLOCK_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.FeatureFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.FeatureFileImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeatureFile()
	 * @generated
	 */
	int FEATURE_FILE = 9;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__IMPORTS = XtendPackage.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__XTEND_CLASS = XtendPackage.XTEND_FILE__XTEND_CLASS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE__PACKAGE = XtendPackage.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FILE_FEATURE_COUNT = XtendPackage.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.StepReferenceImpl <em>Step Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.StepReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepReference()
	 * @generated
	 */
	int STEP_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__ANNOTATIONS = STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__ANNOTATION_INFO = STEP__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__STEP_EXPRESSION = STEP__STEP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__AND = STEP__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE__REFERENCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_REFERENCE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.GivenReferenceImpl <em>Given Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.GivenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGivenReference()
	 * @generated
	 */
	int GIVEN_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__STEP_EXPRESSION = STEP_REFERENCE__STEP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__AND = STEP_REFERENCE__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The number of structural features of the '<em>Given Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.WhenReferenceImpl <em>When Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.WhenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhenReference()
	 * @generated
	 */
	int WHEN_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__STEP_EXPRESSION = STEP_REFERENCE__STEP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__AND = STEP_REFERENCE__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The number of structural features of the '<em>When Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.ThenReferenceImpl <em>Then Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.ThenReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThenReference()
	 * @generated
	 */
	int THEN_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__STEP_EXPRESSION = STEP_REFERENCE__STEP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__AND = STEP_REFERENCE__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The number of structural features of the '<em>Then Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.feature.feature.impl.AndReferenceImpl <em>And Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.feature.feature.impl.AndReferenceImpl
	 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAndReference()
	 * @generated
	 */
	int AND_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__ANNOTATIONS = STEP_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__ANNOTATION_INFO = STEP_REFERENCE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__NAME = STEP_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__STEP_EXPRESSION = STEP_REFERENCE__STEP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__AND = STEP_REFERENCE__AND;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE__REFERENCE = STEP_REFERENCE__REFERENCE;

	/**
	 * The number of structural features of the '<em>And Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_REFERENCE_FEATURE_COUNT = STEP_REFERENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.jnario.feature.feature.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.feature.feature.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.jnario.feature.feature.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.feature.feature.Feature#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.jnario.feature.feature.Feature#getBackground()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Background();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see org.jnario.feature.feature.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Background#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.jnario.feature.feature.Background#getSteps()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Background#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.jnario.feature.feature.Background#getMembers()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_Members();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.jnario.feature.feature.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Scenario#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see org.jnario.feature.feature.Scenario#getExamples()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Examples();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.feature.feature.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.feature.feature.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Scenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.jnario.feature.feature.Scenario#getSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Scenario#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.jnario.feature.feature.Scenario#getMembers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Members();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.jnario.feature.feature.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.feature.feature.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.feature.feature.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.feature.feature.Step#getStepExpression <em>Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Expression</em>'.
	 * @see org.jnario.feature.feature.Step#getStepExpression()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_StepExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.Step#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.jnario.feature.feature.Step#getAnd()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_And();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see org.jnario.feature.feature.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see org.jnario.feature.feature.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see org.jnario.feature.feature.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.jnario.feature.feature.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.StepExpression <em>Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Expression</em>'.
	 * @see org.jnario.feature.feature.StepExpression
	 * @generated
	 */
	EClass getStepExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.feature.feature.StepExpression#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.jnario.feature.feature.StepExpression#getAnnotations()
	 * @see #getStepExpression()
	 * @generated
	 */
	EReference getStepExpression_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link org.jnario.feature.feature.StepExpression#getBlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Expression</em>'.
	 * @see org.jnario.feature.feature.StepExpression#getBlockExpression()
	 * @see #getStepExpression()
	 * @generated
	 */
	EReference getStepExpression_BlockExpression();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.FeatureFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.jnario.feature.feature.FeatureFile
	 * @generated
	 */
	EClass getFeatureFile();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.GivenReference <em>Given Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given Reference</em>'.
	 * @see org.jnario.feature.feature.GivenReference
	 * @generated
	 */
	EClass getGivenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.WhenReference <em>When Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Reference</em>'.
	 * @see org.jnario.feature.feature.WhenReference
	 * @generated
	 */
	EClass getWhenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.ThenReference <em>Then Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Reference</em>'.
	 * @see org.jnario.feature.feature.ThenReference
	 * @generated
	 */
	EClass getThenReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.AndReference <em>And Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Reference</em>'.
	 * @see org.jnario.feature.feature.AndReference
	 * @generated
	 */
	EClass getAndReference();

	/**
	 * Returns the meta object for class '{@link org.jnario.feature.feature.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Reference</em>'.
	 * @see org.jnario.feature.feature.StepReference
	 * @generated
	 */
	EClass getStepReference();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.feature.feature.StepReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.jnario.feature.feature.StepReference#getReference()
	 * @see #getStepReference()
	 * @generated
	 */
	EReference getStepReference_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureFactory getFeatureFactory();

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
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.FeatureImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeature()
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
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.BackgroundImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getBackground()
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
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ScenarioImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getScenario()
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
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStep()
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
		 * The meta object literal for the '<em><b>Step Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STEP_EXPRESSION = eINSTANCE.getStep_StepExpression();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__AND = eINSTANCE.getStep_And();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.GivenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.WhenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ThenImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.AndImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepExpressionImpl <em>Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepExpressionImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepExpression()
		 * @generated
		 */
		EClass STEP_EXPRESSION = eINSTANCE.getStepExpression();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EXPRESSION__ANNOTATIONS = eINSTANCE.getStepExpression_Annotations();

		/**
		 * The meta object literal for the '<em><b>Block Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EXPRESSION__BLOCK_EXPRESSION = eINSTANCE.getStepExpression_BlockExpression();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.FeatureFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.FeatureFileImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getFeatureFile()
		 * @generated
		 */
		EClass FEATURE_FILE = eINSTANCE.getFeatureFile();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.GivenReferenceImpl <em>Given Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.GivenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getGivenReference()
		 * @generated
		 */
		EClass GIVEN_REFERENCE = eINSTANCE.getGivenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.WhenReferenceImpl <em>When Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.WhenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getWhenReference()
		 * @generated
		 */
		EClass WHEN_REFERENCE = eINSTANCE.getWhenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.ThenReferenceImpl <em>Then Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.ThenReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getThenReference()
		 * @generated
		 */
		EClass THEN_REFERENCE = eINSTANCE.getThenReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.AndReferenceImpl <em>And Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.AndReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getAndReference()
		 * @generated
		 */
		EClass AND_REFERENCE = eINSTANCE.getAndReference();

		/**
		 * The meta object literal for the '{@link org.jnario.feature.feature.impl.StepReferenceImpl <em>Step Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.feature.feature.impl.StepReferenceImpl
		 * @see org.jnario.feature.feature.impl.FeaturePackageImpl#getStepReference()
		 * @generated
		 */
		EClass STEP_REFERENCE = eINSTANCE.getStepReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_REFERENCE__REFERENCE = eINSTANCE.getStepReference_Reference();

	}

} //FeaturePackage
