/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator

			Feature: Addition
			
			  In order to avoid silly mistakes
			  As a math idiot
			  I want to be told the sum of two numbers
			  
			  Scenario: Add two numbers
			    val calculator = new Calculator()
			    int result
			    When I entered "50" and "70"
			    	     result = calculator.add(args.first, args.second)
			    Then the result should be "120" 
				     result => args.first.toInt   
				      
	      
	      
	      
	      
	      
	      
	      