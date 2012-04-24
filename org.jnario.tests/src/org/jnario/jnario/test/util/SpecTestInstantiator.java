/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.jnario.runner.TestInstantiator;

import com.google.inject.Injector;

public class SpecTestInstantiator implements TestInstantiator {
	protected GlobalStateMemento globalStateMemento;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new SpecStandaloneTestSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
		if (injector != null)
			new SpecStandaloneTestSetup().register(injector);
	}
	
	public Object createTest(Class<?> klass) throws Exception {
		return getInjector().getInstance(klass);
	}

	public void beforeTestRun() {
		setupRegistry();
	}

	public void afterTestRun() {
		restoreRegistry();
	}

}
