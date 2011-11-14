package de.bmw.carit.jnario.lib;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.hamcrest.Matcher;
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
	
}
