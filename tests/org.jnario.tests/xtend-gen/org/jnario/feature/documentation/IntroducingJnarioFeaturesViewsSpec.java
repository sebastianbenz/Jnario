package org.jnario.feature.documentation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * There are two different views available for features - one displaying everything
 * including steps and their definition (code), the other one only displaying
 * the steps and definition of arguments.
 * To expand or collapse the definition of the steps use the feature button
 * that you can find in the main button bar while being in a feature file.
 */
@SuppressWarnings("all")
@Named("Views")
@RunWith(ExampleGroupRunner.class)
public class IntroducingJnarioFeaturesViewsSpec extends IntroducingJnarioFeaturesSpec {
  /**
   * @filter('''|.isSuccessful)
   * @lang(feature)
   */
  @Test
  @Named("Displaying step definitions")
  @Order(4)
  public void _displayingStepDefinitions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import org.jnario.feature.documentation.Calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: Calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Background:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Calculator calculator");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("int result");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Given a calculator");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("calculator = new Calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scenario: Adding two numbers");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("When adding two numbers \"5\" and \"6\". ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("result = calculator.add(args.first.toInt, args.second.toInt)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Then it prints \"11\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("result => args.first.toInt");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("Scenario: Dividing two numbers");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("When entering two numbers \"10\" and \"5\" and pressing enter. ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("result = calculator.divide(args.first.toInt, args.second.toInt)");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Then it prints \"2\"");
    _builder.newLine();
    FeatureExecutor.isSuccessful(_builder);
  }
  
  /**
   * @filter('''|.isSuccessful)
   * @lang(feature)
   */
  @Test
  @Named("Hiding step definitions")
  @Order(5)
  public void _hidingStepDefinitions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import org.jnario.feature.documentation.Calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: Calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Background:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Given a calculator");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scenario: Adding two numbers");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("When adding two numbers \"5\" and \"6\". ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Then it prints \"11\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("Scenario: Dividing two numbers");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("When entering two numbers \"10\" and \"5\" and pressing enter. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Then it prints \"2\"");
    _builder.newLine();
    FeatureExecutor.isSuccessful(_builder);
  }
}
