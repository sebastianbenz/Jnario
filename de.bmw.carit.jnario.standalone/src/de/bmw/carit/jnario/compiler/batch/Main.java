package de.bmw.carit.jnario.compiler.batch;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.BasicConfigurator;

import com.google.inject.Injector;

import de.bmw.carit.jnario.spec.SpecStandaloneSetup;

/**
 * @author Sebastian Benz
 */
public class Main {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		SpecBatchCompiler jnarioCompiler = injector.getInstance(SpecBatchCompiler.class);
		if ((args == null) || (args.length == 0)) {
			printUsage();
			return;
		}
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

}
