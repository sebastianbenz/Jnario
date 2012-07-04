package demo;

import demo.Calculator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
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
  @Named("When I entered \"50\" and \"70\"")
  public void whenIEntered50And70() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("50");
      args.add("70");
      String _first = args.first();
      int _int = StringConversions.toInt(_first);
      String _second = args.second();
      int _int_1 = StringConversions.toInt(_second);
      int _add = this.calculator.add(_int, _int_1);
      this.result = _add;
  }
  
  @Test
  @Order(1)
  @Named("Then the result should be \"120\"")
  public void thenTheResultShouldBe120() {
      StepArguments _stepArguments = new StepArguments();
      final StepArguments args = _stepArguments;
      args.add("120");
      String _first = args.first();
      int _int = StringConversions.toInt(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(this.result), Integer.valueOf(_int));
      Assert.assertTrue("\nExpected result => args.first.toInt but"
       + "\n     result is " + Integer.valueOf(this.result)
       + "\n     args.first.toInt is " + Integer.valueOf(_int)
       + "\n     args.first is " + "\"" + _first + "\""
       + "\n     args is " + args + "\n", _doubleArrow);
      
  }
  
  final Calculator calculator = new Function0<Calculator>() {
    public Calculator apply() {
      Calculator _calculator = new Calculator();
      return _calculator;
    }
  }.apply();
  
  int result;
}
