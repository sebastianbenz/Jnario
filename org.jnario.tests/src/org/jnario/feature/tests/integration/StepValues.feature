/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Step values
	
	Background:
	
	Scenario: Value definition in steps
		Given a feature
			jnarioFile = '''
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						Given some values "3", "4"
							x = args.get(0)
						Then it should be possible to get the value
							x => "3"
			'''
		When this feature is executed
		Then it should be successful

	Scenario: Access of values with first, second, ...
		Given a feature
			jnarioFile = '''
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						Given some values "3", "4"
							x = args.first
						Then it should be possible to get the value
							x => "3"
			'''
		When this feature is executed
		Then it should be successful

	Scenario: Value definition in steps and Background
		Given a feature with a background
			jnarioFile = 
			'''
				package bootstrap 
				Feature: Test feature
					Background:
						String x
						Given some values "3", "4"
							x = args.get(1)
					Scenario: using fields in step definitions
						Then those values should be accessible
							x => "4"
							
			''' 
		When this feature is executed
		Then it should be successful
		
	Scenario: Referencing variables that contain a value from args
		Given a feature
			jnarioFile = '''
				package bootstrap 
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						String y 
						Given the value "hello"
							x = args.first
						When I add " world"
							y = x + args.first
						Then it should be "hello world"
							y should be args.first
							
			'''
		When this feature is executed
		Then it should be successful
		