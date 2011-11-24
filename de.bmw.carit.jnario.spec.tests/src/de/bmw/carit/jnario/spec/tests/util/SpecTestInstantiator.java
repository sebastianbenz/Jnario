package de.bmw.carit.jnario.spec.tests.util;

import de.bmw.carit.jnario.runner.TestInstantiator;
import de.bmw.carit.jnario.spec.SpecInjectorProvider;

public class SpecTestInstantiator implements TestInstantiator {

	private SpecInjectorProvider injectorProvider = new SpecInjectorProvider();
	
	@Override
	public Object createTest(Class<?> klass) throws Exception {
		injectorProvider.setupRegistry();
		return injectorProvider.getInjector().getInstance(klass);
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
		injectorProvider.restoreRegistry();
	}

}
