package features;

import calculator.Calculator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Add two numbers")
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers {
  @Test
  @Order(0)
  @Named("Given I have entered \"50\" into the calculator")
  public void givenIHaveEntered50IntoTheCalculator() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("50");
      String _first = args.first();
      this.calculator.enter(_first);
  }
  
  @Test
  @Order(1)
  @Named("And I have entered \"70\" into the calculator")
  public void andIHaveEntered70IntoTheCalculator() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("70");
      String _first = args.first();
      calculator.enter(_first);
  }
  
  @Test
  @Order(2)
  @Named("When I press \"add\"")
  public void whenIPressAdd() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("add");
      String _first = args.first();
      this.calculator.press(_first);
  }
  
  @Test
  @Order(3)
  @Named("Then the result should be \"120\"")
  public void thenTheResultShouldBe120() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("120");
      String _result = this.calculator.result();
      String _first = args.first();
      boolean _doubleArrow = Should.operator_doubleArrow(_result, _first);
      Assert.assertTrue("\nExpected calculator.result => args.first but"
       + "\n     calculator.result is " + "\"" + _result + "\""
       + "\n     calculator is " + this.calculator
       + "\n     args.first is " + "\"" + _first + "\""
       + "\n     args is " + args + "\n", _doubleArrow);
      
  }
  
  Calculator calculator = new Function0<Calculator>() {
    public Calculator apply() {
      Calculator _calculator = new Calculator();
      return _calculator;
    }
  }.apply();
}
