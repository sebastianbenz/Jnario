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

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;


/**
 * @author Sebastian Benz - Initial contribution and API 
 */
@SuppressWarnings("restriction")
public class ExampleGroupRunner extends ParentRunner<Runner> {
	
	private final class IsTestMethod implements
			Predicate<FrameworkMethod> {
		public boolean apply(FrameworkMethod input) {
			return input.getMethod().getDeclaringClass() == getTestClass().getJavaClass();
		}
	}


	private final NameProvider nameProvider;
	private List<Runner> children;
	private List<ExtensionClass> extensions;
	
	public ExampleGroupRunner(Class<?> testClass) throws InitializationError {
		this(testClass, NameProvider.create());
	}

	public ExampleGroupRunner(Class<?> testClass, NameProvider nameProvider) throws InitializationError {
		super(testClass);
		this.nameProvider = nameProvider;
		setExtensions();
		setChildren();
	}

	private void setChildren() throws InitializationError {
		Iterable<Runner> allExamples = concat(collectExampleGroups(), collectExamples());
		this.children = newArrayList(Iterables.filter(allExamples, notNull()));
		if(children.isEmpty()){
			throw new InitializationError("No examples");
		}
	}
	
	private void setExtensions() {
		List<FrameworkField> extensionFields = getTestClass().getAnnotatedFields(Extension.class);
		extensions = newArrayListWithExpectedSize(extensionFields.size());
		for (FrameworkField frameworkField : extensionFields) {
			extensions.add(new ExtensionClass(frameworkField));
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
		List<FrameworkMethod> methods = getTestClass().getAnnotatedMethods(Test.class);
		methods = newArrayList(Iterables.filter(methods, isTestMethod()));
		orderMethods(methods);
		return createRunners(getTestClass().getJavaClass(), methods);
	}

	protected Predicate<FrameworkMethod> isTestMethod() {
		return new IsTestMethod();
	}
	
	protected Iterable<? extends Runner> createRunners(final Class<?> testClass,
			List<FrameworkMethod> annotatedMethods) {
		return transform(annotatedMethods,
				new Function<FrameworkMethod, Runner>() {

					public Runner apply(FrameworkMethod from) {
						try {
							return createExampleRunner(testClass, from);
						} catch (InitializationError e) {
							throw new RuntimeException(e);
						} catch (NoTestsRemainException e) {
							throw new Error(e); // should not happen
						}
					}
				});
	}

	protected void orderMethods(List<FrameworkMethod> annotatedMethods) {
		Collections.sort(annotatedMethods, new Comparator<FrameworkMethod>(){

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
		return new ExampleRunner(testClass, extensions, from, nameProvider, createTestInstantiator());
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
				new Function<Class<?>, Runner>() {

					public Runner apply(Class<?> declaredClass) {
						try {
							return createExampleGroupRunner(declaredClass);
						} catch (InitializationError e) {
							return null;
						}
					}

					
				});
	}
	
	protected Runner createExampleGroupRunner(
			Class<?> declaredClass) throws InitializationError {
		return new ExampleGroupRunnerBuilder(declaredClass, nameProvider).build();
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
	
	@Override
	protected Statement withAfterClasses(Statement next) {
		return withExtension(super.withAfterClasses(next), AfterClass.class, newRunAfters());
	}

	@Override
	protected Statement withBeforeClasses(Statement next) {
		return withExtension(super.withBeforeClasses(next), BeforeClass.class, newRunBefores());
	}
	
	private Statement withExtension(Statement next, Class<? extends Annotation> annotationType, Function2<Statement, List<FrameworkMethod>, Statement> statementFactory) {
		for (ExtensionClass extension : extensions) {
			List<FrameworkMethod> methods = extension.allMethodsWithAnnotation(annotationType);
			try {
				if(!methods.isEmpty()){
					next = statementFactory.apply(next, methods);
				}
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			}
		}
		return next;
	}
	
	private Function2<Statement, List<FrameworkMethod>, Statement> newRunBefores(){
		return new Function2<Statement, List<FrameworkMethod>, Statement>() {

			public Statement apply(Statement next, List<FrameworkMethod> methods) {
				return new RunBefores(next, methods, null);
			}
		};
	}


	private Function2<Statement, List<FrameworkMethod>, Statement> newRunAfters(){
		return new Function2<Statement, List<FrameworkMethod>, Statement>() {
	
			public Statement apply(Statement next, List<FrameworkMethod> methods) {
				return new RunAfters(next, methods, null);
			}
		};
	}


}
