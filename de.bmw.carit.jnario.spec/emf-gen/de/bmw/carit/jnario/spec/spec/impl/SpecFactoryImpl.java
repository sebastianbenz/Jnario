/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec.impl;

import de.bmw.carit.jnario.spec.spec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecFactory init()
	{
		try
		{
			SpecFactory theSpecFactory = (SpecFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bmw.de/carit/jnario/spec/Spec"); 
			if (theSpecFactory != null)
			{
				return theSpecFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecFactoryImplCustom();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SpecPackage.SPEC_FILE: return createSpecFile();
			case SpecPackage.EXAMPLE_GROUP: return createExampleGroup();
			case SpecPackage.EXAMPLE: return createExample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFile createSpecFile()
	{
		SpecFileImplCustom specFile = new SpecFileImplCustom();
		return specFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleGroup createExampleGroup()
	{
		ExampleGroupImplCustom exampleGroup = new ExampleGroupImplCustom();
		return exampleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example createExample()
	{
		ExampleImplCustom example = new ExampleImplCustom();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecPackage getSpecPackage()
	{
		return (SpecPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecPackage getPackage()
	{
		return SpecPackage.eINSTANCE;
	}

} //SpecFactoryImpl
