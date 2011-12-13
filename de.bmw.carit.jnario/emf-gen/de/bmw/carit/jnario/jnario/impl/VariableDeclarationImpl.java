/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.jnario.impl;

import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.VariableDeclarationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.VariableDeclarationImpl#getVariableDec <em>Variable Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
{
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableDec() <em>Variable Dec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDec()
	 * @generated
	 * @ordered
	 */
	protected XExpression variableDec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl()
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
		return JnarioPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility()
	{
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility)
	{
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.VARIABLE_DECLARATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getVariableDec()
	{
		return variableDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDec(XExpression newVariableDec, NotificationChain msgs)
	{
		XExpression oldVariableDec = variableDec;
		variableDec = newVariableDec;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC, oldVariableDec, newVariableDec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDec(XExpression newVariableDec)
	{
		if (newVariableDec != variableDec)
		{
			NotificationChain msgs = null;
			if (variableDec != null)
				msgs = ((InternalEObject)variableDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC, null, msgs);
			if (newVariableDec != null)
				msgs = ((InternalEObject)newVariableDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC, null, msgs);
			msgs = basicSetVariableDec(newVariableDec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC, newVariableDec, newVariableDec));
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
			case JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC:
				return basicSetVariableDec(null, msgs);
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
			case JnarioPackage.VARIABLE_DECLARATION__VISIBILITY:
				return getVisibility();
			case JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC:
				return getVariableDec();
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
			case JnarioPackage.VARIABLE_DECLARATION__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC:
				setVariableDec((XExpression)newValue);
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
			case JnarioPackage.VARIABLE_DECLARATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC:
				setVariableDec((XExpression)null);
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
			case JnarioPackage.VARIABLE_DECLARATION__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case JnarioPackage.VARIABLE_DECLARATION__VARIABLE_DEC:
				return variableDec != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
