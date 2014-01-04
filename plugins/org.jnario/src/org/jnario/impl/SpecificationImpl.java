/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jnario.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.core.xtend.impl.XtendClassImplCustom;
import org.jnario.Executable;
import org.jnario.JnarioPackage;
import org.jnario.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */
public class SpecificationImpl extends XtendClassImplCustom implements Specification {
	private EList<Executable> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.SPECIFICATION;
	}
	
	public boolean isPending(){
		for (Executable child : getChildren()) {
			if(child.isPending()){
				return true;
			}
		}
		return false;
	}
	
	public EList<Executable> getChildren(){
		if(children == null){
			children = calculateChildren();
		}
		return children;
	}

	protected EList<Executable> calculateChildren() {
		return ECollections.emptyEList();
	}
	
} //SpecificationImpl
