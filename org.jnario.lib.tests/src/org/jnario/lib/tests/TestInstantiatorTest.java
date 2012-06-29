/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.lib.tests;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.jnario.lib.AbstractSpecCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class TestInstantiatorTest {

	private static ArrayList<String> callOrder = newArrayList();;
	private static final String TEST_RUN = "Test";
	private static final String BEFORE = "Before";
	private static final String AFTER = "After";

	public static class MockTestInstantiator extends AbstractSpecCreator {

		@SuppressWarnings("unchecked")
		public <T> T create(Class<T> klass) {
			return (T) new Example() {
				@Override
				public void dummy() throws Exception {
					callOrder.add(TEST_RUN);
				}
			};
		}

		public void beforeSpecRun() {
			callOrder.add(BEFORE);
		}

		public void afterSpecRun() {
			callOrder.add(AFTER);
		}

	}

	@RunWith(ExampleGroupRunner.class)
	@CreateWith(MockTestInstantiator.class)
	public static class Example {
		@Test
		public void dummy() throws Exception {

		}
	}

	@Before
	public void clearFlags() {
		callOrder.clear();
	}

	@Test
	public void shouldUseProvidedTestInstantiator() throws InitializationError {
		new JUnitCore().run(Example.class);
		Assert.assertThat(callOrder, is(newArrayList(BEFORE, TEST_RUN, AFTER)));
	}

}
