package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.feature.feature.Step;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("StepExpressionProvider")
@InstantiateWith(SpecTestInstantiator.class)
public class StepExpressionProviderSpec {
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Ignore
  @Test
  @Named("should return the name for a step with definition")
  @Order(99)
  public void shouldReturnTheNameForAStepWithDefinition() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Example");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step with an implementation");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"the implementation\"");
    _builder.newLine();
    this.modelStore.parseScenario(_builder);
  }
  
  @Ignore
  @Test
  @Named("should copy the referenced step\\\'s implementation and set the referencing step")
  @Order(99)
  public void shouldCopyTheReferencedStepSImplementationAndSetTheReferencingStep() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Example");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"the implementation\"");
    _builder.newLine();
    this.modelStore.parseScenario(_builder);
  }
  
  public Step step() {
    Query _query = Query.query(this.modelStore);
    return _query.<Step>first(Step.class);
  }
}
