/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Parsing simple jnario files.
Scenario: And stuff.
	int x
	int y
	int z
Given two numbers.
	x = 3
	y = 5
And their sum.
	z = 8
Then the adding these should be the result.
	(x+y) => z