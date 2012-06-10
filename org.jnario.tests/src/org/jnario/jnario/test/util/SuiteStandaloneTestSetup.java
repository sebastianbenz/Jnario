/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
