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
    _builder.append("Feature: Tables in Features");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Scenario: Using tables in **Given**");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Given a table:");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("| a | b | sum |");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("| 1 | 2 |  3  |");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("| 4 | 5 |  9  |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Then we can access it via ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("args.table.forEach[a + b => sum]");
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
