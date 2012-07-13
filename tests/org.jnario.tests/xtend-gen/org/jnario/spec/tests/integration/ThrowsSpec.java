package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Throws")
@CreateWith(value = SpecTestCreator.class)
public class ThrowsSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
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
    this._behaviorExecutor.executesSuccessfully(_builder);
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
    this._behaviorExecutor.executesSuccessfully(_builder);
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
    this._behaviorExecutor.executionFails(_builder);
  }
}
