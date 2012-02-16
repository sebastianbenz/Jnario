package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.internal.runners.model.MultipleFailureException;

import com.google.common.base.Function;

@SuppressWarnings("restriction")
public class ExampleTable<T> implements Iterable<T>{

	interface Result{
	}
	
	private static class Ok implements Result{
		@Override
		public String toString() {
			return "✔";
		}
	}
	
	private static class Failure implements Result{

		private final Throwable e;

		public Failure(Throwable e) {
			this.e = e;
		}
		
		@Override
		public String toString() {
			return "X";
		}
		
	}

	private static final Result OK = new Ok();
	
	private final List<T> rows;

	private final String name;
	
	public static <P> ExampleTable<P> create(String name, P... entries){
		return new ExampleTable<P>(name, asList(entries));
	}
	
	public ExampleTable(String name, List<T> rows){
		this.name = name;
		this.rows = rows;
	}

	public T get(int index){
		return rows.get(index);
	}
	
	@Override
	public Iterator<T> iterator() {
		return rows.iterator();
	}
	
	public void each(Procedure1<T> assertion) {
		if(rows.isEmpty()){
			return;
		}
		Map<T, Result> results = newHashMap();
		if(passes(assertion, results)){
			return;
		}else{
			throw newAssertionError(createMessage(results), results);
		}
		
	}

	private boolean passes(Procedure1<T> assertion, Map<T, Result> results) {
		boolean hasFailed = false;
		for (T row : rows) {
			Result result;
			try {
				assertion.apply(row);
				result = OK;
			} catch (Throwable e) {
				result = new Failure(e);
				hasFailed = true;
			}
			results.put(row, result);
		}
		return !hasFailed;
	}
			

	private AssertionError newAssertionError(StringBuilder message,
			Map<T, Result> results) {
		AssertionError assertionError = new AssertionError(message);
		Iterable<Failure> failures = filter(results.values(), Failure.class);
		List<Throwable> errors = newArrayList(transform(failures, new Function<Failure, Throwable>() {

			@Override
			public Throwable apply(Failure p) {
				return p.e;
			}
		}));
		Throwable cause;
		if(errors.size() == 1){
			cause = errors.get(0);
		}else{
			cause= new MultipleFailureException(errors);
		}
		assertionError.initCause(cause);
		return assertionError;
	}

	private StringBuilder createMessage(Map<T, Result> results) {
		StringBuilder message = new StringBuilder(name + " failed\n");
		for (Entry<T, Result> entry : results.entrySet()) {
			message.append("        ");
			message.append(entry.getKey());
			message.append(" ");
			message.append(entry.getValue());
			message.append("\n");
		}
		return message;
	}

}
