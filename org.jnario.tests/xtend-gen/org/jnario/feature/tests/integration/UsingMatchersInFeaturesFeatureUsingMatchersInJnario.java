package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using Matchers in Jnario")
@SuppressWarnings("all")
public class UsingMatchersInFeaturesFeatureUsingMatchersInJnario {
  @Test
  @Order(0)
  @Named("Given a scenario which uses the Jnario matchers")
  public void givenAScenarioWhichUsesTheJnarioMatchers() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Should");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Features with should");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a Scenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("When defining the expected behavior");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should be possible to use \'should\'");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("true should be true");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("1 + 1 should not be 1");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"something\" should not be null ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("And the shortcut \'=>\'");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("1 + 1 => 2 ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"a string\" => typeof(String)");
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
