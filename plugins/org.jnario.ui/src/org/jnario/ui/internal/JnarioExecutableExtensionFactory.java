package org.jnario.ui.internal;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class JnarioExecutableExtensionFactory extends
		AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return JnarioActivator.getInstance().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return JnarioActivator.getInstance().getInjector();
	}

}
