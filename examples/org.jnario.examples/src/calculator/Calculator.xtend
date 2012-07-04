/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator 

class Calculator {
	
	def add(int a, int b){
		return a + b
	}
	  
	 def divide(int a, int b){
	 	return a / b
	 }
	 
	 def substract(int a, int b){
	 	return a - b
	 }
	 
	override toString() {
		"Calculator"		
	}
	
	def enter(String a){
		
	}
	
	def press(String command){
		
	}
	
	def result(){
		return "120"
	}
}    