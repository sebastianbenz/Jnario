/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Using JUnit Rules in Features

You can use the special ```mock```  and ```stub``` literals to create mocks with mockito.

	Scenario: Creating Mocks
		CharSequence jnarioFile
		When I have a feature which creates a mock
			'''
				package demo
				import java.util.Stack
				Feature:  Mocking
				
					Scenario: Create a mock in a Feature
						var Stack x
						Given a field with a mock
							x = mock(Stack)
						Then the mock should be created
							x => typeof(Stack)	
			'''
			jnarioFile = args.first
		Then it should execute successfully
