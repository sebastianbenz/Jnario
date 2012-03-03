/**
 */
package org.jnario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.impl.XBinaryOperationImpl;
import org.eclipse.xtext.xbase.impl.XBinaryOperationImplCustom;

import org.jnario.JnarioPackage;
import org.jnario.Should;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Should</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.impl.ShouldImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.jnario.impl.ShouldImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.jnario.impl.ShouldImpl#getPostfix <em>Postfix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class ShouldImpl extends XBinaryOperationImplCustom implements Should {
	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostfix() <em>Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfix()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostfix() <em>Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfix()
	 * @generated
	 * @ordered
	 */
	protected String postfix = POSTFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShouldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JnarioPackage.Literals.SHOULD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SHOULD__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SHOULD__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostfix() {
		return postfix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostfix(String newPostfix) {
		String oldPostfix = postfix;
		postfix = newPostfix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.SHOULD__POSTFIX, oldPostfix, postfix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JnarioPackage.SHOULD__NOT:
				return isNot();
			case JnarioPackage.SHOULD__PREFIX:
				return getPrefix();
			case JnarioPackage.SHOULD__POSTFIX:
				return getPostfix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JnarioPackage.SHOULD__NOT:
				setNot((Boolean)newValue);
				return;
			case JnarioPackage.SHOULD__PREFIX:
				setPrefix((String)newValue);
				return;
			case JnarioPackage.SHOULD__POSTFIX:
				setPostfix((String)newValue);
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
			case JnarioPackage.SHOULD__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case JnarioPackage.SHOULD__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case JnarioPackage.SHOULD__POSTFIX:
				setPostfix(POSTFIX_EDEFAULT);
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
			case JnarioPackage.SHOULD__NOT:
				return not != NOT_EDEFAULT;
			case JnarioPackage.SHOULD__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case JnarioPackage.SHOULD__POSTFIX:
				return POSTFIX_EDEFAULT == null ? postfix != null : !POSTFIX_EDEFAULT.equals(postfix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (not: ");
		result.append(not);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", postfix: ");
		result.append(postfix);
		result.append(')');
		return result.toString();
	}

} //ShouldImpl
