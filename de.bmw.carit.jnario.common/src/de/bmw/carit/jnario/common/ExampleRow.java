/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.common.ExampleRow#getCells <em>Cells</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.common.ExampleRow#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleRow()
 * @model
 * @generated
 */
public interface ExampleRow extends EObject
{
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<XExpression> getCells();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.bmw.carit.jnario.common.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(ExampleTable)
	 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleRow_Table()
	 * @see de.bmw.carit.jnario.common.ExampleTable#getRows
	 * @model opposite="rows" transient="false"
	 * @generated
	 */
	ExampleTable getTable();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.common.ExampleRow#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(ExampleTable value);

} // ExampleRow
