/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.feature.generator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;

import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmModelGenerator;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureJvmModelGenerator extends ExtendedJvmModelGenerator {

	@Inject private ILogicalContainerProvider logicalContainerProvider;

	/**
	 *  based on JvmModelGenerator, changed to generate an empty method instead of "throw UnsupportedOperationException"
	 */
	@Override
	public CharSequence generateBody(final JvmExecutable op, final ImportManager importManager) {

		EList<Adapter> adapters = op.eAdapters();
		Iterable<CompilationStrategyAdapter> _filter = IterableExtensions.<CompilationStrategyAdapter>filter(adapters, CompilationStrategyAdapter.class);
		CompilationStrategyAdapter adapter = IterableExtensions.<CompilationStrategyAdapter>head(_filter);
		XExpression expr = logicalContainerProvider.getAssociatedExpression(op);
		if(adapter == null && expr == null){
			return new StringConcatenation();
		}
		return super.generateBody(op, importManager);		
	}

}
