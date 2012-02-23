/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.feature.feature;

import de.bmw.carit.jnario.common.ExampleTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.bmw.carit.jnario.feature.feature.Scenario#getExamples <em>Examples</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.feature.feature.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.feature.feature.Scenario#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.bmw.carit.jnario.feature.feature.Scenario#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends XtendMember
{
	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.common.ExampleTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getScenario_Examples()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleTable> getExamples();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bmw.carit.jnario.feature.feature.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link de.bmw.carit.jnario.feature.feature.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getScenario_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xtend2.xtend2.XtendMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage#getScenario_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<XtendMember> getMembers();

} // Scenario
