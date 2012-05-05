/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static org.eclipse.emf.common.util.URI.createURI;
import static org.jnario.jnario.test.util.ResultMatchers.failureCountIs;
import static org.jnario.jnario.test.util.ResultMatchers.isSuccessful;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.IResourceValidator;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;
import org.jnario.spec.SpecInjectorProvider;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.junit.Assert;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Result;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;
@SuppressWarnings("restriction")
public class SpecExecutor extends BehaviorExecutor{
	
	private final ExampleNameProvider nameProvider;

	@Inject
	public SpecExecutor(ExtendedJvmModelGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, ExampleNameProvider javaNameProvider, IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
		this.nameProvider = javaNameProvider;
		validate = false;
	}
	
	public static void executesSuccessfully(CharSequence content) {
		Result result = execute(content);
		Assert.assertThat(result, isSuccessful());
	}
	
	public static void executionFails(CharSequence content) {
		Result result = execute(content);
		Assert.assertThat(result, failureCountIs(1));
	}

	public static Result execute(CharSequence content) {
		SpecInjectorProvider injectorProvider = new SpecInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = new SpecStandaloneTestSetup().createInjectorAndDoEMFRegistration();
			
			Resource resource = parse(content.toString());
			
			SpecExecutor executor = injector.getInstance(SpecExecutor.class);
			return executor.run(resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
	}

	public static Resource parse(String content) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		Resource resource = resourceSet.createResource(createURI("dummy.spec"));
		try {
			resource.load(new StringInputStream(content), Collections.emptyMap());
			Resources.checkForParseErrors(resource);
		} catch (IOException e) {
			e.printStackTrace();
			org.junit.Assert.fail(e.getMessage());
		}
		return resource;
	}
	
	protected Result runExamples(EObject object) throws MalformedURLException, ClassNotFoundException {
		SpecFile spec = (SpecFile) object;
		CompositeResult result = new CompositeResult();
		for (ExampleGroup exampleGroup : Iterables.filter(spec.getXtendClasses(), ExampleGroup.class)) {
			String specClassName = nameProvider.toJavaClassName(exampleGroup);
			String packageName = spec.getPackage();
			result.add(runTestsInClass(specClassName, packageName));
		}
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no examples", ((SpecFile)object).getXtendClasses().isEmpty());
	}
}
