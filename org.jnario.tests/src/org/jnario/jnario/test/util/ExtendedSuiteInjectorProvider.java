package org.jnario.jnario.test.util;

import org.jnario.suite.SuiteInjectorProvider;
import org.jnario.suite.SuiteRuntimeModule;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExtendedSuiteInjectorProvider extends SuiteInjectorProvider {

	protected Injector internalCreateInjector() {
		return new SuiteStandaloneSetup(){
			public Injector createInjector() {
				return Guice.createInjector(new SuiteRuntimeModule(){
					public ClassLoader bindClassLoaderToInstance() {
						return getClass().getClassLoader();
					};
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}
