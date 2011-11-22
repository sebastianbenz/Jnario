package de.bmw.carit.jnario.common.test.util;

import static com.google.common.collect.Iterables.filter;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.experimental.results.PrintableResult;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.inject.Inject;

public abstract class BehaviorExecutor {

	private final IGenerator generator;
	private final JavaIoFileSystemAccess fsa;
	private final TemporaryFolder tempFolder;
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	private IResourceValidator validator;

	@Inject
	public BehaviorExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, IResourceValidator validator) {
		this.generator = generator;
		this.fsa = fsa;
		this.tempFolder = tempFolder;
		this.validator = validator;
	}

	public PrintableResult run(EObject object) {
		try {
			configureOutlet();
			validate(object);
			generateJava(object);
			return runExamples(object);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			return null; // not reachable
		} finally {
			tempFolder.delete();
		}
	}

	private void validate(EObject object) {
		Iterable<Issue> issues = validator.validate(object.eResource(), CheckMode.NORMAL_AND_FAST, CancelIndicator.NullImpl);
		Iterable<Issue> onlyErrors = filterErrors(issues);
		assertFalse("Validation errors\n" + Joiner.on("\n  ").join(issues), onlyErrors.iterator().hasNext());
	}

	public Iterable<Issue> filterErrors(Iterable<Issue> issues) {
		Iterable<Issue> onlyErrors = filter(issues, new Predicate<Issue>() {

			public boolean apply(Issue input) {
				return input.getSeverity() == Severity.ERROR;
			}
		});
		return onlyErrors;
	}

	private void configureOutlet() throws IOException {
		tempFolder.create();
		fsa.setOutputPath(tempFolder.getRoot().getAbsolutePath());
	}

	protected void generateJava(EObject object) {
		generator.doGenerate(object.eResource(), fsa);
	}

	protected abstract PrintableResult runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException;

	protected void compileJavaFile(String packageName, String specClassName) {
		String specJavaFile = getGeneratedJavaClassName(packageName, specClassName);
		compiler.run(System.in, System.out, System.err, specJavaFile);
	}

	protected List<Failure> execute(Class<?> cls) {
		return JUnitCore.runClasses(cls).getFailures();
	}

	protected Class<?> loadGeneratedClass(String packageName, String specClassName)
			throws MalformedURLException, ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader
				.newInstance(new URL[] { tempFolder.getRoot().toURI().toURL() });
		String className = packageName + "." + specClassName;
		CompositeClassLoader compositeClassLoader = new CompositeClassLoader(classLoader);
		return Class.forName(className, true, compositeClassLoader);
	}

	private String getGeneratedJavaClassName(String packageName, String specClassName) {
		StringBuilder sb = new StringBuilder();
		sb.append(tempFolder.getRoot().getAbsolutePath());
		sb.append(File.separator);
		sb.append(packageName.replaceAll("\\.", File.separator + File.separator));
		sb.append(File.separator);
		sb.append(specClassName);
		sb.append(".java");
		return sb.toString();
	}

	protected List<Failure> runTestsInClass(String className, String packageName, List<Failure> failures)
			throws MalformedURLException, ClassNotFoundException {
		compileJavaFile(packageName, className);
		Class<?> testClass = loadGeneratedClass(packageName, className);
		List<Failure> newFailures = execute(testClass);
		failures.addAll(newFailures);
		return failures;
	}

}
