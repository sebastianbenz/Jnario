package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
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
public class AfterSpec {
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
    SpecExecutor.executesSuccessfully(_builder);
  }
}
