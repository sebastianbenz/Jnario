/**
 * Copyright (c) 2012 BMW Car IT and others. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.jnario.spec.spec;

import org.eclipse.xtend.core.xtend.XtendMember;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.spec.spec.SpecPackage#getExampleGroup()
 * @model
 * @generated
 */
public interface ExampleGroup extends Specification, XtendMember
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
	 * @see org.jnario.spec.spec.SpecPackage#getExampleGroup_Preamble()
	 * @model
	 * @generated
	 */
	String getPreamble();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.ExampleGroup#getPreamble <em>Preamble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preamble</em>' attribute.
	 * @see #getPreamble()
	 * @generated
	 */
	void setPreamble(String value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' containment reference.
	 * @see #setTargetType(JvmTypeReference)
	 * @see org.jnario.spec.spec.SpecPackage#getExampleGroup_TargetType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getTargetType();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.ExampleGroup#getTargetType <em>Target Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' containment reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operation</em>' reference.
	 * @see #setTargetOperation(JvmOperation)
	 * @see org.jnario.spec.spec.SpecPackage#getExampleGroup_TargetOperation()
	 * @model
	 * @generated
	 */
	JvmOperation getTargetOperation();

	/**
	 * Sets the value of the '{@link org.jnario.spec.spec.ExampleGroup#getTargetOperation <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' reference.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(JvmOperation value);

} // ExampleGroup
