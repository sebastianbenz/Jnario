package org.jnario.junit3;

import junit.framework.Test;

public class ExampleGroupSuite {

	public static Test suite() {
		JnarioTestSuite suite = new JnarioTestSuite("Do some stuff");
		// $JUnit-BEGIN$
		suite.addTestSuite(NestedExampleGroupSpec.class);
		suite.addTest(new ExampleGroupSpec("testShouldSayHello"));
		suite.addTest(new ExampleGroupSpec("testShouldSayHallo"));
		// $JUnit-END$
		return suite;
	}
	
	
}
