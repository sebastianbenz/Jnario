/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.junit.runner.Description.createTestDescription;
import static org.junit.runner.manipulation.Filter.matchMethodDescription;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.xbase.lib.Functions.Function3;
import org.junit.After;
import org.junit.Before;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
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


/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
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
	private List<ExtensionClass> extensions;

	public ExampleRunner(final Class<?> testClass, List<ExtensionClass> extensions, final FrameworkMethod method, NameProvider nameProvider, TestInstantiator testBuilder)
			throws InitializationError, NoTestsRemainException {
		super(testClass);
		this.extensions = extensions;
		this.method = method;
		this.nameProvider = nameProvider;
		this.testBuilder = testBuilder;
		filter(matchMethodDescription(getDescription()));
	}
	
	public ExampleRunner(Class<?> testClass, FrameworkMethod from,
			NameProvider nameProvider, TestInstantiator delegate) throws InitializationError, NoTestsRemainException {
		this(testClass, Collections.<ExtensionClass>emptyList(), from, nameProvider, delegate);
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
	
	@Override
	protected Statement withBefores(FrameworkMethod method, Object target,
			Statement statement) {
		return withExtension(super.withBefores(method, target, statement), Before.class, target, newRunBefores());
	}
	
	@Override
	protected Statement withAfters(FrameworkMethod method, Object target,
			Statement statement) {
		return withExtension(super.withAfters(method, target, statement), After.class, target, newRunAfters());
	}

	private Statement withExtension(Statement next, Class<? extends Annotation> annotationType, Object target, Function3<Statement, List<FrameworkMethod>, Object, Statement> statementFactory) {
		for (ExtensionClass extension : extensions) {
			List<FrameworkMethod> methods = extension.allMethodsWithAnnotation(annotationType);
			try {
				if(!methods.isEmpty()){
					try {
						Object extensionValue = extension.get(target);
						if(extensionValue == null){
							throw new IllegalStateException(extension.getName() + " is not initialized");
						}
						next = statementFactory.apply(next, methods, extensionValue);
					} catch (IllegalAccessException e) {
						throw new IllegalStateException(extension.getName() + " is not accessible. Extension fields must be public.");
					}
				}
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			}
		}
		return next;
	}
	
	private Function3<Statement, List<FrameworkMethod>, Object, Statement> newRunBefores(){
		return new Function3<Statement, List<FrameworkMethod>, Object, Statement>() {

			@Override
			public Statement apply(Statement next, List<FrameworkMethod> methods, Object target) {
				return new RunBefores(next, methods, target);
			}
		};
	}

	private Function3<Statement, List<FrameworkMethod>, Object, Statement> newRunAfters(){
		return new Function3<Statement, List<FrameworkMethod>, Object, Statement>() {

			@Override
			public Statement apply(Statement next, List<FrameworkMethod> methods, Object target) {
				return new RunAfters(next, methods, target);
			}
		};
	}

	
}