/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.jnario.spec.doc.SpecDocGenerator;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SpecGenerator implements IGenerator {

	@Inject JvmModelGenerator jvmModelGenerator;
	@Inject SpecDocGenerator docGenerator;
	
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(input, fsa);
		docGenerator.doGenerate(input, fsa);
	}

}
 