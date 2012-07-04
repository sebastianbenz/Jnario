package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Throws")
public class ThrowsSpec {
  @Test
  @Named("passes if exception is thrown")
  @Order(99)
  public void passesIfExceptionIsThrown() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.append("import java.util.EmptyStackException");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"throws\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact new Stack<String>().pop throws EmptyStackException ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("passes if exception of expected sub type is thrown")
  @Order(99)
  public void passesIfExceptionOfExpectedSubTypeIsThrown() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"throws\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact new Stack<String>().pop throws Throwable ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("fails if no exception is thrown")
  @Order(99)
  public void failsIfNoExceptionIsThrown() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"throws\" {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact 1 + 1 throws RuntimeException ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executionFails(_builder);
  }
}
