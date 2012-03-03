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
@Named("add[int, int]")
public class CalculatorAddIntIntSpec extends CalculatorSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("should add two values")
  @Order(0)
  public void shouldAddTwoValues() throws Exception {
    int _add = this.subject.add(1, 2);
    MatcherChain<Integer> _should = Should.<Integer>should(Integer.valueOf(_add));
    Should.<Integer>be(_should, Integer.valueOf(3));
  }
}
