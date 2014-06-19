/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import com.google.inject.Inject
import org.jnario.jnario.test.util.BehaviorExecutor
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.runner.CreateWith

import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.junit.Assert.*

@CreateWith(typeof(FeatureTestCreator))
describe "Features" {

	@Inject extension BehaviorExecutor
	fact "support anonymous class declaration"{
		val spec = '''
package bootstrap

import java.util.HashMap

Feature: Test
Something

Scenario: Something
    When a
    val test = new HashMap(){
      
    override get(Object key) {
      "Hello World"
    }
    
  }
  test.get(null) => "Hello World"
Scenario: Something Els
    Given an empty string
    When a
 
		'''
		assertThat(execute(spec), successful)
	} 
	
}
	