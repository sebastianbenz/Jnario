package demo;

import demo.CalculatorSpec;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Nested Calculator")
public class CalculatorNestedCalculatorSpec extends CalculatorSpec {
  @Test
  @Named("\\\"hello\\\" => \\\"hello\\\"")
  @Order(99)
  public void helloHello() throws Exception {
    boolean _doubleArrow = Should.operator_doubleArrow("hello", "hello");
    Assert.assertTrue("\nExpected \"hello\" => \"hello\" but"
     + "\n     \"hello\" => \"hello\" is " + new StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
}
