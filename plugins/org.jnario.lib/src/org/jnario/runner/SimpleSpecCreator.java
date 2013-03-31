/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.lib.AbstractSpecCreator;

/**
 * A creator of spec instances using a constructor without arguments.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class SimpleSpecCreator extends AbstractSpecCreator {

	protected <T> T create(Class<T> klass) {
		try {
			return klass.newInstance();
		} catch (Exception e) {
			Exceptions.sneakyThrow(e);
			return null; // not reachable
		}
	}
}
