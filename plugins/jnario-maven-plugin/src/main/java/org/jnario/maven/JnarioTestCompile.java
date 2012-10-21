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
import org.eclipse.xtend.maven.XtendTestCompile;
import org.eclipse.xtext.ISetup;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.compiler.JnarioDocCompiler;
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
 * @extendsPlugin xtend-maven-plugin
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {
	
	@Override
	public void execute() throws MojoExecutionException {
		if (isSkipped()) {
			getLog().info("Jnario compiler skipped.");
		}
		configureLog4j();
		
		// the order is important, the suite compiler must be executed last
		List<Injector> injectors = createInjectors(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
		ResourceSet resourceSet = createResourceSet(injectors);
		
		for (Injector injector : injectors) {
			compile(injector, resourceSet);
		}
	}

	private void compile(Injector injector, ResourceSet resourceSet)
			throws MojoExecutionException {
		JnarioBatchCompiler compiler = injector.getInstance(JnarioBatchCompiler.class);
		execute(resourceSet, compiler);
	}
 
	private ResourceSet createResourceSet(List<Injector> injectors) {
		Provider<ResourceSet> resourceSetProvider = injectors.get(0).getProvider(ResourceSet.class);
		ResourceSet resourceSet = resourceSetProvider.get();
		return resourceSet;
	}

	private List<Injector> createInjectors(ISetup... setups) {
		return transform(asList(setups), new Function<ISetup, Injector>() {
			public Injector apply(ISetup input) {
				return input.createInjectorAndDoEMFRegistration();
			}
		});
	}

	private void execute(ResourceSet resourceSet, JnarioBatchCompiler compiler)
			throws MojoExecutionException {
		compiler.setResourceSet(resourceSet);
		internalExecute(compiler);
	}

}
