/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.suite;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.jnario.JnarioPackage;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.suite.SuitePackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
@SuppressWarnings("restriction")
public class SuiteStandaloneSetup extends SuiteStandaloneSetupGenerated{

	public static void doSetup() {
		new SuiteStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		SpecStandaloneSetup.doSetup();
		FeatureStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(),XAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(JnarioPackage.eNS_URI, JnarioPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SuitePackage.eNS_URI, SuitePackage.eINSTANCE);
		super.register(injector);
	}
}

