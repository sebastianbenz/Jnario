/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget <em>Target</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup()
 * @model
 * @generated
 */
public interface ExampleGroup extends Member
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
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup_Preamble()
   * @model
   * @generated
   */
  String getPreamble();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preamble</em>' attribute.
   * @see #getPreamble()
   * @generated
   */
  void setPreamble(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(JvmIdentifiableElement)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup_Target()
   * @model
   * @generated
   */
  JvmIdentifiableElement getTarget();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(JvmIdentifiableElement value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.jnario.spec.spec.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Member> getElements();

} // ExampleGroup
