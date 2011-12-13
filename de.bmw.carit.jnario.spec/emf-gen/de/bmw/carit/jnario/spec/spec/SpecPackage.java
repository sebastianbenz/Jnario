/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec;

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
 * @see de.bmw.carit.jnario.spec.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bmw.de/carit/jnario/spec/Spec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecPackage eINSTANCE = de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
	 * @generated
	 */
	int SPEC_FILE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__IMPORTS = Xtend2Package.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__XTEND_CLASS = Xtend2Package.XTEND_FILE__XTEND_CLASS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE__PACKAGE = Xtend2Package.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FILE_FEATURE_COUNT = Xtend2Package.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
	 * @generated
	 */
	int EXAMPLE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATIONS = Xtend2Package.XTEND_CLASS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__NAME = Xtend2Package.XTEND_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__EXTENDS = Xtend2Package.XTEND_CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__IMPLEMENTS = Xtend2Package.XTEND_CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__SUPER_TYPES = Xtend2Package.XTEND_CLASS__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__MEMBERS = Xtend2Package.XTEND_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Super Call Referable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__SUPER_CALL_REFERABLE = Xtend2Package.XTEND_CLASS__SUPER_CALL_REFERABLE;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TYPE_PARAMETERS = Xtend2Package.XTEND_CLASS__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__ANNOTATION_INFO = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__PREAMBLE = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_TYPE = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP__TARGET_OPERATION = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Example Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_GROUP_FEATURE_COUNT = Xtend2Package.XTEND_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.TestFunctionImpl <em>Test Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.TestFunctionImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getTestFunction()
	 * @generated
	 */
	int TEST_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION__BODY = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FUNCTION_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__PREAMBLE = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__EXCEPTION = TEST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.BeforeImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Before All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__BEFORE_ALL = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.spec.spec.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.spec.spec.impl.AfterImpl
	 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ANNOTATIONS = TEST_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ANNOTATION_INFO = TEST_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__NAME = TEST_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__BODY = TEST_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>After All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__AFTER_ALL = TEST_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = TEST_FUNCTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.SpecFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.SpecFile
	 * @generated
	 */
	EClass getSpecFile();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup <em>Example Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Group</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup
	 * @generated
	 */
	EClass getExampleGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EAttribute getExampleGroup_Preamble();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetType();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Operation</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation()
	 * @see #getExampleGroup()
	 * @generated
	 */
	EReference getExampleGroup_TargetOperation();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamble</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getPreamble()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Preamble();

	/**
	 * Returns the meta object for the reference '{@link de.bmw.carit.jnario.spec.spec.Example#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Example#getException()
	 * @see #getExample()
	 * @generated
	 */
	EReference getExample_Exception();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.Before#isBeforeAll <em>Before All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before All</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.Before#isBeforeAll()
	 * @see #getBefore()
	 * @generated
	 */
	EAttribute getBefore_BeforeAll();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.After#isAfterAll <em>After All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After All</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.After#isAfterAll()
	 * @see #getAfter()
	 * @generated
	 */
	EAttribute getAfter_AfterAll();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.spec.spec.TestFunction <em>Test Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Function</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.TestFunction
	 * @generated
	 */
	EClass getTestFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.spec.spec.TestFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.TestFunction#getName()
	 * @see #getTestFunction()
	 * @generated
	 */
	EAttribute getTestFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.spec.spec.TestFunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.bmw.carit.jnario.spec.spec.TestFunction#getBody()
	 * @see #getTestFunction()
	 * @generated
	 */
	EReference getTestFunction_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

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
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecFileImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getSpecFile()
		 * @generated
		 */
		EClass SPEC_FILE = eINSTANCE.getSpecFile();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl <em>Example Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExampleGroup()
		 * @generated
		 */
		EClass EXAMPLE_GROUP = eINSTANCE.getExampleGroup();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_GROUP__PREAMBLE = eINSTANCE.getExampleGroup_Preamble();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_TYPE = eINSTANCE.getExampleGroup_TargetType();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_GROUP__TARGET_OPERATION = eINSTANCE.getExampleGroup_TargetOperation();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.ExampleImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Preamble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__PREAMBLE = eINSTANCE.getExample_Preamble();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE__EXCEPTION = eINSTANCE.getExample_Exception();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.BeforeImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '<em><b>Before All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEFORE__BEFORE_ALL = eINSTANCE.getBefore_BeforeAll();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.AfterImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '<em><b>After All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER__AFTER_ALL = eINSTANCE.getAfter_AfterAll();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.spec.spec.impl.TestFunctionImpl <em>Test Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.spec.spec.impl.TestFunctionImpl
		 * @see de.bmw.carit.jnario.spec.spec.impl.SpecPackageImpl#getTestFunction()
		 * @generated
		 */
		EClass TEST_FUNCTION = eINSTANCE.getTestFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FUNCTION__NAME = eINSTANCE.getTestFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FUNCTION__BODY = eINSTANCE.getTestFunction_Body();

	}

} //SpecPackage
