package org.jnario.junit3;

import junit.framework.TestSuite;

public class JnarioTestSuite extends TestSuite{
	
	public JnarioTestSuite(String name) {
		super(name);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void addTestSuite(Class testClass) {
		addTest(new NamedJnarioTestSuite(testClass));
	}
}
