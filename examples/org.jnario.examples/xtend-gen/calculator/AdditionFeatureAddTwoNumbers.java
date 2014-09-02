package calculator;

import calculator.AdditionFeature;
import calculator.Calculator;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Add two numbers")
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers extends AdditionFeature {
  final Calculator calculator = new Calculator();
  
  int result;
  
  @Test
  @Order(0)
  @Named("When I entered \\\"50\\\" and \\\"70\\\"")
  public void _whenIEntered50And70() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Add two numbers\n"
      + "\nThe method or field args is undefined for the type Scenario: Add two numbers\n"
      + "\nfirst cannot be resolved"
      + "\nsecond cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("Then the result should be \\\"120\\\"")
  public void _thenTheResultShouldBe120() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Add two numbers\n"
      + "\nfirst cannot be resolved"
      + "\ntoInt cannot be resolved");
  }
}
