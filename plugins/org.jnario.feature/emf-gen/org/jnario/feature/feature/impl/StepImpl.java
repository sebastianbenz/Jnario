/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.impl.StepImpl#getStepExpression <em>Step Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends XtendFunctionImpl implements Step
{
	/**
	 * The cached value of the '{@link #getStepExpression() <em>Step Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepExpression()
	 * @generated
	 * @ordered
	 */
	protected StepExpression stepExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl()
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
		return FeaturePackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepExpression getStepExpression()
	{
		return stepExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepExpression(StepExpression newStepExpression, NotificationChain msgs)
	{
		StepExpression oldStepExpression = stepExpression;
		stepExpression = newStepExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__STEP_EXPRESSION, oldStepExpression, newStepExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepExpression(StepExpression newStepExpression)
	{
		if (newStepExpression != stepExpression)
		{
			NotificationChain msgs = null;
			if (stepExpression != null)
				msgs = ((InternalEObject)stepExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__STEP_EXPRESSION, null, msgs);
			if (newStepExpression != null)
				msgs = ((InternalEObject)newStepExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP__STEP_EXPRESSION, null, msgs);
			msgs = basicSetStepExpression(newStepExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP__STEP_EXPRESSION, newStepExpression, newStepExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPending()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case FeaturePackage.STEP__STEP_EXPRESSION:
				return basicSetStepExpression(null, msgs);
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
			case FeaturePackage.STEP__STEP_EXPRESSION:
				return getStepExpression();
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
			case FeaturePackage.STEP__STEP_EXPRESSION:
				setStepExpression((StepExpression)newValue);
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
			case FeaturePackage.STEP__STEP_EXPRESSION:
				setStepExpression((StepExpression)null);
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
			case FeaturePackage.STEP__STEP_EXPRESSION:
				return stepExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //StepImpl
