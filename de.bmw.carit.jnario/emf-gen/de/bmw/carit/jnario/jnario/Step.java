/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Step#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Step#getStepExpression <em>Step Expression</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Step#getAnd <em>And</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends XtendMember
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Expression</em>' containment reference.
	 * @see #setStepExpression(StepExpression)
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getStep_StepExpression()
	 * @model containment="true"
	 * @generated
	 */
	StepExpression getStepExpression();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Step#getStepExpression <em>Step Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Expression</em>' containment reference.
	 * @see #getStepExpression()
	 * @generated
	 */
	void setStepExpression(StepExpression value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.jnario.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getStep_And()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getAnd();

} // Step
