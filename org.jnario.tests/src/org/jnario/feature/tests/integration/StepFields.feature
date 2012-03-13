/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Step fields

	Scenario: Field definition in steps
		Given a feature
			var jnarioFile = '
				Feature: Test feature
					Scenario: using fields in step definitions
						Given some values "3", "4"
							
			'
		When this feature is executed
		Then it should be successful

	Scenario: Field definition in steps and Background
		Given a feature with a background
			var jnarioFile = '
				Feature: Test feature
					Background:
						Given some values "3", "4"
					Scenario: using fields in step definitions
						When you add them
						Then <c> should be 3
							
			'
		When this feature is executed
		Then it should be successful
		