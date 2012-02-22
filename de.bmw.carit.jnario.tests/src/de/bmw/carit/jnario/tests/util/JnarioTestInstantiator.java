/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;

import com.google.inject.Injector;

import de.bmw.carit.jnario.runner.TestInstantiator;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JnarioTestInstantiator implements TestInstantiator {
	protected GlobalStateMemento globalStateMemento;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new JnarioStandaloneTestSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
		if (injector != null)
			new JnarioStandaloneTestSetup().register(injector);
	}
	
	@Override
	public Object createTest(Class<?> klass) throws Exception {
		setupRegistry();
		return getInjector().getInstance(klass);
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
		restoreRegistry();
	}

}
