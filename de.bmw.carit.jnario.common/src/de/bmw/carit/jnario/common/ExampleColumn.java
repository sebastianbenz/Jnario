/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xtend2.xtend2.XtendField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.common.ExampleColumn#getTable <em>Table</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.common.ExampleColumn#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleColumn()
 * @model
 * @generated
 */
public interface ExampleColumn extends XtendField {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.bmw.carit.jnario.common.ExampleTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(ExampleTable)
	 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleColumn_Table()
	 * @see de.bmw.carit.jnario.common.ExampleTable#getColumns
	 * @model opposite="columns" transient="false"
	 * @generated
	 */
	ExampleTable getTable();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.common.ExampleColumn#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(ExampleTable value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see de.bmw.carit.jnario.common.CommonPackage#getExampleColumn_Cells()
	 * @model derived="true"
	 * @generated
	 */
	EList<XExpression> getCells();

} // ExampleColumn
