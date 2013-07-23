package org.jnario.maven;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.jnario.feature.FeatureStandaloneSetupGenerated;
import org.jnario.feature.feature.FeaturePackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class FeatureMavenStandaloneSetup implements ISetup {

	private static Injector injector = null;

	public Injector createInjectorAndDoEMFRegistration() {
		if (injector != null)
			return injector;
		EPackage.Registry.INSTANCE.put(FeaturePackage.eINSTANCE.getNsURI(), FeaturePackage.eINSTANCE);
		injector = Guice.createInjector(new FeatureMavenModule());
		new FeatureStandaloneSetupGenerated().register(injector);
		return injector;
	}

}
