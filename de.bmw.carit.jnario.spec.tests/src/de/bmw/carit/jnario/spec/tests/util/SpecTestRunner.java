package de.bmw.carit.jnario.spec.tests.util;

import de.bmw.carit.jnario.common.test.util.BehaviorTestRunner;

public class SpecTestRunner extends BehaviorTestRunner {

	public SpecTestRunner(Class<?> klass) {
		super(klass);
	}

	private static final String MODEL_EXTENSION = "spec";

	protected void injectMembers(){
		new TestSetup().createInjectorAndDoEMFRegistration().injectMembers(this);
	}

	@Override
	protected String getModelExtension() {
		return MODEL_EXTENSION;
	}	
}
