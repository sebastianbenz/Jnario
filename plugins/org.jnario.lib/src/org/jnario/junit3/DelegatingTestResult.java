package org.jnario.junit3;

import java.util.Enumeration;

import junit.framework.AssertionFailedError;
import junit.framework.Protectable;
import junit.framework.Test;
import junit.framework.TestFailure;
import junit.framework.TestListener;
import junit.framework.TestResult;

public class DelegatingTestResult extends TestResult {

	private TestResult delegate;
	private Test wrapper;
	
	public DelegatingTestResult(TestResult delegate, Test wrapper) {
		this.delegate = delegate;
		this.wrapper = wrapper;
	}
	
	public synchronized void addError(Test test, Throwable t) {
		delegate.addError(wrapper, t);
	}

	public synchronized void addFailure(Test test, AssertionFailedError t) {
		delegate.addFailure(wrapper, t);
	}

	public synchronized void addListener(TestListener listener) {
		delegate.addListener(listener);
	}

	public synchronized void removeListener(TestListener listener) {
		delegate.removeListener(listener);
	}


	public void endTest(Test test) {
		delegate.endTest(wrapper);
	}

	public synchronized int errorCount() {
		return delegate.errorCount();
	}

	public synchronized Enumeration<TestFailure> errors() {
		return delegate.errors();
	}
	

	public synchronized int failureCount() {
		return delegate.failureCount();
	}

	public synchronized Enumeration<TestFailure> failures() {
		return delegate.failures();
	}
	

	public synchronized int runCount() {
		return delegate.runCount();
	}

	public void runProtected(final Test test, Protectable p) {
		delegate.runProtected(wrapper, p);
	}

	public synchronized boolean shouldStop() {
		return delegate.shouldStop();
	}

	public void startTest(Test test) {
		delegate.startTest(wrapper);
	}

	public synchronized void stop() {
		delegate.stop();
	}

	public synchronized boolean wasSuccessful() {
		return delegate.wasSuccessful();
	}
	
}
