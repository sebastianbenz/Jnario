/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import static org.jnario.runner.ExtensionRule.createExtensionRule;

import java.util.List;

import org.junit.Rule;
import org.junit.rules.TestRule;
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

	private Object scenario;

	public FeatureRunner(Class<?> klass, NameProvider nameProvider)
			throws InitializationError {
		super(klass, nameProvider);
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
			scenario = createTestInstantiator().createSpec(targetClass());
		}
		return new StepRunner(testClass, from, getNameProvider(), scenario);
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
		return rules;
	}

}
