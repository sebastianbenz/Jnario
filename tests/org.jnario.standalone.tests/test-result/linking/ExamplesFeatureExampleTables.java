package linking;

import linking.ExamplesFeatureSomeMoreInfo;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Example tables.")
@SuppressWarnings("all")
public class ExamplesFeatureExampleTables extends ExamplesFeatureSomeMoreInfo {
  int a;
  
  int b;
  
  int result;
  
  @Ignore
  @Test
  @Order(0)
  @Named("Given I have entered \\\"333\\\" into the calculator [PENDING]")
  public void _givenIHaveEntered333IntoTheCalculator() {
    super._givenIHaveEntered333IntoTheCalculator();
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("Given some two numbers \\\"10\\\" and \\\"20\\\"")
  public void _givenSomeTwoNumbers10And20();
  
  @Test
  @Order(2)
  @Ignore
  @Named("When I add them")
  public void _whenIAddThem();
  
  @Test
  @Order(3)
  @Ignore
  @Named("Then the result should be \\\"30\\\"")
  public void _thenTheResultShouldBe30();
}
