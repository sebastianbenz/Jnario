package de.bmw.carit.jnario.tests.util;

import de.bmw.carit.jnario.common.test.util.BehaviorTestRunner;

public class JnarioTestRunner extends BehaviorTestRunner {

	public JnarioTestRunner(Class<?> klass) {
		super(klass);
	}

	private static final String MODEL_EXTENSION = "jnario";

	protected void injectMembers(){
		new TestSetup().createInjectorAndDoEMFRegistration().injectMembers(this);
	}

	@Override
	protected String getModelExtension() {
		return MODEL_EXTENSION;
	}	
}