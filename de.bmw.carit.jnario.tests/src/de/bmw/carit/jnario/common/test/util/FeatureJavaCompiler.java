/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;

import com.google.common.base.Joiner;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class FeatureJavaCompiler extends EclipseRuntimeDependentJavaCompiler{
	
	private static final FeatureJavaCompiler compiler = new FeatureJavaCompiler();
	
	private FeatureJavaCompiler(){
		
	}
	
	private Set<String> jnarioClassPath = new HashSet<String>();
	
	private final class Progress extends
			CompilationProgress {
		@Override
		public void worked(int workIncrement, int remainingWork) {
		}

		@Override
		public void setTaskName(String name) {
		}

		@Override
		public boolean isCanceled() {
			return false;
		}

		@Override
		public void done() {
		}

		@Override
		public void begin(int remainingWork) {
		}
	}


	public void compile(List<String> files) {
		StringBuilder sb = new StringBuilder(getComplianceLevelArg());
		sb.append(" ");
		sb.append(getClasspathArgs());
		sb.append(" ");
		sb.append(Joiner.on(" ").join(files));
		OutputStream errorStream = new ByteArrayOutputStream();
		if(!Main.compile(Main.tokenize(sb.toString()), new PrintWriter(System.out), new PrintWriter(errorStream ), new Progress())){
			throw new IllegalArgumentException("Couldn't compile : " + errorStream.toString() + "\n" );
		}
	}
	
	@Override
	public void addClassPath(String classpath) {
		this.jnarioClassPath.add(classpath);
	}
	
	@Override
	public void addClassPathOfClass(Class<?> clazz) {
		final String classNameAsPath = "/" + clazz.getCanonicalName().replace('.', '/');
		String resourceName = classNameAsPath + ".class";
		URL url = clazz.getResource(resourceName);
		if (url == null)
			throw new IllegalArgumentException(resourceName + " not found");
		String pathToFolderOrJar = null;
		if (url.getProtocol().startsWith("bundleresource")) {
			try {
				url = resolveBundleResourceURL(url);
			} catch (IOException e) {
				throw new WrappedException(e);
			}
		}
		if (url.getProtocol().startsWith("jar")) {
			try {
				pathToFolderOrJar = new URL(url.getPath().substring(0, url.getPath().indexOf('!'))).toURI()
						.getRawPath();
			} catch (Exception e) {
				throw new WrappedException(e);
			}
		} else {
			String resolvedRawPath;
			try {
				resolvedRawPath = URIUtil.toURI(url).getRawPath();
			} catch (URISyntaxException e) {
				throw new WrappedException(e);
			}
			pathToFolderOrJar = resolvedRawPath.substring(0, resolvedRawPath.indexOf(classNameAsPath));
		}
		jnarioClassPath.add(pathToFolderOrJar);
	}
	
	@Override
	public String getClasspathArgs() {
		StringBuilder sb = new StringBuilder();
		sb.append("-classpath ");
		Iterator<String> iterator = jnarioClassPath.iterator();
		while(iterator.hasNext()){
			sb.append(iterator.next());
			if (iterator.hasNext())
				sb.append(File.pathSeparator);
		}
		return sb.toString();
	}

	public static FeatureJavaCompiler getInstance() {
		return compiler;
	}
	
	
	
}
