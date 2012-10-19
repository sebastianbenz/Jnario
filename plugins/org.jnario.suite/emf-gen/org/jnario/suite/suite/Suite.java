/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.suite;

import org.eclipse.emf.common.util.EList;
import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.suite.suite.Suite#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.suite.suite.SuitePackage#getSuite()
 * @model
 * @generated
 */
public interface Suite extends Specification
{
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.suite.suite.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.jnario.suite.suite.SuitePackage#getSuite_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getElements();

} // Suite
