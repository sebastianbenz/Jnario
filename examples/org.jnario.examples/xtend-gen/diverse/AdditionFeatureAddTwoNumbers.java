package diverse;

import calculator.SimpleCalculator;
import diverse.AdditionFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Add two numbers")
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers extends AdditionFeature {
  final SimpleCalculator calculator = new SimpleCalculator();
  
  @Test
  @Order(0)
  @Named("Given I have entered \\\"50\\\" into the calculator")
  public void _givenIHaveEntered50IntoTheCalculator() {
    final StepArguments args = new StepArguments("50");
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calculator.enter(_first);
  }
  
  @Test
  @Order(1)
  @Named("And I have entered \\\"70\\\" into the calculator")
  public void _andIHaveEntered70IntoTheCalculator() {
    final StepArguments args = new StepArguments("70");
    String _first = JnarioIterableExtensions.<String>first(args);
    this.calculator.enter(_first);
  }
  
  @Test
  @Order(2)
  @Named("When I press \\\"add\\\"")
  public void _whenIPressAdd() {
    final StepArguments args = new StepArguments("add");
    this.calculator.add();
  }
  
  @Test
  @Order(3)
  @Named("Then the result should be \\\"120\\\"")
  public void _thenTheResultShouldBe120() {
    final StepArguments args = new StepArguments("120");
    String _result = this.calculator.result();
    String _first = JnarioIterableExtensions.<String>first(args);
    Assert.assertTrue("\nExpected calculator.result =>  args.first but"
     + "\n     calculator.result is " + new org.hamcrest.StringDescription().appendValue(_result).toString()
     + "\n     calculator is " + new org.hamcrest.StringDescription().appendValue(this.calculator).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", Should.<String>operator_doubleArrow(_result, _first));
    
  }
}
