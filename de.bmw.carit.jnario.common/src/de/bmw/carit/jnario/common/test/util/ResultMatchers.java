/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.experimental.results.PrintableResult;
import org.junit.internal.matchers.TypeSafeMatcher;
import org.junit.runner.Result;

public class ResultMatchers {

	public static Matcher<Result> ignoreCountIs(final int count) {
		return new TypeSafeMatcher<Result>() {
			public void describeTo(Description description) {
				description.appendText("has " + count + " ignored tests");
			}

			@Override
			public boolean matchesSafely(Result item) {
				return item.getIgnoreCount() == count;
			}
		};
	}

	public static Matcher<Result> isSuccessful() {
		return failureCountIs(0);
	}

	public static Matcher<Result> failureCountIs(final int count) {
		return new TypeSafeMatcher<Result>() {
			public void describeTo(Description description) {
				description.appendText("has " + count + " failures");
			}

			@Override
			public boolean matchesSafely(Result item) {
				return item.getFailureCount() == count;
			}
		};
	}

	public static Matcher<Result> hasSingleFailureContaining(final String string) {
		return new TypeSafeMatcher<Result>() {
			public boolean matchesSafely(Result item) {
				return new PrintableResult(item.getFailures()).toString().contains(string)
						&& failureCountIs(1).matches(item);
			}

			public void describeTo(Description description) {
				description.appendText("has single failure containing "
						+ string);
			}
		};
	}
}
