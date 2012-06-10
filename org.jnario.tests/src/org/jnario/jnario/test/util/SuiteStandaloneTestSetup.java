package org.jnario.jnario.test.util;

import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.suite.SuiteRuntimeModule;
import org.jnario.suite.SuiteStandaloneSetup;
import org.jnario.suite.suite.SuiteFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SuiteStandaloneTestSetup extends SuiteStandaloneSetup{

	@Override
	public void register(Injector injector) {
		FeatureStandaloneSetup.doSetup();
		SpecStandaloneTestSetup.doSetup();
		super.register(injector);
	}
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new SuiteRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return SpecTestRunner.class.getClassLoader();
			}
			
			@SuppressWarnings("unused")
			public Class<? extends BehaviorExecutor> bindBehaviorExecutor() {
				return SuiteExecutor.class;
			}

			@SuppressWarnings("unused")
			public SuiteFactory bindFactory() {
				return SuiteFactory.eINSTANCE;
			}
			

		});
	}
}
