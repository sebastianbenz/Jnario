/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.impl.XtendFieldImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.JnarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.impl.ExampleColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.jnario.impl.ExampleColumnImpl#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleColumnImpl extends XtendFieldImpl implements ExampleColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.EXAMPLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTable getTable() {
		if (eContainerFeatureID() != JnarioPackage.EXAMPLE_COLUMN__TABLE) return null;
		return (ExampleTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(ExampleTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, JnarioPackage.EXAMPLE_COLUMN__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(ExampleTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != JnarioPackage.EXAMPLE_COLUMN__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, JnarioPackage.EXAMPLE_TABLE__COLUMNS, ExampleTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.EXAMPLE_COLUMN__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<XExpression> getCells() {
		EList<XExpression>	cells = new EObjectResolvingEList<XExpression>(XExpression.class, this, JnarioPackage.EXAMPLE_COLUMN__CELLS);
		int columnIndex = getTable().getColumns().indexOf(this);
		for (ExampleRow row : getTable().getRows()) {
			if(row.getCells().size() > columnIndex){
				cells.add(row.getCells().get(columnIndex));
			}
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((ExampleTable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				return basicSetTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				return eInternalContainer().eInverseRemove(this, JnarioPackage.EXAMPLE_TABLE__COLUMNS, ExampleTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				return getTable();
			case JnarioPackage.EXAMPLE_COLUMN__CELLS:
				return getCells();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				setTable((ExampleTable)newValue);
				return;
			case JnarioPackage.EXAMPLE_COLUMN__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends XExpression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				setTable((ExampleTable)null);
				return;
			case JnarioPackage.EXAMPLE_COLUMN__CELLS:
				getCells().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JnarioPackage.EXAMPLE_COLUMN__TABLE:
				return getTable() != null;
			case JnarioPackage.EXAMPLE_COLUMN__CELLS:
				return !getCells().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleColumnImpl
