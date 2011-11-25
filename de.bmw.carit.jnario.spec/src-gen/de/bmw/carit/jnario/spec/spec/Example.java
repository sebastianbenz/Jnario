/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Example#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends Member
{
  /**
   * Returns the value of the '<em><b>Preamble</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preamble</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preamble</em>' attribute.
   * @see #setPreamble(String)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample_Preamble()
   * @model
   * @generated
   */
  String getPreamble();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preamble</em>' attribute.
   * @see #getPreamble()
   * @generated
   */
  void setPreamble(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Example#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // Example
