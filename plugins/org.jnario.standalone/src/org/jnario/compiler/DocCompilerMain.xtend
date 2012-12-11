/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler

import com.google.common.io.Closeables
import com.google.inject.Injector
import java.io.File
import java.io.FileInputStream
import org.apache.log4j.BasicConfigurator
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.Property
import org.jnario.report.HashBasedSpec2ResultMapping
import org.jnario.report.SpecResultParser

import static org.jnario.compiler.CompilerMain.*
import static org.jnario.compiler.DocCompilerMain.*


class DocCompilerMain {
	
	def static void main(String[] args) {
		if ((args == null) || (args.size == 0)) {
			printUsage();
			return;
		}
	
		new DocCompilerMain => [
			val arguments = args.iterator
			while(arguments.hasNext){
				val argument = arguments.next.trim
				switch(argument){
					case argument == "-cp" || argument == "-classpath": setClassPath(arguments.next)
					case "-d": setOutputPath(arguments.next)
					case "-results": setResultFolder(arguments.next)
					case "-encoding": setFileEncoding(arguments.next)
					default: setSourcePath(argument)
				}
			}	
		]
	}
	
	@Property String outputPath = "doc-gen";
	@Property String classPath = "";
	@Property String resultFolder = "";
	@Property String fileEncoding = "UTF-8";
	@Property String sourcePath = ".";
	
	def compile() {
		BasicConfigurator::configure();
		val anyInjector = SETUPS.get(0).createInjectorAndDoEMFRegistration()
		val resourceSet = anyInjector.getInstance(typeof(ResourceSet));
		
		anyInjector.generateCssAndJsFiles
		generateDocs(resourceSet)
	}
	
	def private generateDocs(ResourceSet resourceSet){
		for (setup : SETUPS) {
			val injector = setup.createInjectorAndDoEMFRegistration();
			val jnarioCompiler = injector.getInstance(typeof(JnarioDocCompiler));
			jnarioCompiler.setOutputPath(outputPath);
			jnarioCompiler.setClassPath(classPath);
			jnarioCompiler.setFileEncoding(fileEncoding);
			jnarioCompiler.setSourcePath(sourcePath);
			jnarioCompiler.setResourceSet(resourceSet);
			jnarioCompiler.setExecutable2ResultMapping(createSpec2ResultMapping)
			if(!jnarioCompiler.compile()){
				return COMPILATION_ERROR;
			}
		}
		return OK;
	}
	
	def private static void printUsage() {
		println("Usage: JnarioDocCompiler <options> <source directories>")
		println("where possible options include:")
		println("-d <directory>             Specify where to place generated documentation files")
		println("-results <folder>          Specify folder containing JUnit XML test results")
		println("-encoding <encoding>       Specify character encoding used by source files")
	}
	
	def HashBasedSpec2ResultMapping createSpec2ResultMapping()  {
		val resultMapping =  SETUPS.get(2).createInjectorAndDoEMFRegistration.getInstance(typeof(HashBasedSpec2ResultMapping));
		val reportFolder = new File(resultFolder);
		if(reportFolder.exists()){
			addExecutionResults(resultMapping, reportFolder);
		}
		return resultMapping;
	}

	def generateCssAndJsFiles(Injector injector) {
		val assetsCompiler = injector.getInstance(typeof(HtmlAssetsCompiler));
		assetsCompiler.setOutputPath(outputPath);
		assetsCompiler.compile();
	}

	def void addExecutionResults(HashBasedSpec2ResultMapping resultMapping, File reportFolder)  {
		val specResultParser = new SpecResultParser();
		for (File file : reportFolder.listFiles([name.endsWith("xml")])) {
			var FileInputStream is = null;
			try {
				is = new FileInputStream(file);
				specResultParser.parse(is, resultMapping);
			}finally{
				Closeables::closeQuietly(is)
			}
			
		}
	}
}