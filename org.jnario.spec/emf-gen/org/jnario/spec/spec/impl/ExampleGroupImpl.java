/**
 * Copyright (c) 2012 BMW Car IT and others. All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.jnario.spec.spec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendPackage;

import org.eclipse.xtend.core.xtend.impl.XtendMemberImplCustom;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.jnario.Specification;

import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.jnario.spec.spec.impl.ExampleGroupImpl#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleGroupImpl extends XtendMemberImplCustom implements ExampleGroup
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference extends_;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeReference> implements_;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeReference> superTypes;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<XtendMember> members;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeParameter> typeParameters;

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
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract)
	{
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getExtends()
	{
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(JvmTypeReference newExtends, NotificationChain msgs)
	{
		JvmTypeReference oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(JvmTypeReference newExtends)
	{
		if (newExtends != extends_)
		{
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_GROUP__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeReference> getImplements()
	{
		if (implements_ == null)
		{
			implements_ = new EObjectContainmentEList<JvmTypeReference>(JvmTypeReference.class, this, SpecPackage.EXAMPLE_GROUP__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeReference> getSuperTypes()
	{
		if (superTypes == null)
		{
			superTypes = new EObjectResolvingEList<JvmTypeReference>(JvmTypeReference.class, this, SpecPackage.EXAMPLE_GROUP__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XtendMember> getMembers()
	{
		if (members == null)
		{
			members = new EObjectContainmentEList<XtendMember>(XtendMember.class, this, SpecPackage.EXAMPLE_GROUP__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeParameter> getTypeParameters()
	{
		if (typeParameters == null)
		{
			typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS);
		}
		return typeParameters;
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
	public String getPackageName()
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
	public String getSimpleName()
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
			case SpecPackage.EXAMPLE_GROUP__EXTENDS:
				return basicSetExtends(null, msgs);
			case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
			case SpecPackage.EXAMPLE_GROUP__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
			case SpecPackage.EXAMPLE_GROUP__NAME:
				return getName();
			case SpecPackage.EXAMPLE_GROUP__ABSTRACT:
				return isAbstract();
			case SpecPackage.EXAMPLE_GROUP__EXTENDS:
				return getExtends();
			case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS:
				return getImplements();
			case SpecPackage.EXAMPLE_GROUP__SUPER_TYPES:
				return getSuperTypes();
			case SpecPackage.EXAMPLE_GROUP__MEMBERS:
				return getMembers();
			case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS:
				return getTypeParameters();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_GROUP__NAME:
				setName((String)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__EXTENDS:
				setExtends((JvmTypeReference)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends JvmTypeReference>)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends JvmTypeReference>)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends XtendMember>)newValue);
				return;
			case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
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
			case SpecPackage.EXAMPLE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecPackage.EXAMPLE_GROUP__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SpecPackage.EXAMPLE_GROUP__EXTENDS:
				setExtends((JvmTypeReference)null);
				return;
			case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS:
				getImplements().clear();
				return;
			case SpecPackage.EXAMPLE_GROUP__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case SpecPackage.EXAMPLE_GROUP__MEMBERS:
				getMembers().clear();
				return;
			case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS:
				getTypeParameters().clear();
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
			case SpecPackage.EXAMPLE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecPackage.EXAMPLE_GROUP__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SpecPackage.EXAMPLE_GROUP__EXTENDS:
				return extends_ != null;
			case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case SpecPackage.EXAMPLE_GROUP__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
			case SpecPackage.EXAMPLE_GROUP__MEMBERS:
				return members != null && !members.isEmpty();
			case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
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
		if (baseClass == XtendClass.class)
		{
			switch (derivedFeatureID)
			{
				case SpecPackage.EXAMPLE_GROUP__NAME: return XtendPackage.XTEND_CLASS__NAME;
				case SpecPackage.EXAMPLE_GROUP__ABSTRACT: return XtendPackage.XTEND_CLASS__ABSTRACT;
				case SpecPackage.EXAMPLE_GROUP__EXTENDS: return XtendPackage.XTEND_CLASS__EXTENDS;
				case SpecPackage.EXAMPLE_GROUP__IMPLEMENTS: return XtendPackage.XTEND_CLASS__IMPLEMENTS;
				case SpecPackage.EXAMPLE_GROUP__SUPER_TYPES: return XtendPackage.XTEND_CLASS__SUPER_TYPES;
				case SpecPackage.EXAMPLE_GROUP__MEMBERS: return XtendPackage.XTEND_CLASS__MEMBERS;
				case SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS: return XtendPackage.XTEND_CLASS__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == Specification.class)
		{
			switch (derivedFeatureID)
			{
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
		if (baseClass == XtendClass.class)
		{
			switch (baseFeatureID)
			{
				case XtendPackage.XTEND_CLASS__NAME: return SpecPackage.EXAMPLE_GROUP__NAME;
				case XtendPackage.XTEND_CLASS__ABSTRACT: return SpecPackage.EXAMPLE_GROUP__ABSTRACT;
				case XtendPackage.XTEND_CLASS__EXTENDS: return SpecPackage.EXAMPLE_GROUP__EXTENDS;
				case XtendPackage.XTEND_CLASS__IMPLEMENTS: return SpecPackage.EXAMPLE_GROUP__IMPLEMENTS;
				case XtendPackage.XTEND_CLASS__SUPER_TYPES: return SpecPackage.EXAMPLE_GROUP__SUPER_TYPES;
				case XtendPackage.XTEND_CLASS__MEMBERS: return SpecPackage.EXAMPLE_GROUP__MEMBERS;
				case XtendPackage.XTEND_CLASS__TYPE_PARAMETERS: return SpecPackage.EXAMPLE_GROUP__TYPE_PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == Specification.class)
		{
			switch (baseFeatureID)
			{
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
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", preamble: ");
		result.append(preamble);
		result.append(')');
		return result.toString();
	}

} //ExampleGroupImpl
