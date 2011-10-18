package de.bmw.carit.jnario.tests.util;

import java.util.Map;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.eclipse.xtext.junit4.InjectWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import com.google.common.collect.Maps;
import com.google.inject.Injector;

public class JnarioTestRunner extends BlockJUnit4ClassRunner {
	private static Map<Class<?>, IInjectorProvider> injectorProviderClassCache = Maps
			.newHashMap();

	public JnarioTestRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected Object createTest() throws Exception {
		Object object = super.createTest();
		IInjectorProvider injectorProvider = getOrCreateInjectorProvider();
		if (injectorProvider instanceof IRegistryConfigurator) {
			((IRegistryConfigurator) injectorProvider).setupRegistry();
		}
		if (injectorProvider != null) {
			try {
				Injector injector = injectorProvider.getInjector();
				if (injector != null) {
					injector.injectMembers(object);
				}
			} catch (Exception e) {
				// ignore UI tests
			}
		}
		return object;
	}

	@Override
	protected Statement methodBlock(FrameworkMethod method) {
		final Statement methodBlock = super.methodBlock(method);
		if (getInjectorProvider() instanceof IRegistryConfigurator) {
			return new Statement() {
				@Override
				public void evaluate() throws Throwable {
					try {
						methodBlock.evaluate();
					} finally {
						IInjectorProvider injectorProvider = getInjectorProvider();
						if (injectorProvider instanceof IRegistryConfigurator) {
							((IRegistryConfigurator) injectorProvider).restoreRegistry();
						}
						
					}
				}
			};
		}
		return methodBlock;
	}

	protected IInjectorProvider getOrCreateInjectorProvider() throws Exception {
		IInjectorProvider injectorProvider = getInjectorProvider();
		if (injectorProvider == null) {
			injectorProvider = createInjectorProvider();
			injectorProviderClassCache.put(getTestClass().getJavaClass(),
					injectorProvider);
		}
		return injectorProvider;
	}

	protected IInjectorProvider getInjectorProvider() {
		return injectorProviderClassCache.get(getTestClass().getJavaClass());
	}

	protected IInjectorProvider createInjectorProvider() throws Exception {
		IInjectorProvider injectorProvider = null;
		InjectWith injectWith = getTestClass().getJavaClass().getAnnotation(
				InjectWith.class);
		if (injectWith != null) {
			injectorProvider = injectWith.value().newInstance();
		}
		return injectorProvider;
	}
	
}