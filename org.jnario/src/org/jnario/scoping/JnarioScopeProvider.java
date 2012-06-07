package org.jnario.scoping;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.scoping.XtendScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;

public class JnarioScopeProvider extends XtendScopeProvider {

	@Override
	protected IScope createFeatureCallScope(XAbstractFeatureCall call,
			EReference reference) {
		// removing this results in a validation error when using the "with" operator
		if (call instanceof XBinaryOperation) {
			call.getFeature(); 
		}
		return super.createFeatureCallScope(call, reference);
	}
}
