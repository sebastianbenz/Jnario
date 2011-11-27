package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;

import com.google.common.base.Function;


/**
 * Use {@link ExampleGroupRunner} instead.
 */
@Deprecated
public class JnarioRunner extends BlockJUnit4ClassRunner {

	private final class RunnerWrapper implements
			TestInstantiator {
		@Override
		public Object createTest(TestClass klass) throws Exception {
			return JnarioRunner.super.createTest();
		}

		@Override
		public void beforeTestRun() {
		}

		@Override
		public void afterTestRun() {
		}
	}

	private TestInstantiator delegate;
	private Map<String, JnarioRunner> childRunners = newHashMap();
	
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
				JnarioRunner childRunner = new JnarioRunner(subClass);
				Description childDescription = childRunner.getDescription();
				for (Description methods : childDescription.getChildren()) {
					String methodName = methods.getMethodName();
					if(methodName != null){
						childRunners.put(methodName, childRunner);
					}
				}
				description.addChild(childDescription);
			} catch (InitializationError e) {
				e.printStackTrace();
				// not a test
			}
		}
		return description;
	}
	
	@Override
	protected List<FrameworkMethod> getChildren() {
		List<FrameworkMethod> result = super.getChildren();
//		for (JnarioRunner runner : childRunners.values()) {
//			result.addAll(runner.getChildren());
//		}
		return newArrayList(transform(result, new Function<FrameworkMethod, FrameworkMethod>(){

			@Override
			public FrameworkMethod apply(final FrameworkMethod from) {
				return new NamedFrameworkMethod(from.getMethod(), nameOf(from));
			}
		}));
	}
	
	@Override
	protected Object createTest() throws Exception {
		return delegate.createTest(getTestClass());
	}
	
	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		delegate.beforeTestRun();
		JnarioRunner childRunner = childRunners.get(method.getName());
		if(childRunner == null){
			super.runChild(method, notifier);
		}else{
			childRunner.runChild(method, notifier);
		}
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
