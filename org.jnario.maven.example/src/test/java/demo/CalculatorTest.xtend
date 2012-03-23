/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package demo

import org.junit.Test

class CalculatorTest {
	
	@Test
	def void shouldRun(){
		new Calculator().add(1, 1)
	}
	
}