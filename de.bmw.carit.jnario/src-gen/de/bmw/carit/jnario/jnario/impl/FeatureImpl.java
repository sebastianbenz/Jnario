/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario.impl;

import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Scenario;

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

import org.eclipse.xtext.xtend2.xtend2.XtendImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.jnario.impl.FeatureImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<XtendImport> imports;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected Background background;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return JnarioPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.FEATURE__PACKAGE_NAME, oldPackageName, packageName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.FEATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XtendImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<XtendImport>(XtendImport.class, this, JnarioPackage.FEATURE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.FEATURE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Background getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackground(Background newBackground, NotificationChain msgs)
  {
    Background oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JnarioPackage.FEATURE__BACKGROUND, oldBackground, newBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(Background newBackground)
  {
    if (newBackground != background)
    {
      NotificationChain msgs = null;
      if (background != null)
        msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.FEATURE__BACKGROUND, null, msgs);
      if (newBackground != null)
        msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JnarioPackage.FEATURE__BACKGROUND, null, msgs);
      msgs = basicSetBackground(newBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JnarioPackage.FEATURE__BACKGROUND, newBackground, newBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, JnarioPackage.FEATURE__SCENARIOS);
    }
    return scenarios;
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
      case JnarioPackage.FEATURE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case JnarioPackage.FEATURE__BACKGROUND:
        return basicSetBackground(null, msgs);
      case JnarioPackage.FEATURE__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case JnarioPackage.FEATURE__PACKAGE_NAME:
        return getPackageName();
      case JnarioPackage.FEATURE__NAME:
        return getName();
      case JnarioPackage.FEATURE__IMPORTS:
        return getImports();
      case JnarioPackage.FEATURE__DESCRIPTION:
        return getDescription();
      case JnarioPackage.FEATURE__BACKGROUND:
        return getBackground();
      case JnarioPackage.FEATURE__SCENARIOS:
        return getScenarios();
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
      case JnarioPackage.FEATURE__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case JnarioPackage.FEATURE__NAME:
        setName((String)newValue);
        return;
      case JnarioPackage.FEATURE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends XtendImport>)newValue);
        return;
      case JnarioPackage.FEATURE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JnarioPackage.FEATURE__BACKGROUND:
        setBackground((Background)newValue);
        return;
      case JnarioPackage.FEATURE__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case JnarioPackage.FEATURE__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case JnarioPackage.FEATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JnarioPackage.FEATURE__IMPORTS:
        getImports().clear();
        return;
      case JnarioPackage.FEATURE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JnarioPackage.FEATURE__BACKGROUND:
        setBackground((Background)null);
        return;
      case JnarioPackage.FEATURE__SCENARIOS:
        getScenarios().clear();
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
      case JnarioPackage.FEATURE__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case JnarioPackage.FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JnarioPackage.FEATURE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case JnarioPackage.FEATURE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JnarioPackage.FEATURE__BACKGROUND:
        return background != null;
      case JnarioPackage.FEATURE__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
