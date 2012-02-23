/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import java.util.List;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public abstract class ExampleTableRow {

	private final List<String> cells;

	public ExampleTableRow(List<String> cells) {
		this.cells = cells;
	}
	
	List<String> getCells(){
		return cells;
	}
	
}
