package de.bmw.carit.jnario.spec.tests.util;

import static com.google.common.collect.Lists.newArrayList;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import junit.framework.Assert;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.junit.experimental.results.PrintableResult;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;

public class SpecExecutor {

	private final IGenerator generator;
	private final JavaIoFileSystemAccess fsa;
	private final TemporaryFolder tempFolder;
	private final JavaNameProvider javaNameProvider;
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

	@Inject
	public SpecExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider) {
		this.generator = generator;
		this.fsa = fsa;
		this.tempFolder = tempFolder;
		this.javaNameProvider = javaNameProvider;
	}

	public List<PrintableResult> execute(SpecFile spec) {
		List<PrintableResult> results = newArrayList();
		try {
			tempFolder.create();
			fsa.setOutputPath(tempFolder.getRoot().getAbsolutePath());
			generator.doGenerate(spec.eResource(), fsa);
			
			for (ExampleGroup exampleGroup : spec.getElements()) {
				String specClassName = javaNameProvider.getJavaClassName(exampleGroup);
				String file = getGeneratedJavaClassName(spec, specClassName);
				compiler.run(System.in, System.out, System.err, file);
				Class<?> testClass = loadGeneratedClass(spec, specClassName); 
				results.add(execute(testClass));
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}finally{
			tempFolder.delete();
		}
		return results;
	}

	private PrintableResult execute(Class<?> cls) {
		return new PrintableResult(JUnitCore.runClasses(cls).getFailures());
	}

	private Class<?> loadGeneratedClass(SpecFile spec, String specClassName)
			throws MalformedURLException, ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader.newInstance(
				new URL[] { 
						tempFolder.getRoot().toURI().toURL() 
				});
		String className = spec.getPackageName() + "."	+ specClassName;
		return Class.forName(className, true, classLoader);
	}

	private String getGeneratedJavaClassName(SpecFile spec, String specClassName) {
		StringBuilder sb = new StringBuilder();
		sb.append(tempFolder.getRoot().getAbsolutePath());
		sb.append(File.separator);
		sb.append(spec.getPackageName().replaceAll("\\.", File.separator));
		sb.append(File.separator);
		sb.append(specClassName);
		sb.append(".java");
		return sb.toString();
	}

}
