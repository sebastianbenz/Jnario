/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec.impl;

import de.bmw.carit.jnario.spec.spec.ExampleHeading;
import de.bmw.carit.jnario.spec.spec.ExampleRow;
import de.bmw.carit.jnario.spec.spec.ExampleTable;
import de.bmw.carit.jnario.spec.spec.SpecPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtend2.xtend2.impl.XtendMemberImplCustom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleTableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleTableImpl extends XtendMemberImplCustom implements ExampleTable
{
	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected ExampleHeading heading;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleRow> rows;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTableImpl()
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
		return SpecPackage.Literals.EXAMPLE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleHeading getHeading()
	{
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(ExampleHeading newHeading, NotificationChain msgs)
	{
		ExampleHeading oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_TABLE__HEADING, oldHeading, newHeading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(ExampleHeading newHeading)
	{
		if (newHeading != heading)
		{
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject)heading).eInverseRemove(this, SpecPackage.EXAMPLE_HEADING__TABLE, ExampleHeading.class, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject)newHeading).eInverseAdd(this, SpecPackage.EXAMPLE_HEADING__TABLE, ExampleHeading.class, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_TABLE__HEADING, newHeading, newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleRow> getRows()
	{
		if (rows == null)
		{
			rows = new EObjectContainmentWithInverseEList<ExampleRow>(ExampleRow.class, this, SpecPackage.EXAMPLE_TABLE__ROWS, SpecPackage.EXAMPLE_ROW__TABLE);
		}
		return rows;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				if (heading != null)
					msgs = ((InternalEObject)heading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.EXAMPLE_TABLE__HEADING, null, msgs);
				return basicSetHeading((ExampleHeading)otherEnd, msgs);
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				return basicSetHeading(null, msgs);
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				return getHeading();
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				return getRows();
			case SpecPackage.EXAMPLE_TABLE__NAME:
				return getName();
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
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				setHeading((ExampleHeading)newValue);
				return;
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends ExampleRow>)newValue);
				return;
			case SpecPackage.EXAMPLE_TABLE__NAME:
				setName((String)newValue);
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
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				setHeading((ExampleHeading)null);
				return;
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				getRows().clear();
				return;
			case SpecPackage.EXAMPLE_TABLE__NAME:
				setName(NAME_EDEFAULT);
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
			case SpecPackage.EXAMPLE_TABLE__HEADING:
				return heading != null;
			case SpecPackage.EXAMPLE_TABLE__ROWS:
				return rows != null && !rows.isEmpty();
			case SpecPackage.EXAMPLE_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExampleTableImpl
