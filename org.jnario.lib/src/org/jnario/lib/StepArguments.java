/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.lib;

import java.util.ArrayList;
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
	
	public StepArguments() {
		this(new ArrayList<String>());
	}
	
	public StepArguments(String... values) {
		this(Arrays.asList(values));
	}
	
	public StepArguments(List<String> values) {
		this.values = values;
	}

	public void add(String value){
		values.add(value);
	}
	
	public String get(int index){
		return values.get(index);
	}
	
	public String first(){
		return values.get(0);
	}
	
	public String second(){
		return values.get(1);
	}
	
	public String third(){
		return values.get(2);
	}
	
	public String forth(){
		return values.get(3);
	}
	
	public String fifth(){
		return values.get(4);
	}

	@Override
	public String toString() {
		return values.toString();
	}

	public Iterator<String> iterator() {
		return values.iterator();
	}

	public static StepArguments create(String...values) {
		return new StepArguments(Arrays.asList(values));
	}
	
}
