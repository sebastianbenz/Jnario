package org.jnario.feature.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;

import com.google.inject.Inject;

@SuppressWarnings("serial")
public class ExpressionCopier{
	
	private class Implementation extends Copier{
		public Implementation() {
			super(false);
		}
		
		@Override
		public EObject copy(EObject source) {
			EObject target = super.copy(source);
			modelAssociator.associate(source, target);
			if (source instanceof XAbstractFeatureCall) {
				XAbstractFeatureCall sourceFeatureCall = (XAbstractFeatureCall) source;
				XAbstractFeatureCall targetFeatureCall = (XAbstractFeatureCall) target;
				targetFeatureCall.setImplicitFirstArgument((XExpression) copy(sourceFeatureCall.getImplicitFirstArgument()));
				targetFeatureCall.setImplicitReceiver((XExpression) copy(sourceFeatureCall.getImplicitReceiver()));
			}
			return target;
		}
	}

	@Inject IJvmModelAssociator modelAssociator;
	
	public <T extends EObject> T cloneWithProxies(T original) {
		if (original == null)
			return original;
		
		Implementation copier = new Implementation();
		@SuppressWarnings("unchecked")
		T copy = (T) copier.copy(original);
		copier.copyReferences();
		return copy;
	}
	
}
