package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using fields from other steps")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureUsingFieldsFromOtherSteps {
  @Test
  @Order(0)
  @Named("Given a scenario with a field")
  public void givenAScenarioWithAField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("Feature: Test");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: TestScenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<String> values = new ArrayList()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a list");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values += \"hello\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: TestScenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a list");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should have contents");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values.size => 1");
    _builder.newLine();
    this.jnarioFile = _builder;
  }
  
  @Test
  @Order(1)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
