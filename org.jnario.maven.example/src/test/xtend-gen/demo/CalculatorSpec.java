package demo;

import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
public class CalculatorSpec {
  @Test
  @Named("should add two values")
  @Order(99)
  public void shouldAddTwoValues() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow(
      "Hello", "Hello");
    Assert.assertTrue("\nExpected //\t\tnew Calculator().add(1, 2) should be 3\r\n\t\t\"Hello\" => \"Hello\" but"
     + "\n     //\t\tnew Calculator().add(1, 2) should be 3\r\n\t\t\"Hello\" => \"Hello\" is " + Boolean.valueOf(_doubleArrow) + "\n", _doubleArrow);
    
  }
}
