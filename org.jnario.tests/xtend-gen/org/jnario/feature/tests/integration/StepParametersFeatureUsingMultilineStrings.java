package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using multiline Strings")
@SuppressWarnings("all")
public class StepParametersFeatureUsingMultilineStrings extends StepParametersFeatureBackground {
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap ");
    _builder.newLine();
    _builder.append("Feature: Test feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: using multiline strings in step definitions");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given the multine string: ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"hello\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x = args.first");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should be \"hello\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x should be args.first");
    _builder.newLine();
    this.jnarioFile = _builder;
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When this feature is executed")
  public void whenThisFeatureIsExecuted() {
    
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
