/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.spec.impl;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;

import java.util.regex.Pattern;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ExampleImplCustom extends org.jnario.spec.spec.impl.ExampleImpl {

	private static final Pattern NAME_PATTERN = Pattern.compile("\\s*\r?\n\\s*");

	@Override
	public String getName() {
		if(name != null){
			return name;
		}
		if(expr == null){
			return null;
		}
		if (expr instanceof XStringLiteral) {
			XStringLiteral stringLiteral = (XStringLiteral) expr;
			name = stringLiteral.getValue();
		}else{
			ICompositeNode node = getNode(expr);
			if(node == null){
				return null;
			}
			name = node.getText().trim();
		}
		name = NAME_PATTERN.matcher(name).replaceAll(" ");
		return name;
	}
	
	@Override
	public XExpression getExpression() {
		if(expr instanceof XStringLiteral){
			return expression;
		}else{
			return expr;
		}
	}
	
	@Override
	public boolean isPending() {
		if(pending){
			return true;
		}
		if(expr == null){
			return true;
		}
		if(!(expr instanceof XStringLiteral)){
			return false;
		}
		if(expression == null){
			return true;
		}
		if(!(expression instanceof XBlockExpression)){
			return false;
		}
		XBlockExpression block = (XBlockExpression) expression;
		return block.getExpressions().isEmpty();
	}
	
	
}
