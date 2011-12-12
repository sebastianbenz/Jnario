package de.bmw.carit.jnario.lib;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Assert;

@SuppressWarnings("restriction")
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
	
	public static <T> void should(T expected, T value) {
		Assert.assertEquals(expected, value);
	}
	
    @Factory
    public static <T> Matcher<T> be(Matcher<T> matcher) {
        return new Is<T>(matcher);
    }

    /**
     * This is a shortcut to the frequently used is(equalTo(x)).
     *
     * eg. assertThat(cheese, is(equalTo(smelly)))
     * vs  assertThat(cheese, is(smelly))
     */
    @Factory
    public static <T> Matcher<T> be(T value) {
        return is(equalTo(value));
    }
    
    /**
     * This is a shortcut to the frequently used is(instanceOf(SomeClass.class)).
     *
     * eg. assertThat(cheese, is(instanceOf(Cheddar.class)))
     * vs  assertThat(cheese, is(Cheddar.class))
     */
    @Factory
    public static Matcher<Object> be(Class<?> type) {
        return is(instanceOf(type));
    }
    
	public static <T> ISpecification<T> should(T input) {
		return new Specification<T>(input, Collections.<Step> emptyList());
	}
	
	public static <T> ISpecification<? extends T> be(ISpecification<? extends T> actual, Matcher<T> matcher) {
		actual.evaluate(matcher);
		return actual;
	}

	public static <T> ISpecification<? extends T> be(ISpecification<? extends T> actual, T expected) {
		return be(actual, is(expected));
	}
	
	public static <T> void any(ISpecification<? extends T> actual, T... candidates){
		throw new UnsupportedOperationException();
	}
	
	public static <T> void not(ISpecification<? extends T> actual, T expected) {
		be(actual.append(Step.NOT), expected);
	}

	public static <T> ISpecification<T> not(ISpecification<T> actual) {
		return actual.append(Step.NOT);
	}

	public static <T> ISpecification<T> be(ISpecification<T> actual) {
		return actual;
	}
	
	public static <T> void contain(ISpecification<? extends Iterable<T>> actual, T... elements){
		be(actual, hasItems(elements));
	}
	
	public static <T> void contain(ISpecification<? extends Iterable<T>> actual, Matcher<? extends T>... elementMatchers) {
		be(actual, hasItems(elementMatchers));
	}

	public static void startWith(ISpecification<String> actual, String expected) {
		be(actual, Matchers.startsWith(expected));
	}
	
	public static void endWith(ISpecification<String> actual, String expected) {
		be(actual, Matchers.endsWith(expected));
	}
	
	public static void contain(ISpecification<String> actual, String expected) {
		be(actual, Matchers.containsString(expected));
	}
	
	public static <T> ISpecification<T> each(T... inputs) {
		return new CompositeSpecification<T>(Arrays.asList(inputs));
	}
	
	public static <T> ISpecification<T> each(Iterable<? extends T> inputs) {
		return new CompositeSpecification<T>(inputs);
	}
}
