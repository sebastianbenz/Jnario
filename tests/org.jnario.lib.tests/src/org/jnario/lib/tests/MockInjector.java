package org.jnario.lib.tests;

import org.jnario.runner.SimpleSpecCreator;
import org.mockito.MockitoAnnotations;

public class MockInjector extends SimpleSpecCreator {

	@Override
	protected <T> T create(Class<T> klass) {
		T spec = super.create(klass);
		MockitoAnnotations.initMocks(spec);
		return spec;
	}

}
