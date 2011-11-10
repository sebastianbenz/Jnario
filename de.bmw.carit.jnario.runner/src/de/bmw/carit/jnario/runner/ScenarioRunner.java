package de.bmw.carit.jnario.runner;

import org.junit.runners.model.InitializationError;

public class ScenarioRunner extends JnarioRunner {

	private Object test;
	
	public ScenarioRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected Object createTest() throws Exception {
		if(test == null){
			test = super.createTest();
		}
		return test;
	}
	
}
