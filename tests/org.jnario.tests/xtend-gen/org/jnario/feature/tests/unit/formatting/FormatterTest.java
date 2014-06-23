package org.jnario.feature.tests.unit.formatting;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jnario.jnario.test.util.AbstractXbaseFormatterTest;
import org.jnario.spec.SpecInjectorProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
@SuppressWarnings("all")
public class FormatterTest extends AbstractXbaseFormatterTest {
  @Test
  @Ignore
  public void testFormatLinebreaks() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("Feature: Calculator");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Background:");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("int result");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Given a calculator");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Scenario: Adding two numbers 2");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("When I enter two numbers \"20\" and \"70\"");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("result = args.first.toInt + args.second.toInt");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Then it returns \"90\"");
    _builder.newLine();
    _builder.append("     \t");
    _builder.append("result => args.first.toInt");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Scenario: Adding two numbers wer");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("When I enter two numbers \"20\" and \"80\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Then it returns \"100\"");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package test");
    _builder_1.newLine();
    _builder_1.append("Feature: Calculator");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Background:");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("int result");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("Given a calculator");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Scenario: Adding two numbers 2");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("When I enter two numbers \"20\" and \"70\"");
    _builder_1.newLine();
    _builder_1.append("       ");
    _builder_1.append("result = args.first.toInt + args.second.toInt");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("Then it returns \"90\"");
    _builder_1.newLine();
    _builder_1.append("     \t");
    _builder_1.append("result => args.first.toInt");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Scenario: Adding two numbers wer");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("When I enter two numbers \"20\" and \"80\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Then it returns \"100\"");
    _builder_1.newLine();
    this.assertFormatted(_builder, _builder_1);
  }
}
