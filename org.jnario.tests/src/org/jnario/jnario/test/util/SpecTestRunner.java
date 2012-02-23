/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;


public class SpecTestRunner extends BehaviorTestRunner {

	public SpecTestRunner(Class<?> klass) {
		super(klass);
	}

	private static final String MODEL_EXTENSION = "spec";

	protected void injectMembers(){
		new SpecStandaloneTestSetup().createInjectorAndDoEMFRegistration().injectMembers(this);
	}

	@Override
	protected String getModelExtension() {
		return MODEL_EXTENSION;
	}	
}
