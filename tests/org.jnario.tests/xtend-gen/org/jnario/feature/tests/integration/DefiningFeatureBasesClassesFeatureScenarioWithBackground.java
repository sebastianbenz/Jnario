package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.DefiningFeatureBasesClassesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Scenario with Background")
@Ignore
@SuppressWarnings("all")
public class DefiningFeatureBasesClassesFeatureScenarioWithBackground extends DefiningFeatureBasesClassesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("Given a scenario")
  public void _givenAScenario() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Scenario with Background\r\n"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void _thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
