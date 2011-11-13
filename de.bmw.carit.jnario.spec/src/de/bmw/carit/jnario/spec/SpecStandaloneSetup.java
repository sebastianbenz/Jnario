
package de.bmw.carit.jnario.spec;

import org.eclipse.xtext.xtend2.Xtend2StandaloneSetup;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecStandaloneSetup extends SpecStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

