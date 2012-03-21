/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.TypeSafeMatcher;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Should {

	public static <T> Matcher<T> matches(final String desc, final Function1<T, Boolean> matcher){
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
	
	public static Matcher<String> startWith(String substring){
		return Matchers.startsWith(substring);
	}
	
	public static Matcher<String> endWith(String substring){
		return Matchers.endsWith(substring);
	}

}
