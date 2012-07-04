package org.jnario.jnario.test.util;

import org.jnario.spec.SpecInjectorProvider;
import org.jnario.spec.SpecStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExtendedSpecInjectorProvider extends SpecInjectorProvider {

	protected Injector internalCreateInjector() {
		return new SpecStandaloneSetup(){
			public Injector createInjector() {
				return Guice.createInjector(new org.jnario.spec.SpecRuntimeModule(){
					public void configure(com.google.inject.Binder binder) {
						super.configure(binder);
						binder.bind(BehaviorExecutor.class).to(SpecExecutor.class);
					};
					public ClassLoader bindClassLoaderToInstance() {
						return getClass().getClassLoader();
					};
				});
			}
			
			public Injector createInjectorAndDoEMFRegistration() {
				return super.createInjectorAndDoEMFRegistration();
			};
		}.createInjectorAndDoEMFRegistration();
	}
}
