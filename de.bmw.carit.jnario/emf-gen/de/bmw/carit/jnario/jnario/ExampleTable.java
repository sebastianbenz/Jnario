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
 * A representation of the model object '<em><b>Example Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.ExampleTable#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.ExampleTable#getHeading <em>Heading</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.ExampleTable#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleTable()
 * @model
 * @generated
 */
public interface ExampleTable extends EObject
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
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.ExampleTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(ExampleHeading)
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleTable_Heading()
	 * @model containment="true"
	 * @generated
	 */
	ExampleHeading getHeading();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.jnario.ExampleTable#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(ExampleHeading value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.jnario.ExampleRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see de.bmw.carit.jnario.jnario.JnarioPackage#getExampleTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleRow> getRows();

} // ExampleTable
