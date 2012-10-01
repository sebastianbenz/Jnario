/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package diverse

import java.util.EmptyStackException
import java.util.Stack

describe Stack{
	
	fact subject.empty should be true
 	   
	fact "initially empty" {subject.size => 0}
	
	fact subject.pop() throws EmptyStackException
	
	fact "increases size when pushing"{
		subject.push("something")
		subject.size => 1
	} 	 
	
	fact "decreases size when popping"{
		subject.push("something")
		subject.pop()
		subject.size => 0
	} 	
	 
	fact "pop returns last pushed element"{
		subject.push("something")
		subject.push("something else")
		subject.pop() => "something else"
		subject.pop() => "something"
	}
 }  