package org.jnario.feature.feature.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepImplementation;

public class StepReferenceImplCustom extends StepReferenceImpl {

	/*
	 * (non-Javadoc)
	 * @see org.jnario.feature.feature.impl.StepReferenceImpl#getReference()
	 */
	public StepImplementation getReference()
	{
		if (reference != null && reference.eIsProxy())
		{
			InternalEObject oldReference = (InternalEObject)reference;
			EObject resolvedProxy = eResolveProxy(oldReference);
			// depending on the recent change history, the resolved proxy might not be a step implementation 
			
			if (resolvedProxy instanceof StepImplementation) {
				reference = (StepImplementation)resolvedProxy;
			}
			if (reference != oldReference)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.STEP_REFERENCE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}
}
