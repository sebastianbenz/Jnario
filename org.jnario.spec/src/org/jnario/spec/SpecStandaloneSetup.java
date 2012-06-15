/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.spec;

import org.eclipse.emf.ecore.EPackage;
import org.jnario.JnarioPackage;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Injector;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		EPackage.Registry.INSTANCE.put(JnarioPackage.eNS_URI, JnarioPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SpecPackage.eNS_URI, SpecPackage.eINSTANCE);
		return super.createInjectorAndDoEMFRegistration();
	}
}

