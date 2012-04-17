package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable referencing a variable from background step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableReferencingAVariableFromBackgroundStep {
  @Test
  @Order(0)
  @Named("Given a jnario file")
  public void givenAJnarioFile() {
    this.jnarioFile = "\n\t\t\t\tpackage bootstrap5\n\t\t\t\tFeature: Variable test\n\t\t\t\t\tBackground:\n\t\t\t\t\t\tint x\n\t\t\t\t\t\tGiven some variable\n\t\t\t\t\t\t\tx = 3\n\t\t\t\t\tScenario: Some scenario\n\t\t\t\t\t\t\tint y\n\t\t\t\t\t\t\tWhen assigning the variable\n\t\t\t\t\t\t\t\ty = x\n\t\t\t\t\t\t\tThen it should be accessible\n\t\t\t\t\t\t\t\ty => 3\n\t\t\t";
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
