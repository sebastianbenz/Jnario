package org.jnario.feature.ui.internal;

import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.jnario.ui.JnarioSharedState;

import com.google.inject.Module;

public class FeatureActivatorImpl extends FeatureActivator {
	
	@Override
	protected Module getSharedStateModule() {
		return Modules2.mixin(new SharedStateModule(), new JnarioSharedState());
	}
	
}
