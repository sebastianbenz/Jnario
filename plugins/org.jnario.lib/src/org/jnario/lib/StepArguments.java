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
 * String arguments that are defined in a step definition.
 * 
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class StepArguments implements Iterable<String>{
	
	private final List<String> values;
	
	public StepArguments(String... values) {
		this.values = asList(values);
	}
	
	@Override
	public String toString() {
		return values.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<String> iterator() {
		return values.iterator();
	}
	
}
