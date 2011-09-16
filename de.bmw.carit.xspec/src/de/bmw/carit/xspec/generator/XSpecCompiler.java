/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.xspec.generator;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;

import de.bmw.carit.xspec.xspec.Given;
import de.bmw.carit.xspec.xspec.Sentence;
import de.bmw.carit.xspec.xspec.XSpec;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class XSpecCompiler extends XbaseCompiler {
	
	private static final JvmTypeReference VOID = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();

	public String compile(XExpression expression, ImportManager importManager) {
		StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(importManager);

		return compile(expression, appendable, newVoidRef()).toString();
	}
	
	protected JvmTypeReference newVoidRef() {
		JvmParameterizedTypeReference reference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
		reference.setType(TypesFactory.eINSTANCE.createJvmVoid());
		return reference;
	}

}
