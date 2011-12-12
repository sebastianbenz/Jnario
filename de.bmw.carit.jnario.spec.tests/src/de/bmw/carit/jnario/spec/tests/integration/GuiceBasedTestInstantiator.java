package de.bmw.carit.jnario.spec.tests.integration;


import com.google.inject.Guice;
import com.google.inject.util.Modules;

import de.bmw.carit.jnario.runner.TestInstantiator;

public class GuiceBasedTestInstantiator implements TestInstantiator{

	@Override
	public Object createTest(Class<?> klass) throws Exception {
		return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
	}

}
