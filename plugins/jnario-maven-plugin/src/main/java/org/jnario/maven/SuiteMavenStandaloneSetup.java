package org.jnario.maven;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.jnario.suite.SuiteStandaloneSetupGenerated;
import org.jnario.suite.suite.SuitePackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SuiteMavenStandaloneSetup implements ISetup {

	private static Injector injector = null;

	public Injector createInjectorAndDoEMFRegistration() {
		if (injector != null)
			return injector;
		EPackage.Registry.INSTANCE.put(SuitePackage.eINSTANCE.getNsURI(), SuitePackage.eINSTANCE);
		injector = Guice.createInjector(new SuiteMavenModule());
		new SuiteStandaloneSetupGenerated().register(injector);
		return injector;
	}

}
