/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;


/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureTestRunner extends BehaviorTestRunner {

	public FeatureTestRunner(Class<?> klass) {
		super(klass);
	}

	private static final String MODEL_EXTENSION = "feature";

	protected void injectMembers(){
		new FeatureTestSetup().createInjectorAndDoEMFRegistration().injectMembers(this);
	}

	@Override
	protected String getModelExtension() {
		return MODEL_EXTENSION;
	}	
}