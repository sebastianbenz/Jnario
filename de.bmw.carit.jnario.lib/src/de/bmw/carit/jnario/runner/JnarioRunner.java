package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Function;

public class JnarioRunner extends BlockJUnit4ClassRunner {

	private final class RunnerWrapper implements
			TestInstantiator {
		@Override
		public Object createTest(Class<?> klass) throws Exception {
			return JnarioRunner.super.createTest();
		}

		@Override
		public void beforeTestRun() {
		}

		@Override
		public void afterTestRun() {
		}
	}

	private static final class NamedFrameworkMethod extends FrameworkMethod {
		
		private final String name;

		private NamedFrameworkMethod(Method method, String name) {
			super(method);
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}
	}

	private TestInstantiator delegate;
	
	public JnarioRunner(Class<?> klass) throws InitializationError {
		super(klass);
		initializeTestInstantiator(klass);
	}

	public void initializeTestInstantiator(Class<?> klass)
			throws InitializationError {
		InstantiateWith annotation = klass.getAnnotation(InstantiateWith.class);
		if(annotation == null){
			delegate = new RunnerWrapper();
		}else{
			try {
				delegate = annotation.value().newInstance();
			} catch (Exception e) {
				throw new InitializationError(e);
			}
		}
	}
	
	@Override
	public Description getDescription() {
		Description description = super.getDescription();
		Class<?>[] declaredClasses = getTestClass().getJavaClass().getDeclaredClasses();
		for (Class<?> subClass : declaredClasses) {
			try {
				description.addChild(new JnarioRunner(subClass).getDescription());
			} catch (InitializationError e) {
				// not a test
			}
		}
		return description;
	}
	
	@Override
	protected List<FrameworkMethod> getChildren() {
		return newArrayList(transform(super.getChildren(), new Function<FrameworkMethod, FrameworkMethod>(){

			@Override
			public FrameworkMethod apply(final FrameworkMethod from) {
				return new NamedFrameworkMethod(from.getMethod(), nameOf(from));
			}
		}));
	}
	
	@Override
	protected Object createTest() throws Exception {
		return delegate.createTest(getTestClass().getJavaClass());
	}
	
	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		delegate.beforeTestRun();
		super.runChild(method, notifier);
		delegate.afterTestRun();
	}
	
	@Override
	protected String getName() {
		return nameOf(getTestClass().getJavaClass());
	}
	
	protected String nameOf(FrameworkMethod method) {
		return nameOf(method.getAnnotation(Named.class), method.getName());
	}

	public String nameOf(Named named, String defaultName) {
		return named == null ? defaultName : named.value();
	}

	protected String nameOf(Class<?> klass) {
		return nameOf(klass.getAnnotation(Named.class), super.getName());
	}

}
