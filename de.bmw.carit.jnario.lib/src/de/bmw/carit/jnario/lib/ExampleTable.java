package de.bmw.carit.jnario.lib;

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

public class ExampleTable<T> implements Iterable<T>{

	private final List<T> entries;
	
	public static <P> ExampleTable<P> create(P... entries){
		return new ExampleTable<P>(asList(entries));
	}
	
	public ExampleTable(List<T> entries){
		this.entries = entries;
	}

	@Override
	public Iterator<T> iterator() {
		return entries.iterator();
	}

}
