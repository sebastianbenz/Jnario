package org.jnario.jnario.test.util;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.jnario.runner.TestInstantiator;

import com.google.inject.Injector;

public abstract class SpecificationInstantiator implements TestInstantiator{

	protected Injector injector;

	public Object createTest(Class<?> klass) throws Exception {
		return injector.getInstance(klass);
	}

	public void beforeTestRun() {
		injector = getInjectorProvider().getInjector();
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).setupRegistry();
		}
	}

	public void afterTestRun() {
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).restoreRegistry();
		}
	}

	protected abstract IInjectorProvider getInjectorProvider();

}