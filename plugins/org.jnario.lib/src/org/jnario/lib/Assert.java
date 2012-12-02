package org.jnario.lib;

/*
 * copied from org.junit
 */
public class Assert {
	
	/**
	 * Asserts that a condition is true. If it isn't it throws an
	 * {@link AssertionError} with the given message.
	 * 
	 * @param message
	 *            the identifying message for the {@link AssertionError} (<code>null</code>
	 *            okay)
	 * @param condition
	 *            condition to be checked
	 */
	static public void assertTrue(String message, boolean condition) {
		if (!condition)
			fail(message);
	}
	
	/**
	 * Asserts that a condition is false. If it isn't it throws an
	 * {@link AssertionError} with the given message.
	 * 
	 * @param message
	 *            the identifying message for the {@link AssertionError} (<code>null</code>
	 *            okay)
	 * @param condition
	 *            condition to be checked
	 */
	static public void assertFalse(String message, boolean condition) {
		assertTrue(message, !condition);
	}
	
	/**
	 * Fails a test with the given message.
	 * 
	 * @param message
	 *            the identifying message for the {@link AssertionError} (<code>null</code>
	 *            okay)
	 * @see AssertionError
	 */
	static public void fail(String message) {
		if (message == null)
			throw new AssertionError();
		throw new AssertionError(message);
	}


}
