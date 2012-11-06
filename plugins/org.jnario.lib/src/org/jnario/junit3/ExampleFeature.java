package org.jnario.junit3;

import junit.framework.Test;

public class ExampleFeature{

	public static Test suite() {
		JnarioTestSuite suite = new JnarioTestSuite("My Feature");
		suite.addTestSuite(Scenario1.class);
		suite.addTestSuite(Scenario2.class);
		return suite;
	}
	
}
