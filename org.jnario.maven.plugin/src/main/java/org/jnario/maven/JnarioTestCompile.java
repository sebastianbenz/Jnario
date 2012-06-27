/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.maven.XtendTestCompile;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.feature.compiler.batch.FeatureBatchCompiler;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.spec.compiler.batch.SpecBatchCompiler;
import org.jnario.suite.SuiteStandaloneSetup;
import org.jnario.suite.compiler.batch.SuiteBatchCompiler;

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
			getLog().info("Xtend compiler skipped.");
		}
		configureLog4j();
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		Provider<ResourceSet> resourceSetProvider = injector.getProvider(ResourceSet.class);
		ResourceSet resourceSet = resourceSetProvider.get();
		
		JnarioBatchCompiler compiler = injector.getInstance(SpecBatchCompiler.class);
		execute(resourceSet, compiler);
		
		compiler = createFeatureCompiler();
		execute(resourceSet, compiler);
		
		compiler = createSuiteCompiler();
		execute(resourceSet, compiler);
	}

	private void execute(ResourceSet resourceSet, JnarioBatchCompiler compiler)
			throws MojoExecutionException {
		compiler.setResourceSet(resourceSet);
		internalExecute(compiler);
	}
	
	protected JnarioBatchCompiler createFeatureCompiler() {
		Injector injector = new FeatureStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(FeatureBatchCompiler.class);
	}
	
	protected JnarioBatchCompiler createSuiteCompiler() {
		Injector injector = new SuiteStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SuiteBatchCompiler.class);
	}
}
