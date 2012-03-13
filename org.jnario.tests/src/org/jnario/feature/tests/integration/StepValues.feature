/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Step values

	Scenario: Value definition in steps
		Given a feature
			var jnarioFile = '
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						Given some values "3", "4"
							var x = stepValues.get(0)
						Then it should be possible to get the value
							x.^should.^be("3")
			'
		When this feature is executed
		Then it should be successful

	Scenario: Access of values with first, second, ...
		Given a feature
			var jnarioFile = '
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						Given some values "3", "4"
							var x = stepValues.first()
						Then it should be possible to get the value
							x.^should.^be("3")
			'
		When this feature is executed
		Then it should be successful

	Scenario: Value definition in steps and Background
		Given a feature with a background
			var jnarioFile = '
				package bootstrap 
				Feature: Test feature
					Background:
						Given some values "3", "4"
							var x = stepValues.get(1)
					Scenario: using fields in step definitions
						Then those values should be accessible
							x.^should.^be("4")
							
			'
		When this feature is executed
		Then it should be successful