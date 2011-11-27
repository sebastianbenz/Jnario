package de.bmw.carit.jnario.runner;

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;

import java.util.List;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;


public class ExampleGroupRunner extends ParentRunner<Runner> {

	private NameProvider nameProvider;
	private List<Runner> children;
	
	public ExampleGroupRunner(Class<?> testClass) throws InitializationError {
		this(testClass, NameProvider.create());
	}

	public ExampleGroupRunner(Class<?> testClass, NameProvider nameProvider) throws InitializationError {
		super(testClass);
		this.nameProvider = nameProvider;
		
		Iterable<Runner> allExamples = concat(examples(), exampleGroups());
		this.children = newArrayList(Iterables.filter(allExamples, notNull()));
		if(children.isEmpty()){
			throw new InitializationError("No examples");
		}
	}

	@Override
	protected String getName() {
		return nameProvider.nameOf(getTestClass());
	}
	
	@Override
	protected List<Runner> getChildren() {
		return children;
	}

	private Iterable<? extends Runner> exampleGroups() {
		List<FrameworkMethod> annotatedMethods = getTestClass()
				.getAnnotatedMethods(Test.class);
		return transform(annotatedMethods,
				new Function<FrameworkMethod, Runner>() {

					@Override
					public Runner apply(FrameworkMethod from) {
						try {
							return createExampleRunner(from);
						} catch (InitializationError e) {
							return null;
						} catch (NoTestsRemainException e) {
							throw new Error(e); // should not happen
						}
					}


				});
	}
	
	
	protected ExampleRunner createExampleRunner(
			FrameworkMethod from) throws InitializationError,
			NoTestsRemainException {
		return new ExampleRunner(from, nameProvider, createTestInstantiator());
	}

	protected TestInstantiator createTestInstantiator() throws InitializationError {
		InstantiateWith annotation = targetClass().getAnnotation(InstantiateWith.class);
		try {
			if(annotation == null){
				return new DefaultTestInstantiator();
			}else{
				return annotation.value().newInstance();
			}
		} catch (Exception e) {
			throw new InitializationError(e);
		}
	}

	private Iterable<? extends Runner> examples() {
		return transform(allDeclaredClasses(),
				new Function<Class<?>, ExampleGroupRunner>() {

					@Override
					public ExampleGroupRunner apply(Class<?> declaredClass) {
						try {
							ExampleGroupRunner childRunner = new ExampleGroupRunner(declaredClass, nameProvider);
							if (childRunner.getChildren().isEmpty()) {
								return null;
							}
							return childRunner;
						} catch (InitializationError e) {
							return null;
						}
					}
				});
	}

	public List<Class<?>> allDeclaredClasses() {
		return asList(targetClass().getDeclaredClasses());
	}

	public Class<?> targetClass() {
		return getTestClass().getJavaClass();
	}

	@Override
	protected Description describeChild(Runner child) {
		return child.getDescription();
	}

	@Override
	protected void runChild(Runner child, RunNotifier notifier) {
		child.run(notifier);
	}

}
