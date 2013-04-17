package org.jnario.spec.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Inject;

public class SpecBatchScopeProvider extends	XbaseWithAnnotationsBatchScopeProvider {

	@Inject SpecScopeProvider delegate;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION){
			return delegate.getScope(context, reference);
		}
		return super.getScope(context, reference);
	}
	
}
