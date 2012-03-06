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

	public T get(int index){
		return rows.get(index);
	}
	
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
