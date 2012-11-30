package org.jnario.feature.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.jnario.util.SourceAdapter;

import com.google.inject.Inject;

@SuppressWarnings("serial")
public class ExpressionCopier{
	
	private class Implementation extends Copier{
		public Implementation() {
			super(true);
		}
		
		@Override
		public EObject copy(EObject source) {
			EObject target = super.copy(source);
			modelAssociator.associate(source, target);
			if (source instanceof XAbstractFeatureCall) {
				XAbstractFeatureCall sourceFeatureCall = (XAbstractFeatureCall) source;
				((XAbstractFeatureCall) source).getFeature();
				XAbstractFeatureCall targetFeatureCall = (XAbstractFeatureCall) target;
				targetFeatureCall.setImplicitFirstArgument((XExpression) copy(sourceFeatureCall.getImplicitFirstArgument()));
				targetFeatureCall.setImplicitReceiver((XExpression) copy(sourceFeatureCall.getImplicitReceiver()));
			}
			if(source instanceof XExpression){
				SourceAdapter.adapt(target, source);
			}
			if(source instanceof XtendField){
				SourceAdapter.adapt(target, source);
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
