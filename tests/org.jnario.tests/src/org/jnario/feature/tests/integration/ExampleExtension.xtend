/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

import org.junit.After
import org.junit.Before

class ExampleExtension {
	
	@Before def before(){
		println("before")
	}
	
	@After def after(){
		println("after")
	}
	
// 	@BeforeClass def beforeAll(){
//		println("before all")
//	}
//  
//	@AfterClass def afterAll(){
//		println("after all")
//	}

	def String greet(String s){
		return "Hello " + s
	}
	
}