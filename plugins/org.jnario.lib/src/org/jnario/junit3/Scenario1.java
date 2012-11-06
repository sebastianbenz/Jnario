package org.jnario.junit3;

import junit.framework.Test;
import junit.framework.TestCase;

import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;

@Named("My Scenario 1")
public class Scenario1 extends TestCase{
	
	public Scenario1(String name) {
		super(name);
	}

	public static Test suite() {
		JnarioTestSuite suite = new JnarioTestSuite("My Scenario 1");
		suite.addTest(new Scenario1("testGivenACalculator"));
		suite.addTest(new Scenario1("testWhenIAddTwoValues"));
		suite.addTest(new Scenario1("testThenTheResultShouldBe"));
		return suite;
	}
	
	@Override
	protected void setUp() throws Exception {
		// do nothing
	}
	
	@Named("Given a caculator")
	public void testGivenACalculator() throws Exception {
		super.setUp(); System.out.println("setup");
		System.out.println("Given a caculator");
	}
	
	@Named("When I add wo values")
	public void testWhenIAddTwoValues() throws Exception {
		System.out.println("When I add wo values");
	}
	
	@Named("Then the result should be")
	public void testThenTheResultShouldBe() throws Exception {
		System.out.println("Then the result should be");
		super.tearDown(); System.out.println("teardown");
	}
	
	@Override
	public String getName() {
		return NameProvider.create().nameOf(getClass(), super.getName());
	}
	
	@Override
	protected void tearDown() throws Exception {
		// do nothing
	}
	
}
