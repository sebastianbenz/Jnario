
package de.bmw.carit.jnario;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JnarioStandaloneSetup extends JnarioStandaloneSetupGenerated{

	public static void doSetup() {
		new JnarioStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

