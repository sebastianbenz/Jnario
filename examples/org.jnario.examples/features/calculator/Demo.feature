package calculator
/*******************************************************************************

 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
Feature: Calculator

	Scenario:  Adding to values

		Given I have a Calculator
		When I add two values
		Then it should print the result.
 