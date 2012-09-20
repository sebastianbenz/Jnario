package example;

import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: MyScenario")
@SuppressWarnings("all")
public class SomethingFeatureMyScenario {
  @Test
  @Order(0)
  @Named("Given a step")
  public void givenAStep() {
    int _plus = (1 + 1);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And a pending step [PENDING]")
  public void andAPendingStep() {
    
  }
  
  @Test
  @Order(2)
  @Named("And step with uml\u00E4uts")
  public void andStepWithUmläuts() {
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), Integer.valueOf(1));
    Assert.assertTrue("\nExpected 1 => 1 but"
     + "\n     1 => 1 is " + new StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Order(3)
  @Named("And step with args \"arg\"")
  public void andStepWithArgsArg() {
    StepArguments _stepArguments = new StepArguments("arg");
    final StepArguments args = _stepArguments;
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(1), Integer.valueOf(1));
    Assert.assertTrue("\nExpected 1 => 1 but"
     + "\n     1 => 1 is " + new StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
}
