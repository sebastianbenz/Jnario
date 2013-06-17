package org.jnario.feature.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.scoping.JnarioImportedNamespaceScopeProvider;

public class FeatureImportedNamespaceScopeProvider extends
		JnarioImportedNamespaceScopeProvider {
	
	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		if (reference == FeaturePackage.Literals.STEP_REFERENCE__REFERENCE || reference == FeaturePackage.Literals.STEP_REFERENCE__SYNTHETIC_STEP_REFERENCE) {
			IScope globalScope = getGlobalScope(context.eResource(), reference);
			return internalGetScope(globalScope, globalScope, context, reference);
		}else{
			return super.getScope(context, reference);
		}
	}
	
}
