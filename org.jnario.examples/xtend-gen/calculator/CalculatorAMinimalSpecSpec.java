package calculator;

import calculator.Calculator;
import org.hamcrest.CoreMatchers;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Calculator - A minimal Spec")
public class CalculatorAMinimalSpecSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("subject.add[4, 5] => 9")
  @Order(0)
  public void subjectAdd459() throws Exception {
    int _add = this.subject.add(4, 5);
    boolean result = CoreMatchers.is(9).matches(_add);
    Assert.assertTrue("\nExpected subject.add(4, 5) => 9 but:"
     + "\n     subject.add(4, 5) is " + _add
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test
  @Named("subject.divide[10, 5] => 1")
  @Order(1)
  public void subjectDivide1051() throws Exception {
    int _divide = this.subject.divide(10, 5);
    boolean result = CoreMatchers.is(1).matches(_divide);
    Assert.assertTrue("\nExpected subject.divide(10, 5) => 1 but:"
     + "\n     subject.divide(10, 5) is " + _divide
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test(expected = ArithmeticException.class)
  @Named("throws ArithmeticException subject.divide[10, 0]")
  @Order(2)
  public void subjectDivide100() throws Exception {
    this.subject.divide(10, 0);
  }
}
