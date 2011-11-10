/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Then#getAnd <em>And</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Then#getAnd_code <em>And code</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getThen()
 * @model
 * @generated
 */
public interface Then extends Step
{
  /**
   * Returns the value of the '<em><b>And</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' attribute list.
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getThen_And()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnd();

  /**
   * Returns the value of the '<em><b>And code</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.jnario.jnario.Code}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And code</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And code</em>' containment reference list.
   * @see de.bmw.carit.jnario.jnario.JnarioPackage#getThen_And_code()
   * @model containment="true"
   * @generated
   */
  EList<Code> getAnd_code();

} // Then
