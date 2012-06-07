/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package test

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Examples.

	Background: Some more info
	
		Given I have entered "333" into the calculator
			""

	Scenario: Example tables.
		Given some variables.
		When I add them
		Then the sum should be the result.
			(x + y + 1) => z
		Examples:
		|x|y|z|
		|1|2|4|
		|3|6|10|
 
 