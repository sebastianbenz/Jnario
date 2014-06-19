/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.toArray;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertFalse;
import static org.eclipse.emf.common.util.URI.createURI;
import static org.eclipse.xtext.util.Exceptions.throwUncheckedException;
import static org.jnario.jnario.test.util.ResultMatchers.failureCountIs;
import static org.jnario.jnario.test.util.ResultMatchers.isSuccessful;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import org.antlr.runtime.Token;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.common.types.access.impl.IndexedJvmTypeAccess;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.hamcrest.Matcher;
import org.jnario.Assertion;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.runner.Named;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.suite.suite.Suite;
import org.junit.Test;
import org.junit.experimental.results.PrintableResult;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.mockito.Mockito;
import org.objectweb.asm.Type;

import testdata.Properties1;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
@SuppressWarnings("restriction")
public abstract class BehaviorExecutor {
	
	protected static Map<Class<?>, IInjectorProvider> injectorProviderClassCache = Maps.newHashMap();
	
	public static Result execute(Class<? extends IInjectorProvider> injectorType, CharSequence content) {
		IInjectorProvider injectorProvider = getOrCreateInjectorProvider(injectorType);
		try {
			((IRegistryConfigurator)injectorProvider).setupRegistry();		
			BehaviorExecutor executor = injectorProvider.getInjector().getInstance(BehaviorExecutor.class);
			return executor.execute(content);
		} finally {
			((IRegistryConfigurator)injectorProvider).restoreRegistry();
		}
	}
	
	public void executesSuccessfully(CharSequence content) {
		assertThat(execute(content), isSuccessful());
	}
	
	public void executionFails(CharSequence content) {
		assertThat(execute(content), failureCountIs(1));
	}
	
	public Result execute(CharSequence content) {
		return execute(content, fileExtension);
	}
	
	protected Result execute(CharSequence content, String fileExtension) {
		Resource resource = parse(content.toString(), fileExtension);	
		Resources.addContainerStateAdapter(resourceSet);
		Result result = run(resource.getContents().get(0));
		return result;
	}
	
	@SuppressWarnings("unchecked")
	protected static <T extends IInjectorProvider> T getOrCreateInjectorProvider(Class<T> type) {
		IInjectorProvider injectorProvider = getInjectorProvider(type);
		if (injectorProvider == null) {
			injectorProvider = createInjectorProvider(type);
			injectorProviderClassCache.put(type, injectorProvider);
		}
		return (T) injectorProvider;
	}

	private XtextResourceSet resourceSet = new XtextResourceSet();
	
	protected Resource parse(CharSequence content) {
		return parse(content, fileExtension);
	}

	private Resource parse(CharSequence content, String file) {
		installJvmTypeProvider(resourceSet);
		Resource resource = resourceSet.createResource(createURI("dummy" + resourceSet.getResources().size() +"." + file));
		resourceSet.getResources().add(resource);
		try {
			resource.load(new StringInputStream(content.toString()), Collections.emptyMap());
//			EcoreUtil.resolveAll(resource);
			Resources.checkForParseErrors(resource);
		} catch (IOException e) {
			e.printStackTrace();
			org.junit.Assert.fail(e.getMessage());
		}
		return resource;
	}
	
	protected static IInjectorProvider getInjectorProvider(Class<? extends IInjectorProvider> type) {
		return injectorProviderClassCache.get(type);
	}
	
	protected static IInjectorProvider createInjectorProvider(Class<? extends IInjectorProvider> type) {
		IInjectorProvider injectorProvider = null;
			try {
				injectorProvider = type.newInstance();
			} catch (Exception e) {
				throwUncheckedException(e);
			}
		return injectorProvider;
	}

	@SuppressWarnings("serial")
	public static class CompositeResult extends Result{

		private List<Result> children = newArrayList();

		public void add(Result child) {
			children.add(child);
		}
		
		@Override
		public int getFailureCount() {
			int failureCount = 0;
			for (Result child : children) {
				failureCount += child.getFailureCount();
			}
			return failureCount;
		}
		
		@Override
		public List<Failure> getFailures() {
			List<Failure> failures = newArrayList();
			for (Result child : children) {
				failures.addAll(child.getFailures());
			}
			return failures;
		}
		
		@Override
		public int getIgnoreCount() {
			int ignoreCount = 0;
			for (Result child : children) {
				ignoreCount += child.getIgnoreCount();
			}
			return ignoreCount;
		}
		
		@Override
		public int getRunCount() {
			int runCount = 0;
			for (Result child : children) {
				runCount += child.getRunCount();
			}
			return runCount;
		}
		
		@Override
		public long getRunTime() {
			long runtime = 0;
			for (Result child : children) {
				runtime += child.getRunTime();
			}
			return runtime;
		}
		
		@Override
		public String toString() {
			return Joiner.on("\n").join(transform(children, new Function<Result, PrintableResult>() {
				public PrintableResult apply(Result result){
					return new PrintableResult(result.getFailures());
				}
			}));
		}
		
	}
	
	
	@Inject private JvmModelGenerator generator;
	@Inject private JavaIoFileSystemAccess fsa;
	
	private TemporaryFolder tempFolder = new TemporaryFolder();

	@Inject private IResourceValidator validator;
	protected boolean validate = true;
	protected FeatureJavaCompiler javaCompiler = FeatureJavaCompiler.getInstance();

	@Inject
	@com.google.inject.name.Named(Constants.FILE_EXTENSIONS)
	public String fileExtension;
	
	@Inject
	@Singleton
	private IndexedJvmTypeAccess indexedJvmTypeAccess;
	
	
	
	
	protected void installJvmTypeProvider(ResourceSet resourceSet) {
		Iterable<? extends String> classPathEntries = javaCompiler.getClasspathPathEntries();
		classPathEntries = filter(classPathEntries, new Predicate<String>() {
			public boolean apply(String input) {
				return !Strings.isEmpty(input.trim());
			}
		});
		Iterable<URL> classPathUrls = Iterables.transform(classPathEntries, new Function<String, URL>() {
			public URL apply(String from) {
				try {
					return new File(from).toURI().toURL();
				} catch (MalformedURLException e) {
					throw new RuntimeException(e);
				}
			}
		});
		URLClassLoader urlClassLoader = new URLClassLoader(toArray(classPathUrls, URL.class), getClass().getClassLoader());
		new ClasspathTypeProvider(urlClassLoader, resourceSet, indexedJvmTypeAccess);
		((XtextResourceSet) resourceSet).setClasspathURIContext(urlClassLoader);
	}
	
	public BehaviorExecutor() {
		initCompiler();
		try {
			tempFolder.create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	protected void initCompiler() {
		javaCompiler.addClassPathOfClass(getClass());
		javaCompiler.addClassPathOfClass(StringExtensions.class);
		javaCompiler.addClassPathOfClass(Notifier.class);
		javaCompiler.addClassPathOfClass(Data.class);
		javaCompiler.addClassPathOfClass(EcorePackage.class);
		javaCompiler.addClassPathOfClass(XbasePackage.class);
		javaCompiler.addClassPathOfClass(XtendPackage.class);
		javaCompiler.addClassPathOfClass(Inject.class);
		javaCompiler.addClassPathOfClass(Properties1.class);
		javaCompiler.addClassPathOfClass(Function.class);
		javaCompiler.addClassPathOfClass(StringConcatenation.class);
		javaCompiler.addClassPathOfClass(Named.class);
		javaCompiler.addClassPathOfClass(ResultMatchers.class);
		javaCompiler.addClassPathOfClass(Matcher.class);
		javaCompiler.addClassPathOfClass(Matchers.class);
		javaCompiler.addClassPathOfClass(Test.class);
		javaCompiler.addClassPathOfClass(FeaturePackage.class);
		javaCompiler.addClassPathOfClass(SpecPackage.class);
		javaCompiler.addClassPathOfClass(BehaviorExecutor.class);
		javaCompiler.addClassPathOfClass(JvmOperation.class);
		javaCompiler.addClassPathOfClass(RegisteredValidatorTester.class);
		javaCompiler.addClassPathOfClass(QualifiedName.class);
		javaCompiler.addClassPathOfClass(Assertion.class);
		javaCompiler.addClassPathOfClass(org.hamcrest.Matchers.class);
		javaCompiler.addClassPathOfClass(Type.class);
		javaCompiler.addClassPathOfClass(Token.class);
		javaCompiler.addClassPathOfClass(Strings.class);
		javaCompiler.addClassPathOfClass(Suite.class);
		javaCompiler.addClassPathOfClass(Mockito.class);
		javaCompiler.addClassPathOfClass(Maps.class);
		javaCompiler.addClassPathOfClass(org.jnario.feature.tests.integration.Calculator.class);
	}

	public Result run(EObject object) {
		try {
			configureOutlet();
			if(validate){
				validate(object);
			}
			generateJava(object);
			return runExamples(object);
		} catch (Exception e) {
			e.printStackTrace();
			try{
				validate(object);
			}catch (AssertionError ex) {
				System.err.println(ex.getMessage());
			}
			Exceptions.sneakyThrow(e);
			return null;
		} finally {
			tempFolder.delete();
		}
	}

	protected void validate(EObject object) {
		Iterable<Issue> issues = validator.validate(object.eResource(),
				CheckMode.NORMAL_AND_FAST, CancelIndicator.NullImpl);
		Iterable<Issue> onlyErrors = filterErrors(issues);
		assertFalse("Validation errors\n" + Joiner.on("\n  ").join(issues),
		onlyErrors.iterator().hasNext());
	}

	protected Iterable<Issue> filterErrors(Iterable<Issue> issues) {
		Iterable<Issue> onlyErrors = filter(issues, new Predicate<Issue>() {

			public boolean apply(Issue input) {
				return input.getSeverity() == Severity.ERROR;
			}
		});
		return onlyErrors;
	}

	private void configureOutlet() throws IOException {
		fsa.setOutputPath(tempFolder.getRoot().getAbsolutePath());
	}

	protected void generateJava(EObject object) {
		generator.doGenerate(object.eResource(), fsa);
	}

	protected abstract Result runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException;

	protected void compileJavaFile(String packageName, String className) {
		List<String> args = findGeneratedJavaFiles(packageName);
		javaCompiler.compile(args);
	}


	protected Result execute(Class<?> cls) {
		return JUnitCore.runClasses(cls);
	}

	protected Class<?> loadGeneratedClass(String packageName,
			String specClassName) throws MalformedURLException,
			ClassNotFoundException {
		URLClassLoader classLoader = URLClassLoader.newInstance(
				new URL[] { tempFolder.getRoot().toURI().toURL() }, getClass()
						.getClassLoader());
		if(packageName != null){
			specClassName = packageName + "." + specClassName;
		}
		return Class.forName(specClassName, true, classLoader);
	}

	private List<String> findGeneratedJavaFiles(String packageName) {
		File packageDir = resolvePackageDir(packageName);
		return allJavaFilesIn(packageDir);
	}

	protected File resolvePackageDir(String packageName) {
		StringBuilder sb = new StringBuilder();
		sb.append(tempFolder.getRoot().getAbsolutePath());
		sb.append(File.separator);
		if(packageName != null){
			sb.append(packageName
					.replaceAll("\\.", File.separator + File.separator));
			sb.append(File.separator);
		}

		File packageDir = new File(sb.toString());
		return packageDir;
	}

	protected List<String> allJavaFilesIn(File packageDir) {
		File[] allJavaFiles = packageDir.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		List<String> result = newArrayList();
		for (int i = 0; i < allJavaFiles.length; i++) {
			File file = allJavaFiles[i];
			try {
				result.add(file.getCanonicalPath());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}

	protected Result runTestsInClass(String className,
			String packageName)
			throws MalformedURLException, ClassNotFoundException {
		compileJavaFile(packageName, className);
		Class<?> testClass = loadGeneratedClass(packageName, className);
		return execute(testClass);
	}

}
