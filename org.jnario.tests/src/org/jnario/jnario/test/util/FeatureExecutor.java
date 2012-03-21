/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static junit.framework.Assert.assertFalse;
import static org.jnario.jnario.test.util.Resources.checkForParseErrors;
import static org.jnario.jnario.test.util.ResultMatchers.failureCountIs;
import static org.jnario.jnario.test.util.ResultMatchers.isSuccessful;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.IResourceValidator;
import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.generator.FeatureJvmModelGenerator;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;
import org.junit.Assert;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Result;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class FeatureExecutor extends BehaviorExecutor{
	
	public static Result execute(CharSequence content) {
		FeatureInjectorProvider injectorProvider = new FeatureInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = new FeatureTestSetup().createInjectorAndDoEMFRegistration();
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			Resource resource = resourceSet.createResource(URI.createURI("temp.feature"));
			try {
				resource.load(new StringInputStream(content.toString()), Collections.emptyMap());
				checkForParseErrors(resource);
			} catch (IOException e) {
				e.printStackTrace();
				org.junit.Assert.fail(e.getMessage());
			}
			
			FeatureExecutor executor = injector.getInstance(FeatureExecutor.class);
			return executor.run((FeatureFile) resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
	}
	
	public static void executesSuccessfully(CharSequence content) {
		Result result = execute(content);
		Assert.assertThat(result, isSuccessful());
	}
	
	public static void executionFails(CharSequence content) {
		Result result = execute(content);
		Assert.assertThat(result, failureCountIs(1));
	}
	
	private final JavaNameProvider nameProvider;

	@Inject
	public FeatureExecutor(FeatureJvmModelGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider, IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
		this.nameProvider = javaNameProvider;
		validate = false;
	}

	protected Result runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException {
		CompositeResult result = new CompositeResult();
		FeatureFile jnarioFile = (FeatureFile) object;
		Feature feature = (Feature)jnarioFile.getXtendClass();
		String jnarioClassName = nameProvider.getFeatureClassName(feature.getName());
		String packageName = jnarioFile.getPackage();
		result.add(runTestsInClass(jnarioClassName, packageName));
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no feature", ((FeatureFile)object).getXtendClass() == null);
		assertFalse("has no scenarios", ((FeatureFile)object).getXtendClass().getMembers().isEmpty());
	}
}
