package de.bmw.carit.jnario.lib;

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

public class ExampleTable<T extends ExampleTableRow> implements Iterable<T>{

	private final String name;

	private final List<T> rows;

	private final List<String> columns;
	
	public static <P extends ExampleTableRow> ExampleTable<P> create(String name, List<String> columns, P... entries){
		return new ExampleTable<P>(name, columns, asList(entries));
	}
	
	public ExampleTable(String name, List<String> columns, List<T> rows){
		this.name = name;
		this.columns = columns;
		this.rows = rows;
	}

	public T get(int index){
		return rows.get(index);
	}
	
	@Override
	public Iterator<T> iterator() {
		return rows.iterator();
	}
	
	public List<T> getRows() {
		return rows;
	}
	
	public List<String> getColumnNames() {
		return columns;
	}
	
	public String getName() {
		return name;
	}
}
