/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

/**
 * An implementation of a table with rows and columns. It should
 * be used together with {@link Each#forEach(ExampleTable, org.eclipse.xtext.xbase.lib.Procedures.Procedure1)}.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
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

	/**
	 * Returns the table row at the specified index.
	 * 
	 * @param index
	 * @return the table row
     * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public T get(int index){
		return rows.get(index);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<T> iterator() {
		return rows.iterator();
	}
	
	/**
	 * @return the list of rows
	 */
	public List<T> getRows() {
		return rows;
	}
	
	/**
	 * @return the column names
	 */
	public List<String> getColumnNames() {
		return columns;
	}
	
	/**
	 * @return the name of this table
	 */
	public String getName() {
		return name;
	}
}
