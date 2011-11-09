
package de.bmw.carit.jnario.spec;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

