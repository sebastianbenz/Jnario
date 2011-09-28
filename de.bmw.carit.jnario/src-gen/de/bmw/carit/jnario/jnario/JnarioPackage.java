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
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
   * @generated
   */
  int JNARIO = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__SCENARIOS = 1;

  /**
   * The number of structural features of the '<em>Jnario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ScenarioImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__GIVEN = 1;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__WHEN = 2;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__THEN = 3;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.StepImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getStep()
   * @generated
   */
  int STEP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
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
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.GivenImpl <em>Given</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.GivenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGiven()
   * @generated
   */
  int GIVEN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
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
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.WhenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
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
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ThenImpl <em>Then</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ThenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThen()
   * @generated
   */
  int THEN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
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
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Jnario <em>Jnario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jnario</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario
   * @generated
   */
  EClass getJnario();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getName()
   * @see #getJnario()
   * @generated
   */
  EAttribute getJnario_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Jnario#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getScenarios()
   * @see #getJnario()
   * @generated
   */
  EReference getJnario_Scenarios();

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
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Scenario#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Given</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getGiven()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Given();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Scenario#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getWhen()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_When();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Scenario#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getThen()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Then();

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
   * Returns the meta object for the attribute list '{@link de.bmw.carit.jnario.jnario.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Step#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code</em>'.
   * @see de.bmw.carit.jnario.jnario.Step#getCode()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Code();

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
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
     * @generated
     */
    EClass JNARIO = eINSTANCE.getJnario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JNARIO__NAME = eINSTANCE.getJnario_Name();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JNARIO__SCENARIOS = eINSTANCE.getJnario_Scenarios();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__GIVEN = eINSTANCE.getScenario_Given();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__WHEN = eINSTANCE.getScenario_When();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__THEN = eINSTANCE.getScenario_Then();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__CODE = eINSTANCE.getStep_Code();

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

  }

} //JnarioPackage
