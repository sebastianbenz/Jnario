/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Member#getDecl <em>Decl</em>}</li>
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
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(XExpression)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getMember_Decl()
   * @model containment="true"
   * @generated
   */
  XExpression getDecl();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Member#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(XExpression value);

} // Member
