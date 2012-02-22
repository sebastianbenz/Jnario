/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.Example#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends TestFunction
{
	/**
	 * Returns the value of the '<em><b>Preamble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preamble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preamble</em>' attribute.
	 * @see #setPreamble(String)
	 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample_Preamble()
	 * @model
	 * @generated
	 */
	String getPreamble();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Example#getPreamble <em>Preamble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preamble</em>' attribute.
	 * @see #getPreamble()
	 * @generated
	 */
	void setPreamble(String value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(JvmDeclaredType)
	 * @see de.bmw.carit.jnario.spec.spec.SpecPackage#getExample_Exception()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getException();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.spec.spec.Example#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(JvmDeclaredType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPending();

} // Example
