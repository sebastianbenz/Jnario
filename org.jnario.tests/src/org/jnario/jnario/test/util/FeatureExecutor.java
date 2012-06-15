/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static junit.framework.Assert.assertFalse;
import static org.jnario.jnario.test.util.ResultMatchers.failureCountIs;
import static org.jnario.jnario.test.util.ResultMatchers.isSuccessful;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;

import org.eclipse.emf.ecore.EObject;
import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.junit.runner.Result;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class FeatureExecutor extends BehaviorExecutor{

	public static Result execute(CharSequence content) {
		return execute(FeatureInjectorProvider.class, FeatureExecutor.class, content);
	}
	
	public static void executesSuccessfully(CharSequence content) {
		assertThat(execute(content), isSuccessful());
	}
	
	public static void executionFails(CharSequence content) {
		assertThat(execute(content), failureCountIs(1));
	}
	
	@Inject
	private FeatureClassNameProvider nameProvider;

	public FeatureExecutor() {
		super();
		validate = false;
	}

	protected Result runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException {
		CompositeResult result = new CompositeResult();
		FeatureFile jnarioFile = (FeatureFile) object;
		for (Feature  feature : Iterables.filter(jnarioFile.getXtendClasses(), Feature.class)) {
			String jnarioClassName = nameProvider.getClassName(feature);
			String packageName = jnarioFile.getPackage();
			result.add(runTestsInClass(jnarioClassName, packageName));
		}
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		FeatureFile featureFile = (FeatureFile)object;
		assertFalse("has no feature", featureFile.getXtendClasses().isEmpty());
		assertFalse("has no scenarios", ((Feature)featureFile.getXtendClasses().get(0)).getScenarios().isEmpty());
	}
}
