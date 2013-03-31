/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.eclipse.emf.common.util.URI;
import org.jnario.jnario.test.util.ClassPathUriProvider.FileNameIs;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class ClassPathUriProviderBuilder {

	private final Class<?> context;
	private String relativeFolder = ".";
	
	public ClassPathUriProviderBuilder(Class<?> context) {
		this.context = context;
	}

	public ClassPathUriProviderBuilder(Object context) {
		this.context = context.getClass();
	}

	public ClassPathUriProviderBuilder in(String relativeFolder) {
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

	public static ClassPathUriProviderBuilder startingFrom(Class<?> context) {
		return new ClassPathUriProviderBuilder(context);
	}

	public static ClassPathUriProviderBuilder startingFrom(Object context) {
		return new ClassPathUriProviderBuilder(context);
	}

}