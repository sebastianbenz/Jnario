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
import static org.jnario.lib.tests.ExampleGroupRunnerTest.ExampleWithNestedCustomRunner.CustomRunner.HAS_RUN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.hasFailureContaining;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hamcrest.Matcher;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings({"unchecked", "restriction"})
public class ExampleGroupRunnerTest {
	
	@RunWith(ExampleGroupRunner.class)
	@Named("Example1 Name")
	public static class Example {
		
		@BeforeClass
		public static void beforeClass(){
			run("Example#beforeClass");
		}
		
		@Before
		public void before(){
			run("Example#before");
		}
		
		@Test
		@Order(1)
		@Named("Test 1")
		public void first() throws Exception {
			run("Example#first");
		}
		
		@Test
		@Order(2)
		@Named("Test 2")
		public void second() throws Exception {
			run("Example#second");
		}
		
		@After
		public void after(){
			run("Example#after");
		}
		
		@AfterClass
		public static void afterClass(){
			run("Example#afterClass");
		}
		
	}
	
	@RunWith(ExampleGroupRunner.class)
	@Named("Example2 Name")
	public static class ExampleWithContext {
		
		@Named("Context Name")
		public static class SubExample{
			@Test
			@Order(3)
			@Named("Test 2")
			public void firstSubTest() throws Exception {
				run("SubExample#firstSubTest");
			}
			
			@Test
			@Order(4)
			@Named("Test 3")
			public void secondSubTest() throws Exception {
				run("SubExample#secondSubTest");
			}
		}
		
		@Test
		@Named("Test 1")
		public void firstTest() throws Exception {
			run("ExampleWithContext#firstTest");
		}
	}
	
	@RunWith(ExampleGroupRunner.class)
	@Named("Example3 Name")
	@Contains({Example.class, ExampleWithContext.class})
	public static class ParentExample {
		
		@Test
		@Named("Parent Test 1")
		public void first() throws Exception {
			run("ParentExample#first");
		}
		
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleWithoutAnnotation {

		@Test
		public void test() throws Exception {
			run("ExampleWithoutAnnotation#test");
		}
		
	}
	
	public static class ExampleExtension{
		
		@BeforeClass
		public static void beforeClass(){
			
		}
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleWithExtension {

		@Extension public static Example extensionExample = new Example();
		
		@Test
		@Order(1)
		public void test1() throws Exception {
			run("ExampleWithExtension#test1");
		}
		
		@Test
		@Order(2)
		public void test2() throws Exception {
			run("ExampleWithExtension#test2");
		}
		
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleWithUninitializedExtension{
		@Extension public Example uninitialized;
		
		@Test
		public void aTest() throws Exception {
		}
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleWithNestedCustomRunner{
		
		public static class CustomRunner extends ExampleGroupRunner{
			
			public static boolean HAS_RUN = false;
			
			public CustomRunner(Class<?> testClass, NameProvider nameProvider, Set<Method> setups)
					throws InitializationError {
				super(testClass, nameProvider, setups);
			}
			
			@Override
			public void run(RunNotifier notifier) {
				HAS_RUN = true;
				super.run(notifier);
			}
		}
		
		@RunWith(CustomRunner.class)
		public static class SubExample{
			@Test
			public void aTest() throws Exception {
			}
		}
	}
	
	private static List<String> executedTests = newArrayList();
	
	@Before
	public void clearExecutedTests(){
		executedTests.clear();
	}

	@Test
	public void shouldUseDefaultNameWithoutAnnotation() throws InitializationError {
		assertThat(describe(ExampleWithoutAnnotation.class), is(desc(ExampleWithoutAnnotation.class.getName())));
	}
	
	@Test
	public void shouldNameTestsAfterNamedAnnotation() throws Exception {
		assertThat(describe(Example.class), is(
				desc("Example1 Name",
					desc("Test 1"),
					desc("Test 2")
				)));
	}
	
	@Test
	public void shouldNestContextWithinTestClass() throws Exception {
		assertThat(describe(ExampleWithContext.class), is(
				desc("Example2 Name",
					desc("Context Name",
							desc("Test 2"),
							desc("Test 3")
					),
					desc("Test 1")
				)));
	}
	
	@Test
	public void shouldNestContainedClassesWithinTestClass() throws Exception {
		assertThat(describe(ParentExample.class), is(
			desc("Example3 Name",	
				desc("Example1 Name",
						desc("Test 1"),
						desc("Test 2")
					),
				desc("Example2 Name",
						desc("Context Name",
								desc("Test 2"),
								desc("Test 3")
						),
						desc("Test 1")
					))));
	}
	
	
	@Test
	public void shouldExecuteAllTests() throws Exception {
		List<String> expected = newArrayList(
				"Example#first",
				"Example#second",
				"SubExample#firstSubTest",
				"SubExample#secondSubTest",
				"ExampleWithContext#firstTest",
				"ParentExample#first"
		);

		new JUnitCore().run(ParentExample.class);
		
		for (String test : expected) {
			Assert.assertTrue(executedTests.contains(test));
		}
	}

	@Test
	public void shouldExecuteAllSetupAndTearDownMethods() throws Exception {
		List<String> expected = newArrayList(
				"Example#beforeClass",
				"Example#before",
				"Example#first",
				"Example#after",
				"Example#before",
				"Example#second",
				"Example#after",
				"Example#afterClass"
		);

		new JUnitCore().run(Example.class);
		
		assertEquals(expected, executedTests);
	}
	
	@Test
	public void shouldExecuteSetupAndTeardownMethodsInExtensions() throws Exception {
		List<String> expected = newArrayList(
				"Example#beforeClass",
				"Example#before",
				"ExampleWithExtension#test1",
				"Example#after",
				"Example#before",
				"ExampleWithExtension#test2",
				"Example#after",
				"Example#afterClass"
		);

		new JUnitCore().run(ExampleWithExtension.class);
		
		assertEquals(expected, executedTests);
	}
	
	@RunWith(ExampleGroupRunner.class)
	public static class ExampleWithRule{
		
		@Rule public TestRule testRule = new TestRule();
		
		@Test
		public void test() throws Exception{
		}
	}
	
	@Test
	public void shouldObeyRules(){
		assertThat(testResult(ExampleWithRule.class), is(isSuccessful()));
		assertTrue(TestRule.isExecuted());
	}
	
	
	@Test
	public void throwsIllegalStateExceptionIfExceptionIsNotInitialized() throws Exception {
		assertThat(testResult(ExampleWithUninitializedExtension.class), hasFailureContaining("uninitialized is not initialized"));
	}
	
	@Test
	public void shouldUseNestedRunners() throws Exception {
		new JUnitCore().run(ExampleWithNestedCustomRunner.class);
		assertTrue(HAS_RUN);
		
		// clean up
		HAS_RUN = false;
	}
	
	private Description describe(Class<?> klass) throws InitializationError {
		ExampleGroupRunner xspecRunner = new ExampleGroupRunner(klass);
		Description description = xspecRunner.getDescription();
		return description;
	}

	private Matcher<Description> desc(final String displayName, final Matcher<Description>... childrenMatchers) {
		return new TypeSafeMatcher<Description>() {
	
			public void describeTo(org.hamcrest.Description description) {
				description.appendText(displayName);
			}
	
			@Override
			public boolean matchesSafely(Description item) {
				String name = getTestName(item);
				if(!displayName.equals(name)){
					return false;
				}
				for(int i = 0; i < childrenMatchers.length; i++){
					Matcher<Description> matcher = childrenMatchers[i];
					Description description = item.getChildren().get(i);
					if(!matcher.matches(description)){
						return false;
					}
				}
				return true;
			}

			private String getTestName(Description desc) {
				return desc.getDisplayName().split("\\(")[0];
			}
		};
	}
	
	public static void run(String testName){
		executedTests.add(testName);
	}

}
