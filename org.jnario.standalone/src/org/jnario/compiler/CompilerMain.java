/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/


package org.jnario.compiler;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.feature.compiler.batch.FeatureBatchCompiler;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.spec.compiler.batch.SpecBatchCompiler;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class CompilerMain {

	public static void main(String[] args) {
		if ((args == null) || (args.length == 0)) {
			printUsage();
			return;
		}

		BasicConfigurator.configure();
		
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		Provider<ResourceSet> resourceSetProvider = injector.getProvider(ResourceSet.class);
		ResourceSet resourceSet = resourceSetProvider.get();
		
		JnarioBatchCompiler compiler = injector.getInstance(SpecBatchCompiler.class);
		run(compiler, args, resourceSet);
		
		injector = new FeatureStandaloneSetup().createInjectorAndDoEMFRegistration();
		compiler = injector.getInstance(FeatureBatchCompiler.class);
		run(compiler, args, resourceSet);
		
		injector = new SuiteStandaloneSetup().createInjectorAndDoEMFRegistration();
		compiler = injector.getInstance(FeatureBatchCompiler.class);
		run(compiler, args, resourceSet);
	}

	private static void run(JnarioBatchCompiler jnarioCompiler, String[] args, ResourceSet resourceSet) {
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
		jnarioCompiler.setResourceSet(resourceSet);
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

}
