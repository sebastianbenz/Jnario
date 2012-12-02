/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow;
import static org.jnario.runner.ExtensionRule.createClassExtensionRule;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.runner.internal.ExampleGroupRunnerBuilder;
import org.jnario.runner.internal.ExtensionClass;
import org.jnario.runner.internal.RunAfters;
import org.jnario.runner.internal.RunBefores;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.ParentRunner;
import org.junit.runners.Suite;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * The Jnario spec {@link Runner} features full text descriptions for tests and
 * classes annotated with {@link Named}. It combines the functionality of a
 * {@link BlockJUnit4ClassRunner} with a {@link Suite} to enable nesting specs and facts.
 * Nested specs can be declared using the {@link Contains} annotation.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleGroupRunner extends ParentRunner<Runner> {

	private final class IsTestMethod implements Predicate<FrameworkMethod> {
		public boolean apply(FrameworkMethod input) {
			return input.getMethod().getDeclaringClass() == getTestClass()
					.getJavaClass();
		}
	}

	private final NameProvider nameProvider;
	private List<Runner> children;
	private List<ExtensionClass> extensions;
	private Set<Method> setups;

	public ExampleGroupRunner(Class<?> testClass) throws InitializationError {
		this(testClass, NameProvider.create(), new HashSet<Method>());
	}

	public ExampleGroupRunner(Class<?> testClass, NameProvider nameProvider, Set<Method> setups)
			throws InitializationError {
		super(testClass);
		this.nameProvider = nameProvider;
		this.setups = setups;
		setExtensions();
		setChildren();
	}

	private void setChildren() throws InitializationError {
		Iterable<Runner> allExamples = concat(collectExampleGroups(),
				collectExamples());
		this.children = newArrayList(Iterables.filter(allExamples, notNull()));
	}

	private void setExtensions() {
		TestClass testClass = getTestClass();
		List<FrameworkField> extensionFields = testClass.getAnnotatedFields(Extension.class);
		extensions = newArrayListWithExpectedSize(extensionFields.size());
		for (FrameworkField frameworkField : extensionFields) {
			extensions.add(new ExtensionClass(frameworkField));
		}
	}

	@Override
	protected String getName() {
		return nameProvider.nameOf(getTestClass().getJavaClass());
	}

	@Override
	protected List<Runner> getChildren() {
		return children;
	}

	protected NameProvider getNameProvider() {
		return nameProvider;
	}

	protected Iterable<? extends Runner> collectExamples() {
		List<FrameworkMethod> methods = getTestClass().getAnnotatedMethods(Test.class);
		methods = newArrayList(Iterables.filter(methods, isTestMethod()));
		orderMethods(methods);
		return createRunners(getTestClass().getJavaClass(), methods);
	}

	protected Predicate<FrameworkMethod> isTestMethod() {
		return new IsTestMethod();
	}

	protected Iterable<? extends Runner> createRunners(
			final Class<?> testClass, List<FrameworkMethod> annotatedMethods) {
		return transform(annotatedMethods,
				new Function<FrameworkMethod, Runner>() {
					public Runner apply(FrameworkMethod from) {
						try {
							return createExampleRunner(testClass, from);
						} catch (InitializationError e) {
							sneakyThrow(e);
							return null; // not reachable
						} catch (NoTestsRemainException e) {
							Exceptions.sneakyThrow(e);
							return null; // not reachable
						}
					}
				});
	}

	protected void orderMethods(List<FrameworkMethod> annotatedMethods) {
		Collections.sort(annotatedMethods, new Comparator<FrameworkMethod>() {

			public int compare(FrameworkMethod method1, FrameworkMethod method2) {
				Order o1 = method1.getAnnotation(Order.class);
				Order o2 = method2.getAnnotation(Order.class);
				if (o1 == null && o2 == null) {
					return 0;
				}
				if (o1 != null && o2 == null) {
					return -1;
				}
				if (o1 == null && o2 != null) {
					return 1;
				}
				return o1.value() - o2.value();
			}

		});
	}

	protected ExampleRunner createExampleRunner(Class<?> testClass,
			FrameworkMethod from) throws InitializationError,
			NoTestsRemainException {
		return new ExampleRunner(testClass, extensions, from, nameProvider,
				createTestInstantiator());
	}

	protected SpecCreator createTestInstantiator() throws InitializationError {
		CreateWith annotation = getCreateWithAnnotation();
		try {
			if (annotation == null) {
				return new SimpleSpecCreator();
			} else {
				return annotation.value().newInstance();
			}
		} catch (Exception e) {
			throw new InitializationError(e);
		}
	}

	protected CreateWith getCreateWithAnnotation() {
		Class<?> klass = targetClass();
		CreateWith annotation = null;
		while (annotation == null && klass != null) {
			annotation = klass.getAnnotation(CreateWith.class);
			klass = klass.getSuperclass();
		}
		return annotation;
	}

	protected Iterable<? extends Runner> collectExampleGroups() {
		return transform(allDeclaredClasses(),
				new Function<Class<?>, Runner>() {

					public Runner apply(Class<?> declaredClass) {
						try {
							return createExampleGroupRunner(declaredClass);
						} catch (InitializationError e) {
							Exceptions.sneakyThrow(e);
							return null; //not reachable
						}
					}

				});
	}

	protected Runner createExampleGroupRunner(Class<?> declaredClass)
			throws InitializationError {
		return new ExampleGroupRunnerBuilder(declaredClass, nameProvider, setups)
				.build();
	}

	protected List<Class<?>> allDeclaredClasses() {
		List<Class<?>> declaredClasses = asList(targetClass()
				.getDeclaredClasses());
		Iterable<? extends Class<?>> containedClasses = allContainedClasses();
		return newArrayList(concat(declaredClasses, containedClasses));
	}

	protected Iterable<? extends Class<?>> allContainedClasses() {
		Iterable<? extends Class<?>> containedClasses = emptyList();
		Contains contains = targetClass().getAnnotation(Contains.class);
		if (contains != null) {
			containedClasses = asList(contains.value());
		}
		return containedClasses;
	}

	protected Class<?> targetClass() {
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
	
	@Override
	protected List<TestRule> classRules() {
		List<TestRule> rules = super.classRules();
		rules.add(createClassExtensionRule(staticExtensions(), null, setups));
		return rules;
	}
	
	@Override
	protected Statement withBeforeClasses(Statement statement) {
		List<FrameworkMethod> befores= getTestClass().getAnnotatedMethods(BeforeClass.class);
		List<FrameworkMethod> filteredBefores = filterAlreadyScheduled(befores);
		return filteredBefores.isEmpty() ? statement :
			new RunBefores(statement, filteredBefores, null);
	}
	
	@Override
	protected Statement withAfterClasses(Statement statement) {
		List<FrameworkMethod> befores= getTestClass().getAnnotatedMethods(AfterClass.class);
		List<FrameworkMethod> filteredAfters = filterAlreadyScheduled(befores);
		return filteredAfters.isEmpty() ? statement :
			new RunAfters(statement, filteredAfters, null);
	}

	public List<FrameworkMethod> filterAlreadyScheduled(
			List<FrameworkMethod> befores) {
		List<FrameworkMethod> filteredAfters = new ArrayList<FrameworkMethod>(befores.size());
		for (FrameworkMethod frameworkMethod : befores) {
			if(!setups.contains(frameworkMethod.getMethod())){
				filteredAfters.add(frameworkMethod);
				setups.add(frameworkMethod.getMethod());
			}
		}
		return filteredAfters;
	}

	private Iterable<ExtensionClass> staticExtensions() {
		Iterable<ExtensionClass> staticExtensions =  Iterables.filter(extensions, new Predicate<ExtensionClass>() {
			public boolean apply(ExtensionClass extension){
				return extension.isStatic();
			}
		});
		return staticExtensions;
	}
	
	protected List<ExtensionClass> getExtensions() {
		return extensions;
	}

}
