/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package foo

import org.junit.Test
import org.junit.Assert
import foo.FooClass

class FooTest {
	
	@Test
	def assertTrue() {
	    Assert::assertEquals(1,new FooClass().count);
	}
}