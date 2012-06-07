package org.jnario.compiler

import org.apache.log4j.BasicConfigurator
import org.jnario.feature.FeatureStandaloneSetup
import org.jnario.feature.compiler.batch.FeatureDocCompiler
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.spec.compiler.batch.SpecDocCompiler

import static org.jnario.compiler.DocGeneratorMain.*

class DocGeneratorMain {
	
	def static void main(String[] args) {
		if ((args == null) || (args.size == 0)) {
			printUsage();
			return;
		}

		BasicConfigurator::configure();
		{
			val injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration()
			val compiler = injector.getInstance(typeof(SpecDocCompiler))
			run(compiler, args);
		}
		{
			val injector = new FeatureStandaloneSetup().createInjectorAndDoEMFRegistration();
			val compiler = injector.getInstance(typeof(FeatureDocCompiler));
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