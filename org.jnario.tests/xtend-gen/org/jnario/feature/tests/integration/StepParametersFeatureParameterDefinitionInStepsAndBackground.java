package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.feature.tests.integration.StepParametersFeatureBackground;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Parameter definition in steps and Background")
@SuppressWarnings("all")
public class StepParametersFeatureParameterDefinitionInStepsAndBackground extends StepParametersFeatureBackground {
  @Test
  @Order(0)
  @Named("Given a feature with a background")
  public void givenAFeatureWithABackground() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap ");
    _builder.newLine();
    _builder.append("Feature: Test feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Background:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given some values \"3\", \"4\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x = args.get(1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: using fields in step definitions");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then those values should be accessible");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("x => \"4\"");
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
    throw new UnsupportedOperationException("whenThisFeatureIsExecutedis not implemented");
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
