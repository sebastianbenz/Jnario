/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.spec.impl;

import org.eclipse.xtext.xbase.XBlockExpression;
/**
 * @author Sebastian Benz
 */
@SuppressWarnings("restriction")
public class ExampleImplCustom extends de.bmw.carit.jnario.spec.spec.impl.ExampleImpl {

	@Override
	public boolean isPending() {
		if(body == null){
			return true;
		}
		if(!(body instanceof XBlockExpression)){
			return false;
		}
		XBlockExpression block = (XBlockExpression) body;
		return block.getExpressions().isEmpty();
	}
	
	
}
