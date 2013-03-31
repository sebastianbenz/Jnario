/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.spec.impl;

import static org.eclipse.xtext.util.Strings.equal;

import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("restriction")
public class TestFunctionImplCustom extends TestFunctionImpl {

	@Override
	public boolean isStatic() {
		for(String modifier: getModifiers()) { 
			if(equal(modifier, "all")) 
				return true;
		}
		return super.isStatic();
	}
}
