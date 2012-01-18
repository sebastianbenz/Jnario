/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.lib;

/**
 * @author Sebastian Benz
 */
@SuppressWarnings("serial")
public class UnexpectedExceptionError extends AssertionError {

	private final Throwable cause;
	private final Class<? extends Throwable> expected;

	public UnexpectedExceptionError(Class<? extends Throwable> expected, Throwable cause) {
		super(expected);
		this.expected = expected;
		this.cause = cause;
	}
	
	@Override
	public Throwable getCause() {
		return cause;
	}
	
	@Override
	public String getMessage() {
		return "Expected " + expected.getName() + " but was " + cause.getClass().getName();
	}

}