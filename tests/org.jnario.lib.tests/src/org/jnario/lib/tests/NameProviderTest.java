/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.tests;

import static org.eclipse.xtext.util.Strings.convertFromJavaString;
import static org.junit.Assert.assertEquals;

import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;
import org.junit.Test;

public class NameProviderTest {

	@Named("string with special char \\u00E4")
	private static class Example{
	}
	
	@Test
	public void convertsFromJavaString() throws Exception {
		String actual = new NameProvider().nameOf(Example.class);
		assertEquals("string with special char " + convertFromJavaString("\\u00E4", true), actual);
	}
	
}
