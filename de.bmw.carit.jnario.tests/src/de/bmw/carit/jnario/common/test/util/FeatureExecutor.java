/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.test.util;

import static junit.framework.Assert.assertFalse;

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
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Result;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.bmw.carit.jnario.feature.FeatureInjectorProvider;
import de.bmw.carit.jnario.feature.feature.Feature;
import de.bmw.carit.jnario.feature.feature.FeatureFile;
import de.bmw.carit.jnario.feature.generator.FeatureJvmModelGenerator;
import de.bmw.carit.jnario.feature.naming.JavaNameProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class FeatureExecutor extends BehaviorExecutor{
	
	public static Result execute(String content) {
		FeatureInjectorProvider injectorProvider = new FeatureInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = new FeatureTestSetup().createInjectorAndDoEMFRegistration();
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			Resource resource = resourceSet.createResource(URI.createURI("temp.feature"));
			try {
				resource.load(new StringInputStream(content), Collections.emptyMap());
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
	
	private final JavaNameProvider nameProvider;

	@Inject
	public FeatureExecutor(FeatureJvmModelGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider, IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
		this.nameProvider = javaNameProvider;
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
