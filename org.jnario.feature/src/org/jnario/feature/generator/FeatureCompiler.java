/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives.Primitive;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.jnario.compiler.JnarioCompiler;
import org.jnario.feature.jvmmodel.FeatureJvmModelInferrer;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureCompiler extends JnarioCompiler {

	/**
	 * based on XbaseCompiler, removed brackets ("{\n" and "\n}") from original method
	 */
	@Override
	protected void _toJavaStatement(XBlockExpression expr, ITreeAppendable b, boolean isReferenced) {
		if (expr.getExpressions().isEmpty())
			return;
		if (expr.getExpressions().size()==1) {
			internalToJavaStatement(expr.getExpressions().get(0), b, isReferenced);
			return;
		}
		if (isReferenced)
			declareSyntheticVariable(expr, b);
		b.increaseIndentation();
		final EList<XExpression> expressions = expr.getExpressions();
		for (int i = 0; i < expressions.size(); i++) {
			XExpression ex = expressions.get(i);
			if (i < expressions.size() - 1) {
				internalToJavaStatement(ex, b, false);
			} else {
				internalToJavaStatement(ex, b, isReferenced);
				if (isReferenced) {
					b.append("\n").append(getVarName(expr, b)).append(" = (");
					internalToConvertedExpression(ex, b, null);
					b.append(");");
				}
			}
		}
		b.decreaseIndentation();
	}
	
	/**
	 * based on XbaseCompiler, removed creation of local variables
	 */
	@Override
	protected void _toJavaStatement(XVariableDeclaration varDeclaration,
			ITreeAppendable b, boolean isReferenced) {
		if (varDeclaration.getRight() != null) {
			internalToJavaStatement(varDeclaration.getRight(), b, true);
		}
		b.newLine();
		JvmTypeReference type = null;
		
		if(varDeclaration.getName() == FeatureJvmModelInferrer.STEP_VALUES){
			// for step arguments only
			if (varDeclaration.getType() != null) {
				type = varDeclaration.getType();
			} else {
				type = getTypeProvider().getType(varDeclaration.getRight());
			}

			b.append(" ");
			
			serialize(type, varDeclaration, b);
			b.append(" ");
		}
		
		b.append(b.declareVariable(varDeclaration, varDeclaration.getName()));
		b.append(" = ");
		if (varDeclaration.getRight() != null) {
			internalToConvertedExpression(varDeclaration.getRight(), b, type);
		} else {
			if (getPrimitives().isPrimitive(type)) {
				Primitive primitiveKind = getPrimitives().primitiveKind((JvmPrimitiveType) type.getType());
				switch (primitiveKind) {
					case Boolean:
						b.append("false");
						break;
					default:
						b.append("0");
						break;
				}
			} else {
				b.append("null");
			}
		}
		b.append(";");
	}

}
