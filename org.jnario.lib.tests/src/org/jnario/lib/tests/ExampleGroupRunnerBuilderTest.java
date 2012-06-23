package org.jnario.lib.tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.ExampleGroupRunnerBuilder;
import org.jnario.runner.NameProvider;
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
		return new ExampleGroupRunnerBuilder(type, nameProvider).build();
	}
	
}
