/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator

describe "Additions"{

  def examples{
  		|  a  |  b  |  sum  |
  		|  1  |  2  |   3   |
  		|  4  |  5  |   9   |
  		| 10  | 11  |  20   | 
  		| 21  | 21  |  42   | 
  }
  fact examples.forEach[a + b => sum]
  
  fact "examples"{
  	val name = "Sebastian"
  	sayHello(name) => "Hello Sebastian"
  }
  
  def sayHello(String name){
  	return "Hello " + name.toUpperCase
  }
  
}