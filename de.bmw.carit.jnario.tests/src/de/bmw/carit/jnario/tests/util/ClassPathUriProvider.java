package de.bmw.carit.jnario.tests.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

@SuppressWarnings("restriction")
public class ClassPathUriProvider implements IUriProvider {

	public static class FileNameIs implements Predicate<URI> {

		private HashSet<String> validNames;

		public FileNameIs(String[] fileNames) {
			this.validNames = newHashSet(fileNames);
		}

		public boolean apply(URI input) {
			return validNames.contains(input.lastSegment());
		}

	}

	public static class Builder {

		private final Class<?> context;
		private String relativeFolder = ".";
		
		public Builder(Class<?> context) {
			this.context = context;
		}

		public Builder(Object context) {
			this.context = context.getClass();
		}

		public Builder in(String relativeFolder) {
			this.relativeFolder = relativeFolder;
			return this;
		}

		public IUriProvider select(String... fileNames) {
			return new ClassPathUriProvider(context, relativeFolder, new FileNameIs(fileNames));
		}

		public IUriProvider selectAll() {
			return new ClassPathUriProvider(context, relativeFolder, Predicates.<URI>alwaysTrue());
		}

		public IUriProvider select(Predicate<URI> filter) {
			return new ClassPathUriProvider(context, relativeFolder, filter);
		}

	}

	public static ClassPathUriProvider.Builder startingFrom(Object context) {
		return new Builder(context);
	}
	
	public static ClassPathUriProvider.Builder startingFrom(Class<?> context) {
		return new Builder(context);
	}

	private final String relativeFolder;
	private final Class<?> klass;
	private Predicate<URI> filter;

	private ClassPathUriProvider(Class<?> context, String relativeFolder, Predicate<URI> filter) {
		klass = context;
		this.relativeFolder = relativeFolder;
		this.filter = filter;
	}

	public Iterable<URI> allUris() {
		return filter(allResources(), filter);
	}

	private Iterable<URI> allResources() {
		URL parentFolder = klass.getResource(relativeFolder);
		List<URI> result = new ArrayList<URI>();
		try {
			if (Activator.getDefault() != null) {
				parentFolder = FileLocator.resolve(parentFolder);
			}
		} catch (IOException e) {
			throwRuntimeException(e);
		}
		java.net.URI uri = null;
		try {
			uri = parentFolder.toURI();
		} catch (URISyntaxException e) {
			throwRuntimeException(e);
		}
		File folder = new File(uri);
		for (File child : folder.listFiles()) {
			if (child.isFile()) {
				result.add(URI.createFileURI(child.getAbsolutePath()));
			}
		}
		return result;
	}

	private void throwRuntimeException(Exception e) {
		throw new RuntimeException(e);
	}

	
}