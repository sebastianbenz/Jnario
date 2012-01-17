package de.bmw.carit.jnario.tests.util;

import static com.google.common.collect.Iterators.find;
import static com.google.common.collect.Sets.newHashSet;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

import com.google.common.base.Predicate;

/**
 * @author Sebastian Benz
 */
@SuppressWarnings("restriction")
public class Matchers extends CoreMatchers{

	public static Matcher<Resource> hasNoErrors() {
		return new TypeSafeMatcher<Resource>() {

			public void describeTo(Description description) {
				description.appendText("has no errors");
			}

			@Override
			public boolean matchesSafely(Resource resource) {
				return resource.getErrors().isEmpty();
			}
		};
	}

	public static TypeSafeMatcher<EObject> contains(final Predicate<EObject> predicate) {
		return new TypeSafeMatcher<EObject>() {
	
			public void describeTo(Description description) {
				description.appendText(predicate.toString());
			}
	
			@Override
			public boolean matchesSafely(EObject item) {
				try{
					find(item.eAllContents(), predicate);
					return true;
				}catch (NoSuchElementException e) {
					return false;
				}
			}
		};
	}

	public static Matcher<File> contains(final String... fileNames) {
		return new TypeSafeMatcher<File>() {
	
			public void describeTo(Description description) {
				description.appendText("contains " + fileNames);
			}
	
			@Override
			public boolean matchesSafely(File item) {
				try {
					ZipFile zipFile = new ZipFile(item);
					for (String fileName : fileNames) {
						ZipEntry entry = zipFile.getEntry(fileName);
						if(entry == null){
							return false;
						}
					}
				} catch (Exception e) {
					throw new WrappedException(e);
				}
				return true;
			}
	
		};
	}

	public static <T> Matcher<Set<T>> are(T... elements) {
		Set<T> set = newHashSet(elements);
		return is(set);
	}

}
