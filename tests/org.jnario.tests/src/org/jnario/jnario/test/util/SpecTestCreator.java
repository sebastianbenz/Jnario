/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.jnario.spec.SpecInjectorProvider;


public class SpecTestCreator extends JnarioTestCreator {
	
	private static ExtendedSpecInjectorProvider injectorProvider = new ExtendedSpecInjectorProvider();
	
	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
