package de.bmw.carit.jnario.lib.internal;

import de.bmw.carit.jnario.lib.ExampleTableRow;

public class RowFailed extends RowResult {

	final Throwable cause;

	public RowFailed(ExampleTableRow value, Throwable e) {
		super(value);
		this.cause = e;
	}

	@Override
	public String toString() {
		return "✘";
	}

	public Throwable getCause() {
		return cause;
	}

}