/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.spec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jnario.spec.spec.SpecPackage
 * @generated
 */
public interface SpecFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecFactory eINSTANCE = org.jnario.spec.spec.impl.SpecFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	SpecFile createSpecFile();

	/**
	 * Returns a new object of class '<em>Example Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Group</em>'.
	 * @generated
	 */
	ExampleGroup createExampleGroup();

	/**
	 * Returns a new object of class '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example</em>'.
	 * @generated
	 */
	Example createExample();

	/**
	 * Returns a new object of class '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Before</em>'.
	 * @generated
	 */
	Before createBefore();

	/**
	 * Returns a new object of class '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After</em>'.
	 * @generated
	 */
	After createAfter();

	/**
	 * Returns a new object of class '<em>Test Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Function</em>'.
	 * @generated
	 */
	TestFunction createTestFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecPackage getSpecPackage();

} //SpecFactory
