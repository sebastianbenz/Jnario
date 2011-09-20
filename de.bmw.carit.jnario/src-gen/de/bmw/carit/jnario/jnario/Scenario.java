/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Scenario#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Scenario#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Scenario Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario Name</em>' attribute.
   * @see #setScenarioName(String)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getScenario_ScenarioName()
   * @model
   * @generated
   */
  String getScenarioName();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Scenario#getScenarioName <em>Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario Name</em>' attribute.
   * @see #getScenarioName()
   * @generated
   */
  void setScenarioName(String value);

  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(Sentence)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getScenario_Spec()
   * @model containment="true"
   * @generated
   */
  Sentence getSpec();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Scenario#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(Sentence value);

} // Scenario
