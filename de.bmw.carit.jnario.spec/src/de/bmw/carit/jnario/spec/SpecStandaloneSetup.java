
package de.bmw.carit.jnario.spec;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtend2.Xtend2StandaloneSetup;

import com.google.inject.Injector;

import de.bmw.carit.jnario.spec.spec.SpecPackage;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		Xtend2StandaloneSetup.doSetup();
		XbaseStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(),XAnnotationsPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(SpecPackage.eNS_URI, SpecPackage.eINSTANCE);
		super.register(injector);
	}
}

