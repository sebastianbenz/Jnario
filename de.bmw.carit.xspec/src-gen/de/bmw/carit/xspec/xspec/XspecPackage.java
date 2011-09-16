/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.bmw.carit.xspec.xspec.XspecFactory
 * @model kind="package"
 * @generated
 */
public interface XspecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xspec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bmw.carit.de/xspec/XSpec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xspec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XspecPackage eINSTANCE = de.bmw.carit.xspec.xspec.impl.XspecPackageImpl.init();

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.XSpecImpl <em>XSpec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.XSpecImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getXSpec()
   * @generated
   */
  int XSPEC = 0;

  /**
   * The feature id for the '<em><b>Module Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSPEC__MODULE_NAME = 0;

  /**
   * The feature id for the '<em><b>Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSPEC__SPECS = 1;

  /**
   * The number of structural features of the '<em>XSpec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.SentenceImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 1;

  /**
   * The feature id for the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__GIVEN = 0;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__WHEN = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__THEN = 2;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.StepImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getStep()
   * @generated
   */
  int STEP = 2;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESC = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__CODE = 1;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.GivenImpl <em>Given</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.GivenImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getGiven()
   * @generated
   */
  int GIVEN = 3;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>Given</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.WhenImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 4;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.xspec.xspec.impl.ThenImpl <em>Then</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.xspec.xspec.impl.ThenImpl
   * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getThen()
   * @generated
   */
  int THEN = 5;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__DESC = STEP__DESC;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>Then</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.XSpec <em>XSpec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSpec</em>'.
   * @see de.bmw.carit.xspec.xspec.XSpec
   * @generated
   */
  EClass getXSpec();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.xspec.xspec.XSpec#getModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module Name</em>'.
   * @see de.bmw.carit.xspec.xspec.XSpec#getModuleName()
   * @see #getXSpec()
   * @generated
   */
  EAttribute getXSpec_ModuleName();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.xspec.xspec.XSpec#getSpecs <em>Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specs</em>'.
   * @see de.bmw.carit.xspec.xspec.XSpec#getSpecs()
   * @see #getXSpec()
   * @generated
   */
  EReference getXSpec_Specs();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see de.bmw.carit.xspec.xspec.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.xspec.xspec.Sentence#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Given</em>'.
   * @see de.bmw.carit.xspec.xspec.Sentence#getGiven()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_Given();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.xspec.xspec.Sentence#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see de.bmw.carit.xspec.xspec.Sentence#getWhen()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_When();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.xspec.xspec.Sentence#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see de.bmw.carit.xspec.xspec.Sentence#getThen()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_Then();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see de.bmw.carit.xspec.xspec.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.xspec.xspec.Step#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see de.bmw.carit.xspec.xspec.Step#getDesc()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Desc();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.xspec.xspec.Step#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see de.bmw.carit.xspec.xspec.Step#getCode()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Code();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Given</em>'.
   * @see de.bmw.carit.xspec.xspec.Given
   * @generated
   */
  EClass getGiven();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When</em>'.
   * @see de.bmw.carit.xspec.xspec.When
   * @generated
   */
  EClass getWhen();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.xspec.xspec.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then</em>'.
   * @see de.bmw.carit.xspec.xspec.Then
   * @generated
   */
  EClass getThen();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XspecFactory getXspecFactory();

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
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.XSpecImpl <em>XSpec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.XSpecImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getXSpec()
     * @generated
     */
    EClass XSPEC = eINSTANCE.getXSpec();

    /**
     * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSPEC__MODULE_NAME = eINSTANCE.getXSpec_ModuleName();

    /**
     * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSPEC__SPECS = eINSTANCE.getXSpec_Specs();

    /**
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.SentenceImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENTENCE__GIVEN = eINSTANCE.getSentence_Given();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENTENCE__WHEN = eINSTANCE.getSentence_When();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENTENCE__THEN = eINSTANCE.getSentence_Then();

    /**
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.StepImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESC = eINSTANCE.getStep_Desc();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__CODE = eINSTANCE.getStep_Code();

    /**
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.GivenImpl <em>Given</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.GivenImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getGiven()
     * @generated
     */
    EClass GIVEN = eINSTANCE.getGiven();

    /**
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.WhenImpl <em>When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.WhenImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getWhen()
     * @generated
     */
    EClass WHEN = eINSTANCE.getWhen();

    /**
     * The meta object literal for the '{@link de.bmw.carit.xspec.xspec.impl.ThenImpl <em>Then</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.xspec.xspec.impl.ThenImpl
     * @see de.bmw.carit.xspec.xspec.impl.XspecPackageImpl#getThen()
     * @generated
     */
    EClass THEN = eINSTANCE.getThen();

  }

} //XspecPackage
