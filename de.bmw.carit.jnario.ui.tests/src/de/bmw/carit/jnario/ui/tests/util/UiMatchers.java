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
