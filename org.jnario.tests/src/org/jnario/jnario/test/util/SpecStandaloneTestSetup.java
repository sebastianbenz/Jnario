/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecRuntimeModule;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.spec.spec.SpecFactory;

public class SpecStandaloneTestSetup extends SpecStandaloneSetup {
	
	@Override
	public void register(Injector injector) {
		FeatureStandaloneSetup.doSetup();
		super.register(injector);
	}
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new SpecRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return SpecTestRunner.class.getClassLoader();
			}
			
			@SuppressWarnings("unused")
			public Class<? extends BehaviorExecutor> bindBehaviorExecutor() {
				return SpecExecutor.class;
			}

			@SuppressWarnings("unused")
			public SpecFactory bindFactory() {
				return SpecFactory.eINSTANCE;
			}
			

		});
	}
}