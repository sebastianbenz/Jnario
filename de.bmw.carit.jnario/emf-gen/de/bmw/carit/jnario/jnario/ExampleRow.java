/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.ExampleRow#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleRow()
 * @model
 * @generated
 */
public interface ExampleRow extends EObject
{
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.jnario.ExampleCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleRow_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleCell> getParts();

} // ExampleRow
