package diverse;

import calculator.SimpleCalculator;
import diverse.AdditionFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
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
public class AdditionFeatureAddTwoNumbers extends AdditionFeature {
  final SimpleCalculator calculator = new Function0<SimpleCalculator>() {
    public SimpleCalculator apply() {
      SimpleCalculator _simpleCalculator = new SimpleCalculator();
      return _simpleCalculator;
    }
  }.apply();
  
  @Test
  @Order(0)
  @Named("Given I have entered \\\"50\\\" into the calculator")
  public void givenIHaveEntered50IntoTheCalculator() {
    StepArguments _stepArguments = new StepArguments("50");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calculator.enter(_first);
  }
  
  @Test
  @Order(1)
  @Named("And I have entered \\\"70\\\" into the calculator")
  public void andIHaveEntered70IntoTheCalculator() {
    StepArguments _stepArguments = new StepArguments("70");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calculator.enter(_first);
  }
  
  @Test
  @Order(2)
  @Named("When I press \\\"add\\\"")
  public void whenIPressAdd() {
    StepArguments _stepArguments = new StepArguments("add");
    final StepArguments args = _stepArguments;
    this.calculator.add();
  }
  
  @Test
  @Order(3)
  @Named("Then the result should be \\\"120\\\"")
  public void thenTheResultShouldBe120() {
    StepArguments _stepArguments = new StepArguments("120");
    final StepArguments args = _stepArguments;
    String _result = this.calculator.result();
    String _first = JnarioIterableExtensions.<String>first(args);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, _first);
    Assert.assertTrue("\nExpected calculator.result =>  args.first but"
     + "\n     calculator.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     calculator is " + new StringDescription().appendValue(this.calculator).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
