package de.bmw.carit.jnario.runner;

public interface TestInstantiator {

	Object createTest(Class<?> klass) throws Exception;
	void beforeTestRun();
	void afterTestRun();
}
