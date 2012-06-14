/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import org.eclipse.xtend.maven.XtendTestCompile;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.spec.compiler.batch.SpecBatchCompiler;

import com.google.inject.Injector;

/**
 * Goal which compiles Xtend test sources.
 *
 * @author Sebastian Benz - Initial contribution and API
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {

	@Override
	protected XtendBatchCompiler createXtendBatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
}
