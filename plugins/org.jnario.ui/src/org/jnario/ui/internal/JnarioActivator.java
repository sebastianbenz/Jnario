/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.internal;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.jnario.ui.JnarioUiModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class JnarioActivator extends AbstractUIPlugin {
	
	private static JnarioActivator INSTANCE;
	private static final Logger logger = Logger.getLogger(JnarioActivator.class);
	private Injector injector;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injector = null;
		INSTANCE = null;
		super.stop(context);
	}
	
	public static JnarioActivator getInstance() {
		return INSTANCE;
	}
	
	public synchronized Injector getInjector() {
		if (injector == null) {
			injector = createInjector();
		}
		return injector;
	}
	
	protected Injector createInjector() {
		try {
			Module sharedStateModule = getSharedStateModule();
			Module jnarioModule = new JnarioUiModule();
			return Guice.createInjector(Modules2.mixin(sharedStateModule, jnarioModule));
		} catch (Exception e) {
			logger.error("Failed to create injector for jnario");
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for jnario", e);
		}
	}

	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
}
