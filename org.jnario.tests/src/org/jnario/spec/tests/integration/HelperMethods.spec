/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.junit.Assert.*
import static org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
/**
 * @author Sebastian Benz - Initial contribution and API
 */
describe "HelperMethods" {
 
	it "'should' wraps org.junit.Assert#assertThat"{
		val spec = '
			package bootstrap
			
			describe "HelperMethods" {
			
				it "should wraps org.junit.Assert#assertThat"{
					"MyString".should.be("MyString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
	
	it "'be' wraps CoreMatchers#is"{
		val spec = '
			package bootstrap
			
			describe "HelperMethods" {
			
				it "be should wrap CoreMatchers#is"{
					"MyString".should.be("MyString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
	
	it "'contains' wraps IsCollectionContaining#hasItem"{
		val spec = '
			package bootstrap

			describe "HelperMethods" {
			
				it "contains should wrap CoreMatchers#is"{
					newArrayList("MyString").should.contain("MyString")
					newArrayList("MyString").should.not.contain("MyOtherString")
				} 
						
			}
		'
		assertThat(execute(spec), is(successful))
	} 
			
}
	