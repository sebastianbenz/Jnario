/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Background#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Background#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends EObject
{
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.jnario.Given}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getBackground_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Given> getSteps();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xtend2.xtend2.XtendMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getBackground_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<XtendMember> getMembers();

} // Background
