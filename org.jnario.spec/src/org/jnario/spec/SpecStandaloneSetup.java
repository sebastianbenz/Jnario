/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.spec;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.core.XtendStandaloneSetup;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.XtypeStandaloneSetup;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.jnario.JnarioPackage;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Injector;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		XtendStandaloneSetup.doSetup();
		XbaseStandaloneSetup.doSetup();
		XtypeStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(),XAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(JnarioPackage.eNS_URI, JnarioPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SpecPackage.eNS_URI, SpecPackage.eINSTANCE);
		super.register(injector);
	}
}

