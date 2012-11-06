package org.jnario.junit3;

import junit.framework.Test;
import junit.framework.TestCase;

import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;

@Named("Greetings to the world")
public class NestedExampleGroupSpec extends TestCase {

	public NestedExampleGroupSpec(String name) {
		super(name);
	}

	public static Test suite() {
		JnarioTestSuite suite = new JnarioTestSuite("Greetings to the World");
		suite.addTest(new NestedExampleGroupSpec("testShouldSayHello"));
		suite.addTest(new NestedExampleGroupSpec("testShouldSayHallo"));
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
