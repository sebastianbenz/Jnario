package features;

import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Add two numbers")
@SuppressWarnings("all")
public class AdditionFeatureAddTwoNumbers {
  @Test
  @Order(0)
  @Ignore
  @Named("Given I have entered \"50\" into the calculator [PENDING]")
  public void givenIHaveEntered50IntoTheCalculator() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And I have entered \"70\" into the calculator [PENDING]")
  public void andIHaveEntered70IntoTheCalculator() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("When I press \"add\" [PENDING]")
  public void whenIPressAdd() {
    
  }
  
  @Test
  @Order(3)
  @Ignore
  @Named("Then the result should be \"120\" [PENDING]")
  public void thenTheResultShouldBe120() {
    
  }
}
