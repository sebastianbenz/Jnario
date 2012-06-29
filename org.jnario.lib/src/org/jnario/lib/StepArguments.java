/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.lib;

import java.util.Arrays;
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
		this(Arrays.asList(values));
	}
	
	public StepArguments(List<String> values) {
		this.values = values;
	}

	/**
     * Returns the element at the specified position in the arguments.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this argument list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
	public String get(int index){
		return values.get(index);
	}
	
	/**
	 * @return the first argument
	 */
	public String first(){
		return values.get(0);
	}
	
	/**
	 * @return the second argument
	 */
	public String second(){
		return values.get(1);
	}
	
	/**
	 * @return the third argument
	 */
	public String third(){
		return values.get(2);
	}
	
	/**
	 * @return the forth argument
	 */
	public String forth(){
		return values.get(3);
	}
	
	/**
	 * @return the fifth argument
	 */
	public String fifth(){
		return values.get(4);
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
