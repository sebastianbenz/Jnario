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
import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.XtendStandaloneSetup;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.maven.AbstractXtendCompilerMojo;
import org.eclipse.xtend.maven.MavenProjectAdapter;
import org.eclipse.xtend.maven.MavenProjectResourceSetProvider;
import org.eclipse.xtend.maven.XtendMavenStandaloneSetup;
import org.eclipse.xtend.maven.XtendTestCompile;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.resource.BatchLinkableResource;
import org.eclipse.xtext.xbase.resource.XbaseResource;
import org.jnario.compiler.JnarioBatchCompiler;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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
	 * Location of the Xtend settings file.
	 * 
	 * @parameter default-value="${basedir}/.settings/org.jnario.Jnario.prefs"
	 * @readonly
	 */
	private String propertiesFileLocation;
	
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
		new XtendMavenStandaloneSetup().createInjectorAndDoEMFRegistration();
		List<Injector> injectors = createInjectors(new FeatureMavenStandaloneSetup(), new SpecMavenStandaloneSetup(), new SuiteMavenStandaloneSetup());
		resourceSetProvider = new JnarioMavenProjectResourceSetProvider(project);
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
		compileXtendSources();
		for (Injector injector : injectors) {
			resourceSetProvider.get().eAdapters().clear();
			compile(injector);
		}
	}

	public void compileXtendSources() throws MojoExecutionException {
		XtendBatchCompiler xtendCompiler = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(XtendBatchCompiler.class);
		compileTestSources2(xtendCompiler);
	}
	
	protected void compileTestSources2(XtendBatchCompiler xtend2BatchCompiler) throws MojoExecutionException {
		List<String> testCompileSourceRoots = Lists.newArrayList(project.getTestCompileSourceRoots());
		String testClassPath = concat(File.pathSeparator, getTestClassPath());
		project.addTestCompileSourceRoot(testOutputDirectory);
		compile(xtend2BatchCompiler, testClassPath, testCompileSourceRoots, testOutputDirectory);
	}
	
	private void compile(Injector injector)	throws MojoExecutionException {
		JnarioBatchCompiler compiler = injector.getInstance(JnarioBatchCompiler.class);
		final String defaultValue = project.getBasedir() + "/src/test/generated-sources/xtend";
		getLog().debug("Output directory '" + testOutputDirectory + "'");
		getLog().debug("Default directory '" + defaultValue + "'");
		if (defaultValue.equals(testOutputDirectory)) {
			determinateOutputDirectory(project.getBuild().getTestSourceDirectory(), new Procedure1<String>() {
				public void apply(String xtendOutputDir) {
					testOutputDirectory = xtendOutputDir;
					getLog().info("Using Xtend output directory '" + testOutputDirectory + "'");
				}
			});
		}
		compileTestSources(compiler);
	}
 
	private List<Injector> createInjectors(ISetup... setups) {
		return transform(asList(setups), new Function<ISetup, Injector>() {
			public Injector apply(ISetup input) {
				return input.createInjectorAndDoEMFRegistration();
			}
		});
	}
	
	protected void determinateOutputDirectory(String sourceDirectory, Procedure1<String> fieldSetter) {
		if (propertiesFileLocation != null) {
			File f = new File(propertiesFileLocation);
			if (f.canRead()) {
				Properties xtendSettings = new Properties();
				try {
					xtendSettings.load(new FileInputStream(f));
					// TODO read Xtend setup to compute the properties file loc and property name
					String xtendOutputDirProp = xtendSettings.getProperty("outlet.DEFAULT_OUTPUT.directory", null);
					if (xtendOutputDirProp != null) {
						File srcDir = new File(sourceDirectory);
						getLog().debug("Source dir : " + srcDir.getPath() + " exists " + srcDir.exists());
						if (srcDir.exists() && srcDir.getParent() != null) {
							String path = new File(srcDir.getParent(), xtendOutputDirProp).getPath();
							getLog().debug("Applying Xtend property: " + xtendOutputDirProp);
							fieldSetter.apply(path);
						}
					}
				} catch (FileNotFoundException e) {
					getLog().warn(e);
				} catch (IOException e) {
					getLog().warn(e);
				}
			} else {
				getLog().info("Can't load Jnario properties:" + propertiesFileLocation);
			}
		}
	}

	protected void compile(XtendBatchCompiler xtend2BatchCompiler, String classPath, List<String> sourceDirectories, String outputPath) throws MojoExecutionException {
		xtend2BatchCompiler.setResourceSetProvider(resourceSetProvider);
		MavenProjectAdapter.install(resourceSetProvider.get(), project);
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
