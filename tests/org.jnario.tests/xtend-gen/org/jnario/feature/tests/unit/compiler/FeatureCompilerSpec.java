package org.jnario.feature.tests.unit.compiler;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Feature Compiler")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class FeatureCompilerSpec {
  @Inject
  @Extension
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
    this._behaviorExecutor.executesSuccessfully("\n\t\tFeature: Rich Strings\n\t\t\tScenario: A\n\t\t\tWhen I a rich strings\n\t\t\t\tval x = \'world\'\n\t\t\t\t\'\'\'hello \u00ABx\u00BB\'\'\'.toString => \'hello world\'\n\t\t");
  }
}
