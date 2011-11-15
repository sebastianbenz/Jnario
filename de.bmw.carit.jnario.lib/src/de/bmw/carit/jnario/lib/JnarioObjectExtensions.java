package de.bmw.carit.jnario.lib;

import static org.hamcrest.core.Is.is;

import java.util.Collections;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Assert;


public class JnarioObjectExtensions extends ObjectExtensions{

	/**
	 * This is the equivalent to the {@link Assert#assertThat(Object, Matcher)} method.
	 * 
	 * @param <T>
	 *            the static type accepted by the matcher (this can flag obvious
	 *            compile-time problems such as {@code assertThat(1, is("a"))}
	 * @param actual
	 *            the computed value being compared
	 * @param matcher
	 *            an expression, built of {@link Matcher}s, specifying allowed
	 *            values
	 */
	public static <T> void should(T actual, Matcher<T> matcher) {
		Assert.assertThat(actual, matcher);
	}
	
	public static <T> Specification<T> should(T input) {
		return new Specification<T>(input, Collections.<Step> emptyList());
	}
	
	public static <T> Specification<T> be(Specification<T> actual, Matcher<T> matcher) {
		boolean result = matcher.matches(actual.getInput());
		result = actual.evaluate(result);
		if (!result) {
			Description description = new StringDescription();
			description.appendText("\nExpected: ");
			description.appendDescriptionOf(matcher);
			description.appendText("\n     got: ");
			description.appendValue(actual);
			description.appendText("\n");
			throw new java.lang.AssertionError(description.toString());
		}
		return actual;
	}

	public static <T> Specification<T> be(Specification<T> actual, T expected) {
		return be(actual, is(expected));
	}

	public static <T> void any(Specification<T> actual, T... candidates){
		throw new UnsupportedOperationException();
	}
	
	public static <T> void not(Specification<T> actual, T expected) {
		be(actual.append(Step.NOT), expected);
	}

	public static <T> Specification<T> not(Specification<T> actual) {
		return actual.append(Step.NOT);
	}

	public static <T> Specification<T> be(Specification<T> actual) {
		return actual;
	}
	
}
