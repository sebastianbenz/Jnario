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
@Named("divide[int, int]")
public class CalculatorDivideIntIntSpec extends CalculatorSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("should divide two values")
  @Order(99)
  public void shouldDivideTwoValues() throws Exception {
    int _divide = this.subject.divide(6, 2);
    boolean _should_be = Should.should_be(_divide, 2);
    Assert.assertTrue("\nExpected subject.divide(6, 2) should be 2 but"
     + "\n     subject.divide(6, 2) is " + _divide
     + "\n     subject is " + this.subject + "\n", _should_be);
    
  }
  
  @Test
  @Named("on division by zero")
  @Order(99)
  public void onDivisionByZero() throws Exception {
    try{
      this.subject.divide(1, 0);
      Assert.fail("Expected " + ArithmeticException.class.getName() + " in \n     subject.divide(1, 0)\n with:"
       + "\n     subject is " + this.subject);
    }catch(ArithmeticException e){
      // expected
    }
  }
}
