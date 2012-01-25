/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package de.bmw.carit.jnario.spec;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.XtypeStandaloneSetup;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtend2.Xtend2StandaloneSetup;

import com.google.inject.Injector;

import de.bmw.carit.jnario.spec.spec.SpecPackage;

/**
 * @author Sebastian Benz
 */
@SuppressWarnings("restriction")
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		Xtend2StandaloneSetup.doSetup();
		XbaseStandaloneSetup.doSetup();
		XtypeStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(),XAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SpecPackage.eNS_URI, SpecPackage.eINSTANCE);
		super.register(injector);
	}
}

