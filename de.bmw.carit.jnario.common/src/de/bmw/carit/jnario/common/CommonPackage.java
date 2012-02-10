/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.bmw.carit.jnario.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;
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
 * @see de.bmw.carit.jnario.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bmw.de/carit/jnario/Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = de.bmw.carit.jnario.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.common.impl.ExampleTableImpl <em>Example Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.common.impl.ExampleTableImpl
	 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleTable()
	 * @generated
	 */
	int EXAMPLE_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATIONS = Xtend2Package.XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ANNOTATION_INFO = Xtend2Package.XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__NAME = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__HEADING = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE__ROWS = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Example Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TABLE_FEATURE_COUNT = Xtend2Package.XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.common.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.common.impl.ExampleHeadingImpl
	 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleHeading()
	 * @generated
	 */
	int EXAMPLE_HEADING = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Example Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_HEADING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.common.impl.ExampleRowImpl <em>Example Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.common.impl.ExampleRowImpl
	 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleRow()
	 * @generated
	 */
	int EXAMPLE_ROW = 2;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Example Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.common.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.common.impl.AssertionImpl
	 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.bmw.carit.jnario.common.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bmw.carit.jnario.common.impl.MatcherImpl
	 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 4;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__CLOSURE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.common.ExampleTable <em>Example Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Table</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleTable
	 * @generated
	 */
	EClass getExampleTable();

	/**
	 * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.common.ExampleTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleTable#getName()
	 * @see #getExampleTable()
	 * @generated
	 */
	EAttribute getExampleTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.common.ExampleTable#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heading</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleTable#getHeading()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.common.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleTable#getRows()
	 * @see #getExampleTable()
	 * @generated
	 */
	EReference getExampleTable_Rows();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.common.ExampleHeading <em>Example Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Heading</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleHeading
	 * @generated
	 */
	EClass getExampleHeading();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.common.ExampleHeading#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleHeading#getCells()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Cells();

	/**
	 * Returns the meta object for the container reference '{@link de.bmw.carit.jnario.common.ExampleHeading#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleHeading#getTable()
	 * @see #getExampleHeading()
	 * @generated
	 */
	EReference getExampleHeading_Table();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.common.ExampleRow <em>Example Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Row</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleRow
	 * @generated
	 */
	EClass getExampleRow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.common.ExampleRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleRow#getCells()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Cells();

	/**
	 * Returns the meta object for the container reference '{@link de.bmw.carit.jnario.common.ExampleRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see de.bmw.carit.jnario.common.ExampleRow#getTable()
	 * @see #getExampleRow()
	 * @generated
	 */
	EReference getExampleRow_Table();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.common.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see de.bmw.carit.jnario.common.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.common.Assertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.bmw.carit.jnario.common.Assertion#getExpression()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Expression();

	/**
	 * Returns the meta object for class '{@link de.bmw.carit.jnario.common.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see de.bmw.carit.jnario.common.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.common.Matcher#getClosure <em>Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closure</em>'.
	 * @see de.bmw.carit.jnario.common.Matcher#getClosure()
	 * @see #getMatcher()
	 * @generated
	 */
	EReference getMatcher_Closure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.common.impl.ExampleTableImpl <em>Example Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.common.impl.ExampleTableImpl
		 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleTable()
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
		 * The meta object literal for the '{@link de.bmw.carit.jnario.common.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.common.impl.ExampleHeadingImpl
		 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleHeading()
		 * @generated
		 */
		EClass EXAMPLE_HEADING = eINSTANCE.getExampleHeading();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__CELLS = eINSTANCE.getExampleHeading_Cells();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_HEADING__TABLE = eINSTANCE.getExampleHeading_Table();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.common.impl.ExampleRowImpl <em>Example Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.common.impl.ExampleRowImpl
		 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getExampleRow()
		 * @generated
		 */
		EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__CELLS = eINSTANCE.getExampleRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ROW__TABLE = eINSTANCE.getExampleRow_Table();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.common.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.common.impl.AssertionImpl
		 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__EXPRESSION = eINSTANCE.getAssertion_Expression();

		/**
		 * The meta object literal for the '{@link de.bmw.carit.jnario.common.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bmw.carit.jnario.common.impl.MatcherImpl
		 * @see de.bmw.carit.jnario.common.impl.CommonPackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHER__CLOSURE = eINSTANCE.getMatcher_Closure();

	}

} //CommonPackage
