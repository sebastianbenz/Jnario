package org.jnario.junit3;

import junit.framework.TestSuite;

public class JnarioTestSuite extends TestSuite{
	
	@SuppressWarnings("rawtypes")
	public JnarioTestSuite(String name, Class... testClasses) {
		super(name);
		for (Class testClass : testClasses) {
			addTestSuite(testClass);
		}
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void addTestSuite(Class testClass) {
		addTest(new NamedJnarioTestSuite(testClass));
	}
}
