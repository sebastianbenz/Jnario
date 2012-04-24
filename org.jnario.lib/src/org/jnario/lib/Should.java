/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static com.google.common.collect.Iterables.contains;

import org.eclipse.xtext.xbase.lib.Functions;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import com.google.common.base.Objects;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Should {

	public static boolean should_be(Object actual, Object expected){
		return Objects.equal(actual, expected);
	}
	
	public static boolean should_be(Object actual, Class<?> expectedType){
		return expectedType.isInstance(actual);
	}
	
	public static <T> boolean should_be(T actual, Matcher<T> matcher){
		if(matcher == null){
			return actual == null;
		}
		return matcher.matches(actual);
	}
	
	public static <T> boolean should_contain(Iterable<T> actual, T element){
		return contains(actual, element);
	}
	
	public static <T> boolean should_contain(Iterable<T> collection, Matcher<T> matcher){
		for (T item : collection) {
            if (matcher.matches(item)){
                return true;
            }
        }
        return false;
	}
	
	public static <T> boolean should_contain(String actual, CharSequence substring){
		return actual.contains(substring);
	}
	
	public static <T> boolean should_be(T actual, boolean result){
		if (actual instanceof Boolean) {
			return ((Boolean)actual).equals(result);
		}
		return result;
	}
	
	public static <T> Matcher<T> matches(final String desc, final Functions.Function1<T, Boolean> matcher){
		return new TypeSafeMatcher<T>() {

			public void describeTo(Description description) {
				description.appendText(desc);
			}

			@Override
			public boolean matchesSafely(T item) {
				return matcher.apply(item);
			}
		};
	}
}
