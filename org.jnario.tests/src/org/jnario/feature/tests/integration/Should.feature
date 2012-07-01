/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Using Matchers in Features
	Scenario: Using Matchers in Jnario
		Given a scenario which uses the Jnario matchers
			jnarioFile = '''
				Feature: Should
					
					Scenario: Features with should
						
						Given a Scenario
						Then it should be possible to use 'should'
							true should be true
							1 + 1 should not be 1
							"something" should not be null 
						And the shortcut '=>'
							1 + 1 => 2 
							"a string" => typeof(String)
			'''
		Then it should be successful
		