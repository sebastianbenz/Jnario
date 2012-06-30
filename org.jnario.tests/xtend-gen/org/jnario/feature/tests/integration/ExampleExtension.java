package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public class ExampleExtension {
  @BeforeClass
  public static String beforeAll() {
    String _println = InputOutput.<String>println("before all");
    return _println;
  }
  
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
  
  @AfterClass
  public static String afterAll() {
    String _println = InputOutput.<String>println("after all");
    return _println;
  }
}
