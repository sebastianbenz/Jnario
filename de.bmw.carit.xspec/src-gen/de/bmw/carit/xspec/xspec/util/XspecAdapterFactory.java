/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec.util;

import de.bmw.carit.xspec.xspec.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.xspec.xspec.XspecPackage
 * @generated
 */
public class XspecAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XspecPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XspecAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XspecPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XspecSwitch<Adapter> modelSwitch =
    new XspecSwitch<Adapter>()
    {
      @Override
      public Adapter caseXSpec(XSpec object)
      {
        return createXSpecAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseGiven(Given object)
      {
        return createGivenAdapter();
      }
      @Override
      public Adapter caseWhen(When object)
      {
        return createWhenAdapter();
      }
      @Override
      public Adapter caseThen(Then object)
      {
        return createThenAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.XSpec <em>XSpec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.XSpec
   * @generated
   */
  public Adapter createXSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.Given
   * @generated
   */
  public Adapter createGivenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.When
   * @generated
   */
  public Adapter createWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.bmw.carit.xspec.xspec.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.bmw.carit.xspec.xspec.Then
   * @generated
   */
  public Adapter createThenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XspecAdapterFactory
