package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Maps.newHashMap;
import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import de.bmw.carit.jnario.lib.ExampleTable.Result;

public class ExampleTable<T> implements Iterable<T>{

	interface Result{
		
	}
	
	private static class Ok implements Result{
		
	}
	
	private static class Failed implements Result{

		private final AssertionError e;

		public Failed(AssertionError e) {
			this.e = e;
		}
		
	}

	private static final Result OK = new Ok();
	
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
	
	public <T> void each(Iterable<? extends T> inputs, Procedure1<T> matcher) {
		Map<T, Result> results = newHashMap();
		boolean hasFailed = false;
		
		for (T input : inputs) {
			try {
				matcher.apply(input);
				results.put(input, OK);
			} catch (AssertionError e) {
				results.put(input, new Failed(e));
				hasFailed = true;
			}
		}
		
		if(!hasFailed){
			return;
		}
		
	}

}
