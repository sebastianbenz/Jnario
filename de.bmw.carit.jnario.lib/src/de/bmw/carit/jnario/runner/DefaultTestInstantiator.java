package de.bmw.carit.jnario.runner;

import org.junit.runners.model.TestClass;

public class DefaultTestInstantiator implements TestInstantiator {

	@Override
	public Object createTest(TestClass klass) throws Exception {
		return klass.getOnlyConstructor().newInstance();
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
	}

}
