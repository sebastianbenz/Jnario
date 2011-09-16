/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec.impl;

import de.bmw.carit.xspec.xspec.*;

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
public class XspecFactoryImpl extends EFactoryImpl implements XspecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XspecFactory init()
  {
    try
    {
      XspecFactory theXspecFactory = (XspecFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bmw.carit.de/xspec/XSpec"); 
      if (theXspecFactory != null)
      {
        return theXspecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XspecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XspecFactoryImpl()
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
      case XspecPackage.XSPEC: return createXSpec();
      case XspecPackage.SENTENCE: return createSentence();
      case XspecPackage.STEP: return createStep();
      case XspecPackage.GIVEN: return createGiven();
      case XspecPackage.WHEN: return createWhen();
      case XspecPackage.THEN: return createThen();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSpec createXSpec()
  {
    XSpecImpl xSpec = new XSpecImpl();
    return xSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sentence createSentence()
  {
    SentenceImpl sentence = new SentenceImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Given createGiven()
  {
    GivenImpl given = new GivenImpl();
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Then createThen()
  {
    ThenImpl then = new ThenImpl();
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XspecPackage getXspecPackage()
  {
    return (XspecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XspecPackage getPackage()
  {
    return XspecPackage.eINSTANCE;
  }

} //XspecFactoryImpl
