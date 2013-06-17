/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui;
import static com.google.inject.name.Names.named;

import org.eclipse.xtend.ide.XtendPreferenceStoreInitializer;
import org.eclipse.xtend.ide.refactoring.XtendRefactoringPreferences;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.jnario.ui.internal.JnarioActivator;
import org.jnario.ui.preferences.JnarioPreferenceStoreAccess;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.name.Names;


@SuppressWarnings("restriction")
public class JnarioSharedState implements Module {

	public void configure(Binder binder) {
		binder.bind(EclipseOutputConfigurationProvider.class).toInstance(injector().getInstance(EclipseOutputConfigurationProvider.class));
		binder.bind(IPreferenceStoreAccess.class).to(JnarioPreferenceStoreAccess.class).in(Scopes.SINGLETON);
		binder.bind(IPreferenceStoreInitializer.class)
				.annotatedWith(Names.named("RefactoringPreferences"))
				.to(XtendRefactoringPreferences.Initializer.class);
		binder.bind(IPreferenceStoreInitializer.class)
				.annotatedWith(named("builderPreferenceInitializer")).toInstance(
						injector().getInstance(BuilderPreferenceAccess.Initializer.class));
		binder.bind(IPreferenceStoreInitializer.class).annotatedWith(Names.named("smartCaretPreferenceInitializer")) //$NON-NLS-1$
		.to(XtendPreferenceStoreInitializer.class);
		binder.bind(IPreferenceStoreInitializer.class).annotatedWith(Names.named("bracketMatcherPrefernceInitializer")) //$NON-NLS-1$
		.to(org.eclipse.xtext.ui.editor.bracketmatching.BracketMatchingPreferencesInitializer.class);
		binder.bind(IPreferenceStoreInitializer.class).annotatedWith(IOutlineContribution.All.class)
		.to(IOutlineContribution.Composite.class);
	}

	protected Injector injector() {
		return JnarioActivator.getInstance().getInjector();
	}

}
