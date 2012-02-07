package gameoflife;

import org.mockito.MockitoAnnotations;

import de.bmw.carit.jnario.runner.DefaultTestInstantiator;

public class MockitoInstantiator extends DefaultTestInstantiator {

	@Override
	public Object createTest(Class<?> klass) throws Exception {
		Object test = super.createTest(klass);
		MockitoAnnotations.initMocks(test);
		return test;
	}

}
