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
	
}