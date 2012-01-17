/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

@SuppressWarnings("restriction")
public class UiMatchers {
	public static <T extends IResource> Matcher<T> exists() {
		return new TypeSafeMatcher<T>() {
	
			public void describeTo(Description description) {
				description.appendText("exists");
			}
	
			@Override
			public boolean matchesSafely(T item) {
				return item.exists();
			}
	
		};
	}

	public static Matcher<IFile> contains(final String expected) {
		return new TypeSafeMatcher<IFile>() {
	
			public void describeTo(Description description) {
				description.appendText("contains").appendValue(expected);
			}
	
			@Override
			public boolean matchesSafely(IFile file) {
				try {
					return Files.contentsOf(file).contains(expected);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			}
	
		};
	}
}
