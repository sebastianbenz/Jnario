package org.jnario.suite.ui.internal;

import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.jnario.ui.JnarioSharedState;

import com.google.inject.Module;

public class SuiteActivatorImpl extends SuiteActivator {
	
	@Override
	protected Module getSharedStateModule() {
		return Modules2.mixin(new SharedStateModule(), new JnarioSharedState());
	}
	
}
