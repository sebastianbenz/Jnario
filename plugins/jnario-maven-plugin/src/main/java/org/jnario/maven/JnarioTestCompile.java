/*******************************************************************************
# * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.XtendStandaloneSetup;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.maven.MavenProjectResourceSetProvider;
import org.eclipse.xtend.maven.XtendTestCompile;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.common.base.Function;
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
public class JnarioTestCompile extends XtendTestCompile {
	
	/**
	 * Location of the Xtend settings file.
	 * 
	 * @parameter default-value="${basedir}/.settings/org.jnario.Jnario.prefs"
	 * @readonly
	 */
	private String propertiesFileLocation;

	@Override
	protected void internalExecute() throws MojoExecutionException {
		// the order is important, the suite compiler must be executed last
		List<Injector> injectors = createInjectors(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
		final ResourceSet resourceSet = createResourceSet();
		compileXtendSources();
		for (Injector injector : injectors) {
			compile(injector, resourceSet);
		}
	}

	public void compileXtendSources() throws MojoExecutionException {
		XtendBatchCompiler xtendCompiler = new XtendStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(XtendBatchCompiler.class);
		super.compileTestSources(xtendCompiler);
	}

	private void compile(Injector injector, ResourceSet resourceSet)
			throws MojoExecutionException {
		JnarioBatchCompiler compiler = injector.getInstance(JnarioBatchCompiler.class);
		execute(resourceSet, compiler);
	}
 
	private ResourceSet createResourceSet() {
		Provider<ResourceSet> resourceSetProvider = new MavenProjectResourceSetProvider(project);
		return resourceSetProvider.get();
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

	private void execute(ResourceSet resourceSet, JnarioBatchCompiler compiler)	throws MojoExecutionException {
		compiler.setResourceSet(resourceSet);
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
	

}
