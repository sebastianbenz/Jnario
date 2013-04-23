/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;

import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
	
	@Override
	protected void internalExecute() throws MojoExecutionException {
		// the order is important, the suite compiler must be executed last
		List<Injector> injectors = createInjectors(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
		ResourceSet resourceSet = createResourceSet();
		
		for (Injector injector : injectors) {
			compile(injector, resourceSet);
		}
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
