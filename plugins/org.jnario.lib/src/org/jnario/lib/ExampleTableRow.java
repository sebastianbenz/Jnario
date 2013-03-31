/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import java.util.List;

import org.hamcrest.StringDescription;

/**
 * The super class of all table rows.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public abstract class ExampleTableRow {

	private final List<String> cells;

	public ExampleTableRow(List<String> cells) {
		this.cells = cells;
	}
	
	public List<String> getCells(){
		return cells;
	}
	
	public String toString(Object value) {
		return new StringDescription().appendValue(value).toString();
	}
	
}
