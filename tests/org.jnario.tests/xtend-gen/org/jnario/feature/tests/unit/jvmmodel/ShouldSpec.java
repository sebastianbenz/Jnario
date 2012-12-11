package org.jnario.feature.tests.unit.jvmmodel;

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
@Named("Should")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class ShouldSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Shows correct failure message in reused steps")
  @Order(1)
  public void _showsCorrectFailureMessageInReusedSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: Failure messages when reusing steps");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: name");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("1 + 1 => 3");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}catch(AssertionError e){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("e.message should contain \"1 + 1 => 3\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: name 2\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
