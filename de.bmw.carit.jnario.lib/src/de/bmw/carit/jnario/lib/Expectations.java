/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.lib;

import static org.junit.Assert.fail;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
/**
 * @author Sebastian Benz
 */
public class Expectations {

	public static void expect(Class<? extends Throwable> exceptionType, Procedure1<Object> proc){
		try {
			proc.apply(null);
			fail("Expected " + exceptionType.getName() + " but none was thrown.");
		} catch (Throwable e) {
			if(!exceptionType.isInstance(e)){
				throw new UnexpectedExceptionError(exceptionType, e);
			}
		}
	}

}
