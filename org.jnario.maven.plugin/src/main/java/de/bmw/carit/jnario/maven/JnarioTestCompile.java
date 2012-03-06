/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;
import org.eclipse.xtext.xtend2.maven.XtendTestCompile;

import com.google.inject.Injector;

import org.jnario.compiler.batch.SpecBatchCompiler;
import org.jnario.spec.SpecStandaloneSetup;

/**
 * Goal which compiles Xtend2 test sources.
 *
 * @author Sebastian Benz - Initial contribution and API
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {

	@Override
	protected Xtend2BatchCompiler createXtend2BatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
}
