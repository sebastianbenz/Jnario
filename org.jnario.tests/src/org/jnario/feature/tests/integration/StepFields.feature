/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
Feature: Step fields

	Scenario: Field definition in steps
		Given a feature
			var feature = "
				Feature: Test feature
					Scenario: using fields in step definitions
						Given some values <x>, <y>
							x = 3
							y = 4
			"
		When this feature is executed
		Then it should be successful

	Scenario: Field definition in steps and Background
		Given a <feature> with a background
			var feature = "
				Feature: Test feature
					Background:
						Given some values <a>, <b>
							a = 3
							b = 4
					Scenario: using fields in step definitions
						When you add them
							c = a
						Then <c> should be 3
							c.should.be(3)
			"
		When this feature is executed
		Then it should be successful
			
			
	Scenario: Field definitions in combination with examples
		Given a feature with an example table without declaring variables in steps
			var feature = "
				Feature: Test feature
					Scenario: using fields in step definitions
						When you add <x> and <y> them values
							result = x + y
						Then the <result> should be <z>
							(result).should.be(z)
					Examples:
						|x|y|z|
						|3|4|7|
			"
		When this feature is executed
		Then it should be successful
		