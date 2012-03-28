/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.feature.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.StepExpression#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.feature.feature.StepExpression#getBlockExpression <em>Block Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.feature.feature.FeaturePackage#getStepExpression()
 * @model
 * @generated
 */
public interface StepExpression extends EObject
{
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.jnario.feature.feature.FeaturePackage#getStepExpression_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<XAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Block Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Expression</em>' containment reference.
	 * @see #setBlockExpression(XBlockExpression)
	 * @see org.jnario.feature.feature.FeaturePackage#getStepExpression_BlockExpression()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getBlockExpression();

	/**
	 * Sets the value of the '{@link org.jnario.feature.feature.StepExpression#getBlockExpression <em>Block Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Expression</em>' containment reference.
	 * @see #getBlockExpression()
	 * @generated
	 */
	void setBlockExpression(XBlockExpression value);

} // StepExpression
