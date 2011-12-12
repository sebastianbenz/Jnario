/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec.impl;

import de.bmw.carit.jnario.spec.spec.ExampleHeading;
import de.bmw.carit.jnario.spec.spec.ExampleTable;
import de.bmw.carit.jnario.spec.spec.SpecPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl#getTable <em>Table</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.spec.spec.impl.ExampleHeadingImpl#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleHeadingImpl extends MinimalEObjectImpl.Container implements ExampleHeading
{
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> values;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<XVariableDeclaration> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleHeadingImpl()
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
		return SpecPackage.Literals.EXAMPLE_HEADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleTable getTable()
	{
		if (eContainerFeatureID() != SpecPackage.EXAMPLE_HEADING__TABLE) return null;
		return (ExampleTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(ExampleTable newTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newTable, SpecPackage.EXAMPLE_HEADING__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(ExampleTable newTable)
	{
		if (newTable != eInternalContainer() || (eContainerFeatureID() != SpecPackage.EXAMPLE_HEADING__TABLE && newTable != null))
		{
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, SpecPackage.EXAMPLE_TABLE__HEADING, ExampleTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.EXAMPLE_HEADING__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XExpression> getValues()
	{
		if (values == null)
		{
			values = new EObjectResolvingEList<XExpression>(XExpression.class, this, SpecPackage.EXAMPLE_HEADING__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XVariableDeclaration> getCells()
	{
		if (cells == null)
		{
			cells = new EObjectContainmentEList<XVariableDeclaration>(XVariableDeclaration.class, this, SpecPackage.EXAMPLE_HEADING__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((ExampleTable)otherEnd, msgs);
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
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				return basicSetTable(null, msgs);
			case SpecPackage.EXAMPLE_HEADING__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				return eInternalContainer().eInverseRemove(this, SpecPackage.EXAMPLE_TABLE__HEADING, ExampleTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				return getTable();
			case SpecPackage.EXAMPLE_HEADING__VALUES:
				return getValues();
			case SpecPackage.EXAMPLE_HEADING__CELLS:
				return getCells();
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
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				setTable((ExampleTable)newValue);
				return;
			case SpecPackage.EXAMPLE_HEADING__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends XExpression>)newValue);
				return;
			case SpecPackage.EXAMPLE_HEADING__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends XVariableDeclaration>)newValue);
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
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				setTable((ExampleTable)null);
				return;
			case SpecPackage.EXAMPLE_HEADING__VALUES:
				getValues().clear();
				return;
			case SpecPackage.EXAMPLE_HEADING__CELLS:
				getCells().clear();
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
			case SpecPackage.EXAMPLE_HEADING__TABLE:
				return getTable() != null;
			case SpecPackage.EXAMPLE_HEADING__VALUES:
				return values != null && !values.isEmpty();
			case SpecPackage.EXAMPLE_HEADING__CELLS:
				return cells != null && !cells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleHeadingImpl
