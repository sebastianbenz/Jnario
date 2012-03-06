package org.jnario.lib.tests;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.TestInstantiator;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class TestInstantiatorTest {

	private static ArrayList<String> callOrder = newArrayList();;
	private static final String TEST_RUN = "Test";
	private static final String BEFORE = "Before";
	private static final String AFTER = "After";

	public static class MockTestInstantiator implements TestInstantiator {

		public Object createTest(Class<?> klass) {
			return new Example() {
				@Override
				public void dummy() throws Exception {
					callOrder.add(TEST_RUN);
				}
			};
		}

		public void beforeTestRun() {
			callOrder.add(BEFORE);
		}

		public void afterTestRun() {
			callOrder.add(AFTER);
		}

	}

	@RunWith(ExampleGroupRunner.class)
	@InstantiateWith(MockTestInstantiator.class)
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
