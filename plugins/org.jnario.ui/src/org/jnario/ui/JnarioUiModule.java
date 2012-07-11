package org.jnario.ui;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.jnario.doc.DocOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class JnarioUiModule extends AbstractGenericModule{
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("org.jnario");
		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).annotatedWith(com.google.inject.name.Names.named("builderPreferenceInitializer")).to(org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer.class);
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return DocOutputConfigurationProvider.class;
	}

}
