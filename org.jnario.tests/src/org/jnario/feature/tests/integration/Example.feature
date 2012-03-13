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
Feature: Examples.
Scenario: Example tables.
Given some variables.
When I add them
Then the sum should be the result.
	(x + y + 1).^should.^be(z)
Examples:
|x|y|z|
|1|2|4|
|3|6|10|

Examples: some examples
|x|z|
|4|5|		
