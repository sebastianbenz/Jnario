package calculator;

import calculator.Calculator;
import org.hamcrest.StringDescription;
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
  public void _subjectAdd459() throws Exception {
    int _add = this.subject.add(4, 5);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_add), Integer.valueOf(9));
    Assert.assertTrue("\nExpected subject.add(4, 5) => 9 but"
     + "\n     subject.add(4, 5) is " + new StringDescription().appendValue(Integer.valueOf(_add)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.divide[10, 5] => 1")
  @Order(99)
  public void _subjectDivide1051() throws Exception {
    int _divide = this.subject.divide(10, 5);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_divide), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.divide(10, 5) => 1 but"
     + "\n     subject.divide(10, 5) is " + new StringDescription().appendValue(Integer.valueOf(_divide)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.divide[10, 0] should throw ArithmeticException")
  @Order(99)
  public void _subjectDivide100ShouldThrowArithmeticException() throws Exception {
    try{
      this.subject.divide(10, 0);
      Assert.fail("Expected " + ArithmeticException.class.getName() + " in \n     subject.divide(10, 0)\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(ArithmeticException e){
      // expected
    }
  }
}
