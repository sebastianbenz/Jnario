package de.bmw.carit.jnario.lib;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.collection.IsCollectionContaining.hasItems;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsNot;

public class XMatchers {

	public static class IsFactory<T> implements MatcherFactory<T> {
		
		public Matcher<T> create(Matcher<T> matcher) {
			return CoreMatchers.is(matcher);
		}

		@SuppressWarnings("unchecked")
		public Matcher<T> create(Class<?> expected) {
			return (Matcher<T>) CoreMatchers.is(expected);
		}
	}

	private static final class IsNotFactory<T> implements MatcherFactory<T> {
		public Matcher<T> create(Matcher<T> expected) {
			return new IsNot<T>(expected);
		}
	}

	public static <T> MatcherChain<T> should(MatcherChain<T> matcherBuilder) {
		return matcherBuilder;
	}

	public static <T> MatcherChain<T> should(final T actual) {
		return new SingleTargetMatcherChain<T>(actual);
	}
	

	public static <T> MatcherChain<T> be(MatcherChain<T> matcherBuilder, T expected) {
		return be(matcherBuilder, CoreMatchers.equalTo(expected));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> MatcherChain<T> be(MatcherChain<T> matcherBuilder, Class<?> expected) {
		return matcherBuilder.assertMatches((Matcher<T>) instanceOf(expected));
	}
	
	public static <T> MatcherChain<T> be(MatcherChain<T> matcherBuilder, Matcher<T> expected) {
		return matcherBuilder.assertMatches(expected);
	}

	public static <T> MatcherChain<T> be(MatcherChain<T> matcherBuilder) {
		return matcherBuilder.append(new IsFactory<T>());
	}

	public static <T> MatcherChain<T> not(MatcherChain<T> matcherBuilder, T expected) {
		be(matcherBuilder, CoreMatchers.not(expected));
		return matcherBuilder;
	}

	public static <T> MatcherChain<T> not(MatcherChain<T> matcherBuilder) {
		return matcherBuilder.append(new IsNotFactory<T>());
	}
	
	public static <T> MatcherChain<T> not(MatcherChain<T> matcherBuilder, Matcher<T> expected) {
		return be(matcherBuilder, CoreMatchers.not(expected));
	}
	
	@SuppressWarnings("unchecked") // incompatibility between javac and JDT compiler
	public static <T> MatcherChain<? extends Iterable<T>> contain(MatcherChain<? extends Iterable<T>> matcherBuilder, T... expected) {
		return be((MatcherChain<Iterable<T>>)matcherBuilder, hasItems(expected));
	}

	@SuppressWarnings("unchecked") // incompatibility between javac and JDT compiler
	public static <T> MatcherChain<? extends Iterable<T>> contain(MatcherChain<? extends Iterable<T>> matcherBuilder, Matcher<? extends T>... matchers) {
		return be((MatcherChain<Iterable<T>>)matcherBuilder, hasItems(matchers));
	}
	
	public static MatcherChain<String> startWith(MatcherChain<String> matcherBuilder, String expected) {
		return be(matcherBuilder, startsWith(expected));
	}
	
	public static MatcherChain<String> endWith(MatcherChain<String> matcherBuilder, String expected) {
		be(matcherBuilder, endsWith(expected));
		return matcherBuilder;
	}
	
	public static MatcherChain<String> contain(MatcherChain<String> matcherBuilder, String expected) {
		be(matcherBuilder, containsString(expected));
		return matcherBuilder;
	}

}
