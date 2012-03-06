/**
 */
package org.jnario.impl;

import org.eclipse.emf.ecore.EClass;

import org.jnario.JnarioPackage;
import org.jnario.SetLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SetLiteralImpl extends CollectionLiteralImpl implements SetLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.SET_LITERAL;
	}
	
	@Override
	public String operationName() {
		return "newHashSet";
	}

} //SetLiteralImpl
