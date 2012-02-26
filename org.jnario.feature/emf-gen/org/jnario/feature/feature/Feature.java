/**
 */
package org.jnario.feature.feature;

import org.eclipse.xtend.core.xtend.XtendClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.jnario.feature.feature.Feature#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.feature.feature.FeaturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends XtendClass
{
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.jnario.feature.feature.FeaturePackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.jnario.feature.feature.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Background)
	 * @see org.jnario.feature.feature.FeaturePackage#getFeature_Background()
	 * @model containment="true"
	 * @generated
	 */
	Background getBackground();

	/**
	 * Sets the value of the '{@link org.jnario.feature.feature.Feature#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Background value);

} // Feature
