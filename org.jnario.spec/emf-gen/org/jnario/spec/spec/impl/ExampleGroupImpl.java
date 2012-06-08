/**
 * Copyright (c) 2012 BMW Car IT and others. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.jnario.spec.spec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtend.core.xtend.XtendAnnotationTarget;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendPackage;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.jnario.impl.SpecificationImpl;

import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getAnnotationInfo <em>Annotation Info</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleGroupImpl extends SpecificationImpl implements ExampleGroup
{
	/**
	 * The cached value of the '{@link #getAnnotationInfo() <em>Annotation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInfo()
	 * @generated
	 * @ordered
	 */
	protected XtendAnnotationTarget annotationInfo;

	/**
	 * The default value of the '{@link #getPreamble() <em>Preamble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreamble()
	 * @generated
	 * @ordered
	 */
	protected static final String PREAMBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreamble() <em>Preamble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreamble()
	 * @generated
	 * @ordered
	 */
	protected String preamble = PREAMBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference targetType;

	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation targetOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleGroupImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SpecPackage.Literals.EXAMPLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtendAnnotationTarget getAnnotationInfo()
	{
		return annotationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationInfo(XtendAnnotationTarget newAnnotationInfo, NotificationChain msgs)
	{
		XtendAnnotationTarget oldAnnotationInfo = annotationInfo;
		annotationInfo = newAnnotationInfo;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO, oldAnnotationInfo, newAnnotationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationInfo(XtendAnnotationTarget newAnnotationInfo)
	{
		if (newAnnotationInfo != annotationInfo)
		{
			NotificationChain msgs = null;
			if (annotationInfo != null)
				msgs = ((InternalEObject)annotationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO, null, msgs);
			if (newAnnotationInfo != null)
				msgs = ((InternalEObject)newAnnotationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO, null, msgs);
			msgs = basicSetAnnotationInfo(newAnnotationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO, newAnnotationInfo, newAnnotationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreamble()
	{
		return preamble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreamble(String newPreamble)
	{
		String oldPreamble = preamble;
		preamble = newPreamble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__PREAMBLE, oldPreamble, preamble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getTargetType()
	{
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetType(JvmTypeReference newTargetType, NotificationChain msgs)
	{
		JvmTypeReference oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, oldTargetType, newTargetType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(JvmTypeReference newTargetType)
	{
		if (newTargetType != targetType)
		{
			NotificationChain msgs = null;
			if (targetType != null)
				msgs = ((InternalEObject)targetType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, null, msgs);
			if (newTargetType != null)
				msgs = ((InternalEObject)newTargetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, null, msgs);
			msgs = basicSetTargetType(newTargetType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, newTargetType, newTargetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getTargetOperation()
	{
		if (targetOperation != null && targetOperation.eIsProxy())
		{
			InternalEObject oldTargetOperation = (InternalEObject)targetOperation;
			targetOperation = (JvmOperation)eResolveProxy(oldTargetOperation);
			if (targetOperation != oldTargetOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION, oldTargetOperation, targetOperation));
			}
		}
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetTargetOperation()
	{
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperation(JvmOperation newTargetOperation)
	{
		JvmOperation oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO:
				return basicSetAnnotationInfo(null, msgs);
			case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
				return basicSetTargetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO:
				return getAnnotationInfo();
			case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
				return getPreamble();
			case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
				return getTargetType();
			case SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION:
				if (resolve) return getTargetOperation();
				return basicGetTargetOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO:
				setAnnotationInfo((XtendAnnotationTarget)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
				setPreamble((String)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
				setTargetType((JvmTypeReference)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION:
				setTargetOperation((JvmOperation)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO:
				setAnnotationInfo((XtendAnnotationTarget)null);
				return;
			case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
				setPreamble(PREAMBLE_EDEFAULT);
				return;
			case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
				setTargetType((JvmTypeReference)null);
				return;
			case SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION:
				setTargetOperation((JvmOperation)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO:
				return annotationInfo != null;
			case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
				return PREAMBLE_EDEFAULT == null ? preamble != null : !PREAMBLE_EDEFAULT.equals(preamble);
			case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
				return targetType != null;
			case SpecPackage.EXAMPLE_GROUP__TARGET_OPERATION:
				return targetOperation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == XtendMember.class)
		{
			switch (derivedFeatureID)
			{
				case SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO: return XtendPackage.XTEND_MEMBER__ANNOTATION_INFO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == XtendMember.class)
		{
			switch (baseFeatureID)
			{
				case XtendPackage.XTEND_MEMBER__ANNOTATION_INFO: return SpecPackage.EXAMPLE_GROUP__ANNOTATION_INFO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (preamble: ");
		result.append(preamble);
		result.append(')');
		return result.toString();
	}

} //ExampleGroupImpl
