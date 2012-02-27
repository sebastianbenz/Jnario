package calculator;

import calculator.Calculator;
import calculator.CalculatorSpec;
import org.jnario.lib.MatcherChain;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
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
    MatcherChain<Integer> _should = Should.<Integer>should(Integer.valueOf(_divide));
    Should.<Integer>be(_should, Integer.valueOf(2));
  }
  
  @Test(expected = ArithmeticException.class)
  @Named("throws ArithmeticException on division by zero")
  @Order(1)
  public void onDivisionByZero() throws Exception {
    this.subject.divide(1, 0);
  }
}
