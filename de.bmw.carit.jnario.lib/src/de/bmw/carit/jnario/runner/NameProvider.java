/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.runner;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class NameProvider {
	
	public static NameProvider create(){
		return new NameProvider();
	}

	public String nameOf(FrameworkMethod method) {
		return nameOf(method.getAnnotation(Named.class), method.getName());
	}

	private String nameOf(Named named, String defaultName) {
		return named == null ? defaultName : named.value();
	}

	public String nameOf(TestClass klass) {
		return nameOf(klass.getJavaClass().getAnnotation(Named.class), klass.getName());
	}
}
