/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSpec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.xspec.xspec.XSpec#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link de.bmw.carit.xspec.xspec.XSpec#getSpecs <em>Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.xspec.xspec.XspecPackage#getXSpec()
 * @model
 * @generated
 */
public interface XSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Module Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Name</em>' attribute.
   * @see #setModuleName(String)
   * @see de.bmw.carit.xspec.xspec.XspecPackage#getXSpec_ModuleName()
   * @model
   * @generated
   */
  String getModuleName();

  /**
   * Sets the value of the '{@link de.bmw.carit.xspec.xspec.XSpec#getModuleName <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Name</em>' attribute.
   * @see #getModuleName()
   * @generated
   */
  void setModuleName(String value);

  /**
   * Returns the value of the '<em><b>Specs</b></em>' containment reference list.
   * The list contents are of type {@link de.bmw.carit.xspec.xspec.Sentence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specs</em>' containment reference list.
   * @see de.bmw.carit.xspec.xspec.XspecPackage#getXSpec_Specs()
   * @model containment="true"
   * @generated
   */
  EList<Sentence> getSpecs();

} // XSpec
