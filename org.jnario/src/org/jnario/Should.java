/**
 */
package org.jnario;

import org.eclipse.xtext.xbase.XBinaryOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Should</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.Should#isNot <em>Not</em>}</li>
 *   <li>{@link org.jnario.Should#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.jnario.Should#getPostfix <em>Postfix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.JnarioPackage#getShould()
 * @model
 * @generated
 */
public interface Should extends XBinaryOperation {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see org.jnario.JnarioPackage#getShould_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link org.jnario.Should#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.jnario.JnarioPackage#getShould_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.jnario.Should#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Postfix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postfix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfix</em>' attribute.
	 * @see #setPostfix(String)
	 * @see org.jnario.JnarioPackage#getShould_Postfix()
	 * @model
	 * @generated
	 */
	String getPostfix();

	/**
	 * Sets the value of the '{@link org.jnario.Should#getPostfix <em>Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfix</em>' attribute.
	 * @see #getPostfix()
	 * @generated
	 */
	void setPostfix(String value);

} // Should
