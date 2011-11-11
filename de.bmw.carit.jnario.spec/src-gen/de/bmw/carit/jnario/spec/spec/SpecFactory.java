/**
 * <copyright>
 * </copyright>
 *
 */
package de.bmw.carit.jnario.spec.spec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.spec.spec.SpecPackage
 * @generated
 */
public interface SpecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecFactory eINSTANCE = de.bmw.carit.jnario.spec.spec.impl.SpecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  SpecFile createSpecFile();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Example Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Example Group</em>'.
   * @generated
   */
  ExampleGroup createExampleGroup();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Example</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Example</em>'.
   * @generated
   */
  Example createExample();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpecPackage getSpecPackage();

} //SpecFactory
