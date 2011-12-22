package de.bmw.carit.jnario.runner;

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

import java.util.Collections;
import java.util.Comparator;
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
		
		Iterable<Runner> allExamples = concat(collectExampleGroups(), collectExamples());
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
	
	protected NameProvider getNameProvider(){
		return nameProvider;
	}

	protected Iterable<? extends Runner> collectExamples() {
		List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Test.class);
		orderMethods(annotatedMethods);
		return createRunners(getTestClass().getJavaClass(), annotatedMethods);
	}

	protected Iterable<? extends Runner> createRunners(final Class<?> testClass,
			List<FrameworkMethod> annotatedMethods) {
		return transform(annotatedMethods,
				new Function<FrameworkMethod, Runner>() {

					@Override
					public Runner apply(FrameworkMethod from) {
						try {
							return createExampleRunner(testClass, from);
						} catch (InitializationError e) {
							return null;
						} catch (NoTestsRemainException e) {
							throw new Error(e); // should not happen
						}
					}
				});
	}

	protected void orderMethods(List<FrameworkMethod> annotatedMethods) {
		Collections.sort(annotatedMethods, new Comparator<FrameworkMethod>(){

			@Override
			public int compare(FrameworkMethod method1, FrameworkMethod method2) {
				Order o1 = method1.getAnnotation(Order.class);
				Order o2 = method2.getAnnotation(Order.class);
				if(o1 == null && o2 == null){
					return 0;
				}
				if(o1 != null && o2 == null){
					return -1;
				}
				if(o1 == null && o2 != null){
					return 1;
				}
				return o1.value() - o2.value();
			}
			
		});
	}
	
	protected ExampleRunner createExampleRunner(Class<?> testClass,
			FrameworkMethod from) throws InitializationError,
			NoTestsRemainException {
		return new ExampleRunner(testClass, from, nameProvider, createTestInstantiator());
	}

	protected TestInstantiator createTestInstantiator() throws InitializationError {
		InstantiateWith annotation = getInstantiateWithAnnotation();
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

	protected InstantiateWith getInstantiateWithAnnotation() {
		Class<?> klass = targetClass();
		InstantiateWith annotation = null;
		while(annotation == null && klass != null){
			 annotation = klass.getAnnotation(InstantiateWith.class);
			 klass = klass.getSuperclass();
		}
		return annotation;
	}

	protected Iterable<? extends Runner> collectExampleGroups() {
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
		List<Class<?>> declaredClasses = asList(targetClass().getDeclaredClasses());
		Iterable<? extends Class<?>> containedClasses = allContainedClasses();
		return newArrayList(concat(declaredClasses, containedClasses));
	}

	protected Iterable<? extends Class<?>> allContainedClasses() {
		Iterable<? extends Class<?>> containedClasses = emptyList();
		Contains contains = targetClass().getAnnotation(Contains.class);
		if(contains != null){
			containedClasses = asList(contains.value());
		}
		return containedClasses;
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
