/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*


import static extension org.jnario.jnario.test.util.SpecExecutor.*

/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "Exception" {
 
		it "should except exceptions for examples"{
			val spec = '
				package bootstrap
	
				describe "Example" {
				 
				   it throws IllegalArgumentException " should pass when exception is thrown"{
					  	throw new IllegalArgumentException()
				   }
				   
				}
				'
		spec.execute.should.be(successful)
	} 

}