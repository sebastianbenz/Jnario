package org.jnario.feature.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Instantiating Objects in Backgrounds")
@SuppressWarnings("all")
public class BackgroundsFeatureInstantiatingObjectsInBackgrounds {
  @Test
  @Order(0)
  @Named("Given I have a feature with a background")
  public void givenIHaveAFeatureWithABackground() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("import org.jnario.feature.tests.integration.Calculator");
    _builder.newLine();
    _builder.append("Feature: Calculator");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Background:");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("int result ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Calculator calculator");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Given a calculator");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("calculator = new Calculator()");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Scenario: Adding two numbers 1 ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("When I enter two numbers \"20\" and \"70\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("result = calculator.add(args.first.toInt, args.second.toInt)");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Then it returns \"90\"");
    _builder.newLine();
    _builder.append("     \t");
    _builder.append("result => args.first.toInt");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Scenario: Adding two numbers 2");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("When I enter two numbers \"20\" and \"80\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Then it returns \"100\"");
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
