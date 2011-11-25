/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getElements <em>Elements</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}</li>
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
   * Returns the value of the '<em><b>Target Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Type</em>' reference.
   * @see #setTargetType(JvmDeclaredType)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup_TargetType()
   * @model
   * @generated
   */
  JvmDeclaredType getTargetType();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Type</em>' reference.
   * @see #getTargetType()
   * @generated
   */
  void setTargetType(JvmDeclaredType value);

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

  /**
   * Returns the value of the '<em><b>Target Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Operation</em>' reference.
   * @see #setTargetOperation(JvmOperation)
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExampleGroup_TargetOperation()
   * @model
   * @generated
   */
  JvmOperation getTargetOperation();

  /**
   * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Operation</em>' reference.
   * @see #getTargetOperation()
   * @generated
   */
  void setTargetOperation(JvmOperation value);

} // ExampleGroup
