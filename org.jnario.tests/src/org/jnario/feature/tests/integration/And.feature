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
public int x
public int y
public int z
Given some variables.
	x = 3
	y = 5
	z = 7
And some values.
	x = 5
	y = 3
	z = 8
When I add those numbers them
Then the sum should be the result.
	(x+y) => z