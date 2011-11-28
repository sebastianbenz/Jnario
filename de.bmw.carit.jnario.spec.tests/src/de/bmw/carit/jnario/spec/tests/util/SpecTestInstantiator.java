package de.bmw.carit.jnario.spec.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.junit.runners.model.TestClass;

import com.google.inject.Injector;

import de.bmw.carit.jnario.runner.TestInstantiator;

public class SpecTestInstantiator implements TestInstantiator {
	protected GlobalStateMemento globalStateMemento;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new TestSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
		if (injector != null)
			new TestSetup().register(injector);
	}
	
	@Override
	public Object createTest(TestClass klass) throws Exception {
		setupRegistry();
		return getInjector().getInstance(klass.getJavaClass());
	}

	@Override
	public void beforeTestRun() {
	}

	@Override
	public void afterTestRun() {
		restoreRegistry();
	}

}
