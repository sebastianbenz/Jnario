package org.jnario.feature.tests.integration;

import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Features with should")
@SuppressWarnings("all")
public class ShouldFeatureFeaturesWithShould {
  @Test
  @Order(0)
  @Ignore
  @Named("[PENDING] Given a Scenario")
  public void givenAScenario() {
    throw new UnsupportedOperationException("givenAScenariois not implemented");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When defining the expected behavior")
  public void whenDefiningTheExpectedBehavior() {
    throw new UnsupportedOperationException("whenDefiningTheExpectedBehavioris not implemented");
  }
  
  @Test
  @Order(2)
  @Named("Then it should be possible to use \'should\'")
  public void thenItShouldBePossibleToUseshould() {
      boolean _should_be = Should.<Boolean>should_be(true, true);Assert
      .assertTrue("\nExpected true should be true but:" + "\n", _should_be);
      
      int _plus = (1 + 1);
      boolean _should_be_1 = Should.should_be(_plus, 1);Assert
      .assertFalse("\nExpected 1 + 1 should not be 1 but:"
       + "\n     1 + 1 is " + _plus + "\n", _should_be_1);
      
      boolean _should_be_2 = Should.<String>should_be(
        "something", null);Assert
      .assertFalse("\nExpected \"something\" should not be null but:" + "\n", _should_be_2);
      
  }
  
  @Test
  @Order(3)
  @Named("And the shortcut \'=>\'")
  public void andTheShortcut() {
      int _plus = (1 + 1);
      boolean _should_be = Should.should_be(_plus, 2);Assert
      .assertTrue("\nExpected 1 + 1 => 2 but:"
       + "\n     1 + 1 is " + _plus + "\n", _should_be);
      
      boolean _should_be_1 = Should.should_be(
        "a string", String.class);Assert
      .assertTrue("\nExpected \"a string\" => typeof(String) but:" + "\n", _should_be_1);
      
  }
}
