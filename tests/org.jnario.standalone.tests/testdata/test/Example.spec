/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package test

describe "Spec Example" {

	def aTable{
		| x | y |
		| 0 | 0 |
	}

	fact "should pass"{
		1 + 1 => 2
	} 
	describe "Nested Example" {
		fact "should pass aswell"{
			1 + 1 => 2
		} 
	}
}
	 