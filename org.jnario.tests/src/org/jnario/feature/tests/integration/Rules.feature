/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Junit Rules
	Scenario: Using JUnit Rules 
		CharSequence jnarioFile
		Given a scenario with a rule
			jnarioFile = '''
				import org.junit.Rule
				import org.junit.rules.TemporaryFolder
				
				Feature:  JUnit Rules
				
					Scenario: Using rules in a Feature
						@Rule
				  		public TemporaryFolder folder = new TemporaryFolder
					
						Given a feature with a rule
						Then the rule should be initialized
							folder.root should not be null	
			'''
		When it is executed
		Then it should be successful
