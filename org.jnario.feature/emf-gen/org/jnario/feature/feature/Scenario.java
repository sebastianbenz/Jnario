/**
 * <copyright>
 * </copyright>
 *
 */
package org.jnario.feature.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;

import org.jnario.ExampleTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.feature.feature.Scenario#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.jnario.feature.feature.Scenario#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.feature.feature.FeaturePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends XtendClass
{
	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link org.jnario.ExampleTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see org.jnario.feature.feature.FeaturePackage#getScenario_Examples()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleTable> getExamples();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.core.xtend.XtendMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.jnario.feature.feature.FeaturePackage#getScenario_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<XtendMember> getSteps();

} // Scenario
