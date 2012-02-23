/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.tests.integration

import static de.bmw.carit.jnario.common.test.util.SpecExecutor.*
import static org.junit.Assert.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "Guice" {

	it "should demonstrate the injection of Tests"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
			import de.bmw.carit.jnario.runner.InstantiateWith
			import de.bmw.carit.jnario.lib.GuiceBasedTestInstantiator
			import com.google.inject.Inject
			
			@InstantiateWith(typeof(GuiceBasedTestInstantiator))
			describe "GuiceBasedTestInstantiator" {
				
				@Inject String toInject
				
				it "should inject fields"{
					assertNotNull(toInject);
				} 
						
			}
		'
		assertThat(execute(spec), successful)
	}
	
}
	