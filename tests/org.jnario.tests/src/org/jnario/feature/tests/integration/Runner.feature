/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static extension org.jnario.jnario.test.util.FeatureExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Test Runner

	Scenario: Create only one test instance for one jnario scenario
		CharSequence jnarioFile
		When I have a scenario that uses one variable in different steps
		'''
			package bootstrap
			Feature: a feature
				Scenario: a scenario with field
					public int x
					Given a variable access
						x = 3
					When the variable is accessed
						x = x + 1 
					Then it is accessed
						x => 4
		'''
		jnarioFile = args.first				
		Then the scenario should have no validation errors that the variable was not defined
		And it should execute successfully
		