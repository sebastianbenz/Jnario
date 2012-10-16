/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package demo

describe "Calculator"{
	
	fact "should add two values"{
		new Calculator().add(1, 2) should be 3
	}
	
	def examples{
		| a | b | sum |
		| 1 | 2 |  4  |
		| 1 | 3 |  4  |
	}
	
	fact "should handle tables"{
		examples.forEach[a + b => sum]
	}	
	  
}          