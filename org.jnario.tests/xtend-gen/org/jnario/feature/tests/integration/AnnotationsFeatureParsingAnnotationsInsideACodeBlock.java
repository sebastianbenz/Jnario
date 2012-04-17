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
@Named("Scenario: Parsing annotations inside a code block")
@SuppressWarnings("all")
public class AnnotationsFeatureParsingAnnotationsInsideACodeBlock {
  @Test
  @Order(0)
  @Named("Given a jnario-file with annotations")
  public void givenAJnariofileWithAnnotations() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("import org.junit.Rule ");
    _builder.newLine();
    _builder.append("Feature: A feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: a scenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a variable with an annotation");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Rule");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var x = 3");
    _builder.newLine();
    this.jnarioFile = _builder;
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When I parse it")
  public void whenIParseIt() {
    throw new UnsupportedOperationException("whenIParseItis not implemented");
  }
  
  @Test
  @Order(2)
  @Named("Then there should be no parsing error")
  public void thenThereShouldBeNoParsingError() {
    FeatureExecutor.executesSuccessfully(this.jnarioFile);
  }
  
  CharSequence jnarioFile;
}
