package org.jnario.jnario.test.util;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.jnario.lib.AbstractSpecCreator;

import com.google.inject.Injector;

public abstract class JnarioTestCreator extends AbstractSpecCreator{

	protected Injector injector;

	public <T> T create(Class<T> klass){
		if(injector == null){
			beforeSpecRun();
		}
		return injector.getInstance(klass);
	}

	public void beforeSpecRun() {
		injector = getInjectorProvider().getInjector();
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).setupRegistry();
		}
	}

	public void afterSpecRun() {
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) getInjectorProvider()).restoreRegistry();
		}
	}

	protected abstract IInjectorProvider getInjectorProvider();

}