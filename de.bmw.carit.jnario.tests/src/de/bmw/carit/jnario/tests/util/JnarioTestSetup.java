/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.tests.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.carit.jnario.JnarioRuntimeModule;
import de.bmw.carit.jnario.JnarioStandaloneSetup;
import de.bmw.carit.jnario.common.test.util.BehaviorExecutor;
import de.bmw.carit.jnario.jnario.JnarioFactory;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
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