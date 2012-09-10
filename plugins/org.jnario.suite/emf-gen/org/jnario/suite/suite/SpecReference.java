/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.suite;

import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.suite.suite.SpecReference#getSpec <em>Spec</em>}</li>
 *   <li>{@link org.jnario.suite.suite.SpecReference#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.suite.suite.SuitePackage#getSpecReference()
 * @model
 * @generated
 */
public interface SpecReference extends Reference
{
	/**
	 * Returns the value of the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' reference.
	 * @see #setSpec(Specification)
	 * @see org.jnario.suite.suite.SuitePackage#getSpecReference_Spec()
	 * @model
	 * @generated
	 */
	Specification getSpec();

	/**
	 * Sets the value of the '{@link org.jnario.suite.suite.SpecReference#getSpec <em>Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(Specification value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.jnario.suite.suite.SuitePackage#getSpecReference_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.jnario.suite.suite.SpecReference#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // SpecReference
