/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.StepReference#getReference <em>Reference</em>}</li>
 *   <li>{@link org.jnario.feature.feature.StepReference#getSyntheticStepReference <em>Synthetic Step Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.feature.feature.FeaturePackage#getStepReference()
 * @model
 * @generated
 */
public interface StepReference extends Step
{
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(StepImplementation)
	 * @see org.jnario.feature.feature.FeaturePackage#getStepReference_Reference()
	 * @model
	 * @generated
	 */
	StepImplementation getReference();

	/**
	 * Sets the value of the '{@link org.jnario.feature.feature.StepReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(StepImplementation value);

	/**
	 * Returns the value of the '<em><b>Synthetic Step Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic Step Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Step Reference</em>' reference.
	 * @see #setSyntheticStepReference(Step)
	 * @see org.jnario.feature.feature.FeaturePackage#getStepReference_SyntheticStepReference()
	 * @model
	 * @generated
	 */
	Step getSyntheticStepReference();

	/**
	 * Sets the value of the '{@link org.jnario.feature.feature.StepReference#getSyntheticStepReference <em>Synthetic Step Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Step Reference</em>' reference.
	 * @see #getSyntheticStepReference()
	 * @generated
	 */
	void setSyntheticStepReference(Step value);

} // StepReference
