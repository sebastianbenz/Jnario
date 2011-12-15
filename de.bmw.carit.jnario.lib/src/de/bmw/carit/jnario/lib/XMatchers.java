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

	public static <T> MatcherChain<T> should(MatcherChain<T> matcherChain) {
		return matcherChain;
	}

	public static <T> MatcherChain<T> should(final T actual) {
		return new SingleTargetMatcherChain<T>(actual);
	}
	

	public static <T> MatcherChain<T> be(MatcherChain<T> matcherChain, T expected) {
		return be(matcherChain, CoreMatchers.equalTo(expected));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> MatcherChain<T> be(MatcherChain<T> matcherChain, Class<?> expected) {
		return matcherChain.assertMatches((Matcher<T>) instanceOf(expected));
	}
	
	public static <T> MatcherChain<T> be(MatcherChain<T> matcherChain, Matcher<T> expected) {
		return matcherChain.assertMatches(expected);
	}

	public static <T> MatcherChain<T> be(MatcherChain<T> matcherChain) {
		return matcherChain.append(new IsFactory<T>());
	}

	public static <T> MatcherChain<T> not(MatcherChain<T> matcherChain, T expected) {
		be(matcherChain, CoreMatchers.not(expected));
		return matcherChain;
	}

	public static <T> MatcherChain<T> not(MatcherChain<T> matcherChain) {
		return matcherChain.append(new IsNotFactory<T>());
	}
	
	public static <T> MatcherChain<T> not(MatcherChain<T> matcherChain, Matcher<T> expected) {
		return be(matcherChain, CoreMatchers.not(expected));
	}
	
	@SuppressWarnings("unchecked") // incompatibility between javac and JDT compiler
	public static <T> MatcherChain<? extends Iterable<T>> contain(MatcherChain<? extends Iterable<T>> matcherChain, T... expected) {
		return be((MatcherChain<Iterable<T>>)matcherChain, hasItems(expected));
	}

	@SuppressWarnings("unchecked") // incompatibility between javac and JDT compiler
	public static <T> MatcherChain<? extends Iterable<T>> contain(MatcherChain<? extends Iterable<T>> matcherChain, Matcher<? extends T>... matchers) {
		return be((MatcherChain<Iterable<T>>)matcherChain, hasItems(matchers));
	}
	
	public static MatcherChain<String> startWith(MatcherChain<String> matcherChain, String expected) {
		return be(matcherChain, startsWith(expected));
	}
	
	public static MatcherChain<String> endWith(MatcherChain<String> matcherChain, String expected) {
		be(matcherChain, endsWith(expected));
		return matcherChain;
	}
	
	public static MatcherChain<String> contain(MatcherChain<String> matcherChain, String expected) {
		be(matcherChain, containsString(expected));
		return matcherChain;
	}

}
