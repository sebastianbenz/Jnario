package org.jnario.runner;

import org.junit.Ignore;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

@SuppressWarnings("restriction")
public class StepRunner extends ExampleRunner {

	private Object scenario;

	public StepRunner(Class<?> testClass, FrameworkMethod method,
			NameProvider nameProvider, Object scenario) throws InitializationError, NoTestsRemainException {
		super(testClass, method, nameProvider, null);
		this.scenario = scenario;
	}
	
	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		Description description= describeChild(method);
		if (method.getAnnotation(Ignore.class) != null) {
			notifier.fireTestIgnored(description);
		} else {
			runLeaf(methodBlock(method), description, notifier);
		}
	}

	@Override
	protected Statement methodBlock(FrameworkMethod method) {
		Statement statement= methodInvoker(method, scenario);
		return statement;
	}
}
