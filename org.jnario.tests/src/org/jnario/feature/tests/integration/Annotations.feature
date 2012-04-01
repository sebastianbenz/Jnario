/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import static extension org.jnario.jnario.test.util.FeatureExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
Feature: Annotations

	Scenario: Parsing annotations inside a code block
		CharSequence jnarioFile
		Given a jnario-file with annotations
		
			jnarioFile = '''
				package bootstrap
				import org.junit.Rule 
				Feature: A feature
					Scenario: a scenario
						Given a variable with an annotation
							@Rule
							var x = 3
				'''
		When I parse it
		
					
		Then there should be no parsing error
			jnarioFile.executesSuccessfully