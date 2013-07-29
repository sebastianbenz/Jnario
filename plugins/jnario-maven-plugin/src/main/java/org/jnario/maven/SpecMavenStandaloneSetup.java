package org.jnario.maven;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.core.XtendStandaloneSetupGenerated;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend.maven.XtendMavenModule;
import org.eclipse.xtend.maven.XtendMavenStandaloneSetup;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetupGenerated;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SpecMavenStandaloneSetup implements ISetup {

	private static Injector injector = null;

	public Injector createInjectorAndDoEMFRegistration() {
		if (injector != null)
			return injector;
		EPackage.Registry.INSTANCE.put(SpecPackage.eINSTANCE.getNsURI(), SpecPackage.eINSTANCE);
		injector = Guice.createInjector(new SpecMavenModule());
		new SpecStandaloneSetupGenerated().register(injector);
		return injector;
	}

}
