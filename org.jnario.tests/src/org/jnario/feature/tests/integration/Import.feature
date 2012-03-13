/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static org.hamcrest.core.Is.*
import static org.junit.Assert.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Using imports in a file
	
	Scenario: Import stuff.
		Given some variables.
			var x = 3
			var y = 4
			var z = 5
		When I add them
			var sum = x + y + z
		Then the sum should be 12.
			assertThat(sum, is(12))