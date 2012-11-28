/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.jnario.feature.FeatureUiInjectorProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureUiTestCreator extends JnarioTestCreator{
	private static FeatureUiInjectorProvider injectorProvider = new FeatureUiInjectorProvider();
	
	@Override
	protected IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}

}
