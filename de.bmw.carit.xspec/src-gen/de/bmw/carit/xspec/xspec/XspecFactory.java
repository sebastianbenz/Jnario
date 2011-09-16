/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.xspec.xspec.XspecPackage
 * @generated
 */
public interface XspecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XspecFactory eINSTANCE = de.bmw.carit.xspec.xspec.impl.XspecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XSpec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSpec</em>'.
   * @generated
   */
  XSpec createXSpec();

  /**
   * Returns a new object of class '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence</em>'.
   * @generated
   */
  Sentence createSentence();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>Given</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Given</em>'.
   * @generated
   */
  Given createGiven();

  /**
   * Returns a new object of class '<em>When</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When</em>'.
   * @generated
   */
  When createWhen();

  /**
   * Returns a new object of class '<em>Then</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then</em>'.
   * @generated
   */
  Then createThen();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XspecPackage getXspecPackage();

} //XspecFactory
