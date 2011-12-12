package de.bmw.carit.jnario.lib.tests;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;

import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.InstantiateWith;
import de.bmw.carit.jnario.runner.JnarioRunner;
import de.bmw.carit.jnario.runner.TestInstantiator;

public class TestInstantiatorTest {

	private static ArrayList<String> callOrder;
	private static final String TEST_RUN = "Test";
	private static final String BEFORE = "Before";
	private static final String AFTER = "After";

	public static class MockTestInstantiator implements TestInstantiator {

		@Override
		public Object createTest(Class<?> klass) {
			return new Example() {
				@Override
				public void dummy() throws Exception {
					callOrder.add(TEST_RUN);
				}
			};
		}

		@Override
		public void beforeTestRun() {
			callOrder.add(BEFORE);
		}

		@Override
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
		callOrder = newArrayList();
	}

	@Test
	public void shouldUseProvidedTestInstantiator() throws InitializationError {
		new JUnitCore().run(Example.class);
		Assert.assertThat(callOrder, is(newArrayList(BEFORE, TEST_RUN, AFTER)));
	}

}
