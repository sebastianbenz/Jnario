/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/


package org.jnario.compiler;

import static com.google.common.collect.Lists.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ISetup;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.inject.Injector;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class CompilerMain {

	public static final int COMPILATION_ERROR = -1;
	public static final int OK = 0;

	public static void main(String[] args) {
		if ((args == null) || (args.length == 0)) {
			printUsage();
		}
		CompilerMain jnarioCompiler = new CompilerMain();
		Iterator<String> arguments = Arrays.asList(args).iterator();
		while (arguments.hasNext()) {
			String argument = arguments.next();
			if ("-d".equals(argument.trim())) {
				jnarioCompiler.setOutputPath(arguments.next().trim());
			} else if ("-classpath".equals(argument.trim()) || "-cp".equals(argument.trim())) {
				jnarioCompiler.setClassPath(arguments.next().trim());
			} else if ("-tempdir".equals(argument.trim()) || "-td".equals(argument.trim())) {
				jnarioCompiler.setTempDirectory(arguments.next().trim());
			} else if ("-encoding".equals(argument.trim())) {
				jnarioCompiler.setFileEncoding(arguments.next().trim());
			} else {
				jnarioCompiler.setSourcePath(argument);
			}
		}
		jnarioCompiler.compile();
	}
	
	private static void printUsage() {
		System.out.println("Usage: JnarioBatchCompiler <options> <source directories>");
		System.out.println("where possible options include:");
		System.out.println("-d <directory>             Specify where to place generated jnario files");
		System.out.println("-tp <path>                 Temp directory to hold generated stubs and classes");
		System.out.println("-cp <path>                 Specify where to find user class files");
		System.out.println("-encoding <encoding>       Specify character encoding used by source files");
	}
	
	private String outputPath;
	private String classPath;
	private String tempDirectory;
	private String fileEncoding;
	private String sourcePath;

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	public void setTempDirectory(String tempDirectory) {
		this.tempDirectory = tempDirectory;
	}

	public void setFileEncoding(String fileEncoding) {
		this.fileEncoding = fileEncoding;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public int compile() {
		BasicConfigurator.configure();
		ResourceSet resourceSet = SETUPS.get(0).createInjectorAndDoEMFRegistration().getInstance(ResourceSet.class);
		for (ISetup setup : SETUPS) {
			Injector injector = setup.createInjectorAndDoEMFRegistration();
			JnarioBatchCompiler jnarioCompiler = injector.getInstance(JnarioBatchCompiler.class);
			jnarioCompiler.setOutputPath(outputPath);
			jnarioCompiler.setClassPath(classPath);
			jnarioCompiler.setTempDirectory(tempDirectory);
			jnarioCompiler.setFileEncoding(fileEncoding);
			jnarioCompiler.setSourcePath(sourcePath);
			jnarioCompiler.setResourceSet(resourceSet);
			if(!jnarioCompiler.compile()){
				return COMPILATION_ERROR;
			}
		}
		return OK;
	}

	public static final List<ISetup> SETUPS =  newArrayList(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());

}
