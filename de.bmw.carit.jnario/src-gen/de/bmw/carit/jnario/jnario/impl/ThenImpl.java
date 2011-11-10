/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario.impl;

import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Then;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.ThenImpl#getAnd <em>And</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.ThenImpl#getAnd_code <em>And code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThenImpl extends StepImpl implements Then
{
  /**
   * The cached value of the '{@link #getAnd() <em>And</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd()
   * @generated
   * @ordered
   */
  protected EList<String> and;

  /**
   * The cached value of the '{@link #getAnd_code() <em>And code</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd_code()
   * @generated
   * @ordered
   */
  protected EList<Code> and_code;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThenImpl()
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
    return JnarioPackage.Literals.THEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAnd()
  {
    if (and == null)
    {
      and = new EDataTypeEList<String>(String.class, this, JnarioPackage.THEN__AND);
    }
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Code> getAnd_code()
  {
    if (and_code == null)
    {
      and_code = new EObjectContainmentEList<Code>(Code.class, this, JnarioPackage.THEN__AND_CODE);
    }
    return and_code;
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
      case JnarioPackage.THEN__AND_CODE:
        return ((InternalEList<?>)getAnd_code()).basicRemove(otherEnd, msgs);
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
      case JnarioPackage.THEN__AND:
        return getAnd();
      case JnarioPackage.THEN__AND_CODE:
        return getAnd_code();
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
      case JnarioPackage.THEN__AND:
        getAnd().clear();
        getAnd().addAll((Collection<? extends String>)newValue);
        return;
      case JnarioPackage.THEN__AND_CODE:
        getAnd_code().clear();
        getAnd_code().addAll((Collection<? extends Code>)newValue);
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
      case JnarioPackage.THEN__AND:
        getAnd().clear();
        return;
      case JnarioPackage.THEN__AND_CODE:
        getAnd_code().clear();
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
      case JnarioPackage.THEN__AND:
        return and != null && !and.isEmpty();
      case JnarioPackage.THEN__AND_CODE:
        return and_code != null && !and_code.isEmpty();
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
    result.append(" (and: ");
    result.append(and);
    result.append(')');
    return result.toString();
  }

} //ThenImpl
