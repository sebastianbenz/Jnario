/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.lib;

import static com.google.common.collect.Lists.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class StepArguments {
	
	private final List<String> values = newArrayList();
	
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
	
}
