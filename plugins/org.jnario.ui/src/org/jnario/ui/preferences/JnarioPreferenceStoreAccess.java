package org.jnario.ui.preferences;

import org.eclipse.xtext.ui.editor.preferences.PreferenceStoreAccessImpl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class JnarioPreferenceStoreAccess extends PreferenceStoreAccessImpl {

	@Override
	@Inject
	public void setLanguageNameAsQualifier(@Named("languageName") String languageName) {
		super.setLanguageNameAsQualifier("jnario");
	}
	
}
