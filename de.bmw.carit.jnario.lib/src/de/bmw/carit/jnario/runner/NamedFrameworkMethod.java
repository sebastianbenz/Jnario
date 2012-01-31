/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import java.lang.reflect.Method;

import org.junit.runners.model.FrameworkMethod;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class NamedFrameworkMethod extends FrameworkMethod {
		
		private final String name;

		public NamedFrameworkMethod(Method method, String name) {
			super(method);
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}
		
	}