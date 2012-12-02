package org.jnario.junit3;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class DelegatingTestCase extends TestCase{

	private TestCase delegate;
	
	public DelegatingTestCase(String name, TestCase delegate) {
		super(name);
		this.delegate = delegate;
	}

	public int countTestCases() {
		return delegate.countTestCases();
	}

	public TestResult run() {
		return delegate.run();
	}
	
	public void run(TestResult result) {
		delegate.run(new DelegatingTestResult(result, this));
	}

	public void runBare() throws Throwable {
		delegate.runBare();
	}

	@Override
	public String toString() {
	    return delegate.toString();
	}

}
