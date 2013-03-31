/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ExtensionExample {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before Class");
	}
	
	@Before
	public void before(){
		System.out.println("before");
	}
	
	@After
	public void after(){
		System.out.println("after");
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("after Class");
	}
}