package org.jnario.jnario.tests.unit.jnario;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Scenario;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Scenario")
@RunWith(ExampleGroupRunner.class)
public class ExecutableIsPendingScenarioSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("scenario[\\\"Without steps\\\"].isPending[] should be true")
  @Order(8)
  public void _scenarioWithoutStepsIsPendingShouldBeTrue() throws Exception {
    Scenario _scenario = Features.scenario("Without steps");
    boolean _isPending = _scenario.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected scenario(\"Without steps\").isPending() should be true but"
     + "\n     scenario(\"Without steps\").isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenario(\"Without steps\") is " + new StringDescription().appendValue(_scenario).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[stepWithoutImplementation].isPending[] should be true")
  @Order(9)
  public void _scenarioWithStepWithoutImplementationIsPendingShouldBeTrue() throws Exception {
    Given _stepWithoutImplementation = Features.stepWithoutImplementation();
    Scenario _scenarioWith = Features.scenarioWith(_stepWithoutImplementation);
    boolean _isPending = _scenarioWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected scenarioWith(stepWithoutImplementation).isPending() should be true but"
     + "\n     scenarioWith(stepWithoutImplementation).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(stepWithoutImplementation) is " + new StringDescription().appendValue(_scenarioWith).toString()
     + "\n     stepWithoutImplementation is " + new StringDescription().appendValue(_stepWithoutImplementation).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[implementedStep].isPending[] should be false")
  @Order(10)
  public void _scenarioWithImplementedStepIsPendingShouldBeFalse() throws Exception {
    Given _implementedStep = Features.implementedStep();
    Scenario _scenarioWith = Features.scenarioWith(_implementedStep);
    boolean _isPending = _scenarioWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected scenarioWith(implementedStep).isPending() should be false but"
     + "\n     scenarioWith(implementedStep).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(implementedStep) is " + new StringDescription().appendValue(_scenarioWith).toString()
     + "\n     implementedStep is " + new StringDescription().appendValue(_implementedStep).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("scenarioWith[stepWithoutImplementation, implementedStep].isPending[] should be true")
  @Order(11)
  public void _scenarioWithStepWithoutImplementationImplementedStepIsPendingShouldBeTrue() throws Exception {
    Given _stepWithoutImplementation = Features.stepWithoutImplementation();
    Given _implementedStep = Features.implementedStep();
    Scenario _scenarioWith = Features.scenarioWith(_stepWithoutImplementation, _implementedStep);
    boolean _isPending = _scenarioWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected scenarioWith(stepWithoutImplementation, implementedStep).isPending() should be true but"
     + "\n     scenarioWith(stepWithoutImplementation, implementedStep).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     scenarioWith(stepWithoutImplementation, implementedStep) is " + new StringDescription().appendValue(_scenarioWith).toString()
     + "\n     stepWithoutImplementation is " + new StringDescription().appendValue(_stepWithoutImplementation).toString()
     + "\n     implementedStep is " + new StringDescription().appendValue(_implementedStep).toString() + "\n", _should_be);
    
  }
}
