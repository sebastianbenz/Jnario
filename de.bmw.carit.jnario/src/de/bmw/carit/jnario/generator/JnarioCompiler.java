/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives.Primitive;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xtend2.compiler.Xtend2Compiler;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JnarioCompiler extends Xtend2Compiler {

	// removed "{\n" and "\n}" from original method
	@Override
	protected void _toJavaStatement(XBlockExpression expr, IAppendable b, boolean isReferenced) {
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
	
	@Override
	protected void _toJavaStatement(XVariableDeclaration varDeclaration,
			IAppendable b, boolean isReferenced) {
		if (varDeclaration.getRight() != null) {
			internalToJavaStatement(varDeclaration.getRight(), b, true);
		}
		b.append("\n");
		if (!varDeclaration.isWriteable()) {
			b.append("final ");
		}
		JvmTypeReference type = null;
		if (varDeclaration.getType() != null) {
			type = varDeclaration.getType();
		} else {
			type = getTypeProvider().getType(varDeclaration.getRight());
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
