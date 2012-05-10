package calculator;

import calculator.Calculator;
import calculator.CalculatorSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("substract[int, int]")
public class CalculatorSubstractIntIntSpec extends CalculatorSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("subject.substract[5, 3] should be 2")
  @Order(99)
  public void subjectSubstract53ShouldBe2() throws Exception {
    int _substract = this.subject.substract(5, 3);
    boolean _should_be = Should.should_be(_substract, 2);Assert
    .assertTrue("\nExpected subject.substract(5, 3) should be 2 but"
     + "\n     subject.substract(5, 3) is " + _substract
     + "\n     subject is " + this.subject + "\n", _should_be);
    
  }
}
