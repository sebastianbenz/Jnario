/**
 * Copyright (c) 2012 BMW Car IT and others. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.jnario.spec.spec;

import org.eclipse.xtend.core.xtend.XtendMember;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.spec.spec.TestFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.spec.spec.TestFunction#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.spec.spec.SpecPackage#getTestFunction()
 * @model
 * @generated
 */
public interface TestFunction extends XtendMember
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
	 * @see org.jnario.spec.spec.SpecPackage#getTestFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.TestFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XExpression)
	 * @see org.jnario.spec.spec.SpecPackage#getTestFunction_Body()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getBody();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.TestFunction#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XExpression value);

} // TestFunction
