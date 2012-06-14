/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.maven;

import org.eclipse.xtend.maven.XtendCompile;

import com.google.inject.Injector;


/**
 * Goal which compiles Jnario sources.
 * 
 * @author Sebastian Benz - Initial contribution and API
 * @goal compile
 * @phase generate-sources
 * @requiresDependencyResolution compile
 */
public class JnarioCompile extends XtendCompile {

	@Override
	protected XtendBatchCompiler createXtendBatchCompiler() {
		Injector injector = new SpecStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SpecBatchCompiler.class);
	}
	
}
