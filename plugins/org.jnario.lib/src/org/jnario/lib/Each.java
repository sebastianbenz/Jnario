/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import java.util.Collection;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Extension methods to perform assertions on {@link Iterable}, {@link Collection} and {@link ExampleTable}.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class Each {

	/**
	 * Performs an assertion on each row in an {@link ExampleTable}. All
	 * failures are collected and merged into a readable representation.
	 * 
	 * @param table a table with examples
	 * @param assertion a closure which performs an assertion on each row.
	 */
	public <T extends ExampleTableRow> void forEach(ExampleTable<T> table, Procedure1<T> assertion) {
		ExampleTableIterators.forEach(table, assertion);
	}

}
