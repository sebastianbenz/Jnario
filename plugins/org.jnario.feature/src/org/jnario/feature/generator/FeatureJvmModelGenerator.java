/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.generator;

import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeExtensions;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureJvmModelGenerator extends ExtendedJvmModelGenerator {

	@Inject private ILogicalContainerProvider logicalContainerProvider;
	
	  
	@Inject
	private JvmTypeExtensions jvmTypeExtensions;

	@Override
	public void generateExecutableBody(JvmExecutable op, ITreeAppendable appendable, GeneratorConfig config) {
		if(jvmTypeExtensions.getCompilationStrategy(op) == null && logicalContainerProvider.getAssociatedExpression(op) == null && op instanceof JvmOperation){
			appendable.openScope();
			appendable.increaseIndentation().append("{").newLine();
			appendable.decreaseIndentation().newLine().append("}");
			appendable.closeScope();		
		}else{
			super.generateExecutableBody(op, appendable, config);
		}
	}
	
	public boolean hasBody(JvmExecutable op) {
		return true;
	};
}
