/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec.impl;

import de.bmw.carit.xspec.xspec.Sentence;
import de.bmw.carit.xspec.xspec.XSpec;
import de.bmw.carit.xspec.xspec.XspecPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSpec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.xspec.xspec.impl.XSpecImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link de.bmw.carit.xspec.xspec.impl.XSpecImpl#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XSpecImpl extends MinimalEObjectImpl.Container implements XSpec
{
  /**
   * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleName()
   * @generated
   * @ordered
   */
  protected static final String MODULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleName()
   * @generated
   * @ordered
   */
  protected String moduleName = MODULE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecs() <em>Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecs()
   * @generated
   * @ordered
   */
  protected EList<Sentence> specs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XSpecImpl()
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
    return XspecPackage.Literals.XSPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModuleName()
  {
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModuleName(String newModuleName)
  {
    String oldModuleName = moduleName;
    moduleName = newModuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XspecPackage.XSPEC__MODULE_NAME, oldModuleName, moduleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sentence> getSpecs()
  {
    if (specs == null)
    {
      specs = new EObjectContainmentEList<Sentence>(Sentence.class, this, XspecPackage.XSPEC__SPECS);
    }
    return specs;
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
      case XspecPackage.XSPEC__SPECS:
        return ((InternalEList<?>)getSpecs()).basicRemove(otherEnd, msgs);
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
      case XspecPackage.XSPEC__MODULE_NAME:
        return getModuleName();
      case XspecPackage.XSPEC__SPECS:
        return getSpecs();
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
      case XspecPackage.XSPEC__MODULE_NAME:
        setModuleName((String)newValue);
        return;
      case XspecPackage.XSPEC__SPECS:
        getSpecs().clear();
        getSpecs().addAll((Collection<? extends Sentence>)newValue);
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
      case XspecPackage.XSPEC__MODULE_NAME:
        setModuleName(MODULE_NAME_EDEFAULT);
        return;
      case XspecPackage.XSPEC__SPECS:
        getSpecs().clear();
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
      case XspecPackage.XSPEC__MODULE_NAME:
        return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
      case XspecPackage.XSPEC__SPECS:
        return specs != null && !specs.isEmpty();
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
    result.append(" (moduleName: ");
    result.append(moduleName);
    result.append(')');
    return result.toString();
  }

} //XSpecImpl
