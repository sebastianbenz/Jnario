/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.junit.runner.Description.createTestDescription;
import static org.junit.runner.manipulation.Filter.matchMethodDescription;

import java.util.Collections;
import java.util.List;

import org.jnario.runner.internal.ExtensionClass;
import org.jnario.runner.internal.NamedFrameworkMethod;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
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
 * A {@link Runner} for executing single examples. 
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleRunner extends BlockJUnit4ClassRunner {

	private final class MethodNameConverter implements
			Function<FrameworkMethod, FrameworkMethod> {
		public FrameworkMethod apply(final FrameworkMethod from) {
			return new NamedFrameworkMethod(from.getMethod(),
					nameProvider.nameOf(from.getMethod()));
		}
	}

	private final NameProvider nameProvider;
	private final FrameworkMethod method;
	private SpecCreator testBuilder;
	private List<ExtensionClass> extensions;

	public ExampleRunner(final Class<?> testClass,
			List<ExtensionClass> extensions, final FrameworkMethod method,
			NameProvider nameProvider, SpecCreator testBuilder)
			throws InitializationError, NoTestsRemainException {
		super(testClass);
		this.extensions = extensions;
		this.method = method;
		this.nameProvider = nameProvider;
		this.testBuilder = testBuilder;
		filter(matchMethodDescription(getDescription()));
	}

	public ExampleRunner(Class<?> testClass, FrameworkMethod from,
			NameProvider nameProvider, SpecCreator delegate)
			throws InitializationError, NoTestsRemainException {
		this(testClass, Collections.<ExtensionClass> emptyList(), from,
				nameProvider, delegate);
	}

	@Override
	protected Object createTest() throws Exception {
		Object test = testBuilder.createSpec(getTestClass().getJavaClass());
		initializeSubjects(getTestClass(), test);
		return test;
	}

	protected void initializeSubjects(TestClass testClass, Object test)
			throws InitializationError {
		for (FrameworkField subjectField : testClass
				.getAnnotatedFields(Subject.class)) {
			try {
				Object value = testBuilder.createSubject(subjectField.getField().getType());
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
		testBuilder.beforeSpecRun();
		super.runChild(method, notifier);
		testBuilder.afterSpecRun();
	}
	
	@Override
	protected List<TestRule> getTestRules(Object target) {
		List<TestRule> rules = super.getTestRules(target);
		rules.add(ExtensionRule.createExtensionRule(extensions, target));
		return rules;
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
		return nameProvider.nameOf(method.getMethod());
	}

}