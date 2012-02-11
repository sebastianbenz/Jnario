package de.bmw.carit.jnario.lib;

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

public class ExampleTable<T> implements Iterable<T>{

	private final List<T> rows;
	
	public static <P> ExampleTable<P> create(P... entries){
		return new ExampleTable<P>(asList(entries));
	}
	
	public ExampleTable(List<T> rows){
		this.rows = rows;
	}

	public T get(int index){
		return rows.get(index);
	}
	
	@Override
	public Iterator<T> iterator() {
		return rows.iterator();
	}

}
