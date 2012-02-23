/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.feature.feature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.feature.feature.StepReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getStepReference()
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
	 * @see #setReference(Step)
	 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getStepReference_Reference()
	 * @model
	 * @generated
	 */
	Step getReference();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.feature.feature.StepReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Step value);

} // StepReference
