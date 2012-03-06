/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

/*
 * You can use the `should` statement to express the expected behavior of objects.
 */
describe "CollectionLiterals"{

	describe "List Literal"{
		- [#("green", "red") => newArrayList("green", "red")]
		- [#(#("green"), #("red")) => newArrayList(newArrayList("green"), newArrayList("red"))]
	}
	
	describe "Set Literal"{
		- [#{"green", "red"} => newHashSet("green", "red")]
		- [#{#{"green"}, #{"red"}} => newHashSet(newHashSet("green"), newHashSet("red"))]
	}    
			
}