/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.feature;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtend2.Xtend2StandaloneSetup;

import com.google.inject.Injector;

import org.jnario.CommonPackage;
import org.jnario.feature.feature.FeaturePackage;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureStandaloneSetup extends FeatureStandaloneSetupGenerated{

	public static void doSetup() {
		new FeatureStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		Xtend2StandaloneSetup.doSetup();
		XbaseStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(),XAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, CommonPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(FeaturePackage.eNS_URI, FeaturePackage.eINSTANCE);
		super.register(injector);
	}
}

