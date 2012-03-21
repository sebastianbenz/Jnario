package org.jnario.spec.spec.impl;

import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("restriction")
public class TestFunctionImplCustom extends TestFunctionImpl {

	@Override
	public XExpression getImplementation() {
		return getBody();
	}
	
}
