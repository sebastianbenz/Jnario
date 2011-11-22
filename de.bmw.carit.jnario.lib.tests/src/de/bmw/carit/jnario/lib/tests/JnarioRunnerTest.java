package de.bmw.carit.jnario.lib.tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;

import de.bmw.carit.jnario.runner.JnarioRunner;
import de.bmw.carit.jnario.runner.Named;

@SuppressWarnings({"unchecked", "restriction"})
public class JnarioRunnerTest {
	
	@RunWith(JnarioRunner.class)
	@Named("Example Name")
	public static class Example {
		
		@Test
		@Named("Test 1")
		public void first() throws Exception {
		}
		
		@Test
		@Named("Test 2")
		public void second() throws Exception {
		}
		
	}
	
	@RunWith(JnarioRunner.class)
	@Named("Example Name")
	public static class ExampleWithContext {
		
		@Named("Context Name")
		public static class SubExample{
			@Test
			@Named("Test 2")
			public void firstSubTest() throws Exception {
			}
			
			@Test
			@Named("Test 3")
			public void secondSubTest() throws Exception {
			}
		}
		
		@Test
		@Named("Test 1")
		public void firstSubTest() throws Exception {
		}
	}
	
	@RunWith(JnarioRunner.class)
	public static class ExampleWithoutAnnotation {

		@Test
		public void dummy() throws Exception {
		}
		
	}

	

	@Test
	public void shouldUseDefaultNameWithoutAnnotation() throws InitializationError {
		assertThat(describe(ExampleWithoutAnnotation.class), is(desc(ExampleWithoutAnnotation.class.getName())));
	}
	
	@Test
	public void shouldNameTestsAfterNamedAnnotation() throws Exception {
		assertThat(describe(Example.class), is(desc("Example Name",
															desc("Test 1"),
															desc("Test 2")
														)));
	}
	
	@Test
	public void shouldNestContextWithinTestClass() throws Exception {
		assertThat(describe(ExampleWithContext.class), is(desc("Example Name",
																	desc("Test 1"),
																	desc("Context Name",
																			desc("Test 2"),
																			desc("Test 3")
																	)
																)));
	}

	private Description describe(Class<?> klass) throws InitializationError {
		JnarioRunner xspecRunner = new JnarioRunner(klass);
		Description description = xspecRunner.getDescription();
		return description;
	}


	private Matcher<Description> desc(final String displayName, final Matcher<Description>... childrenMatchers) {
		return new TypeSafeMatcher<Description>() {
	
			@Override
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


}
