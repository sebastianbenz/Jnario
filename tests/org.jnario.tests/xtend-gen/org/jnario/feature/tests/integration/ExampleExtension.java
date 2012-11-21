package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.After;
import org.junit.Before;

@SuppressWarnings("all")
public class ExampleExtension {
  @Before
  public String before() {
    String _println = InputOutput.<String>println("before");
    return _println;
  }
  
  @After
  public String after() {
    String _println = InputOutput.<String>println("after");
    return _println;
  }
  
  public String greet(final String s) {
    return ("Hello " + s);
  }
}
