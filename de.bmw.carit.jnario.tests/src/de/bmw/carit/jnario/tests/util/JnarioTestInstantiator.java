package de.bmw.carit.jnario.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;

import com.google.inject.Injector;

import de.bmw.carit.jnario.runner.TestInstantiator;

public class JnarioTestInstantiator implements TestInstantiator {
	protected GlobalStateMemento globalStateMemento;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new JnarioStandaloneTestSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
		if (injector != null)
			new JnarioStandaloneTestSetup().register(injector);
	}
	
	@Override
	public Object createTest(Class<?> klass) throws Exception {
		setupRegistry();
		return getInjector().getInstance(klass);
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
		restoreRegistry();
	}

}
