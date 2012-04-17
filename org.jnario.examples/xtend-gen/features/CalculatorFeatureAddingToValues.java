package features;

import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario:  Adding to values")
@SuppressWarnings("all")
public class CalculatorFeatureAddingToValues {
  @Test
  @Order(0)
  @Ignore
  @Named("[PENDING] Given I have a Calculator")
  public void givenIHaveACalculator() {
    throw new UnsupportedOperationException("givenIHaveACalculatoris not implemented");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When I add two values")
  public void whenIAddTwoValues() {
    throw new UnsupportedOperationException("whenIAddTwoValuesis not implemented");
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("[PENDING] Then it should print the result.")
  public void thenItShouldPrintTheResult() {
    throw new UnsupportedOperationException("thenItShouldPrintTheResultis not implemented");
  }
}
