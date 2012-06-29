package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using JUnit Rules")
@SuppressWarnings("all")
public class JunitRulesFeatureUsingJUnitRules {
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import org.junit.Rule");
    _builder.newLine();
    _builder.append("import org.junit.rules.TemporaryFolder");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature:  JUnit Rules");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Using rules in a Feature");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Rule public val folder = new TemporaryFolder");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a feature with a rule");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then the rule should be initialized");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("folder.root should not be null\t");
    _builder.newLine();
    this.jnarioFile = _builder;
  }
  
  @Test
  @Order(1)
  @Named("When it is executed")
  public void whenItIsExecuted() {
    
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
