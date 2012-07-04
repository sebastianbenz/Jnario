/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.suite.suite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtend.core.xtend.XtendPackage;

import org.jnario.JnarioPackage;

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
 * @see org.jnario.suite.suite.SuiteFactory
 * @model kind="package"
 * @generated
 */
public interface SuitePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "suite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.jnario.org/suite/Suite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "suite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuitePackage eINSTANCE = org.jnario.suite.suite.impl.SuitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.SuiteElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.SuiteElementImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuiteElement()
	 * @generated
	 */
	int SUITE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.PatternReferenceImpl <em>Pattern Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.PatternReferenceImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getPatternReference()
	 * @generated
	 */
	int PATTERN_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REFERENCE__PATTERN = SUITE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REFERENCE_FEATURE_COUNT = SUITE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.SpecReferenceImpl <em>Spec Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.SpecReferenceImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSpecReference()
	 * @generated
	 */
	int SPEC_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_REFERENCE__SPEC = SUITE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_REFERENCE__TEXT = SUITE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_REFERENCE_FEATURE_COUNT = SUITE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.SuiteImpl <em>Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.SuiteImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuite()
	 * @generated
	 */
	int SUITE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ANNOTATIONS = JnarioPackage.SPECIFICATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__NAME = JnarioPackage.SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ABSTRACT = JnarioPackage.SPECIFICATION__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__EXTENDS = JnarioPackage.SPECIFICATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__IMPLEMENTS = JnarioPackage.SPECIFICATION__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__SUPER_TYPES = JnarioPackage.SPECIFICATION__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__MEMBERS = JnarioPackage.SPECIFICATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__TYPE_PARAMETERS = JnarioPackage.SPECIFICATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ELEMENTS = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FEATURE_COUNT = JnarioPackage.SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.SuiteFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.SuiteFileImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuiteFile()
	 * @generated
	 */
	int SUITE_FILE = 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FILE__IMPORTS = XtendPackage.XTEND_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Xtend Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FILE__XTEND_CLASSES = XtendPackage.XTEND_FILE__XTEND_CLASSES;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FILE__PACKAGE = XtendPackage.XTEND_FILE__PACKAGE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FILE_FEATURE_COUNT = XtendPackage.XTEND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.impl.HeadingImpl
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__NAME = SUITE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = SUITE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jnario.suite.suite.Reference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jnario.suite.suite.Reference
	 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.SuiteElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.jnario.suite.suite.SuiteElement
	 * @generated
	 */
	EClass getSuiteElement();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.PatternReference <em>Pattern Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Reference</em>'.
	 * @see org.jnario.suite.suite.PatternReference
	 * @generated
	 */
	EClass getPatternReference();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.suite.suite.PatternReference#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.jnario.suite.suite.PatternReference#getPattern()
	 * @see #getPatternReference()
	 * @generated
	 */
	EAttribute getPatternReference_Pattern();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.SpecReference <em>Spec Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Reference</em>'.
	 * @see org.jnario.suite.suite.SpecReference
	 * @generated
	 */
	EClass getSpecReference();

	/**
	 * Returns the meta object for the reference '{@link org.jnario.suite.suite.SpecReference#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec</em>'.
	 * @see org.jnario.suite.suite.SpecReference#getSpec()
	 * @see #getSpecReference()
	 * @generated
	 */
	EReference getSpecReference_Spec();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.suite.suite.SpecReference#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.jnario.suite.suite.SpecReference#getText()
	 * @see #getSpecReference()
	 * @generated
	 */
	EAttribute getSpecReference_Text();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.Suite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite</em>'.
	 * @see org.jnario.suite.suite.Suite
	 * @generated
	 */
	EClass getSuite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jnario.suite.suite.Suite#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.jnario.suite.suite.Suite#getElements()
	 * @see #getSuite()
	 * @generated
	 */
	EReference getSuite_Elements();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.SuiteFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.jnario.suite.suite.SuiteFile
	 * @generated
	 */
	EClass getSuiteFile();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see org.jnario.suite.suite.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link org.jnario.suite.suite.Heading#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jnario.suite.suite.Heading#getName()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Name();

	/**
	 * Returns the meta object for class '{@link org.jnario.suite.suite.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.jnario.suite.suite.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuiteFactory getSuiteFactory();

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
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.SuiteElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.SuiteElementImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuiteElement()
		 * @generated
		 */
		EClass SUITE_ELEMENT = eINSTANCE.getSuiteElement();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.PatternReferenceImpl <em>Pattern Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.PatternReferenceImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getPatternReference()
		 * @generated
		 */
		EClass PATTERN_REFERENCE = eINSTANCE.getPatternReference();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_REFERENCE__PATTERN = eINSTANCE.getPatternReference_Pattern();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.SpecReferenceImpl <em>Spec Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.SpecReferenceImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSpecReference()
		 * @generated
		 */
		EClass SPEC_REFERENCE = eINSTANCE.getSpecReference();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_REFERENCE__SPEC = eINSTANCE.getSpecReference_Spec();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_REFERENCE__TEXT = eINSTANCE.getSpecReference_Text();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.SuiteImpl <em>Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.SuiteImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuite()
		 * @generated
		 */
		EClass SUITE = eINSTANCE.getSuite();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUITE__ELEMENTS = eINSTANCE.getSuite_Elements();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.SuiteFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.SuiteFileImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getSuiteFile()
		 * @generated
		 */
		EClass SUITE_FILE = eINSTANCE.getSuiteFile();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.impl.HeadingImpl
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__NAME = eINSTANCE.getHeading_Name();

		/**
		 * The meta object literal for the '{@link org.jnario.suite.suite.Reference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jnario.suite.suite.Reference
		 * @see org.jnario.suite.suite.impl.SuitePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

	}

} //SuitePackage
