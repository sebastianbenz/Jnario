package org.jnario.spec.tests.integration;

import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides a special `assert` statement that makes it really easy to
 * write meaningful assertions.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Introduction")
public class AssertionIntroductionSpec extends AssertionSpec {
  /**
   * `assert` passes if the expression evaluates to true.
   */
  @Test
  @Named("To pass..")
  @Order(99)
  public void toPass() throws Exception {
    Assert.assertTrue("\nExpected true but" + " did not." + "\n", true);
    
    boolean _equals = IntegerExtensions.operator_equals(1, 1);
    Assert.assertTrue("\nExpected 1 == 1 but"
     + "\n     1 == 1 is " + _equals + "\n", _equals);
    
  }
  
  /**
   * `assert` throws an AssertionError if the expression evaluates to false.
   */
  @Test
  @Named("...or not to pass")
  @Order(99)
  public void orNotToPass() throws Exception {
    try{
      Assert.assertTrue("\nExpected false but" + " did not." + "\n", false);
      
      Assert.fail("Expected " + AssertionError.class.getName() + " in \n     {assert false}\n with:");
    }catch(AssertionError e){
      // expected
    }
  }
}
