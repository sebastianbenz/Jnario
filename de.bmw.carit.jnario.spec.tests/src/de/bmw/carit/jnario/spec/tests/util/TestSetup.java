package de.bmw.carit.jnario.spec.tests.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.carit.jnario.spec.SpecRuntimeModule;
import de.bmw.carit.jnario.spec.SpecStandaloneSetup;
import de.bmw.carit.jnario.spec.spec.SpecFactory;

public class TestSetup extends SpecStandaloneSetup {
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new SpecRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return SpecTestRunner.class.getClassLoader();
			}

			@SuppressWarnings("unused")
			public SpecFactory bindFactory() {
				return SpecFactory.eINSTANCE;
			}

		});
	}
}