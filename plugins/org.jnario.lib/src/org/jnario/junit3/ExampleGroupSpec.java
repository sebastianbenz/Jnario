package org.jnario.junit3;

import junit.framework.Test;
import junit.framework.TestCase;

import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;

@Named("My Unit Spec")
public class ExampleGroupSpec extends TestCase{

	public ExampleGroupSpec(String name) {
		super(name);
	}

	public static Test suite() {
		JnarioTestSuite suite = new JnarioTestSuite("My Unit Spec");
		suite.addTestSuite(NestedExampleGroupSpec.class);
		suite.addTest(new ExampleGroupSpec("testShouldSayHello"));
		suite.addTest(new ExampleGroupSpec("testShouldSayHallo"));
		return suite;
	}
	
	@Named("Hello world")
	public void testShouldSayHello() throws Exception {
		System.out.println("Hello world");
	}
	
	@Named("Hallo Welt")
	public void testShouldSayHallo() throws Exception {
		System.out.println("Hallo Welt");
	}
	
	@Override
	public String getName() {
		return NameProvider.create().nameOf(getClass(), super.getName());
	}
}
