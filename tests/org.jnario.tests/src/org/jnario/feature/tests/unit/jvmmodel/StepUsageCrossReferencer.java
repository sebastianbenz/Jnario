package org.jnario.feature.tests.unit.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer;

@SuppressWarnings({ "serial", "restriction" })
public class StepUsageCrossReferencer extends XbaseUsageCrossReferencer {

	protected StepUsageCrossReferencer(EObject eObject) {
		super(eObject);
	}

	@Override
	protected void add(InternalEObject eObject, EReference eReference,
			EObject crossReferencedEObject) {
		super.add(eObject, eReference, crossReferencedEObject);
	}
}
