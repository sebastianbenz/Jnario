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
 *   <li>{@link org.jnario.suite.suite.Suite#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.suite.suite.SuitePackage#getSuite()
 * @model
 * @generated
 */
public interface Suite extends Specification
{
	/**
	 * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.suite.suite.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specs</em>' containment reference list.
	 * @see org.jnario.suite.suite.SuitePackage#getSuite_Specs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSpecs();

} // Suite
