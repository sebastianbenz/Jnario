package org.jnario.junit3;

import junit.framework.TestSuite;

import org.jnario.runner.NameProvider;

@SuppressWarnings("rawtypes")
public class NamedJnarioTestSuite extends TestSuite{
	
	private Class testClass;

	public NamedJnarioTestSuite(Class testClass) {
		super(testClass);
		this.testClass = testClass;
	}
	
	@Override
	public void addTestSuite(Class testClass) {
		addTest(new NamedJnarioTestSuite(testClass));
	}

	@Override
	public String getName() {
		return NameProvider.create().nameOf(testClass);
	}
	
}
