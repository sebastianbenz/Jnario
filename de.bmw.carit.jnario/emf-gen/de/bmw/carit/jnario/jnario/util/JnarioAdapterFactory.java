/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario.util;

import de.bmw.carit.jnario.jnario.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.jnario.JnarioPackage
 * @generated
 */
public class JnarioAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JnarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = JnarioPackage.eINSTANCE;
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
	protected JnarioSwitch<Adapter> modelSwitch =
		new JnarioSwitch<Adapter>()
		{
			@Override
			public Adapter caseFeature(Feature object)
			{
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseBackground(Background object)
			{
				return createBackgroundAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object)
			{
				return createScenarioAdapter();
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
			public Adapter caseAnd(And object)
			{
				return createAndAdapter();
			}
			@Override
			public Adapter caseStepExpression(StepExpression object)
			{
				return createStepExpressionAdapter();
			}
			@Override
			public Adapter caseJnarioFile(JnarioFile object)
			{
				return createJnarioFileAdapter();
			}
			@Override
			public Adapter caseGivenReference(GivenReference object)
			{
				return createGivenReferenceAdapter();
			}
			@Override
			public Adapter caseWhenReference(WhenReference object)
			{
				return createWhenReferenceAdapter();
			}
			@Override
			public Adapter caseThenReference(ThenReference object)
			{
				return createThenReferenceAdapter();
			}
			@Override
			public Adapter caseAndReference(AndReference object)
			{
				return createAndReferenceAdapter();
			}
			@Override
			public Adapter caseStepReference(StepReference object)
			{
				return createStepReferenceAdapter();
			}
			@Override
			public Adapter caseXtendAnnotationTarget(XtendAnnotationTarget object)
			{
				return createXtendAnnotationTargetAdapter();
			}
			@Override
			public Adapter caseXtendClass(XtendClass object)
			{
				return createXtendClassAdapter();
			}
			@Override
			public Adapter caseXtendMember(XtendMember object)
			{
				return createXtendMemberAdapter();
			}
			@Override
			public Adapter caseXtendFile(XtendFile object)
			{
				return createXtendFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Background
	 * @generated
	 */
	public Adapter createBackgroundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Step
	 * @generated
	 */
	public Adapter createStepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Given
	 * @generated
	 */
	public Adapter createGivenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.When
	 * @generated
	 */
	public Adapter createWhenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.Then
	 * @generated
	 */
	public Adapter createThenAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.And
	 * @generated
	 */
	public Adapter createAndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.StepExpression <em>Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.StepExpression
	 * @generated
	 */
	public Adapter createStepExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.JnarioFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.JnarioFile
	 * @generated
	 */
	public Adapter createJnarioFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.GivenReference <em>Given Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.GivenReference
	 * @generated
	 */
	public Adapter createGivenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.WhenReference <em>When Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.WhenReference
	 * @generated
	 */
	public Adapter createWhenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.ThenReference <em>Then Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.ThenReference
	 * @generated
	 */
	public Adapter createThenReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.AndReference <em>And Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.AndReference
	 * @generated
	 */
	public Adapter createAndReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bmw.carit.jnario.jnario.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bmw.carit.jnario.jnario.StepReference
	 * @generated
	 */
	public Adapter createStepReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget <em>Xtend Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget
	 * @generated
	 */
	public Adapter createXtendAnnotationTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xtend2.xtend2.XtendClass <em>Xtend Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xtend2.xtend2.XtendClass
	 * @generated
	 */
	public Adapter createXtendClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xtend2.xtend2.XtendMember <em>Xtend Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xtend2.xtend2.XtendMember
	 * @generated
	 */
	public Adapter createXtendMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xtend2.xtend2.XtendFile <em>Xtend File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xtend2.xtend2.XtendFile
	 * @generated
	 */
	public Adapter createXtendFileAdapter()
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

} //JnarioAdapterFactory
