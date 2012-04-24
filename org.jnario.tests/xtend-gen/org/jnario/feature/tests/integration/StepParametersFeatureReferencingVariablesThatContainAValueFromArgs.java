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
@Named("Scenario: Referencing variables that contain a value from args")
@SuppressWarnings("all")
public class StepParametersFeatureReferencingVariablesThatContainAValueFromArgs extends StepParametersFeatureBackground {
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
    _builder.append("Scenario: using fields in step definitions");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String y ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given the value \"hello\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x = args.first");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("When I add \" world\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("y = x + args.first");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should be \"hello world\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("y should be args.first");
    _builder.newLine();
    _builder.append("\t\t\t");
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
