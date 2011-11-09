/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Member#getType <em>Type</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Member#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getMember_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Member#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(XExpression)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getMember_Right()
   * @model containment="true"
   * @generated
   */
  XExpression getRight();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Member#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(XExpression value);

} // Member
