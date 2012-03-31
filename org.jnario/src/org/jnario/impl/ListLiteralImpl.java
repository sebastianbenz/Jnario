/**
 */
package org.jnario.impl;

import org.eclipse.emf.ecore.EClass;
import org.jnario.JnarioPackage;
import org.jnario.ListLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ListLiteralImpl extends CollectionLiteralImpl implements ListLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.LIST_LITERAL;
	}

	public String operationName() {
		return "newArrayList";
	}
	
	

} //ListLiteralImpl
