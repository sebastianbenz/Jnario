import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Scenario:  Adding to values")
@RunWith(FeatureRunner.class)
public class FtCalculatorScAddingToValues {
  @Test
  @Order(0)
  @Named("Given I have a Calculator")
  public void givenIHaveACalculator() {
    
  }
  
  @Test
  @Order(1)
  @Named("When I add two values")
  public void whenIAddTwoValues() {
    
  }
  
  @Test
  @Order(2)
  @Named("Then it should print the result.")
  public void thenItShouldPrintTheResult() {
    
  }
}
