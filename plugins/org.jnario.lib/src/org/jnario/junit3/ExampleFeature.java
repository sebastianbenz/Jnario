package org.jnario.junit3;

import junit.framework.Test;

public class ExampleFeature{

	public static Test suite() {
		return new JnarioTestSuite("My Feature", Scenario1.class, Scenario2.class);
	}
	
}
