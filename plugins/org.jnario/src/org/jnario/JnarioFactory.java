/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.JnarioPackage
 * @generated
 */
public interface JnarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JnarioFactory eINSTANCE = org.jnario.impl.JnarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Example Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Table</em>'.
	 * @generated
	 */
	ExampleTable createExampleTable();

	/**
	 * Returns a new object of class '<em>Example Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Row</em>'.
	 * @generated
	 */
	ExampleRow createExampleRow();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	Assertion createAssertion();

	/**
	 * Returns a new object of class '<em>Example Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Column</em>'.
	 * @generated
	 */
	ExampleColumn createExampleColumn();

	/**
	 * Returns a new object of class '<em>Should</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Should</em>'.
	 * @generated
	 */
	Should createShould();

	/**
	 * Returns a new object of class '<em>Should Throw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Should Throw</em>'.
	 * @generated
	 */
	ShouldThrow createShouldThrow();

	/**
	 * Returns a new object of class '<em>Mock Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mock Literal</em>'.
	 * @generated
	 */
	MockLiteral createMockLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JnarioPackage getJnarioPackage();

} //JnarioFactory
