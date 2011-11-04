/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.VariableDeclaration#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.VariableDeclaration#getVariableDec <em>Variable Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see #setVisibility(String)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getVariableDeclaration_Visibility()
   * @model
   * @generated
   */
  String getVisibility();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.VariableDeclaration#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(String value);

  /**
   * Returns the value of the '<em><b>Variable Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Dec</em>' containment reference.
   * @see #setVariableDec(XExpression)
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getVariableDeclaration_VariableDec()
   * @model containment="true"
   * @generated
   */
  XExpression getVariableDec();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.jnario.VariableDeclaration#getVariableDec <em>Variable Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Dec</em>' containment reference.
   * @see #getVariableDec()
   * @generated
   */
  void setVariableDec(XExpression value);

} // VariableDeclaration
