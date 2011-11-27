package de.bmw.carit.jnario.spec.tests.util;

import org.junit.runners.model.TestClass;

import de.bmw.carit.jnario.runner.TestInstantiator;
import de.bmw.carit.jnario.spec.SpecInjectorProvider;

public class SpecTestInstantiator implements TestInstantiator {

	private SpecInjectorProvider injectorProvider = new SpecInjectorProvider();
	
	@Override
	public Object createTest(TestClass klass) throws Exception {
		injectorProvider.setupRegistry();
		return injectorProvider.getInjector().getInstance(klass.getJavaClass());
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
		injectorProvider.restoreRegistry();
	}

}
