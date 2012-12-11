package org.jnario.jnario.tests.unit.jnario;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
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
@Named("Feature")
@RunWith(ExampleGroupRunner.class)
public class ExecutableIsPendingFeatureSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("feature[\\\"Without scenarios and without background\\\"].isPending[] should be true")
  @Order(1)
  public void _featureWithoutScenariosAndWithoutBackgroundIsPendingShouldBeTrue() throws Exception {
    Feature _feature = Features.feature("Without scenarios and without background");
    boolean _isPending = _feature.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected feature(\"Without scenarios and without background\").isPending() should be true but"
     + "\n     feature(\"Without scenarios and without background\").isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     feature(\"Without scenarios and without background\") is " + new StringDescription().appendValue(_feature).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWith[implementedScenario].isPending[] should be false")
  @Order(2)
  public void _featureWithImplementedScenarioIsPendingShouldBeFalse() throws Exception {
    Scenario _implementedScenario = Features.implementedScenario();
    Feature _featureWith = Features.featureWith(_implementedScenario);
    boolean _isPending = _featureWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected featureWith(implementedScenario).isPending() should be false but"
     + "\n     featureWith(implementedScenario).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWith(implementedScenario) is " + new StringDescription().appendValue(_featureWith).toString()
     + "\n     implementedScenario is " + new StringDescription().appendValue(_implementedScenario).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWith[scenarioWithoutSteps, implementedScenario].isPending[] should be true")
  @Order(3)
  public void _featureWithScenarioWithoutStepsImplementedScenarioIsPendingShouldBeTrue() throws Exception {
    Scenario _scenarioWithoutSteps = Features.scenarioWithoutSteps();
    Scenario _implementedScenario = Features.implementedScenario();
    Feature _featureWith = Features.featureWith(_scenarioWithoutSteps, _implementedScenario);
    boolean _isPending = _featureWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected featureWith(scenarioWithoutSteps, implementedScenario).isPending() should be true but"
     + "\n     featureWith(scenarioWithoutSteps, implementedScenario).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWith(scenarioWithoutSteps, implementedScenario) is " + new StringDescription().appendValue(_featureWith).toString()
     + "\n     scenarioWithoutSteps is " + new StringDescription().appendValue(_scenarioWithoutSteps).toString()
     + "\n     implementedScenario is " + new StringDescription().appendValue(_implementedScenario).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackground[implementedBackground].isPending[] should be true")
  @Order(4)
  public void _featureWithBackgroundImplementedBackgroundIsPendingShouldBeTrue() throws Exception {
    Background _implementedBackground = Features.implementedBackground();
    Feature _featureWithBackground = Features.featureWithBackground(_implementedBackground);
    boolean _isPending = _featureWithBackground.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected featureWithBackground(implementedBackground).isPending() should be true but"
     + "\n     featureWithBackground(implementedBackground).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackground(implementedBackground) is " + new StringDescription().appendValue(_featureWithBackground).toString()
     + "\n     implementedBackground is " + new StringDescription().appendValue(_implementedBackground).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackground[backgroundWithoutSteps].isPending[] should be true")
  @Order(5)
  public void _featureWithBackgroundBackgroundWithoutStepsIsPendingShouldBeTrue() throws Exception {
    Background _backgroundWithoutSteps = Features.backgroundWithoutSteps();
    Feature _featureWithBackground = Features.featureWithBackground(_backgroundWithoutSteps);
    boolean _isPending = _featureWithBackground.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected featureWithBackground(backgroundWithoutSteps).isPending() should be true but"
     + "\n     featureWithBackground(backgroundWithoutSteps).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackground(backgroundWithoutSteps) is " + new StringDescription().appendValue(_featureWithBackground).toString()
     + "\n     backgroundWithoutSteps is " + new StringDescription().appendValue(_backgroundWithoutSteps).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackgroundAndScenario[backgroundWithoutSteps, implementedScenario].isPending[] should be true")
  @Order(6)
  public void _featureWithBackgroundAndScenarioBackgroundWithoutStepsImplementedScenarioIsPendingShouldBeTrue() throws Exception {
    Background _backgroundWithoutSteps = Features.backgroundWithoutSteps();
    Scenario _implementedScenario = Features.implementedScenario();
    Feature _featureWithBackgroundAndScenario = Features.featureWithBackgroundAndScenario(_backgroundWithoutSteps, _implementedScenario);
    boolean _isPending = _featureWithBackgroundAndScenario.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario).isPending() should be true but"
     + "\n     featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackgroundAndScenario(backgroundWithoutSteps, implementedScenario) is " + new StringDescription().appendValue(_featureWithBackgroundAndScenario).toString()
     + "\n     backgroundWithoutSteps is " + new StringDescription().appendValue(_backgroundWithoutSteps).toString()
     + "\n     implementedScenario is " + new StringDescription().appendValue(_implementedScenario).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("featureWithBackgroundAndScenario[implementedBackground, implementedScenario].isPending[] should be false")
  @Order(7)
  public void _featureWithBackgroundAndScenarioImplementedBackgroundImplementedScenarioIsPendingShouldBeFalse() throws Exception {
    Background _implementedBackground = Features.implementedBackground();
    Scenario _implementedScenario = Features.implementedScenario();
    Feature _featureWithBackgroundAndScenario = Features.featureWithBackgroundAndScenario(_implementedBackground, _implementedScenario);
    boolean _isPending = _featureWithBackgroundAndScenario.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected featureWithBackgroundAndScenario(implementedBackground, implementedScenario).isPending() should be false but"
     + "\n     featureWithBackgroundAndScenario(implementedBackground, implementedScenario).isPending() is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     featureWithBackgroundAndScenario(implementedBackground, implementedScenario) is " + new StringDescription().appendValue(_featureWithBackgroundAndScenario).toString()
     + "\n     implementedBackground is " + new StringDescription().appendValue(_implementedBackground).toString()
     + "\n     implementedScenario is " + new StringDescription().appendValue(_implementedScenario).toString() + "\n", _should_be);
    
  }
}
