package calculator;

import calculator.Calculator;
import calculator.CalculatorSpec;
import org.hamcrest.CoreMatchers;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("divide[int, int]")
public class CalculatorDivideIntIntSpec extends CalculatorSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("should divide two values")
  @Order(0)
  public void shouldDivideTwoValues() throws Exception {
    int _divide = this.subject.divide(6, 2);
    boolean result = CoreMatchers.is(2).matches(_divide);
    Assert.assertTrue("\nExpected subject.divide(6, 2) should be 2 but:"
     + "\n     subject.divide(6, 2) is " + _divide
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test(expected = ArithmeticException.class)
  @Named("throws ArithmeticException on division by zero")
  @Order(1)
  public void onDivisionByZero() throws Exception {
    this.subject.divide(1, 0);
  }
}
