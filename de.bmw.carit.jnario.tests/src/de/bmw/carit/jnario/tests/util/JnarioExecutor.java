package de.bmw.carit.jnario.tests.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
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
import com.google.inject.Injector;

import de.bmw.carit.jnario.JnarioInjectorProvider;
import de.bmw.carit.jnario.naming.JavaNameProvider;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;

public class JnarioExecutor {

	public static PrintableResult execute(String content) {
		JnarioInjectorProvider injectorProvider = new JnarioInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = new TestSetup().createInjectorAndDoEMFRegistration();
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			Resource resource = resourceSet.createResource(URI.createURI("temp.jnario"));
			try {
				resource.load(new StringInputStream(content), Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
				org.junit.Assert.fail(e.getMessage());
			}
			
			JnarioExecutor executor = injector.getInstance(JnarioExecutor.class);
			return executor.run((Jnario) resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
	}
	

	private final IGenerator generator;
	private final JavaIoFileSystemAccess fsa;
	private final TemporaryFolder tempFolder;
	private final JavaNameProvider nameProvider;
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	private IResourceValidator validator;

	@Inject
	public JnarioExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider, IResourceValidator validator) {
		this.generator = generator;
		this.fsa = fsa;
		this.tempFolder = tempFolder;
		this.nameProvider = javaNameProvider;
		this.validator = validator;
	}

	public PrintableResult run(Jnario jnario) {
		try {
			configureOutlet();
			validate(jnario);
			generateJavaJnario(jnario);
			return runScenarios(jnario);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			return null; // not reachable
		} finally {
			tempFolder.delete();
		}
	}

	private void validate(Jnario jnario) {
		Iterable<Issue> issues = validator.validate(jnario.eResource(), CheckMode.NORMAL_AND_FAST, CancelIndicator.NullImpl);
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

	private void generateJavaJnario(Jnario jnario) {
		generator.doGenerate(jnario.eResource(), fsa);
		assertFalse("no scenarios", jnario.getFeature().getScenarios().isEmpty());
	}

	private PrintableResult runScenarios(Jnario jnario)
			throws MalformedURLException, ClassNotFoundException {
		List<Failure> failures = newArrayList();
		for (Scenario scenario : jnario.getFeature().getScenarios()) {
			String jnarioClassName = nameProvider.getJavaClassName(jnario.getFeature().getName()) + nameProvider.getJavaClassName(scenario.getName());
			compilejnarioJavaFile(jnario, jnarioClassName);
			Class<?> testClass = loadGeneratedClass(jnario, jnarioClassName);
			List<Failure> newFailures = execute(testClass);
			failures.addAll(newFailures);
		}
		return new PrintableResult(failures);
	}

	private void compilejnarioJavaFile(Jnario jnario, String jnarioClassName) {
		String jnarioJavaFile = getGeneratedJavaClassName(jnario, jnarioClassName);
		compiler.run(System.in, System.out, System.err, jnarioJavaFile);
	}

	private List<Failure> execute(Class<?> cls) {
		return JUnitCore.runClasses(cls).getFailures();
	}

	private Class<?> loadGeneratedClass(Jnario jnario, String jnarioClassName)
			throws MalformedURLException, ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader
				.newInstance(new URL[] { tempFolder.getRoot().toURI().toURL() });
		String className = jnario.getFeature().getPackageName() + "." + jnarioClassName;
		CompositeClassLoader compositeClassLoader = new CompositeClassLoader(classLoader);
		return Class.forName(className, true, compositeClassLoader);
	}

	private String getGeneratedJavaClassName(Jnario jnario, String jnarioClassName) {
		StringBuilder sb = new StringBuilder();
		sb.append(tempFolder.getRoot().getAbsolutePath());
		sb.append(File.separator);
		sb.append(jnario.getFeature().getPackageName().replaceAll("\\.", File.separator + File.separator));
		sb.append(File.separator);
		sb.append(jnarioClassName);
		sb.append(".java");
		return sb.toString();
	}

}
