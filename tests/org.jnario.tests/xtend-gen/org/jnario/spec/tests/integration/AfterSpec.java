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

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("After")
@CreateWith(value = SpecTestCreator.class)
public class AfterSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should be executed after each test")
  @Order(99)
  public void shouldBeExecutedAfterEachTest() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"After\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static int afterExecutionCount = 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should be executed after each test (1)\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("afterExecutionCount should be 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should be executed after each test (2)\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("afterExecutionCount should be 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should be executed after each test (3)\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("afterExecutionCount should be 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("after{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("afterExecutionCount = afterExecutionCount + 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
