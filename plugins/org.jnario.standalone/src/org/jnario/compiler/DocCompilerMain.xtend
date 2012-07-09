package org.jnario.compiler

import org.apache.log4j.BasicConfigurator
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.suite.SuiteStandaloneSetup

class DocCompilerMain {
	
	def static void main(String[] args) {
		if ((args == null) || (args.size == 0)) {
			printUsage();
			return;
		}

		BasicConfigurator::configure();
		{
			val injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration()
			
			val assetsCompiler = injector.getInstance(typeof(HtmlAssetsCompiler))
			run(assetsCompiler, args);
			
			val compiler = injector.getInstance(typeof(JnarioDocCompiler))
			run(compiler, args);
		}
		{
			val injector = new FeatureStandaloneSetup().createInjectorAndDoEMFRegistration();
			val compiler = injector.getInstance(typeof(JnarioDocCompiler));
			run(compiler, args);
		}
		{
			val injector = new SuiteStandaloneSetup().createInjectorAndDoEMFRegistration();
			val compiler = injector.getInstance(typeof(JnarioDocCompiler));
			run(compiler, args);
		}
	}
	
	def private static run(JnarioDocCompiler compiler, String[] args){
		val arguments = args.iterator
		while(arguments.hasNext){
			val argument = arguments.next.trim
			switch(argument){
				case argument == "-cp" || argument == "-classpath": compiler.setClassPath(arguments.next)
				case "-d": compiler.setOutputPath(arguments.next)
				case "-results": compiler.setResultFolder(arguments.next)
				case "-encoding": compiler.setFileEncoding(arguments.next)
				default: compiler.setSourcePath(argument)
			}
		}
		compiler.compile
	}
	
	def private static void printUsage() {
		println("Usage: JnarioDocCompiler <options> <source directories>")
		println("where possible options include:")
		println("-d <directory>             Specify where to place generated documentation files")
		println("-results <folder>          Specify folder containing JUnit XML test results")
		println("-encoding <encoding>       Specify character encoding used by source files")
	}
	 
}