package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class ExampleTable<T> implements Iterable<T>{

	public static abstract class Result{

		final Object value;

		public Result(Object value) {
			this.value = value;
		}
	}
	
	public static class Ok extends Result{
		
		Ok(Object value){
			super(value);
		}
		
		@Override
		public String toString() {
			return "✓";
		}
	}
	
	public static class Failure extends Result{
		
		final Throwable exception;

		Failure(Object value, Throwable e) {
			super(value);
			this.exception = e;
		}
		
		@Override
		public String toString() {
			return "✗";
		}
		
	}

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
		perform(assertion);
	}

	private void perform(Procedure1<T> assertion) {
		List<Result> results = newArrayListWithExpectedSize(rows.size());
		boolean hasFailed = false;
		for (T row : rows) {
			Result result;
			try {
				assertion.apply(row);
				result = new Ok(row);
			} catch (Throwable e) {
				result = new Failure(row, e);
				hasFailed = true;
			}
			results.add(result);
		}
		if(hasFailed){
			throw newAssertionError(results);
		}
	}

	private AssertionError newAssertionError(List<Result> results) {
		AssertionError error = new AssertionError(createMessage(results));
		error.setStackTrace(getStacktrace(results));
		return error;
	}
	
	private StackTraceElement[] getStacktrace(List<Result> results) {
		return filter(results, Failure.class).iterator().next().exception.getStackTrace();
	}

	private String createMessage(List<Result> results) {
		StringBuilder message = new StringBuilder(name + " failed\n");
		StringBuilder causes = new StringBuilder();
		int i = 1;
		for (Result result : results) {
			describeRow(message, i, result);
			if (result instanceof Failure) {
				message.append(" (");
				message.append(i);
				message.append(")");
				describeCause(causes, i, (Failure) result);
				i++;
			}
			message.append("\n");
		}
		message.append(causes);
		return message.toString();
	}

	protected void describeRow(StringBuilder message, int i, Result result) {
		message.append("        ");
		message.append(result.value);
		message.append(" ");
		message.append(result);
	}

	protected void describeCause(StringBuilder causes, int i, Failure result) {
		causes.append("\n(");
		causes.append(i);
		causes.append(") ");
		causes.append(result.exception.getLocalizedMessage().substring(1));
		causes.append("\n");
	}

	
}
