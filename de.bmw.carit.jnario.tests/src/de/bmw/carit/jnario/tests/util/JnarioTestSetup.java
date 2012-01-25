package de.bmw.carit.jnario.tests.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.carit.jnario.JnarioRuntimeModule;
import de.bmw.carit.jnario.JnarioStandaloneSetup;
import de.bmw.carit.jnario.common.test.util.BehaviorExecutor;
import de.bmw.carit.jnario.jnario.JnarioFactory;

public class JnarioTestSetup extends JnarioStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new JnarioRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return JnarioTestRunner.class.getClassLoader();
			}
			
			@SuppressWarnings("unused")
			public Class<? extends BehaviorExecutor> bindBehaviorExecutor() {
				return JnarioExecutor.class;
			}

			@SuppressWarnings("unused")
			public JnarioFactory bindFactory() {
				return JnarioFactory.eINSTANCE;
			}
		});
	}
	
}