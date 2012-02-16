package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.transform;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Joiner;

public class ExampleTableAssertionError extends AssertionError {

	private static final long serialVersionUID = 1L;
	private final String message;

	public ExampleTableAssertionError(String message, List<Throwable> errors) {
		super(errors);
		this.message = message + causesOf(errors);
		if(errors.isEmpty()){
			throw new Error("No reason to throw an exception");
		}
		setStackTrace(errors.get(0).getStackTrace());
	}

	private String causesOf(List<Throwable> errors) {
		return Joiner.on("\n").join(transform(errors, new Function<Throwable, String>(){

			@Override
			public String apply(Throwable input) {
				return input.getLocalizedMessage();
			}
			
		}));
	}

	public String getMessage() {
		return message;
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		return new StackTraceElement[0];
	}
	
}
