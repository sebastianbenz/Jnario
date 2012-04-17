package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable in the same step it was declared in")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn {
  @Test
  @Order(0)
  @Named("Given a jnario file")
  public void givenAJnarioFile() {
    this.jnarioFile = "\n\t\t\t\tpackage bootstrap1\n\t\t\t\tFeature: Variable test\n\t\t\t\t\tScenario: Some scenario\n\t\t\t\t\t\tGiven a step with a variable\n\t\t\t\t\t\t\tvar x = 3\n\t\t\t\t\t\t\tx = 5\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When it is executed")
  public void whenItIsExecuted() {
    throw new UnsupportedOperationException("whenItIsExecutedis not implemented");
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
