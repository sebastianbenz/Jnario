/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.xtext.xtend2.xtend2.XtendFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jnario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getDescription <em>Description</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.Jnario#getBackground <em>Background</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario()
 * @model
 * @generated
 */
public interface Jnario extends XtendFile
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
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getDescription <em>Description</em>}' attribute.
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
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getJnario_Background()
	 * @model containment="true"
	 * @generated
	 */
	Background getBackground();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.Jnario#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Background value);

} // Jnario
