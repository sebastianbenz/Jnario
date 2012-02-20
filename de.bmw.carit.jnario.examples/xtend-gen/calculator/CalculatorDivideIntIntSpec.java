package calculator;

import calculator.Calculator;
import calculator.CalculatorSpec;
import de.bmw.carit.jnario.lib.MatcherChain;
import de.bmw.carit.jnario.lib.Should;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import de.bmw.carit.jnario.runner.Subject;
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
