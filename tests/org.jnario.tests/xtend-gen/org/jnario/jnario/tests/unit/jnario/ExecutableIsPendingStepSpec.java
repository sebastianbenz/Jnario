package org.jnario.jnario.tests.unit.jnario;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Given;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Step")
public class ExecutableIsPendingStepSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("stepWithoutImplementation.isPending[] should be true")
  @Order(99)
  public void _stepWithoutImplementationIsPendingShouldBeTrue() throws Exception {
    Given _stepWithoutImplementation = Features.stepWithoutImplementation();
    boolean _isPending = _stepWithoutImplementation.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected stepWithoutImplementation.isPending() should be true but"
     + "\n     stepWithoutImplementation.isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     stepWithoutImplementation is " + new StringDescription().appendValue(_stepWithoutImplementation).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("implementedStep.isPending[] should be false")
  @Order(99)
  public void _implementedStepIsPendingShouldBeFalse() throws Exception {
    Given _implementedStep = Features.implementedStep();
    boolean _isPending = _implementedStep.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected implementedStep.isPending() should be false but"
     + "\n     implementedStep.isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     implementedStep is " + new StringDescription().appendValue(_implementedStep).toString() + "\n", _should_be);
    
  }
}
