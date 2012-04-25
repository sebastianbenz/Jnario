/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator

describe Calculator{
	
	context add(int, int){
		fact "should add two values"{
			subject.add(1, 2) should be 3		
		}
	}
  
	context divide(int, int){
		fact "should divide two values"{
			subject.divide(6, 2) should be 2		
		}
		fact "on division by zero"{
			subject.divide(1, 0) should throw ArithmeticException
		}
	}
	
	context substract{
		fact subject.substract(5, 3) should be 2
	}
	
} 
