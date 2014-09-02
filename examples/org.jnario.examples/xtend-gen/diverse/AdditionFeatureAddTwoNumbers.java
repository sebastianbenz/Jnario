package diverse;

import calculator.SimpleCalculator;
import diverse.AdditionFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Add two numbers\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And I have entered \\\"70\\\" into the calculator [PENDING]")
  public void _andIHaveEntered70IntoTheCalculator() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("When I press \\\"add\\\"")
  public void _whenIPressAdd() {
    this.calculator.add();
  }
  
  @Test
  @Order(3)
  @Ignore
  @Named("Then the result should be \\\"120\\\"")
  public void _thenTheResultShouldBe120() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Add two numbers\n"
      + "\nfirst cannot be resolved");
  }
}
