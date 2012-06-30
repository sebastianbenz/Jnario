package org.jnario.feature.tests.integration

import org.junit.Before
import org.junit.BeforeClass
import org.junit.After
import org.junit.AfterClass

class ExampleExtension {
	
	@BeforeClass def static beforeAll(){
		println("before all")
	}
	
	@Before def before(){
		println("before")
	}
	
	@After def after(){
		println("after")
	}
	
	@AfterClass def static afterAll(){
		println("after all")
	}
}