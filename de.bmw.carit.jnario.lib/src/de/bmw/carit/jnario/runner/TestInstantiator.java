package de.bmw.carit.jnario.runner;

import org.junit.runners.model.TestClass;

public interface TestInstantiator {

	Object createTest(TestClass klass) throws Exception;
	
	void beforeTestRun();
	
	void afterTestRun();
	
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
	
}
