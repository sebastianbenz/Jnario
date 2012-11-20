/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import static com.google.common.collect.Iterables.filter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jnario.runner.internal.ExtensionClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

public class ExtensionRule implements TestRule {
	
	private final class ExtensionInvocation extends Statement {
		private final Object extensionValue;
		private Iterable<FrameworkMethod> toExecuteBefore;
		private Iterable<FrameworkMethod> toExecuteAfter;
		private Statement next;

		private ExtensionInvocation(Statement next, Object extensionValue,
				Iterable<FrameworkMethod> toExecuteBefore, Iterable<FrameworkMethod> toExecuteAfter) {
			this.next = next;
			this.extensionValue = extensionValue;
			this.toExecuteBefore = toExecuteBefore;
			this.toExecuteAfter = toExecuteAfter;
		}

		@Override
		public void evaluate() throws Throwable {
			run(toExecuteBefore);
			next.evaluate();
			run(toExecuteAfter);
		}

		private void run(Iterable<FrameworkMethod> toExecute) throws Throwable {
			for (FrameworkMethod method : toExecute) {
				method.invokeExplosively(extensionValue);
			}
		}
	}

	private final Iterable<ExtensionClass> extensions;
	private final Object target;
	private final Class<? extends Annotation> beforeAnnotation;
	private final Class<? extends Annotation> afterAnnotation;
	private Set<Method> alreadyScheduled;

	public static ExtensionRule createClassExtensionRule(Iterable<ExtensionClass> extensions, Object target, Set<Method> alreadyScheduled){
		return new ExtensionRule(extensions, target, BeforeClass.class, AfterClass.class, alreadyScheduled);
	}

	public static ExtensionRule createExtensionRule(Iterable<ExtensionClass> extensions, Object target){
		return new ExtensionRule(extensions, target, Before.class, After.class, new HashSet<Method>());
	}

	public ExtensionRule(Iterable<ExtensionClass> extensions, Object target,
			Class<? extends Annotation> beforeAnnotation,
			Class<? extends Annotation> afterAnnotation, Set<Method> alreadyScheduled) {
		this.extensions = extensions;
		this.target = target;
		this.beforeAnnotation = beforeAnnotation;
		this.afterAnnotation = afterAnnotation;
		this.alreadyScheduled = alreadyScheduled;
	}

	public Statement apply(Statement next, Description description) {
		for (ExtensionClass extension : extensions) {
			final Iterable<FrameworkMethod> toExecuteBefore = filterAlreadyScheduled(extension.allMethodsWithAnnotation(beforeAnnotation));
			final Iterable<FrameworkMethod> toExecuteAfter = filterAlreadyScheduled(extension.allMethodsWithAnnotation(afterAnnotation));
			try {
				final Object extensionValue = extension.get(target);
				if (extensionValue == null) {
					throw new IllegalStateException(extension.getName()	+ " is not initialized");
				}
				next = new ExtensionInvocation(next, extensionValue, toExecuteBefore, toExecuteAfter);
			} catch (IllegalAccessException e) {
				throw new IllegalStateException(
						extension.getName()	+ " is not accessible. Extension fields must be public.");
			}
		}
		return next;
	}

	private Iterable<FrameworkMethod> filterAlreadyScheduled(
			List<FrameworkMethod> candidates) {
		return Lists.newArrayList(filter(candidates, new Predicate<FrameworkMethod>() {
			public boolean apply(FrameworkMethod candidate){
				boolean result = !alreadyScheduled.contains(candidate.getMethod());
				if(result){
					alreadyScheduled.add(candidate.getMethod());
				}
				return result;
			}
		}));
	}

}
