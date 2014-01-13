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
import org.eclipse.xtend.core.compiler.XtendGenerator;
import org.eclipse.xtend.core.macro.declaration.XtendNamedElementImpl;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.junit.runner.Result;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
@SuppressWarnings("restriction")
public class SpecExecutor extends BehaviorExecutor{
	
	@Inject private ExampleNameProvider nameProvider;
	@Inject private XtendQualifiedNameProvider xtendQualifiedNameProvider;
	@Inject private XtendGenerator xtendGenerator;

	public SpecExecutor() {
		super();
		validate = false;
	}
	
	protected Result runExamples(EObject object) throws MalformedURLException, ClassNotFoundException {
		SpecFile spec = (SpecFile) object;
		CompositeResult result = new CompositeResult();
		String packageName = spec.getPackage();
		for (XtendTypeDeclaration type : spec.getXtendTypes()) {
			if (!(type instanceof ExampleGroup)) {
				String className = type.getName();
				compileJavaFile(packageName, className);
				loadGeneratedClass(packageName, className);
			}
		}
		for (ExampleGroup exampleGroup : Iterables.filter(spec.getXtendTypes(), ExampleGroup.class)) {
			String specClassName = nameProvider.toJavaClassName(exampleGroup);
			result.add(runTestsInClass(specClassName, packageName));
		}
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no examples", ((SpecFile)object).getXtendTypes().isEmpty());
	}
}
