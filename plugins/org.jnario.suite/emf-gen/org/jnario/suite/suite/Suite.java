/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.suite.suite;

import org.eclipse.emf.common.util.EList;

import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.suite.suite.Suite#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.suite.suite.SuitePackage#getSuite()
 * @model
 * @generated
 */
public interface Suite extends Specification, SuiteElement
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.suite.suite.SuiteElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.jnario.suite.suite.SuitePackage#getSuite_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuiteElement> getElements();

} // Suite
