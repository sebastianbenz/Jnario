/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jnario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getImports <em>Imports</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getBackground <em>Background</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario()
 * @model
 * @generated
 */
public interface Jnario extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.jnario.jnario.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(Background)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Background()
   * @model containment="true"
   * @generated
   */
  Background getBackground();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(Background value);

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.jnario.jnario.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // Jnario
