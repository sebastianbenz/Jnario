/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
