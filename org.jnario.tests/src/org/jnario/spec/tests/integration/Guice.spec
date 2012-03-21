/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.SpecExecutor.*
import static org.junit.Assert.*
import static org.jnario.jnario.test.util.ResultMatchers.*
/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "Guice" {

	fact "should demonstrate the injection of Tests"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
			import org.jnario.runner.InstantiateWith
			import org.jnario.lib.GuiceBasedTestInstantiator
			import com.google.inject.Inject
			
			@InstantiateWith(typeof(GuiceBasedTestInstantiator))
			describe "GuiceBasedTestInstantiator" {
				
				@Inject String toInject
				
				fact "should inject fields"{
					assertNotNull(toInject)
				} 
						
			}
		'
		assertThat(execute(spec), successful)
	}
	
}
	