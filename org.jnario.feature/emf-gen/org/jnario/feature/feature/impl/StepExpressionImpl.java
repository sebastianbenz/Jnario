/**
 * <copyright>
 * </copyright>
 *

 */
package org.jnario.feature.feature.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.impl.StepExpressionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.jnario.feature.feature.impl.StepExpressionImpl#getBlockExpression <em>Block Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepExpressionImpl extends MinimalEObjectImpl.Container implements StepExpression
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<XAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getBlockExpression() <em>Block Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockExpression()
	 * @generated
	 * @ordered
	 */
	protected XBlockExpression blockExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepExpressionImpl()
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
		return FeaturePackage.Literals.STEP_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XAnnotation> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList<XAnnotation>(XAnnotation.class, this, FeaturePackage.STEP_EXPRESSION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBlockExpression getBlockExpression()
	{
		return blockExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockExpression(XBlockExpression newBlockExpression, NotificationChain msgs)
	{
		XBlockExpression oldBlockExpression = blockExpression;
		blockExpression = newBlockExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION, oldBlockExpression, newBlockExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockExpression(XBlockExpression newBlockExpression)
	{
		if (newBlockExpression != blockExpression)
		{
			NotificationChain msgs = null;
			if (blockExpression != null)
				msgs = ((InternalEObject)blockExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION, null, msgs);
			if (newBlockExpression != null)
				msgs = ((InternalEObject)newBlockExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION, null, msgs);
			msgs = basicSetBlockExpression(newBlockExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION, newBlockExpression, newBlockExpression));
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
			case FeaturePackage.STEP_EXPRESSION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION:
				return basicSetBlockExpression(null, msgs);
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
			case FeaturePackage.STEP_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
			case FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION:
				return getBlockExpression();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case FeaturePackage.STEP_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XAnnotation>)newValue);
				return;
			case FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION:
				setBlockExpression((XBlockExpression)newValue);
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
			case FeaturePackage.STEP_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION:
				setBlockExpression((XBlockExpression)null);
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
			case FeaturePackage.STEP_EXPRESSION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case FeaturePackage.STEP_EXPRESSION__BLOCK_EXPRESSION:
				return blockExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //StepExpressionImpl
