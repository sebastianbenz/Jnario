package de.bmw.carit.jnario.spec.tests.util;

import static com.google.common.collect.Lists.newArrayList;
import static de.bmw.carit.jnario.tests.util.ClassPathUriProvider.startingFrom;
import static junit.framework.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.experimental.results.PrintableResult;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.bmw.carit.jnario.spec.SpecInjectorProvider;
import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;

public class SpecExecutor {

	public static PrintableResult execute(String content) {
		SpecInjectorProvider injectorProvider = new SpecInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = injectorProvider.getInjector();
			
			Resource resource = new XtextResourceSet().createResource(URI.createURI("dummy.spec"));
			try {
				resource.load(new StringInputStream(content), Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
				org.junit.Assert.fail(e.getMessage());
			}
			
			SpecExecutor executor = injector.getInstance(SpecExecutor.class);
			return executor.run((SpecFile) resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
		
		
	}
	

	private final IGenerator generator;
	private final JavaIoFileSystemAccess fsa;
	private final TemporaryFolder tempFolder;
	private final JavaNameProvider nameProvider;
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

	@Inject
	public SpecExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider) {
		this.generator = generator;
		this.fsa = fsa;
		this.tempFolder = tempFolder;
		this.nameProvider = javaNameProvider;
	}

	public PrintableResult run(SpecFile spec) {
		try {
			configureOutlet();
			generateJavaSpec(spec);
			return runExamples(spec);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			return null; // not reachable
		} finally {
			tempFolder.delete();
		}
	}

	private void configureOutlet() throws IOException {
		tempFolder.create();
		fsa.setOutputPath(tempFolder.getRoot().getAbsolutePath());
	}

	private void generateJavaSpec(SpecFile spec) {
		generator.doGenerate(spec.eResource(), fsa);
		assertFalse("has no examples", spec.getElements().isEmpty());
	}

	private PrintableResult runExamples(SpecFile spec)
			throws MalformedURLException, ClassNotFoundException {
		List<Failure> failures = newArrayList();
		for (ExampleGroup exampleGroup : spec.getElements()) {
			String specClassName = nameProvider.getJavaClassName(exampleGroup);
			compileSpecJavaFile(spec, specClassName);
			Class<?> testClass = loadGeneratedClass(spec, specClassName);
			List<Failure> newFailures = execute(testClass);
			failures.addAll(newFailures);
		}
		return new PrintableResult(failures);
	}

	private void compileSpecJavaFile(SpecFile spec, String specClassName) {
		String specJavaFile = getGeneratedJavaClassName(spec, specClassName);
		compiler.run(System.in, System.out, System.err, specJavaFile);
	}

	private List<Failure> execute(Class<?> cls) {
		return JUnitCore.runClasses(cls).getFailures();
	}

	private Class<?> loadGeneratedClass(SpecFile spec, String specClassName)
			throws MalformedURLException, ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader
				.newInstance(new URL[] { tempFolder.getRoot().toURI().toURL() });
		String className = spec.getPackageName() + "." + specClassName;
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
