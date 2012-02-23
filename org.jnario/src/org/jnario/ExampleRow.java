/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

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
 *   <li>{@link org.jnario.ExampleRow#getCells <em>Cells</em>}</li>
 *   <li>{@link org.jnario.ExampleRow#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.CommonPackage#getExampleRow()
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
	 * @see org.jnario.CommonPackage#getExampleRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<XExpression> getCells();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.jnario.ExampleTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(ExampleTable)
	 * @see org.jnario.CommonPackage#getExampleRow_Table()
	 * @see org.jnario.ExampleTable#getRows
	 * @model opposite="rows" transient="false"
	 * @generated
	 */
	ExampleTable getTable();

	/**
	 * Sets the value of the '{@link org.jnario.ExampleRow#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(ExampleTable value);

} // ExampleRow
