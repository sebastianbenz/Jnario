package de.bmw.carit.jnario.runner;


public class DefaultTestInstantiator implements TestInstantiator {

	@Override
	public Object createTest(Class<?> klass) throws Exception {
		return klass.newInstance();
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
	}

}
