/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.tests.unit.naming;

import java.util.List;

public class OperationNamesExample {

	public void simpleOperation(){
	}
	
	public void operationWithSingleArgument(String arg){
	}
	
	public void operationWithMultipleArguments(String arg, Object o, int i){
	}
	
	public void operationWithTypedArguments(List<String> arg, List<? extends String> arg2){
	}
	
	public void operationWithVarArg(String...strings){
	}
	
}
