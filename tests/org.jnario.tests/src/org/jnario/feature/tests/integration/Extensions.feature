/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static extension java.lang.Math.*
import java.util.List

Feature: Feature Extensions

	Scenario: Using jnario predefined extensions
		String numberString
		int number
		Given the number "5" as string
			numberString = args.first
		When it is converted to int
			number = numberString.toInt
		Then it should be "5"
			number => args.first.toInt
			
	Scenario: Referencing steps with extensions
		Given the number "12" as string
		When it is converted to int
		Then it should be "12"
		
	Scenario: Defining own extensions
		double value
		double flooredValue
		Given the value "12.5"
			value = args.first.toDouble
		When I floor it
			flooredValue = value.floor
		Then the value should be "12.0"
			flooredValue => args.first.toDouble
			
	Scenario: Referencing steps with imported extensions
		Given the value "13.9"
		When I floor it
		Then the value should be "13.0"
		
	Scenario: Using Multiple extensions
		List list
		When sorting the colors "red, green, blue"
			list = args.first.split(",").map[it.trim].sort
		Then they should be ordered "blue, green, red"
			list => args.first.toList
			
	Scenario: Referencing multiple extensions
		When sorting the colors "yellow, red"
		Then they should be ordered "red, yellow"
			