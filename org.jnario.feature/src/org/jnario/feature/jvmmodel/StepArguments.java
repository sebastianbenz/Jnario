/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.feature.jvmmodel;

import java.util.ArrayList;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class StepArguments extends ArrayList<String>{
	
	public String first(){
		return this.get(0);
	}
	
	public String second(){
		return this.get(1);
	}
	
	public String third(){
		return this.get(2);
	}
	
	public String forth(){
		return this.get(3);
	}
	
	public String fifth(){
		return this.get(4);
	}
	
}
