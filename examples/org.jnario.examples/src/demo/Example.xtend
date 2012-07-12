/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package demo

import static java.util.Collections.*

class Example {
	def static void main(String[] args) {
		println(newArrayList("red", "blue", "green").sort) 
	}
	
	@Property()
	(String) => void field
}   

class Database{
	def connect(String url){
	}
	
	def query(String sql){
	}
	
	def disconnect(){
	}
}

class Example2{
	
	val Database db
	
	new(Database db){
		this.db = db
	}
	
	def test(){
		newArrayList("red", "green").map[length].reverseView
	}
	
}