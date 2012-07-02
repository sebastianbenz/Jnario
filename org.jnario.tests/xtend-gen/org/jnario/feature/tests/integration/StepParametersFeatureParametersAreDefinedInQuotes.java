package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Parameters are defined in quotes")
@SuppressWarnings("all")
public class StepParametersFeatureParametersAreDefinedInQuotes {
  @Test
  @Order(0)
  @Named("Given a feature")
  public void givenAFeature() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
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
    _builder.append("Given some values \"3\", \"4\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x = args.get(0)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should be possible to get the value");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x => \"3\"");
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
      InputOutput.<String>println("executing scenario");
      FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
