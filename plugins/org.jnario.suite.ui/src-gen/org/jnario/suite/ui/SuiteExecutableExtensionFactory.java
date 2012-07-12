/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.suite.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.jnario.suite.ui.internal.SuiteActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SuiteExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SuiteActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SuiteActivator.getInstance().getInjector(SuiteActivator.ORG_JNARIO_SUITE_SUITE);
	}
	
}
