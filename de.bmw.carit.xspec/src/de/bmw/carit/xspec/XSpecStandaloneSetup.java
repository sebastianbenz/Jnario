
package de.bmw.carit.xspec;

import de.bmw.carit.xspec.XSpecStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XSpecStandaloneSetup extends XSpecStandaloneSetupGenerated{

	public static void doSetup() {
		new XSpecStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

