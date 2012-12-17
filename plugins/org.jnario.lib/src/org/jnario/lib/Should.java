/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static com.google.common.collect.Iterables.contains;

import java.util.Arrays;

import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.lib.Procedures;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import com.google.common.base.Objects;

/**
 * The default should matchers provided by Jnario. These 
 * can be used in Jnario for writing literate assertions. 
 * 
 * The name of a should method must conform to the following
 * convention: 
 * <p>
 * {@code should_xxxx(Type1 actual, Type2 expected)}.
 * </p>
 * Then it can be used in a spec in the following way:
 * <p>
 * {@code fact actual should xxxx expected}
 * </p>
 * 
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class Should{
	
	@SuppressWarnings("unchecked")
	public static boolean operator_doubleArrow(Object actual, Object expected) {
		if (expected instanceof Matcher<?>) {
			return ((Matcher<?>)expected).matches(actual);
		}
		if (!(actual instanceof Class<?>) && (expected instanceof Class<?>)) {
			return should_be(actual, (Class<?>) expected);
		}
		if (expected instanceof Procedures.Procedure1<?>) {
			((Procedures.Procedure1<Object>)expected).apply(actual);
			return true;
		}
		if (expected instanceof Functions.Function1<?,?>) {
			Object result = ((Functions.Function1<Object,Object>)expected).apply(actual);
			return result instanceof Boolean && ((Boolean)result);
		}
		if(isArray(actual) && isArray(expected)){
			return Arrays.equals((Object[])actual, (Object[])expected);
		}
		return Objects.equal(actual, expected);
	}

	private static boolean isArray(Object obj) {
		if(obj == null){
			return false;
		}
		return obj.getClass().isArray();
	}

// does not work due to a type inference problem in xtend
//	public static boolean operator_doubleArrow(Object actual, Class<?> expected) {
//		return should_be(actual, expected);
//	}
//	
//	public static <T> boolean operator_doubleArrow(T actual, Matcher<T> expected) {
//		return should_be(actual, expected);
//	}
//	
//	public static <T> boolean operator_doubleArrow(T actual, T expected) {
//		return should_be(actual, expected);
//	}
	
	public static <T> boolean should_be(Object actual, Object expected){
		return operator_doubleArrow(actual, expected);
	}

//	private static boolean haveSameTypeAndAreStrings(Object actual,
//			Object expected) {
//		return actual != null && expected != null && actual.getClass().equals(expected.getClass()) && actual instanceof CharSequence;
//	}

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
	
	public static <T> boolean should_contain(CharSequence actual, CharSequence substring){
		return actual.toString().contains(substring);
	}
	
	public static <T> boolean should_be(T actual, boolean result){
		if (actual instanceof Boolean) {
			return ((Boolean)actual).equals(result);
		}
		return result;
	}
	
	public static boolean should_startWith(CharSequence s, String substring){
		return s.toString().startsWith(substring);
	} 
	
	public static boolean should_endWith(CharSequence s, String substring){
		return s.toString().endsWith(substring);
	}
	
	public static <T> Matcher<T> matches(final String desc, final Functions.Function1<T, Boolean> matcher){
		return new BaseMatcher<T>() {

			public void describeTo(Description description) {
				description.appendText(desc);
			}

			@SuppressWarnings("unchecked")
			public boolean matches(Object item) {
				return matcher.apply((T) item);
			}
		};
	}
	
	/**
	 * A helper method to mark irrelevant values.
	 * 
	 * @return always null
	 */
	public static <T> T _(){
		return null;
	}
}
