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
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.junit.runner.Result;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
@SuppressWarnings("restriction")
public class SpecExecutor extends BehaviorExecutor{
	
	@Inject private ExampleNameProvider nameProvider;

	public SpecExecutor() {
		super();
		validate = false;
	}
	
	protected Result runExamples(EObject object) throws MalformedURLException, ClassNotFoundException {
		SpecFile spec = (SpecFile) object;
		CompositeResult result = new CompositeResult();
		for (ExampleGroup exampleGroup : Iterables.filter(spec.getXtendTypes(), ExampleGroup.class)) {
			String specClassName = nameProvider.toJavaClassName(exampleGroup);
			String packageName = spec.getPackage();
			result.add(runTestsInClass(specClassName, packageName));
		}
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no examples", ((SpecFile)object).getXtendTypes().isEmpty());
	}
}
