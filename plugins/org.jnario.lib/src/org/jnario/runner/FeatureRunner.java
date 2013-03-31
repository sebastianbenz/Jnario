/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import static org.jnario.runner.ExtensionRule.createExtensionRule;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/**
 * A spec {@link Runner} for Jnario features. It does not reset the scenario's
 * state between the execution of each step.
 * 
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz - Added support for {@link Rule} and  {@link Extension}s.
 */
public class FeatureRunner extends ExampleGroupRunner {

	private final class TestInstantiatorRule implements TestRule {
		private final SpecCreator testInstantiator;

		private TestInstantiatorRule(SpecCreator testInstantiator) {
			this.testInstantiator = testInstantiator;
		}

		public Statement apply(final Statement base, Description description) {
			return new Statement() {
				
				@Override
				public void evaluate() throws Throwable {
					testInstantiator.beforeSpecRun();
					base.evaluate();
					testInstantiator.afterSpecRun();
				}
			};
		}
	}

	private Object scenario;
	private SpecCreator testInstantiator;

	public FeatureRunner(Class<?> klass, NameProvider nameProvider, Set<Method> setups)
			throws InitializationError {
		super(klass, nameProvider, setups);
	}

	public FeatureRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected Predicate<FrameworkMethod> isTestMethod() {
		return Predicates.alwaysTrue();
	}

	@Override
	protected ExampleRunner createExampleRunner(Class<?> testClass,	FrameworkMethod from) throws InitializationError,
			NoTestsRemainException {
		if(scenario == null){
			scenario = getOrCreateTestInstantiator().createSpec(targetClass());
		}
		return new StepRunner(testClass, from, getNameProvider(), scenario);
	}

	public SpecCreator getOrCreateTestInstantiator()  {
		if(testInstantiator == null){
			try {
				testInstantiator = createTestInstantiator();
			} catch (InitializationError e) {
				Exceptions.sneakyThrow(e);
				return null; // not reachable
			}
		}
		return testInstantiator;
	}
	
	
	@Override
	protected Statement classBlock(RunNotifier notifier) {
		Statement classBlock = super.classBlock(notifier);
		for (TestRule rule : getTestRules()) {
			classBlock = rule.apply(classBlock, getDescription());
		}
		return classBlock;
	}
	
	protected List<TestRule> getTestRules() {
		List<TestRule> rules = getTestClass().getAnnotatedFieldValues(scenario,	Rule.class, TestRule.class);
		rules.add(createExtensionRule(getExtensions(), scenario));
		rules.add(0, createInstantiatorRule());
		return rules;
	}

	private TestRule createInstantiatorRule() {
		return new TestInstantiatorRule(getOrCreateTestInstantiator());
	}

}
