/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import static org.junit.Assert.assertFalse;

import java.net.MalformedURLException;

import org.eclipse.emf.ecore.EObject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;
import org.junit.runner.Result;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SuiteExecutor extends BehaviorExecutor {
	
	@Inject private SuiteClassNameProvider nameProvider;

	public SuiteExecutor() {
		super();
		validate = false;
	}
	
	protected Result runExamples(EObject object) throws MalformedURLException, ClassNotFoundException {
		SuiteFile suiteFile = (SuiteFile) object;
		CompositeResult result = new CompositeResult();
		for (Suite suite : Iterables.filter(suiteFile.getXtendClasses(), Suite.class)) {
			String suiteClassName = nameProvider.toJavaClassName(suite);
			String packageName = suite.getPackageName();
			result.add(runTestsInClass(suiteClassName, packageName));
		}
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no examples", ((SuiteFile)object).getXtendClasses().isEmpty());
	}
}
