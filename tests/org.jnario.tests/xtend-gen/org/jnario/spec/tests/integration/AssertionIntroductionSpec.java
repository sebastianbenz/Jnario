package org.jnario.spec.tests.integration;

import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides a special `assert` statement that makes it really easy to
 * write meaningful assertions.
 */
@SuppressWarnings("all")
@Named("Introduction")
@RunWith(ExampleGroupRunner.class)
public class AssertionIntroductionSpec extends AssertionSpec {
  /**
   * `assert` passes if the expression evaluates to true.
   */
  @Test
  @Named("To pass..")
  @Order(1)
  public void _toPass() throws Exception {
    Assert.assertTrue("\nExpected true but" + " did not." + "\n", true);
    
    boolean _equals = (1 == 1);
    Assert.assertTrue("\nExpected 1 == 1 but"
     + "\n     1 == 1 is " + new StringDescription().appendValue(_equals).toString() + "\n", _equals);
    
  }
  
  /**
   * `assert` throws an AssertionError if the expression evaluates to false.
   */
  @Test
  @Named("...or not to pass")
  @Order(2)
  public void _orNotToPass() throws Exception {
    boolean expectedException = false;
    String message = "";
    try{
      Assert.assertTrue("\nExpected false but" + " did not." + "\n", false);
      
      message = "Expected " + AssertionError.class.getName() + " for \n     {assert false}\n with:"
       + "\n     assert false is " + new StringDescription().appendValue(true).toString();
    }catch(AssertionError e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
}
