/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui;

import static com.google.inject.name.Names.named;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.jnario.doc.DocOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class JnarioUiModule extends AbstractGenericModule{
	
	private AbstractUIPlugin plugin;

	public JnarioUiModule(AbstractUIPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(AbstractUIPlugin.class).toInstance(plugin);
		binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("org.jnario.Jnario");
		binder.bind(IPreferenceStoreInitializer.class)
		.annotatedWith(named("builderPreferenceInitializer")).to(BuilderPreferenceAccess.Initializer.class);
	}
	
	public IPreferenceStore bindIPreferenceStore() {
		return plugin.getPreferenceStore();
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return DocOutputConfigurationProvider.class;
	}
	
}
