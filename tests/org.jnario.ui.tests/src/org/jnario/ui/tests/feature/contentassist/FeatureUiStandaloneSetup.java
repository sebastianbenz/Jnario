package org.jnario.ui.tests.feature.contentassist;

import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.feature.FeatureUiInjectorProvider;

import com.google.inject.Injector;

public class FeatureUiStandaloneSetup extends FeatureStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return new FeatureUiInjectorProvider().getInjector();
	}

}
