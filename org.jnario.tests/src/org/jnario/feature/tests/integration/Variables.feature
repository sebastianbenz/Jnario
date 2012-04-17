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
Feature: Access of variables

	Scenario: Access a variable in the same step it was declared in
		Given a jnario file
			jnarioFile = '
				package bootstrap1
				Feature: Variable test
					Scenario: Some scenario
						Given a step with a variable
							var x = 3
							x = 5
			'
		When it is executed
		Then it should be successful
	
	Scenario: Access a variable that was declared in a different step
		Given a jnario file
			jnarioFile = '
				package bootstrap2
				Feature: Variable test
					Scenario: Some scenario
						int x
						Given a step with a variable
							x = 3
						When I assign it a different value
							x = 5
			'
		When it is executed
		Then it should be successful
	
	Scenario: Access a variable that was assigned a value of a variable defined in a different step
		Given a jnario file
			jnarioFile = '
				package bootstrap3
				Feature: Variable test
					Scenario: Some scenario
						int x
						int y
						Given a step with a variable
							x = 3
						When I assign it a different value
							y = x
						Then y should be 3
							y => 3
			'
		When it is executed
		Then it should be successful
	
	Scenario: Access a variable declared in background step
		Given a jnario file
			jnarioFile = '
				package bootstrap4
				Feature: Variable test
					Background:
						int x
						Given some variable
							x = 3
					Scenario: Some scenario
							Then x should be 3
								x => 3
			'
		When it is executed
		Then it should be successful
	
	Scenario: Access a variable referencing a variable from background step
		Given a jnario file
			jnarioFile = '
				package bootstrap5
				Feature: Variable test
					Background:
						int x
						Given some variable
							x = 3
					Scenario: Some scenario
							int y
							When assigning the variable
								y = x
							Then it should be accessible
								y => 3
			'
		When it is executed
		Then it should be successful
		