/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import org.eclipse.xtext.xbase.lib.Procedures
import org.junit.Assert

class Helpers {
	
	def static is(String actual, CharSequence expected){
		Assert::assertEquals(expected.toString().replaceAll("\r", ""), actual.replaceAll("\r", ""))
	}
 
	def static String errorMessage(Procedures$Procedure1<Boolean> proc){
		try{ 
			proc.apply(null)
			throw new AssertionError("expected AssertionError")
		}catch(AssertionError e){
			return e.message.trim 
		}
	} 
	
}