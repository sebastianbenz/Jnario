/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.jnario.Activator;

import com.google.common.base.Predicate;

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

	private final String relativeFolder;
	private final Class<?> klass;
	private Predicate<URI> filter;

	ClassPathUriProvider(Class<?> context, String relativeFolder, Predicate<URI> filter) {
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