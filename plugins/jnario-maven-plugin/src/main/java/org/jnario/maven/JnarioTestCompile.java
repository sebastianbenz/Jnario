/*******************************************************************************
# * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.inject.Singleton;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.maven.AbstractXtendCompilerMojo;
import org.eclipse.xtend.maven.MavenProjectAdapter;
import org.eclipse.xtend.maven.XtendMavenStandaloneSetup;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.types.access.impl.IndexedJvmTypeAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * Goal which compiles Jnario test sources.
 *
 * @author Sebastian Benz - Initial contribution and API
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends AbstractXtendCompilerMojo {
	
	/**
	 * Location of the generated test files.
	 * 
	 * @parameter default-value="${basedir}/src/test/generated-sources/xtend"
	 * @required
	 */
	protected String testOutputDirectory;
	
	/**
	 * Location of the temporary compiler directory.
	 * 
	 * @parameter default-value="${project.build.directory}/xtend-test"
	 * @required
	 */
	private String testTempDirectory;
	
	@Inject
	@Singleton
	private IndexedJvmTypeAccess indexedJvmTypeAccess;

	protected void compileTestSources(XtendBatchCompiler xtend2BatchCompiler) throws MojoExecutionException {
		List<String> testCompileSourceRoots = Lists.newArrayList(project.getTestCompileSourceRoots());
		String testClassPath = concat(File.pathSeparator, getTestClassPath());
		project.addTestCompileSourceRoot(testOutputDirectory);
		compile(xtend2BatchCompiler, testClassPath, testCompileSourceRoots, testOutputDirectory);
	}

	@SuppressWarnings("deprecation")
	protected List<String> getTestClassPath() {
		Set<String> classPath = Sets.newLinkedHashSet();
		classPath.add(project.getBuild().getTestSourceDirectory());
		try {
			classPath.addAll(project.getTestClasspathElements());
		} catch (DependencyResolutionRequiredException e) {
			throw new WrappedException(e);
		}
		addDependencies(classPath, project.getTestArtifacts());
		return newArrayList(filter(classPath, FILE_EXISTS));
	}

	@Override
	protected String getTempDirectory() {
		return testTempDirectory;
	}

	
	private Provider<ResourceSet> resourceSetProvider;

	@Override
	protected void internalExecute() throws MojoExecutionException {
		// the order is important, the suite compiler must be executed last
		List<ISetup> setups = asList(new XtendMavenStandaloneSetup(), new FeatureMavenStandaloneSetup(), new SpecMavenStandaloneSetup(), new SuiteMavenStandaloneSetup());
		final String defaultValue = project.getBasedir() + "/src/test/generated-sources/xtend";
		getLog().debug("Output directory '" + testOutputDirectory + "'");
		getLog().debug("Default directory '" + defaultValue + "'");
		if (defaultValue.equals(testOutputDirectory)) {
			readXtendEclipseSetting(project.getBuild().getTestSourceDirectory(), new Procedure1<String>() {
				public void apply(String xtendOutputDir) {
					testOutputDirectory = xtendOutputDir;
					getLog().info("Using Xtend output directory '" + testOutputDirectory + "'");
				}
			});
		}
		testOutputDirectory = resolveToBaseDir(testOutputDirectory);

		resourceSetProvider = new JnarioMavenProjectResourceSetProvider(project);
		
		ResourceSet resourceSet = resourceSetProvider.get();

		for (ISetup setup : setups) {
			Injector injector = setup.createInjectorAndDoEMFRegistration();
			compile(injector);
			resourceSet.eAdapters().clear();
			MavenProjectAdapter.install(resourceSet, project);
		}
	}
	
	private void compile(Injector injector)	throws MojoExecutionException {
		XtendBatchCompiler compiler = injector.getInstance(XtendBatchCompiler.class);
		final String defaultValue = project.getBasedir() + "/src/test/generated-sources/xtend";
		getLog().debug("Output directory '" + testOutputDirectory + "'");
		getLog().debug("Default directory '" + defaultValue + "'");
		if (defaultValue.equals(testOutputDirectory)) {
			readXtendEclipseSetting(project.getBuild().getTestSourceDirectory(), new Procedure1<String>() {
				public void apply(String xtendOutputDir) {
					testOutputDirectory = xtendOutputDir;
					getLog().info("Using Xtend output directory '" + testOutputDirectory + "'");
				}
			});
		}
		testOutputDirectory = resolveToBaseDir(testOutputDirectory);
		compileTestSources(compiler);
	}
 
	protected void compile(XtendBatchCompiler xtend2BatchCompiler, String classPath, List<String> sourceDirectories, String outputPath) throws MojoExecutionException {
		configureWorkspace(sourceDirectories, outputPath);
		xtend2BatchCompiler.setResourceSetProvider(resourceSetProvider);
		
		Iterable<String> filtered = filter(sourceDirectories, FILE_EXISTS);
		if (Iterables.isEmpty(filtered)) {
			getLog().info(
					"skip compiling sources because the configured directory '" + Iterables.toString(sourceDirectories)
							+ "' does not exists.");
			return;
		}
		getLog().debug("Set temp directory: " + getTempDirectory());
		xtend2BatchCompiler.setTempDirectory(getTempDirectory());
		getLog().debug("Set DeleteTempDirectory: " + false);
		xtend2BatchCompiler.setDeleteTempDirectory(false);
		getLog().debug("Set classpath: " + classPath);
		xtend2BatchCompiler.setClassPath(classPath);
		getLog().debug("Set source path: " + concat(File.pathSeparator, newArrayList(filtered)));
		xtend2BatchCompiler.setSourcePath(concat(File.pathSeparator, newArrayList(filtered)));
		getLog().debug("Set output path: " + outputPath);
		xtend2BatchCompiler.setOutputPath(outputPath);
		getLog().debug("Set encoding: " + encoding);
		xtend2BatchCompiler.setFileEncoding(encoding);
		getLog().debug("Set writeTraceFiles: " + writeTraceFiles);
		xtend2BatchCompiler.setWriteTraceFiles(writeTraceFiles);
		if (!xtend2BatchCompiler.compile()) {
			throw new MojoExecutionException("Error compiling xtend sources in '"
					+ concat(File.pathSeparator, newArrayList(filtered)) + "'.");
		}
	}
	

}