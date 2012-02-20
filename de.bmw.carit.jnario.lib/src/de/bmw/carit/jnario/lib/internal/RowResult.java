package de.bmw.carit.jnario.lib.internal;

import de.bmw.carit.jnario.lib.ExampleTableRow;

public abstract class RowResult{

	final ExampleTableRow value;

	public RowResult(ExampleTableRow value) {
		this.value = value;
	}
	
	public ExampleTableRow getValue() {
		return value;
	}
}
