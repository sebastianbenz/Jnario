/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Context#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.jnario.spec.spec.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getContext_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Context
