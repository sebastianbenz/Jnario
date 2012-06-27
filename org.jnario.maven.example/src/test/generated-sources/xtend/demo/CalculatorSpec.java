package demo;

import demo.Calculator;
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
    Calculator _calculator = new Calculator();
    int _add = _calculator.add(1, 2);
    boolean _should_be = Should.should_be(Integer.valueOf(_add), Integer.valueOf(3));
    Assert.assertTrue("\nExpected new Calculator().add(1, 2) should be 3 but"
     + "\n     new Calculator().add(1, 2) is " + Integer.valueOf(_add)
     + "\n     new Calculator() is " + _calculator + "\n", _should_be);
    
  }
}
