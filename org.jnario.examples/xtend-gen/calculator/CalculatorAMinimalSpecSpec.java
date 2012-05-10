package calculator;

import calculator.Calculator;
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
@Named("Calculator - A minimal Spec")
public class CalculatorAMinimalSpecSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("subject.add[4, 5] => 9")
  @Order(99)
  public void subjectAdd459() throws Exception {
    int _add = this.subject.add(4, 5);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_add), Integer.valueOf(9));Assert
    .assertTrue("\nExpected subject.add(4, 5) => 9 but"
     + "\n     subject.add(4, 5) is " + Integer.valueOf(_add)
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.divide[10, 5] => 1")
  @Order(99)
  public void subjectDivide1051() throws Exception {
    int _divide = this.subject.divide(10, 5);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_divide), Integer.valueOf(1));Assert
    .assertTrue("\nExpected subject.divide(10, 5) => 1 but"
     + "\n     subject.divide(10, 5) is " + Integer.valueOf(_divide)
     + "\n     subject is " + this.subject + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.divide[10, 0] should throw ArithmeticException")
  @Order(99)
  public void subjectDivide100ShouldThrowArithmeticException() throws Exception {
    try{
      int _divide = this.subject.divide(10, 0);
      Assert.fail("Expected " + ArithmeticException.class.getName() + " in \n     subject.divide(10, 0)\n with:"
       + "\n     subject is " + this.subject);
    }catch(ArithmeticException e){
      // expected
    }
  }
}
