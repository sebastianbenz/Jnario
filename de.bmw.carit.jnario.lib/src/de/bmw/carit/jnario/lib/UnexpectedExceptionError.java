package de.bmw.carit.jnario.lib;
@SuppressWarnings("serial")
public class UnexpectedExceptionError extends AssertionError {

	private final Exception cause;
	private final Class<? extends Exception> expected;

	public UnexpectedExceptionError(Class<? extends Exception> expected, Exception cause) {
		super(expected);
		this.expected = expected;
		this.cause = cause;
	}
	
	@Override
	public Throwable getCause() {
		return cause;
	}
	
	@Override
	public String getMessage() {
		return "Expected " + expected.getName() + " but was " + cause.getClass().getName();
	}

}