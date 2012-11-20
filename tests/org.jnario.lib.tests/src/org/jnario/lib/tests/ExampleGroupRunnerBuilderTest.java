/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;
import java.util.HashSet;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.NameProvider;
import org.jnario.runner.internal.ExampleGroupRunnerBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.model.InitializationError;

public class ExampleGroupRunnerBuilderTest {

	public static class ExampleWithoutRunner{
		@Test
		public void testName() throws Exception {
		}
	}
	
	@RunWith(JUnit4.class)
	public static class ExampleWithRunner{
		@Test
		public void testName() throws Exception {
		}
	}

	private NameProvider nameProvider = NameProvider.create();
	
	@Test
	public void defaultIsExampleGroupRunner() throws Exception {
		assertThat(build(ExampleWithoutRunner.class), is(ExampleGroupRunner.class));
	}
	
	@Test
	public void usesAnnotatedRunner() throws Exception {
		assertThat(build(ExampleWithRunner.class), is(JUnit4.class));
	}

	private Object build(Class<?> type) throws InitializationError {
		return new ExampleGroupRunnerBuilder(type, nameProvider, new HashSet<Method>()).build();
	}
	
}
