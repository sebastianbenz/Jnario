/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.documentation

import static extension org.jnario.jnario.test.util.FeatureExecutor.*

/*
 */
describe "Given, When, Then..."{
	
	/*
	 * If you have multiple **Givens**, **Whens** or **Thens** you can 
	 * use **And** or **But** to concatenate them:  
	 * @filter('''|.isSuccessful) 
     * @lang(feature)
	 */
	fact "And, But"{
		'''
		  Feature: And & But
		  Scenario: Multiple Givens
		    Given one thing
		      And another thing
		      And yet another thing
		    When I trigger something
		    Then happens something
		      But not more
		'''.successful
	}

}