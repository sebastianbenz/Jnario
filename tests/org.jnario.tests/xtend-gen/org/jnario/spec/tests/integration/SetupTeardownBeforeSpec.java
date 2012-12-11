package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.SetupTeardownSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Before")
@RunWith(ExampleGroupRunner.class)
public class SetupTeardownBeforeSpec extends SetupTeardownSpec {
  @Test
  @Named("Executes before each test")
  @Order(2)
  public void _executesBeforeEachTest() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Before\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("before{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\"before\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 2\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("fact 1");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("fact 2");
    _builder_1.newLine();
    this.prints(_builder, _builder_1.toString());
  }
}
