package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.junit.runner.Description.createTestDescription;
import static org.junit.runner.manipulation.Filter.matchMethodDescription;

import java.util.List;

import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

import com.google.common.base.Function;


public class ExampleRunner extends BlockJUnit4ClassRunner {

	private final class MethodNameConverter implements Function<FrameworkMethod, FrameworkMethod> {
		@Override
		public FrameworkMethod apply(final FrameworkMethod from) {
			return new NamedFrameworkMethod(from.getMethod(), nameProvider.nameOf(from));
		}
	}
	
	private final NameProvider nameProvider;
	private final FrameworkMethod method;
	private TestInstantiator testBuilder;

	public ExampleRunner(final FrameworkMethod method, NameProvider nameProvider, TestInstantiator testBuilder)
			throws InitializationError, NoTestsRemainException {
		super(method.getMethod().getDeclaringClass());
		this.method = method;
		this.nameProvider = nameProvider;
		this.testBuilder = testBuilder;
		filter(matchMethodDescription(getDescription()));
	}
	
	@Override
	protected Object createTest() throws Exception {
		Object test = newInstanceOf(getTestClass().getJavaClass());
		initializeSubjects(getTestClass(), test);
		return test;
	}

	protected Object newInstanceOf(Class<?> testClass) throws Exception {
		return testBuilder.createTest(testClass);
	}


	protected void initializeSubjects(TestClass testClass, Object test) throws InitializationError {
		for (FrameworkField subjectField : testClass.getAnnotatedFields(Subject.class)) {
			try {
				Object value = newInstanceOf(subjectField.getField().getType());
				subjectField.getField().set(test, value);
			} catch (Exception e) {
				e.printStackTrace();
				throw new InitializationError(e);
			}
		}
	}
	
	protected Statement classBlock(final RunNotifier notifier) {
		return childrenInvoker(notifier);
	}

	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		testBuilder.beforeTestRun();
		super.runChild(method, notifier);
		testBuilder.afterTestRun();
	}
	
	private Class<?> targetClass() {
		return getTestClass().getJavaClass();
	}
	
	@Override
	protected List<FrameworkMethod> getChildren() {
		return newArrayList(transform(super.getChildren(), new MethodNameConverter()));
	}
	
	@Override
	public Description getDescription() {
		return createTestDescription(targetClass(), testName());
	}

	protected String testName() {
		return nameProvider.nameOf(method);
	}

}