/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec.impl;

import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.Member;
import de.bmw.carit.jnario.spec.spec.SpecPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleGroupImpl extends MemberImpl implements ExampleGroup
{
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
   * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetType()
   * @generated
   * @ordered
   */
  protected JvmDeclaredType targetType;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Member> elements;

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
  public JvmDeclaredType getTargetType()
  {
    if (targetType != null && targetType.eIsProxy())
    {
      InternalEObject oldTargetType = (InternalEObject)targetType;
      targetType = (JvmDeclaredType)eResolveProxy(oldTargetType);
      if (targetType != oldTargetType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, oldTargetType, targetType));
      }
    }
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmDeclaredType basicGetTargetType()
  {
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetType(JvmDeclaredType newTargetType)
  {
    JvmDeclaredType oldTargetType = targetType;
    targetType = newTargetType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_GROUP__TARGET_TYPE, oldTargetType, targetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Member>(Member.class, this, SpecPackage.EXAMPLE_GROUP__ELEMENTS);
    }
    return elements;
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
      case SpecPackage.EXAMPLE_GROUP__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
        return getPreamble();
      case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
        if (resolve) return getTargetType();
        return basicGetTargetType();
      case SpecPackage.EXAMPLE_GROUP__ELEMENTS:
        return getElements();
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
      case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
        setPreamble((String)newValue);
        return;
      case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
        setTargetType((JvmDeclaredType)newValue);
        return;
      case SpecPackage.EXAMPLE_GROUP__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Member>)newValue);
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
      case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
        setPreamble(PREAMBLE_EDEFAULT);
        return;
      case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
        setTargetType((JvmDeclaredType)null);
        return;
      case SpecPackage.EXAMPLE_GROUP__ELEMENTS:
        getElements().clear();
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
      case SpecPackage.EXAMPLE_GROUP__PREAMBLE:
        return PREAMBLE_EDEFAULT == null ? preamble != null : !PREAMBLE_EDEFAULT.equals(preamble);
      case SpecPackage.EXAMPLE_GROUP__TARGET_TYPE:
        return targetType != null;
      case SpecPackage.EXAMPLE_GROUP__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
