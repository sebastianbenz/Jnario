package de.bmw.carit.jnario.lib.internal;

import de.bmw.carit.jnario.lib.ExampleTableRow;

public class RowPassed extends RowResult{
	
	public RowPassed(ExampleTableRow value){
		super(value);
	}
	
	@Override
	public String toString() {
		return "✓";
	}
}