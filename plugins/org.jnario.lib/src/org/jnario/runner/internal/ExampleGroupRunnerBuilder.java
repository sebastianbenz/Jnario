/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner.internal;

import java.lang.reflect.Method;
import java.util.Set;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.NameProvider;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

public class ExampleGroupRunnerBuilder {

	private final Class<?> declaredClass;
	private final NameProvider nameProvider;
	private Set<Method> setups;

	public ExampleGroupRunnerBuilder(Class<?> declaredClass,
			NameProvider nameProvider, Set<Method> setups) {
		this.declaredClass = declaredClass;
		this.nameProvider = nameProvider;
		this.setups = setups;
	}

	public Runner build() throws InitializationError {
		RunWith runWith = declaredClass.getAnnotation(RunWith.class);
		if (runWith == null) {
			return new ExampleGroupRunner(declaredClass, nameProvider, setups);
		} else {
			try {
				Class<?> runnerType = runWith.value();
				try {
					return (Runner) runnerType.getConstructor(Class.class,
							NameProvider.class, Set.class).newInstance(
							new Object[] { declaredClass, nameProvider, setups});
				} catch (NoSuchMethodException e) {
					try {
						return (Runner) runnerType.getConstructor(Class.class)
								.newInstance(new Object[] { declaredClass });
					} catch (NoSuchMethodException e2) {
						throw new InitializationError("Could not instantiate "
								+ runnerType.getName());
					}
				}
			} catch (Exception e) {
				Exceptions.sneakyThrow(e);
				return null; // not reachable
			}
		}
	}

}
