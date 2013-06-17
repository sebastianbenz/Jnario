package org.jnario.suite.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.jnario.scoping.JnarioImportedNamespaceScopeProvider;
import org.jnario.suite.suite.SuitePackage;

public class SuiteImportedNamespaceScopeProvider extends
		JnarioImportedNamespaceScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == SuitePackage.Literals.SPEC_REFERENCE__SPEC){
			IScope globalScope = getGlobalScope(context.eResource(), reference);
			return internalGetScope(globalScope, globalScope, context, reference);
		}else{
			return super.getScope(context, reference);
		}
	}
	
}
