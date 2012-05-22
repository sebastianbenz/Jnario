package org.jnario.lib.tests;

import static org.junit.Assert.assertEquals;

import org.jnario.runner.NameProvider;
import org.jnario.runner.Named;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class NameProviderTest {

	@Named("string with special char \\u00E4")
	private static class Example{
		
	}
	
	@Test
	public void convertsFromJavaString() throws Exception {
		String actual = new NameProvider().nameOf(new TestClass(Example.class));
		assertEquals("string with special char ä", actual);
	}
	
}
