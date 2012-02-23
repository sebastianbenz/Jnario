package org.jnario.lib.tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

import org.jnario.runner.DefaultTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.ExampleRunner;
import org.jnario.runner.NameProvider;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleRunnerTest {
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleBaseClass{
		
		@Test
		public void test() throws Exception{
		}
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleDerivedClass extends ExampleBaseClass{
		
		@Test
		public void test2() throws Exception{
		}
		
	}
	
	@Test
	public void shouldInstantiateTheDerivedClassForAnInheritedTestMethod() throws Exception {
		TestClass testClass = new TestClass(ExampleDerivedClass.class);
		List<FrameworkMethod> annotatedMethods = testClass.getAnnotatedMethods(Test.class);
		for(FrameworkMethod method: annotatedMethods) {
			ExampleRunner exampleRunner = new ExampleRunner(ExampleDerivedClass.class, method, new NameProvider(), new DefaultTestInstantiator());
			Description desiredDescription = Description.createTestDescription(ExampleDerivedClass.class, method.getName());
			assertThat(exampleRunner.getDescription().getDisplayName(), is(desiredDescription.getDisplayName()));
		}
	}

}
