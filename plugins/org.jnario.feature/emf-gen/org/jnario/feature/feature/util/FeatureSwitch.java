/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.feature.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtend.core.xtend.XtendAnnotationTarget;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;

import org.jnario.Executable;
import org.jnario.Specification;

import org.jnario.feature.feature.*;

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
 * @see org.jnario.feature.feature.FeaturePackage
 * @generated
 */
public class FeatureSwitch<T>
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case FeaturePackage.FEATURE:
			{
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseSpecification(feature);
				if (result == null) result = caseXtendClass(feature);
				if (result == null) result = caseExecutable(feature);
				if (result == null) result = caseXtendAnnotationTarget(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.BACKGROUND:
			{
				Background background = (Background)theEObject;
				T result = caseBackground(background);
				if (result == null) result = caseScenario(background);
				if (result == null) result = caseXtendClass(background);
				if (result == null) result = caseExecutable(background);
				if (result == null) result = caseXtendAnnotationTarget(background);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.SCENARIO:
			{
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseXtendClass(scenario);
				if (result == null) result = caseExecutable(scenario);
				if (result == null) result = caseXtendAnnotationTarget(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.STEP:
			{
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseXtendFunction(step);
				if (result == null) result = caseExecutable(step);
				if (result == null) result = caseXtendMember(step);
				if (result == null) result = caseXtendAnnotationTarget(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.GIVEN:
			{
				Given given = (Given)theEObject;
				T result = caseGiven(given);
				if (result == null) result = caseStepImplementation(given);
				if (result == null) result = caseStep(given);
				if (result == null) result = caseXtendFunction(given);
				if (result == null) result = caseExecutable(given);
				if (result == null) result = caseXtendMember(given);
				if (result == null) result = caseXtendAnnotationTarget(given);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.WHEN:
			{
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseStepImplementation(when);
				if (result == null) result = caseStep(when);
				if (result == null) result = caseXtendFunction(when);
				if (result == null) result = caseExecutable(when);
				if (result == null) result = caseXtendMember(when);
				if (result == null) result = caseXtendAnnotationTarget(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.THEN:
			{
				Then then = (Then)theEObject;
				T result = caseThen(then);
				if (result == null) result = caseStepImplementation(then);
				if (result == null) result = caseStep(then);
				if (result == null) result = caseXtendFunction(then);
				if (result == null) result = caseExecutable(then);
				if (result == null) result = caseXtendMember(then);
				if (result == null) result = caseXtendAnnotationTarget(then);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.AND:
			{
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseStepImplementation(and);
				if (result == null) result = caseStep(and);
				if (result == null) result = caseXtendFunction(and);
				if (result == null) result = caseExecutable(and);
				if (result == null) result = caseXtendMember(and);
				if (result == null) result = caseXtendAnnotationTarget(and);
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
				if (result == null) result = caseXtendFunction(givenReference);
				if (result == null) result = caseExecutable(givenReference);
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
				if (result == null) result = caseXtendFunction(whenReference);
				if (result == null) result = caseExecutable(whenReference);
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
				if (result == null) result = caseXtendFunction(thenReference);
				if (result == null) result = caseExecutable(thenReference);
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
				if (result == null) result = caseXtendFunction(andReference);
				if (result == null) result = caseExecutable(andReference);
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
				if (result == null) result = caseXtendFunction(stepReference);
				if (result == null) result = caseExecutable(stepReference);
				if (result == null) result = caseXtendMember(stepReference);
				if (result == null) result = caseXtendAnnotationTarget(stepReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeaturePackage.STEP_IMPLEMENTATION:
			{
				StepImplementation stepImplementation = (StepImplementation)theEObject;
				T result = caseStepImplementation(stepImplementation);
				if (result == null) result = caseStep(stepImplementation);
				if (result == null) result = caseXtendFunction(stepImplementation);
				if (result == null) result = caseExecutable(stepImplementation);
				if (result == null) result = caseXtendMember(stepImplementation);
				if (result == null) result = caseXtendAnnotationTarget(stepImplementation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Step Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepImplementation(StepImplementation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendAnnotationTarget(XtendAnnotationTarget object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendClass(XtendClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutable(Executable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendMember(XtendMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendFunction(XtendFunction object)
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
	public T defaultCase(EObject object)
	{
		return null;
	}

} //FeatureSwitch
