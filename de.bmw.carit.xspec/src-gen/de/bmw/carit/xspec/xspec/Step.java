/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.xspec.xspec;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.xspec.xspec.Step#getDesc <em>Desc</em>}</li>
 *   <li>{@link de.bmw.carit.xspec.xspec.Step#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.xspec.xspec.XspecPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see de.bmw.carit.xspec.xspec.XspecPackage#getStep_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link de.bmw.carit.xspec.xspec.Step#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(XBlockExpression)
   * @see de.bmw.carit.xspec.xspec.XspecPackage#getStep_Code()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getCode();

  /**
   * Sets the value of the '{@link de.bmw.carit.xspec.xspec.Step#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(XBlockExpression value);

} // Step
