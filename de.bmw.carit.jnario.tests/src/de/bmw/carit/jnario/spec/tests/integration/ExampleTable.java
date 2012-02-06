package de.bmw.carit.jnario.spec.tests.integration;

import java.util.Iterator;
import java.util.List;

public class ExampleTable<T> implements Iterable<T>{

	private final List<T> entries;

	public ExampleTable(List<T> entries){
		this.entries = entries;
	}

	@Override
	public Iterator<T> iterator() {
		return entries.iterator();
	}

}
