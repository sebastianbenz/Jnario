/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.suite.suite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.suite.suite.PatternReference#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.suite.suite.SuitePackage#getPatternReference()
 * @model
 * @generated
 */
public interface PatternReference extends SuiteElement, Reference
{
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.jnario.suite.suite.SuitePackage#getPatternReference_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.jnario.suite.suite.PatternReference#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // PatternReference
