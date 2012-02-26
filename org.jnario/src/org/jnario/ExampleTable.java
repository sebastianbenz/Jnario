/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtend.core.xtend.XtendMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.ExampleTable#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.ExampleTable#getRows <em>Rows</em>}</li>
 *   <li>{@link org.jnario.ExampleTable#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.JnarioPackage#getExampleTable()
 * @model
 * @generated
 */
public interface ExampleTable extends XtendMember {
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
	 * @see org.jnario.JnarioPackage#getExampleTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.jnario.ExampleTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.ExampleRow}.
	 * It is bidirectional and its opposite is '{@link org.jnario.ExampleRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.jnario.JnarioPackage#getExampleTable_Rows()
	 * @see org.jnario.ExampleRow#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<ExampleRow> getRows();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.ExampleColumn}.
	 * It is bidirectional and its opposite is '{@link org.jnario.ExampleColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.jnario.JnarioPackage#getExampleTable_Columns()
	 * @see org.jnario.ExampleColumn#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<ExampleColumn> getColumns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

} // ExampleTable
