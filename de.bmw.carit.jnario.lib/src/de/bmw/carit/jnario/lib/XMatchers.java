/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.lib;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.collection.IsCollectionContaining.hasItems;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsNot;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
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
	
	public static MatcherChain<String> contain(MatcherChain<String> matcherChain, CharSequence expected) {
		be(matcherChain, containsString(expected.toString()));
		return matcherChain;
	}
	
	public static <T> MatcherChain<T> match(MatcherChain<T> matcherChain, final String stringDescription, final Function1<T, Boolean> matchingFunction) {
		Matcher<T> expected = new TypeSafeMatcher<T>() {

			@Override
			public void describeTo(Description description) {
				description.appendText(stringDescription);
			}

			@Override
			public boolean matchesSafely(T item) {
				return matchingFunction.apply(item);
			}
		};
		return matcherChain.assertMatches(expected);
	}

}
