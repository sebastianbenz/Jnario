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
