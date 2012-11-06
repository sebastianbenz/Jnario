package org.jnario.junit3;

import org.jnario.runner.Named;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@Named("My example Suite")
public class ExampleSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("My example Suite");
		suite.addTest(ExampleFeature.suite());
		suite.addTest(ExampleGroupSpec.suite());
		return suite;
	}

}
