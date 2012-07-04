/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.conversion;

import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.conversion.impl.IDValueConverter;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class MethodNameConverter extends IDValueConverter {

	@Override
	protected void assertTokens(String value, TokenSource tokenSource,
			String escapedString) {
	}
}
