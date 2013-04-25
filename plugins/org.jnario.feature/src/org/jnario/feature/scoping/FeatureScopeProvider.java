/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.scoping.JnarioScopeProvider;

import com.google.common.base.Predicate;

public class FeatureScopeProvider extends JnarioScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == FeaturePackage.Literals.STEP_REFERENCE__REFERENCE){
			return completeStepReference(context, reference);
		}
		return super.getScope(context, reference);
	}

	private FilteringScope completeStepReference(final EObject context, EReference reference) {
		IScope scope = super.getScope(context, reference);
		return new FilteringScope(scope, new Predicate<IEObjectDescription>(){
			public boolean apply(IEObjectDescription desc){
				System.out.println(context.eClass().getName());
				return true;
			}
		});
	}
}
