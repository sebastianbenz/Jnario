package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.lang.Math.max;
import static java.lang.String.format;
import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class ExampleTable<T extends ExampleTableRow> implements Iterable<T>{

	/**
	 * 
	 */
	private static final String INDENT = "        ";

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
		String formatString = createFormatString();
		StringBuilder causes = new StringBuilder();
		StringBuilder message = new StringBuilder(name);
		message.append(" failed\n\n");
		describeColumns(formatString, message);
		int i = 1;
		for (Result result : results) {
			describeRow(formatString, message, result);
			if (result instanceof Failure) {
				message.append("     (");
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

	private String createFormatString() {
		StringBuilder formatString = new StringBuilder("|");
		for(int i = 0; i < columns.size(); i++){
			int length = columns.get(i).length();
			for (T row : rows) {
				String cell = row.getValues().get(i);
				int cellLength = cell == null ? 0 : cell.length();
				length = max(length, cellLength);
			}
			formatString.append(" %" + (i + 1) + "$-" + (length+10) + "s|");
		}
		return formatString.toString();
	}
	
	private void describeColumns(String formatString, StringBuilder message) {
		message.append(INDENT);
		message.append(format(formatString, columns.toArray()));
		message.append("\n"); 
	}

	protected void describeRow(String formatString, StringBuilder message, Result result) {
		message.append(INDENT);
		List<String> cells = ((ExampleTableRow)result.value).getValues();
		message.append(format(formatString, cells.toArray()));
		message.append(" ");
		message.append(result);
	}

	protected void describeCause(StringBuilder causes, int i, Failure result) {
		causes.append("\n(");
		causes.append(i);
		causes.append(") ");
		causes.append(result.exception.getLocalizedMessage().substring(1).replaceAll("\\\n", "\n    "));
	}

	
}
