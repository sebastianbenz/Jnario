package org.jnario.spec.tests.unit.parsing;

import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxAnotherSubContextSpec;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSubContextSpec;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Specs Syntax")
@Contains({ SpecsSyntaxSubContextSpec.class, SpecsSyntaxAnotherSubContextSpec.class })
public class SpecsSyntaxSpec {
  /**
   * fields
   */
  String exampleField = "";
  
  static String staticField = "";
  
  @Extension
  public Collections _collections;
  
  @Extension
  public Collections extensionWithName;
  
  /**
   * facts
   */
  @Test
  @Ignore
  @Named("no expression [PENDING]")
  @Order(4)
  public void noExpression() throws Exception {
    throw new UnsupportedOperationException("noExpressionis not implemented");
  }
  
  @Test
  @Named("block expression")
  @Order(5)
  public void blockExpression() throws Exception {
    final ArrayList<Object> list = CollectionLiterals.<Object>newArrayList();
    int _size = list.size();
    boolean _should_be = Should.should_be(_size, 0);Assert
    .assertTrue("\nExpected list.size => 0 but:"
     + "\n     list.size is " + _size
     + "\n     list is " + list + "\n", _should_be);
    
  }
  
  @Test
  @Named("\"hello\" should be \"hello\"")
  @Order(6)
  public void helloShouldBeHello() throws Exception {
    boolean _should_be = Should.should_be("hello", "hello");Assert
    .assertTrue("\nExpected \"hello\" should be \"hello\" but:" + "\n", _should_be);
    
  }
  
  /**
   * assertions
   */
  @Test
  @Named("assert 1 == 1")
  @Order(9)
  public void assert11() throws Exception {
    boolean _equals = (1 == 1);
    Assert.assertTrue("\nExpected 1 == 1 but:"
     + "\n     1 == 1 is " + _equals + "\n", _equals);
    
  }
  
  @Test
  @Named("1 => 1")
  @Order(10)
  public void _11() throws Exception {
    boolean _should_be = Should.should_be(1, 1);Assert
    .assertTrue("\nExpected 1 => 1 but:" + "\n", _should_be);
    
  }
  
  @Test
  @Named("1 should be 1")
  @Order(11)
  public void _1ShouldBe1() throws Exception {
    boolean _should_be = Should.should_be(1, 1);Assert
    .assertTrue("\nExpected 1 should be 1 but:" + "\n", _should_be);
    
  }
  
  @Test
  @Named("1 should not be 2")
  @Order(12)
  public void _1ShouldNotBe2() throws Exception {
    boolean _should_be = Should.should_be(1, 2);Assert
    .assertFalse("\nExpected 1 should not be 2 but:" + "\n", _should_be);
    
  }
  
  @Test
  @Named("{1 / 0} throws RuntimeException")
  @Order(13)
  public void _10ThrowsRuntimeException() throws Exception {
    try{
      int _divide = (1 / 0);
      Assert.fail("Expected " + RuntimeException.class.getName() + " in \n     {1 / 0}\n with:"
       + "\n     1 / 0 is " + _divide);
    }catch(RuntimeException e){
      // expected
    }
  }
  
  /**
   * Helper Methods
   */
  public String method(final String aParam, final String anotherParam) {
    return "";
  }
  
  public String methodWithReturnType(final String aParam, final String anotherParam) {
    return "";
  }
  
  /**
   * Setup & Tear Down
   */
  @Before
  public void before() throws Exception {
    this.exampleField = "new value";
  }
  
  @Before
  public void before2() throws Exception {
    this.exampleField = "a block";
  }
  
  @BeforeClass
  public static void before3() throws Exception {
    SpecsSyntaxSpec.staticField = "new static field value";
  }
  
  @After
  public void after() throws Exception {
    this.exampleField = "new value";
  }
  
  @After
  public void after2() throws Exception {
    this.exampleField = "a block";
  }
  
  @AfterClass
  public static void after3() throws Exception {
    SpecsSyntaxSpec.staticField = "new static field value";
  }
}
