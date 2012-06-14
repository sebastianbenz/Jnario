package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.tests.unit.validation.JnarioValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Scenarios must have descriptions")
public class JnarioValidatorScenariosMustHaveDescriptionsSpec extends JnarioValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\' Feature: A Feature Scenario: \\\'\\\'\\\'.select[typeof[Scenario]].assertErrorContains[\\\"description\\\"]")
  @Order(99)
  public void featureAFeatureScenarioSelectTypeofScenarioAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: A Feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario:");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    AssertableDiagnostics _select = this.select(_builder, Scenario.class);
    _select.assertErrorContains("description");
  }
}
