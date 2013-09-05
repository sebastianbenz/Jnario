package org.jnario.feature.tests.unit.compiler;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Feature Compiler")
@RunWith(ExampleGroupRunner.class)
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class FeatureCompilerSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Handles empty closures correctly")
  @Order(1)
  public void _handlesEmptyClosuresCorrectly() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Empty Closures");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Defining Empty Closures");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("When I define an empty closure");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("[|].apply ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And  I define an empty closure");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("compiles rich strings")
  @Order(2)
  public void _compilesRichStrings() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\tFeature: Rich Strings\r\n\t\t\tScenario: A\r\n\t\t\tWhen I a rich strings\r\n\t\t\t\tval x = \'world\'\r\n\t\t\t\t\'\'\'hello «x»\'\'\'.toString => \'hello world\'\r\n\t\t");
  }
}
