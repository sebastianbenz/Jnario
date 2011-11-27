package de.bmw.carit.jnario.spec.tests.integration;

import org.junit.runners.model.TestClass;

import com.google.inject.Guice;
import com.google.inject.util.Modules;

import de.bmw.carit.jnario.runner.TestInstantiator;

public class GuiceBasedTestInstantiator implements TestInstantiator{

	@Override
	public Object createTest(TestClass klass) throws Exception {
		return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass.getJavaClass());
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
	}

}
