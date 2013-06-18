package calculator;

import calculator.CalculatorFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario:  Adding to values")
@SuppressWarnings("all")
public class CalculatorFeatureAddingToValues extends CalculatorFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given I have a Calculator [PENDING]")
  public void givenIHaveACalculator() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("When I add two values [PENDING]")
  public void whenIAddTwoValues() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then it should print the result. [PENDING]")
  public void thenItShouldPrintTheResult() {
    
  }
}
