/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Using JUnit Rules in Features

You can use [JUnit rules](http://kentbeck.github.com/junit/javadoc/latest/org/junit/rules/TestRule.html) in your feature. Just define a field with the `@Rule` annotation
like you would do in a normal JUnit test case. 

	Scenario: Using JUnit Rules 
		CharSequence jnarioFile
		Given a feature
			'''
				package demo
				import org.junit.Rule
				import org.junit.rules.TemporaryFolder
				
				Feature:  JUnit Rules
				
					Scenario: Using rules in a Feature
						@Rule public val folder = new TemporaryFolder
					
						Given a feature with a rule
						Then the rule should be initialized
							folder.root should not be null	
			'''
			jnarioFile = args.first
		When it is executed
		Then it should be successful
 