/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.lib;

import java.util.Arrays;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Each {

	public static <T> MatcherChain<T> each(T... inputs) {
		return Each.each(Arrays.asList(inputs));
	}
	
	public static <T> MatcherChain<T> each(Iterable<? extends T> inputs) {
		return new MultiTargetMatcherChain<T>(inputs);
	}
	
	public <T extends ExampleTableRow> void forEach(ExampleTable<T> table, Procedure1<T> assertion) {
		ExampleTableIterators.forEach(table, assertion);
	}

}
