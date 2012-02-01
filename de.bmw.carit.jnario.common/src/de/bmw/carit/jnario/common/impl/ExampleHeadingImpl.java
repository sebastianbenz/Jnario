/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.bmw.carit.jnario.common.impl;

import de.bmw.carit.jnario.common.CommonPackage;
import de.bmw.carit.jnario.common.ExampleHeading;
import de.bmw.carit.jnario.common.ExampleTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtend2.xtend2.XtendField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.common.impl.ExampleHeadingImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.common.impl.ExampleHeadingImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleHeadingImpl extends EObjectImpl implements ExampleHeading {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<XtendField> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleHeadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EXAMPLE_HEADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XtendField> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<XtendField>(XtendField.class, this, CommonPackage.EXAMPLE_HEADING__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTable getTable() {
		if (eContainerFeatureID() != CommonPackage.EXAMPLE_HEADING__TABLE) return null;
		return (ExampleTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(ExampleTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, CommonPackage.EXAMPLE_HEADING__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(ExampleTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != CommonPackage.EXAMPLE_HEADING__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, CommonPackage.EXAMPLE_TABLE__HEADING, ExampleTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.EXAMPLE_HEADING__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.EXAMPLE_HEADING__TABLE:
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
			case CommonPackage.EXAMPLE_HEADING__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case CommonPackage.EXAMPLE_HEADING__TABLE:
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
			case CommonPackage.EXAMPLE_HEADING__TABLE:
				return eInternalContainer().eInverseRemove(this, CommonPackage.EXAMPLE_TABLE__HEADING, ExampleTable.class, msgs);
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
			case CommonPackage.EXAMPLE_HEADING__PARTS:
				return getParts();
			case CommonPackage.EXAMPLE_HEADING__TABLE:
				return getTable();
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
			case CommonPackage.EXAMPLE_HEADING__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends XtendField>)newValue);
				return;
			case CommonPackage.EXAMPLE_HEADING__TABLE:
				setTable((ExampleTable)newValue);
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
			case CommonPackage.EXAMPLE_HEADING__PARTS:
				getParts().clear();
				return;
			case CommonPackage.EXAMPLE_HEADING__TABLE:
				setTable((ExampleTable)null);
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
			case CommonPackage.EXAMPLE_HEADING__PARTS:
				return parts != null && !parts.isEmpty();
			case CommonPackage.EXAMPLE_HEADING__TABLE:
				return getTable() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleHeadingImpl
