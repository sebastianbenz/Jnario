/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.feature.feature.util;

import de.bmw.carit.jnario.feature.feature.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.feature.feature.FeaturePackage
 * @generated
 */
public class FeatureSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeaturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = FeaturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case FeaturePackage.FEATURE:
			{
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseXtendClass(feature);
				if (result == null) result = caseXtendAnnotationTarget(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.BACKGROUND:
			{
				Background background = (Background)theEObject;
				T result = caseBackground(background);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.SCENARIO:
			{
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseXtendMember(scenario);
				if (result == null) result = caseXtendAnnotationTarget(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.STEP:
			{
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseXtendMember(step);
				if (result == null) result = caseXtendAnnotationTarget(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.GIVEN:
			{
				Given given = (Given)theEObject;
				T result = caseGiven(given);
				if (result == null) result = caseStep(given);
				if (result == null) result = caseXtendMember(given);
				if (result == null) result = caseXtendAnnotationTarget(given);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.WHEN:
			{
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseStep(when);
				if (result == null) result = caseXtendMember(when);
				if (result == null) result = caseXtendAnnotationTarget(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.THEN:
			{
				Then then = (Then)theEObject;
				T result = caseThen(then);
				if (result == null) result = caseStep(then);
				if (result == null) result = caseXtendMember(then);
				if (result == null) result = caseXtendAnnotationTarget(then);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.AND:
			{
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseStep(and);
				if (result == null) result = caseXtendMember(and);
				if (result == null) result = caseXtendAnnotationTarget(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.STEP_EXPRESSION:
			{
				StepExpression stepExpression = (StepExpression)theEObject;
				T result = caseStepExpression(stepExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.FEATURE_FILE:
			{
				FeatureFile featureFile = (FeatureFile)theEObject;
				T result = caseFeatureFile(featureFile);
				if (result == null) result = caseXtendFile(featureFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.GIVEN_REFERENCE:
			{
				GivenReference givenReference = (GivenReference)theEObject;
				T result = caseGivenReference(givenReference);
				if (result == null) result = caseStepReference(givenReference);
				if (result == null) result = caseStep(givenReference);
				if (result == null) result = caseXtendMember(givenReference);
				if (result == null) result = caseXtendAnnotationTarget(givenReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.WHEN_REFERENCE:
			{
				WhenReference whenReference = (WhenReference)theEObject;
				T result = caseWhenReference(whenReference);
				if (result == null) result = caseStepReference(whenReference);
				if (result == null) result = caseStep(whenReference);
				if (result == null) result = caseXtendMember(whenReference);
				if (result == null) result = caseXtendAnnotationTarget(whenReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.THEN_REFERENCE:
			{
				ThenReference thenReference = (ThenReference)theEObject;
				T result = caseThenReference(thenReference);
				if (result == null) result = caseStepReference(thenReference);
				if (result == null) result = caseStep(thenReference);
				if (result == null) result = caseXtendMember(thenReference);
				if (result == null) result = caseXtendAnnotationTarget(thenReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.AND_REFERENCE:
			{
				AndReference andReference = (AndReference)theEObject;
				T result = caseAndReference(andReference);
				if (result == null) result = caseStepReference(andReference);
				if (result == null) result = caseStep(andReference);
				if (result == null) result = caseXtendMember(andReference);
				if (result == null) result = caseXtendAnnotationTarget(andReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.STEP_REFERENCE:
			{
				StepReference stepReference = (StepReference)theEObject;
				T result = caseStepReference(stepReference);
				if (result == null) result = caseStep(stepReference);
				if (result == null) result = caseXtendMember(stepReference);
				if (result == null) result = caseXtendAnnotationTarget(stepReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackground(Background object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGiven(Given object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThen(Then object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepExpression(StepExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureFile(FeatureFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenReference(GivenReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenReference(WhenReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenReference(ThenReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndReference(AndReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepReference(StepReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Annotation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendAnnotationTarget(XtendAnnotationTarget object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendClass(XtendClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendMember(XtendMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendFile(XtendFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //FeatureSwitch
