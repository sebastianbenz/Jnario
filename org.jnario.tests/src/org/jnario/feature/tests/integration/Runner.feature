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
		public String jnarioFile
		Given a jnario-file that uses one variable in different steps
		
			jnarioFile = "
				package bootstrap
				Feature:
					Scenario:
						public int x
						Given 
							x = 3
						When 
							x = x + 1 
						Then 
							x => 4
				"
				
		When I run the scenario
					
		Then the scenario should have no validation errors that the variable was not defined
		And it should pass
			jnarioFile.executesSuccessfully