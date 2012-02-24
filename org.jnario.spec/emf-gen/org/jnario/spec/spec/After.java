/**
 * Copyright (c) 2012 BMW Car IT and others. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.spec.spec.After#isAfterAll <em>After All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.spec.spec.SpecPackage#getAfter()
 * @model
 * @generated
 */
public interface After extends TestFunction
{
	/**
	 * Returns the value of the '<em><b>After All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After All</em>' attribute.
	 * @see #setAfterAll(boolean)
	 * @see org.jnario.spec.spec.SpecPackage#getAfter_AfterAll()
	 * @model default="false"
	 * @generated
	 */
	boolean isAfterAll();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.After#isAfterAll <em>After All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After All</em>' attribute.
	 * @see #isAfterAll()
	 * @generated
	 */
	void setAfterAll(boolean value);

} // After
