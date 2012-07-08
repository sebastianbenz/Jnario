/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*
import static extension org.jnario.jnario.test.util.FeatureExecutor.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Calculator

	Scenario: Simple calculator test with background and references
		CharSequence jnarioFile
		When I have a feature with a background and references
			'''
			package demo
			Feature: Calculator
			  Background:
			   int result 
			   Given a calculator
			  Scenario: Adding two numbers 2 
			   When I enter two numbers "20" and "70"
			       result = args.first.toInt + args.second.toInt
			   Then it returns "90"
			     	result => args.first.toInt
			  Scenario: Adding two numbers wer
			    When I enter two numbers "20" and "80"
			    Then it returns "100"   
			'''	
			jnarioFile = args.first	
		Then it should execute successfully
	 	